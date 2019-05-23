package com.test.rest.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
			
		} catch(Exception e) {
			System.out.println("Exception is -: "+ e.getMessage());
		}
		
	}
	
	public String getFixUrl() {
		String fixUrl = pro.getProperty("fixUrl");
		return fixUrl;
		
	}
	
	public String getEndPointUrl() {
		String endpointUrl = pro.getProperty("endPointUrl");
		return endpointUrl;
		
	}
}