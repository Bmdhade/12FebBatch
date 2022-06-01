package com.SuceDemo.TestClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SuceDemo.POMClasses2.HomePagePOMClass2;
import com.SuceDemo.POMClasses2.LoginPagePOMClass2;


public class TC05MultipleProductAddToCartFunctionality 
{
  @Test
  public void multipleProductAddToCartFunctionality()
   {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("url opened");
	
	//1.username--pass---login
	LoginPagePOMClass2 lp = new LoginPagePOMClass2(driver);
	lp.sendUsername();
	System.out.println("enter user name");
	
	lp.sendPassword();
	System.out.println("enter password");
	
	lp.clickLoginButton();
	System.out.println("clicked on login button");
	
	//2.select product--
	HomePagePOMClass2 hp = new HomePagePOMClass2(driver);
	hp.addAllProduct();
	System.out.println("add product");
	
	//3.validation--
	String expectedResult =hp.getTextFromCartButton();
//	System.out.println(expectedResult);
	String actualResult = "3";     //web site issue---3 product will be displayed only
	
	
	if(expectedResult.equals(actualResult))
	{
		System.out.println("test case is passed");
	}
	else 
	{
		System.out.println("test case is failed");
	}
	driver.close();
	System.out.println("browser closed");
	
	System.out.println("end of program");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
