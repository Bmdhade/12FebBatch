package com.SuceDemo.POMClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPagePOMClass2 
{
	//globally declared--
 private WebDriver driver;
 
 //backhomepage---
  @FindBy(xpath="//button[@id='back-to-products']")
  private WebElement backHomePage;
  public void clickBackHomePage()
  {
	  backHomePage.click();
  }
 
  //constructor---
 public OrderPagePOMClass2(WebDriver driver)
 {
	 this.driver =driver;
	 PageFactory.initElements(driver, this);
 }
 
}
