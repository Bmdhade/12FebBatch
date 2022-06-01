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

public class TestCase5 extends TestBaseClass
{

	@Test
	public void multipleProductAddToCart() throws IOException
	{
		//2.select product--
		HomePagePOMClass2 hp = new HomePagePOMClass2(driver);
		hp.addAllProduct();
		System.out.println("add product");
		
		//3.validation--
		String expectedResult =hp.getTextFromCartButton();
//		System.out.println(expectedResult);
		String actualResult = "3";     //web site issue---3 product will be displayed only
		
		
		if(expectedResult.equals(actualResult))
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
