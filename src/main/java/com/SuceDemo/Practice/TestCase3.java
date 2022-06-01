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

public class TestCase3 extends TestBaseClass
{
	
	
	@Test
	public void addSingleProductBuy() throws IOException
	{
		//4.create object of homepagePOMClass
		HomePagePOMClass2 hp= new HomePagePOMClass2(driver);
		hp.clickAddCart2();
		System.out.println("select bag product");
		ScreenShotClass.screenShot(driver);
		
		//5.validation--
		System.out.println("apply validation..");
	    String actaulResult = hp.getTextFromCartButton2();
	    
	    System.out.println(actaulResult);
	    String expectedResult ="1";
		if(actaulResult.equals(expectedResult))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
	
	     hp.clickMenu();
	     System.out.println("Clicked on menu");
	     
	     hp.clickLogOut();
	     System.out.println("click logout");
	     ScreenShotClass.screenShot(driver);    
	     
	}
	

}
