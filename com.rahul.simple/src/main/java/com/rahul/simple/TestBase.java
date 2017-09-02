package com.rahul.simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","/Users/rahulsingh/Desktop//geckodriver 2");
		driver=new FirefoxDriver();
		driver.navigate().to("http://www.seleniumframework.com/Practiceform/");	
	}
	
}
