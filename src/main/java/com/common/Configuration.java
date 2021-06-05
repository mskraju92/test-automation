package com.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

	public static Properties prop;

	public static final String EXECUTION_ENVIRONMENT = getProp().getProperty("execution.environment");

	public static Properties getProp() {
		prop = new Properties();
		InputStream is = Configuration.class.getClassLoader().getResourceAsStream("system.properties");
		try {
			prop.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
