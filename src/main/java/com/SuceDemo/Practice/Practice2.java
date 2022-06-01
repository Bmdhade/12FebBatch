package com.SuceDemo.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 
{

	@BeforeMethod
	public void setUpMethod()
	{
		System.out.println("browser open,url, login");
	}
	
	@Test
	public void verifyLoginFunctionality()
	{
		System.out.println("verifyLoginFunctionality");
	}
	
	@Test
	public void singleProductAddToCart()
	{
		System.out.println("single product add to cart is verified");
	}
	@AfterMethod
	public void method3()
	{
		System.out.println("browser is closed");
	}
	
	
	
}
