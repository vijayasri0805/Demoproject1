package com.upgrade.SeleniumHelperClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	public WebDriver driver;
	public WebDriver getDriver() {
        if (driver != null) {
            return driver;
        }
        driver = new ChromeDriver();  
        return driver;
    }

    public void getUrl(String url) {
    	getDriver().get(url);
        getDriver().manage().window().maximize();
    }
}
