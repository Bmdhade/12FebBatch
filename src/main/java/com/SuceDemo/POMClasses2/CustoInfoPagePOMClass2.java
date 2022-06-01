package com.SuceDemo.POMClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustoInfoPagePOMClass2 
{
	//globally declared--
   private WebDriver driver;
   
   //1.first name--
   @FindBy(xpath="//input[@name='firstName']")
   private WebElement firstName;
   public void sendFirstName()
   {
	   firstName.sendKeys("Bhagvat");
	   System.out.println("user name enterd");
   }
	
   //2.last name--
   @FindBy(xpath="//input[@id='last-name']")
   private WebElement lastName;
   public void sendLastName() 
   {
	   lastName.sendKeys("dhade");
	   System.out.println("last name entered");
   }
	
   //3.postal code---
   @FindBy(xpath="//input[@id='postal-code']")
   private WebElement postalCode;
   public void sendPostlCode()
   {
	   postalCode.sendKeys("443112");
	   System.out.println("postal code entered");
   }
   
   //4.cancel---
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancel;
	public void clickCancel()
	{
		cancel.click();
	}
	
	//5.continue--
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continue1;
	public void clickContinue()
	{
		continue1.click();
	}
	
	//6.constructor--
    public CustoInfoPagePOMClass2(WebDriver driver)
    {
       this.driver =driver;
       
       PageFactory.initElements(driver, this);
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
