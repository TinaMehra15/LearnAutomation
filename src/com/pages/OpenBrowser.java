package com.pages;

import org.apache.http.impl.SocketHttpServerConnection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
static WebDriver driver;

public static WebDriver startBrowser() 
{
	

	String path = System.getProperty("user.dir");
	System.out.println("The path is :" + path); 
	System.setProperty("webdriver.chrome.driver",path+"/resources/chromedriver");
	
	
	
	
	//System.setProperty("webdriver.chrome.driver","/Users/tina.mehra/Documents/chromedriver");
	driver= new ChromeDriver();
	String appURL = "https://www.cwjobs.co.uk/";
	driver.get(appURL);
	return driver;	
	//System.out.println();
}
}
