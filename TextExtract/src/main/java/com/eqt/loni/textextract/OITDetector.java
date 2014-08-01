package com.eqt.loni.textextract;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import net.bitform.api.FileFormat;
import net.bitform.api.options.EnumOptionValue;
import net.bitform.api.secure.SecureOptions;
import net.bitform.api.secure.SecureResponse;

import org.apache.tika.detect.Detector;
import org.apache.tika.io.LookaheadInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

public class OITDetector extends OITDriver implements Detector {

	private static final long serialVersionUID = 1L;
	
	
	@Override
	public MediaType detect(InputStream input, Metadata metadata)
			throws IOException {
	    
		System.out.println("+++ Calling OITDetector");
		// Only identification will occur and no output file
        // will be created regardless of other settings

        request.setOption(SecureOptions.JustIdentify, true);

        // Set the document to be analyzed
        if(input instanceof FileInputStream){
        	request.setOption(SecureOptions.SourceDocument, new LookaheadInputStream(input, 10*1024*1024));
        } else {
        	request.setOption(SecureOptions.SourceDocument, new File(metadata.get(Metadata.RESOURCE_NAME_KEY)));
        }
       
        try {
            // Execute the request
            request.execute();

            // Get the response object
            SecureResponse response = request.getResponse();

            // Check for success
            EnumOptionValue status =  response.getResult(SecureOptions.ProcessingStatus);
            if (status == SecureOptions.ProcessingStatusOption.NotIdentified) {
                // Identification failed
            	System.out.println("+++ NotIdentified");
                return MediaType.OCTET_STREAM;
            }
            
            FileFormat sourceFormat = response.getResult(SecureOptions.SourceFormat);
            if(sourceFormat.equals(FileFormat.UNKNOWN)) {
            	System.out.println("+++ UNKNOWN");
               return MediaType.OCTET_STREAM;        	
            }
            System.out.println("+++ Returning: "+MediaType.application(getFullSubType(sourceFormat, "")));
            return MediaType.application(getFullSubType(sourceFormat, ""));
            
        } catch (IOException e) {
        	System.out.println("+++ Error: "+e);
            return MediaType.OCTET_STREAM;
       }
	}

	public static void main(String[] args) {
		for(FileFormat f : FileFormat.ALL.getChildren())
		{
			if(!f.equals(FileFormat.UNKNOWN)) {
				System.out.println(MediaType.application(getFullSubType(f, "")));
			}
		}
	}
	
}
