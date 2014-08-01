package com.eqt.loni.textextract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

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

public class TextExtract {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, TikaException {

		for (String filename : args) {
		   Metadata metadata = new Metadata();
		   metadata.set(Metadata.RESOURCE_NAME_KEY, filename);
		   File document = new File(filename);
		   Detector detector = new DefaultDetector();
		MediaType mimetype = detector.detect(
		        TikaInputStream.get(document), metadata);
		   System.out.println("File " + filename + " is " + mimetype+"\n\n\n");
		   System.out.println(mimetype.getSubtype() + "     " + OITDriver.prefix + "     " + mimetype.getSubtype().startsWith(OITDriver.prefix));
	        
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
	        
	        PrintStream ps = new PrintStream(System.out, true, "UTF-16");
	        System.out.println("********************************************************\n"+metadata+"\n********************************************************\n");
	        System.out.println(handler.toString());

		}

	}

}
