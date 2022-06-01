package com.SuceDemo.TestClasses2;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SuceDemo.POMClasses2.CartPagePOMClass2;
import com.SuceDemo.POMClasses2.HomePagePOMClass2;
import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;

public class TC06VerifyWeAbleToProceedForCheckouts 
{
  @Test
  public void verifyWeAbleToProceedForCheckOuts() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver", 
			  "C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  //1.create object loginpagePOMclass--
	  
	  //2.username-pass-login
	  LoginPagePOMClass2 lp = new LoginPagePOMClass2(driver);
	  lp.sendUsername();
	  System.out.println("enterd user name");
	  lp.sendPassword();
	  System.out.println("enterd password");
	  lp.clickLoginButton();
	  System.out.println("login successful");
	//  ScreenShotClass.screenShot(driver);
	  
	  //3.createHomePage object---  
	  //addcart --bucket
	  HomePagePOMClass2 hp = new HomePagePOMClass2(driver);
	   hp.clickAddCart2();
	   System.out.println("product select");
	   
	   hp.clickBucket();
	  
	   //4.cartPage object create---
	   CartPagePOMClass2 cp =new CartPagePOMClass2(driver);
	   cp.clickCheckouts();
	   
	   //5validation--
	   
	   String expectedTitle = "Swag Labs";
	   String actualTitle = driver.getTitle();
	   
	   if(expectedTitle.endsWith(actualTitle))
	   {
		   System.out.println("test case is passed");
	   }
	   else
	   {
		   System.out.println("test case is failed");
	   }
	   
	   driver.close();
	   System.out.println("closed browser");
	   
	   System.out.println("end of program");
	   
	  
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
