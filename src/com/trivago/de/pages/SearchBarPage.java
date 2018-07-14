package com.trivago.de.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;

import com.trivago.de.base.HomePage;

public class SearchBarPage extends HomePage{ 
	
	@FindBy(xpath="//input[@class='input search-input']")
	private WebElement SearchString;
	
	@FindBy(xpath="//div[@class='search-icon open']")
	private WebElement CloseSearch;
	
	public void send_SearchString(){
		System.out.println("Search page appeared");
		SearchString.sendKeys("Berlin", Keys.RETURN);
		System.out.println("Berlin location searched");
		//SearchString.sendKeys(Keys.RETURN);		
	}
	
	public void click_CloseSearch(){
		CloseSearch.click();
		System.out.println("Search bar closed");
	}
	
	public SearchBarPage(WebDriver driver) {
		super(driver);
	}


}
