package com.trivago.de.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generics.Utility;

public abstract class BasePage {
  public Logger log=Logger.getLogger(this.getClass());
  public long timeout=Long.parseLong(Utility.getPropertyValue(AutomationConstants.CONFIG_PATH, "EXPLICIT"));
  public WebDriver driver;
  public WebDriverWait wait;// cannot initialize here as we get null pointer exception as driver is not initialized but is passed as argument.
 
  public BasePage(WebDriver driver){
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  wait=new WebDriverWait(driver,timeout);
  }
  
  /*----------------------------------------------------*/
  /*--------- Verify Url has specified content----------*/
  /*----------------------------------------------------*/
  public void verifyURLhas(String expectedUrl){
	  wait.until(ExpectedConditions.urlContains(expectedUrl));
  }
   
  
  public  void waitAndClick(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

  public void switchToWindows(){
	  String handle= driver.getWindowHandle();
		 
      System.out.println(handle);
           
  }

  public void switchToWindowsChild (){ 
		Set handles = driver.getWindowHandles();
	
	    System.out.println(handles);
	
	    for (String handle1 : driver.getWindowHandles()) {
	    	  
	    System.out.println(handle1);
	
	  	driver.switchTo().window(handle1);

  	}
  }
}