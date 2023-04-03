package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
	public String getproperty(String key) throws IOException {
		
		String spath = "C:\\workspaces\\Feb2023\\CucumberFramework\\properties\\application.properties";
		FileInputStream fileinput = new FileInputStream(spath);
		Properties prop = new Properties();
		prop.load(fileinput);
		String value = prop.getProperty(key);
		return value;
	}

}
