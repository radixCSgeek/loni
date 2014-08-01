package com.eqt.loni.textextract;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import net.bitform.api.secure.SecureOptions;
import net.bitform.api.secure.SecureResponse;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class OITParser extends OITDriver implements Parser {

	private static final long serialVersionUID = 1L;
	
	@Override
	public Set<MediaType> getSupportedTypes(ParseContext context) {
		Set<MediaType> types = new HashSet<>();
		for(String typeId : listAllTypes())
		{
			types.add(MediaType.application(typeId));
		}
		
		return types;
	}
	
	@Override
	public void parse(InputStream stream, final ContentHandler handler,
			Metadata metadata, ParseContext context) throws IOException,
			SAXException, TikaException {

		System.out.println("=== Calling OITParser");
        // Only analysis will occur and no output file
        // will be created regardless of other settings
        request.setOption(SecureOptions.JustAnalyze, true);

        // Set the handler
        request.setOption(SecureOptions.OutputType, SecureOptions.OutputTypeOption.ToHandler);
        request.setOption(SecureOptions.ElementHandler, new OITParserHandler(handler));

        // Set the document to be analyzed
        if(stream instanceof FileInputStream){
        	request.setOption(SecureOptions.SourceDocument, stream);
        } else {
        	request.setOption(SecureOptions.SourceDocument, new File(metadata.get(Metadata.RESOURCE_NAME_KEY)));
        }



        try {

            // Execute the request
            request.execute();
        

            // Get the response object
            SecureResponse response = request.getResponse();

            // Check for success
            if (!response.getResult(SecureOptions.WasProcessed)) {

                // Processing failed
            	System.out.println("=== Failed");
                throw new TikaException("Document processing failed");
            }
        } catch (IOException e) {

            // An exception occured
        	System.out.println("Problem reading the document: " + e);
            throw new TikaException("Problem reading the document", e);
        }
	}

}
