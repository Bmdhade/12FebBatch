package com.SuceDemo.TestClasses2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SuceDemo.POMClasses2.HomePagePOMClass2;
import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;

public class TC02LogOutFunctionality 
{
  @Test
  public void logoutFunctionality() throws IOException
  {
	  
	     System.setProperty("webdriver.chrome.driver", 
	     "C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver.exe");
	     
	     System.out.println("checking log out functionality--");

	     WebDriver driver = new ChromeDriver();
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
	   //   ScreenShotClass.screenShot(driver);
	     
	    //4.Create constuctor homePagePomClass---
	     HomePagePOMClass2 hp= new HomePagePOMClass2(driver);
	     hp.clickMenu();
	     System.out.println("Clicked on menu");
	     
	     hp.clickLogOut();
	     System.out.println("click logout");
	 //    ScreenShotClass.screenShot(driver);
	     
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
	     
	     driver.quit();
	     System.out.println("browser closed");
	     System.out.println("end of program");
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
