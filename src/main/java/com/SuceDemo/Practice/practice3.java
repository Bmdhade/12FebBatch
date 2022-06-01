package com.SuceDemo.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice3 
{
    // suit test class method-
	
	@BeforeSuite
	public void  beforeSuite()
	{
		System.out.println("Bs");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Bt");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BC");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BM");
	}
	
	@Test(invocationCount=4)
	public void testCase01()
	{
		System.out.println("tco1");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Am");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Ac");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("At");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("A");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
