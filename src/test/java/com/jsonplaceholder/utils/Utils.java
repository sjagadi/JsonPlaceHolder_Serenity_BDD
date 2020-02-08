package com.jsonplaceholder.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils 
{
	public static String getConfigValue(String configName)
	{
		String configValue = "";
		try 
		{
			FileInputStream input = new FileInputStream("./config.properties");
			Properties prop = new Properties();
			prop.load(input);
			configValue = prop.getProperty(configName.toLowerCase());
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return configValue;
	}
	
	public static String getBigText()
	{
	    StringBuilder stringB = new StringBuilder(2000000);
	    String paddingString = "abcdefghijklmnopqrs";

	    while (stringB.length() + paddingString.length() < 2000000)
	        stringB.append(paddingString);
	    String bigText = "";
	    for (int i = 1; i<= 3; i++)
	    {
	        bigText = bigText + stringB.toString();
	    }
	    return bigText;
	}
}
