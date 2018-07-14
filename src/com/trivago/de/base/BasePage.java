package com.trivago.de.base;

import java.util.ArrayList;

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
  
  
  
  
  public void verifyElementIsPresent(WebElement element)
  {
	 /* try
	  {
		  wait.until(ExpectedConditions.visibilityOf(element));
		  log.info("Element is Present");
	  }
	  catch(Exception e)
	  {
		  log.error("Element Not Present");
		  Assert.fail();
	  }
	  
	  */
	  log.info("Verify Element is Present");
	  boolean present =Utility.verifyElementIsPresent(driver, element);
	  Assert.assertTrue(present, "Element is not present");
	  log.info("Element is Present");
  }
  
  
  public void verifyElementIsNotPresent(WebElement element)
  {
	  try
	  {
		  wait.until(ExpectedConditions.visibilityOf(element));
		  log.error("FAIL:Element is Present");
		  Assert.fail();
	  }
	  catch(Exception e)
	  {
		  log.info("PASS:Element Not Present");
		  
	  }
  }
  
  
  public void verifyElementIsNotPresent(By locator)
  {
	  try
	  {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		  log.error("FAIL:Element is Present");
		  Assert.fail();
	  }
	  catch(Exception e)
	  {
		  log.info("PASS:Element Not Present");
		  
	  }
  }
  
  
  
  public  void waitAndClick(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
  
  
  
  public void verifyListBoxIsSorted(WebElement listBox,int startIndex)
  {
	 ArrayList<String> allText = Utility.getAllTextFromListBox(listBox,startIndex);
	 boolean isSorted = Utility.checkIfArrayListIsSorted(allText);
	 Assert.assertTrue(isSorted, "ListBox is Not Sorted");
  }
  
  
  public void verifyListBoxHasNoDuplicate(WebElement listBox,int startIndex)
  {
	  ArrayList<String> allText =Utility.getAllTextFromListBox(listBox,startIndex);
	  boolean hasDuplicate =Utility.checkArrayListHasDuplicate(allText);
	  Assert.assertFalse(hasDuplicate, "ListBox has duplicate");
	  
  }
  
  public boolean verifyElementIsPresentOrNot(WebElement element)
  {
	  try
	  {
		  wait.until(ExpectedConditions.visibilityOf(element));
		  log.error("PASS:Element is Present");
		  return true;
	  }
	  catch(Exception e)
	  {
		  log.info("FAIL:Element Not Present");
		  return false;
	  }
  }
  
  
}