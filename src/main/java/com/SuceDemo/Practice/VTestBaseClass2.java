package com.SuceDemo.Practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;

public class VTestBaseClass2 
{
	       WebDriver driver; 
			@BeforeMethod
			public void setUp() throws IOException
			{
				System.setProperty("webdriver.chrome.driver", 
			    		 "C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver.exe");
			     driver = new ChromeDriver();
			     System.out.println("browser opened");
			     driver.manage().window().maximize();
			     driver.get("https://www.saucedemo.com/");
			     System.out.println("url opened");
			     
			     //1.username--
			     LoginPagePOMClass2 lp = new LoginPagePOMClass2(driver);
			     lp.sendUsername();
			     System.out.println("enter the user name");
			     
			     //2.password--
			     lp.sendPassword();
			     System.out.println("enter the password");
			     
			     //3.login
			     lp.clickLoginButton();
			     System.out.println("clicked on login button");
			     
			     //4.screenshot--
			     ScreenShotClass.screenShot(driver);	
			}
			
			@AfterMethod
			public void tearDown()
			{
				driver.quit();
			     System.out.println("close browser");
			     System.out.println("end of program..");
			     
			}
			
	}

	
	
	
	
	

