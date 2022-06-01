package com.SuceDemo.Practice;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;

public class TestBaseClass 
{
	    WebDriver driver;
	    Logger log ;
	    
	    @Parameters("browserName")
		@BeforeMethod
		public void setUp(String browserName)
		{
	    	if(browserName.equals("chrome"))
	    	{
			System.setProperty("webdriver.chrome.driver", 
		    		 "/.drivers.chromedriver.exe");
			driver = new ChromeDriver();
	    	}
	    	else
	    	{
	    		System.setProperty("webdriver.gecko.driver", 
			    		 "/.drivers.geckodriver.exe");
	    		driver = new FirefoxDriver();
	     	}
		     
		     log.info("browse open");
		     
		     log =Logger.getLogger("SauceDemo12FebBatchv1");
		     PropertyConfigurator.configure("log4j.properties");
		     
		     driver.manage().window().maximize();
		     driver.get("https://www.saucedemo.com/");
		     log.info("url opened");
		     
		     //1.username--
		     LoginPagePOMClass2 lp = new LoginPagePOMClass2(driver);
		     lp.sendUsername();
		     log.info("user name entered");
		     
		     //2.password--
		     lp.sendPassword();
		       log.info("password entered");
		     
		     //3.login
		     lp.clickLoginButton();
		     log.info("clicked on login button");
		     
//		     //4.screenshot--
//		     ScreenShotClass.screenShot(driver);	
		}
		
		@AfterMethod
		public void tearDown()
		{
			  driver.quit();
		     log.info("close browser");
		     
		     log.info("end of program..");
		     
		}
		
}
