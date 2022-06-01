package com.SuceDemo.POMClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass2 
{
	
	//global
  private WebDriver driver;
  private Actions act;
  
  //1.username
  @FindBy(xpath="//input[@id='user-name']")
  private WebElement usrname;
  //create method
  public void sendUsername()
  {
	  usrname.sendKeys("standard_user");
  }
  
     //2.password
  @FindBy(xpath="//input[@id='password']")
  private WebElement password;
     //create method
  public void sendPassword()
  {
	  password.sendKeys("secret_sauce");
  }
  
  //3.loin--
  @FindBy(xpath="//input[@id='login-button']")
  private WebElement loginButton; 
  public void clickLoginButton()
  {
	 // loginButton.click();
	  act.click(loginButton).perform();
	  
  }
  
  //create constructor passing with argument
  public LoginPagePOMClass2(WebDriver driver)
  {
	  this.driver =driver;
	  
	   PageFactory.initElements(driver, this); 
	   
	   act=new Actions(driver);
  }


  
}
