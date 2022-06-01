package com.SuceDemo.POMClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPagePOMClass2
{
        //globally declared--
	private WebDriver driver;
	
	//1.cancel--
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancel;
	
	public void clickCancel()
	{
		cancel.click();
	}
	
	//2.finish--
	@FindBy(xpath="//html//body/div//button[2]")
	private WebElement finish;
	public void clickFinish()
	{
		finish.click();
	}
	
	//3.constructor---
	public BillPagePOMClass2(WebDriver driver)
	{
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
