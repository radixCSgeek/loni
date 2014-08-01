package com.eqt.loni.textextract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.TextContentHandler;
import org.apache.tika.sax.WriteOutContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

import com.cybozu.labs.langdetect.DetectorFactory;
import com.cybozu.labs.langdetect.LangDetectException;
import com.cybozu.labs.langdetect.Language;

public class QualityTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, TikaException, LangDetectException {

        DetectorFactory.loadProfileFromJarResources("/small-profiles");
        com.cybozu.labs.langdetect.Detector langD = DetectorFactory.create();

        for (String filename : args) {
		   Metadata metadata = new Metadata();
		   metadata.set(Metadata.RESOURCE_NAME_KEY, filename);
		   File document = new File(filename);
		   Detector detector = new DefaultDetector();
		MediaType mimetype = detector.detect(
		        TikaInputStream.get(document), metadata);
	        
		   	Parser parser;
	        if(mimetype.getSubtype().startsWith(OITDriver.prefix) && !mimetype.getSubtype().endsWith("unknown")) {
	        	parser = new OITParser();
	        } else {
	        	parser = new AutoDetectParser(new DefaultDetector());
	        }
	        
	        ContentHandler handler = new TextContentHandler(new WriteOutContentHandler(-1));
	        
	        try {
	          parser.parse(new FileInputStream(document), handler, metadata, new ParseContext());
	          
	          
	        } catch (FileNotFoundException e) {
	          e.printStackTrace();
	        } catch (IOException e) {
	          e.printStackTrace();
	        } catch (SAXException e) {
	          e.printStackTrace();
	        } catch (TikaException e) {
	          e.printStackTrace();
	        }
	        
	        int PHRASE_LENGTH = 30;
	        double numWords = 0;
	        double wordLen = 0;
	        LinkedList<String> window = new LinkedList<>();
	        StringBuilder phrase = new StringBuilder();
	        double lowP = 0;
	        double highP = 0;
	        HashSet<String> langs = new HashSet<>();
	        String lastLang = null;
	        double changeCount = 0;
	        double total = 0;
	        StringBuilder pre = new StringBuilder();
	        for(String word : handler.toString().split("(?U)(?s)\\b")){
	        	if(word.matches("^\\s*$")){
	        		pre.append(word);
	        		continue;
	        	}
	        	numWords++;
	        	wordLen += word.length();
	        	if(word.length() > 30) {
	        		lowP+=PHRASE_LENGTH;
	        		window.clear();
	        		phrase.delete(0, phrase.length());
	        		pre.delete(0, pre.length());
	        		continue;
	        	}
	        	if(window.size() == PHRASE_LENGTH) {
	        		phrase.delete(0, window.removeFirst().length());
	        	}
	        	window.add(pre+word);
        		phrase.append(pre+word);
        		pre.delete(0, pre.length());
	        	if(window.size() == PHRASE_LENGTH) {
	        		total++;
	        		langD.reset();
	        		langD.append(phrase.toString());
	        		List<Language> langList = null;
					try {
						langList = langD.getProbabilities();
					} catch (Exception e) {
						//e.printStackTrace();
		        		lowP+=PHRASE_LENGTH;
		        		window.clear();
		        		phrase.delete(0, phrase.length());
		        		pre.delete(0, pre.length());
		        		continue;
					}
	        		if(langList.isEmpty()) {
	        			lowP++;
	        		} else {
	        			Language bestLang = langList.get(0);
	        			if(bestLang.prob < 0.5) {
	        				lowP++;
	        			} else {
	        				highP++;
	        				langs.add(bestLang.lang);
	        				if(lastLang != null) {
	        					if(!lastLang.equals(bestLang.lang)) {
	        						changeCount++;
	        					}
	        				}
	        				lastLang = bestLang.lang;
	        			}
	        		}
	        	}
	        }
	        
	        double snr = Double.MAX_VALUE;
	        if(lowP > 0) {
	        	snr = highP / lowP;
	        }
	        double divergence = total;
	        if(langs.size() > 0) {
	        	divergence = langs.size() / 3.0;
	        }
	        double discontinuity = 0;
	        if(total > 0) {
	        	discontinuity = changeCount / total;
	        }

	        double avgWordLen = wordLen/numWords;
      
	        double junk = 1.0/snr * 0.5 + divergence * 0.25 + discontinuity * 0.25;
	        System.out.println(filename);
	        System.out.println("Junk: "+junk);
	        System.out.println("snr = "+snr);
	        System.out.println("divergence = "+divergence);
	        System.out.println("discontinuity = "+discontinuity);
	        System.out.println("avg word len = "+avgWordLen);
	        System.out.println("\n");
		}

	}

}
