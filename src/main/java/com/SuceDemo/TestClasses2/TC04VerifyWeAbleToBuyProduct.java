package com.SuceDemo.TestClasses2;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SuceDemo.POMClasses2.BillPagePOMClass2;
import com.SuceDemo.POMClasses2.CartPagePOMClass2;
import com.SuceDemo.POMClasses2.CustoInfoPagePOMClass2;
import com.SuceDemo.POMClasses2.HomePagePOMClass2;
import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;



public class TC04VerifyWeAbleToBuyProduct 
{
   @Test
    public void verifyWeAbleToBuyProduct() throws IOException
   {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("browser opened");
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	System.out.println("url entered");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//1.create object loginPagePOMClass
	LoginPagePOMClass2 lp = new  LoginPagePOMClass2(driver);
	//2.username-password-login--
	lp.sendUsername();
	System.out.println("entered username");
	lp.sendPassword();
	System.out.println("entered password");
	lp.clickLoginButton();
	System.out.println("login successful");
	
	//3.create object HomePagePOMClass---
	HomePagePOMClass2 hp = new HomePagePOMClass2(driver);
	//4.product select
	hp.clickAddCart2();
	//5.cartbucket--
	hp.clickBucket();
	System.out.println("clicked on addcart bucket");
	
	//6.create object cartPagePOMClass--
	CartPagePOMClass2 cp= new CartPagePOMClass2(driver);
	cp.clickCheckouts();
	System.out.println("checked product is selected");
	
	//custoinfo object create--
	CustoInfoPagePOMClass2 ci= new CustoInfoPagePOMClass2(driver);
	ci.sendFirstName();
	System.out.println("first name enterd");
	ci.sendLastName();
	System.out.println("last name entered");
	ci.sendPostlCode();
	System.out.println("postal code entered");
	
	//screenshot--
//	ScreenShotClass.screenShot(driver);
	
	//8.create object BillPagePOMClass--
	BillPagePOMClass2 bp = new BillPagePOMClass2(driver);
	bp.clickFinish();
	
	System.out.println("enter the information");
	System.out.println("validation");
	String expectedURL= "https://www.saucedemo.com/checkout-step-two.html";
	String actaulURL = driver.getCurrentUrl();
	
	if(expectedURL.endsWith(actaulURL))
	{
		System.out.println("test case is passed");
	}
	else
	{
		System.out.println("test case is failed");
	}
	
	System.out.println("user able to buy the product");
	
	driver.quit();
	System.out.println("close browser");
	
	driver.quit();
	System.out.println("browser closed");
	
	System.out.println("end of program");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   
}
}
