package com.test;

//Import All the packages
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.OpenBrowser;
import com.pages.CloseBrowser;
import com.pages.HomePage;


public class AutomateTestCase {
//DECLERATION OF ALL THE VARIABLES
WebDriver driver;
HomePage objHomePage;
CloseBrowser objCloseBrowser;

@Test(priority=1)
public void firstScenario()
{
	//Open the browser
	driver = OpenBrowser.startBrowser();
	
	//Search for the jobType Permanent and get the total count
	objHomePage = new HomePage(driver);
	objHomePage.scenario1();
	
	//Quit the browser
	objCloseBrowser = new CloseBrowser(driver);
	objCloseBrowser.QuitBrowser();

}
@Test(priority=2)
public void secondScenario()

{
	//Open the browser
		driver = OpenBrowser.startBrowser();
		
	//Scenario2 functionality
		objHomePage = new HomePage(driver);
		objHomePage.scenario2();
		
	//Quit the browser
		objCloseBrowser = new CloseBrowser(driver);
		objCloseBrowser.QuitBrowser();
}


}