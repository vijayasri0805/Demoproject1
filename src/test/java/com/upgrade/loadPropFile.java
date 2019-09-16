package com.upgrade;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.internal.support.FileReader;

public class loadPropFile {
	private static String propertyFilePath = System.getProperty("user.dir")+"/src/configuration.properties";
   /*       //+  "\\src\\configuration.properties";
	//BufferedReader reader;*/
public static void main(String args[])
{
	
	Properties properties=new Properties();
	System.out.println(propertyFilePath);
	try {
        properties.load(new FileInputStream(propertyFilePath));
        //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
    } catch (IOException e) {
        System.out.println("Configuration properties file cannot be found");
    }
	System.out.println(properties.getProperty("url"));
	
}
}
