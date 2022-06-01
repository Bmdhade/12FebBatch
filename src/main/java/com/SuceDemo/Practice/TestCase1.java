package com.SuceDemo.Practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SuceDemo.POMClasses2.HomePagePOMClass2;
import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;

public class TestCase1  extends TestBaseClass
{
   @Test  //--execute the tst cases
   public void loginFunctionality() throws IOException
   {
	     //5.scenario --validation
	     String expectedTitle ="Swag Labs";
	  
	     String actualTitle= driver.getTitle();
	     
	       log.info("Verify the test case");
	       
	       Assert.assertEquals(expectedTitle, actualTitle);
	       
	       ScreenShotClass.screenShot(driver);
	        
//	     if(expectedTitle.equals(actualTitle))
//	     {
//	    	 System.out.println("Test case is Passed");
//	     }
//	     else
//	     {
//	    	 System.out.println("test case is failed");
//	     }             
   }	
}
