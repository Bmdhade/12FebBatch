package com.SuceDemo.Practice;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SuceDemo.POMClasses2.HomePagePOMClass2;
import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;

public class TestCase2 extends TestBaseClass
{
	@Test
	public void logoutFunctionality() throws IOException
	{
		 HomePagePOMClass2 hp= new HomePagePOMClass2(driver);
	     hp.clickMenu();
	     System.out.println("Clicked on menu");
	     
	     hp.clickLogOut();
	     System.out.println("click logout");
	     ScreenShotClass.screenShot(driver);
	     
	     //5.validation ---Scenario
	     System.out.println("apply validation");
	     String expectedURL ="https://www.saucedemo.com/";
	     String actualURL =driver.getCurrentUrl();
	     if(expectedURL.equals(actualURL))
	     {
	    	 System.out.println("test case is passed");
	     }
	     else
	     {
	    	 System.out.println("test case is failed");
	     }
	    
	}
	
	
}
