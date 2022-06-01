package com.SuceDemo.TestClasses2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SuceDemo.POMClasses2.HomePagePOMClass2;
import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;


public class TC03AddToSingleProduct 
{
 @Test
   public void addProductToCart() throws IOException
  {
	  
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("opend browser");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("url opened");
	
	//1.usename
	LoginPagePOMClass2 lp = new LoginPagePOMClass2(driver);
	lp.sendUsername();
	System.out.println("enter user name");
	
	//2.password
	lp.sendPassword();
	System.out.println("enter password");
	
	//3.login
	lp.clickLoginButton();
	System.out.println("clicked on login button");
//	ScreenShotClass.screenShot(driver);
	
	//4.create object of homepagePOMClass
	HomePagePOMClass2 hp= new HomePagePOMClass2(driver);
	hp.clickAddCart2();
	System.out.println("select bag product");
//	ScreenShotClass.screenShot(driver);
	
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
     
	//6.browser closed
	driver.quit();
	System.out.println("browser is closed ");
	
	System.out.println("end of program");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
