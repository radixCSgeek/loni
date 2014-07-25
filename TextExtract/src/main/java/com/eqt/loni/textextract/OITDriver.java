package com.eqt.loni.textextract;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.bitform.api.FileFormat;
import net.bitform.api.OutsideInStatus;
import net.bitform.api.secure.SecureOptions;
import net.bitform.api.secure.SecureOptions.UseOutsideInOption;
import net.bitform.api.secure.SecureRequest;

public class OITDriver implements Serializable{
	private static final long serialVersionUID = 1L;
	public static final String prefix = "x."+OITDriver.class.getSimpleName();
	protected  SecureRequest request;

	public OITDriver() {
		request = new SecureRequest();
		OutsideInStatus oitStatus =  (OutsideInStatus)request.getOption(SecureOptions.OutsideInStatus);
		if(oitStatus.isAvailable())
		{
			request.setOption(SecureOptions.UseOutsideIn, UseOutsideInOption.Standard);
		}
	}

	public static String getFullSubType(FileFormat f) {
		return getFullSubType(f, "");
	}
	
	public static String getFullSubType(FileFormat f, String suffix) {
		if(f.equals(FileFormat.ALL)) {
			return prefix+suffix;
		} else { 
			return getFullSubType(f.getParent(), "."+f.getId()+suffix);
		}
	}
	
	public List<String> listAllTypes() {
		ArrayList<String> types = new ArrayList<>();
		getTypes(FileFormat.ALL, types);
		return types;
	}
	
	private void getTypes(FileFormat base, List<String> types) {
		if(base == null) return;
		for(FileFormat f : base.getChildren())
		{
			if(!f.equals(FileFormat.UNKNOWN)) {
				types.add(OITDetector.getFullSubType(f, ""));
				if(f.getChildren() != null) {
					getTypes(f, types);
				}
			}
		}
	}

	public static void main(String[] args) {
		OITDriver drv = new OITDriver();
		for(String t : drv.listAllTypes()) {
			System.out.println(t);
		}
	}
}
