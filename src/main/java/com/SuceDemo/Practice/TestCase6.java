package com.SuceDemo.Practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SuceDemo.POMClasses2.CartPagePOMClass2;
import com.SuceDemo.POMClasses2.HomePagePOMClass2;
import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;

public class TestCase6 extends TestBaseClass
{
	
	@Test(priority=6)
	public void proceedForCheckOuts() throws IOException
	{
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
		   
		   hp.clickMenu();
		     System.out.println("Clicked on menu");
		     
		     hp.clickLogOut();
		     System.out.println("click logout");
		     ScreenShotClass.screenShot(driver);  	  
	}
	
	
}
