package com.SuceDemo.POMClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass2 
{
	//1.globally  declared--
   private WebDriver driver;
   
   //2.continueshoping--
   @FindBy(xpath="//button[@id='continue-shopping']")
	public WebElement continueShoping;
   public void clickContinueShoping()
   {
	   continueShoping.click();  
   }
  
   //3.checkouts--
   @FindBy(xpath="//button[@id='checkout']")
	public WebElement checkOuts;
   public void clickCheckouts()
   {
	   checkOuts.click();  
   }
   
   //4.remove element--
   @FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
  	public WebElement remove;
     public void clickRemove()
     {
    	 remove.click();  
     }
     
     //5.constructor 
     public CartPagePOMClass2(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
        
}
