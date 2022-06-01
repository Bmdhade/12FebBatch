package com.SuceDemo.Practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 
{
  @BeforeMethod
  public void setUpMethod()
  {
	  System.out.println("browser--Url -login");
  }

  @Test
  public void tesrDown()
  {
	  System.out.println("login functionality");
  }
  
  @BeforeMethod
  public void logOutFunctionality()
  {
	  System.out.println("browser closed");
  }
	
}
