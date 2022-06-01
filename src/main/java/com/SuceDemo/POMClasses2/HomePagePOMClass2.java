package com.SuceDemo.POMClasses2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass2 
{    
	//webdriver --declared as global.
	private WebDriver driver ;
	private Select s;
	//1.addtocart--single bag product
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagButton1;
	public void clickAddCart1()
	{
		bagButton1.click();
	}
	
	//2.addcart
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement addToCart2;
	public void clickAddCart2()
	{
		addToCart2.click();
	}
	
	//3.addcart
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
	private WebElement addToCart3;
	public void clickAddCart3()
	{
		addToCart3.click();
	}
	
	//4.addcart
	@FindBy(xpath="(//button[text()='Add to cart'])[4]")
	private WebElement addToCart4;
	public void clickAddCart4()
	{
		addToCart4.click();
	}
	
	
	//5.Filter---dropdown
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	public void clickFilter()
	{
		filter.click();
//		Select s = new Select(filter);  //doubt
		s.selectByIndex(1);	
	}
	 
	//6.bucketElement
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement bucket;
	public void clickBucket()
	{
		bucket.click();
	}
	
	//7.gettext()method
	public String getTextFromCartButton()
	{
		String totalProduct = bucket.getText();
		return totalProduct;
	}
	
	//7.1 gettext2()
	public String getTextFromCartButton2()
	{
		String sigleProduct = bucket.getText();
		return sigleProduct;	
	}
	//8.multiple elements---
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement>multipleAddToCart;
	public void addAllProduct()
	{
		for(int i=0;i<multipleAddToCart.size();i++)
		{
			multipleAddToCart.get(i).click();
		}
	}
	
	//9.menu button
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menuButton;
	public void clickMenu()
	{
		menuButton.click();
	}
	
	//10.allitems elements
	@FindBy(xpath="//a[@id='inventory_sidebar_link']")
	private WebElement allItems;
	public void clickAllItems()
	{
		allItems.click();
	}
	
	//11.about
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement about;
	public void clickAbout()
	{
		about.click();
	}
	
	//12.logout
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	public void clickLogOut()
	{
		logout.click();
	}

	//13.resetapp
	@FindBy(xpath="//a[@id='reset_sidebar_link']")
	private WebElement resetAppState;
	public void clickResetAppState()
	{
		resetAppState.click();
	}
	
	//create constructor with passing argument --
	
	public HomePagePOMClass2(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		s= new Select(filter);
		
	}	
	
}
