package Helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigSettings 
{

	private Properties properties;

	public ConfigSettings()
	{
	File src = new File("./config/prop.properties");
	System.out.println("properties file loaded");
	try 
	{
	FileInputStream fileInput = new FileInputStream(src);

	properties = new Properties();
	properties.load(fileInput);
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}

	}
	
	public String browserName()
	{
		return properties.getProperty("browser");
	}
	
	public String url()
	{
		return properties.getProperty("url");
	}

}
