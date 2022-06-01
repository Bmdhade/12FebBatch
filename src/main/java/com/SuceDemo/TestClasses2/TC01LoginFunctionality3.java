package com.SuceDemo.TestClasses2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SuceDemo.POMClasses2.HomePagePOMClass2;
import com.SuceDemo.POMClasses2.LoginPagePOMClass2;
import com.SuceDemo.UtilityClasses2.ScreenShotClass;

public class TC01LoginFunctionality3 
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
 //    ScreenShotClass.screenShot(driver);
  }
 @Test(invocationCount=1)
 public void loginFunctionality()
 {
     //5.scenario --validation
     String expectedTitle ="Swag Labs";
  //   System.out.println("Title--"+driver.getTitle());
     String actualTitle= driver.getTitle();
     if(expectedTitle.equals(actualTitle))
     {
    	 System.out.println("Test case is Passed");
     }
     else
     {
    	 System.out.println("test case is failed");
     }
 }
 @Test(invocationCount=1, enabled=true,priority =3,dependsOnMethods= {"loginFunctionality"})
 public void logoutFunctionality() throws IOException
 {
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
 }
 
 @Test (priority=2)
 public void addProductToCart() throws IOException
{ 
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
}
 @AfterMethod
 public void tearDown()
 {
     //6.logout--
     driver.quit();
     System.out.println("close browser");
     System.out.println("end of program..");    
     
}
}
