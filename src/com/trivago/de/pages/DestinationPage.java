package com.trivago.de.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.trivago.de.base.HomePage;

public class DestinationPage extends HomePage{

	@FindBy(xpath="//div[@class='menu-title'][contains(text(),'Destinations')]")
	private WebElement TextDestination;

	@FindBy(xpath="//div[@class='destination-menu'][contains(text(),'West')]")
	private WebElement West;
	
	@FindBy(xpath="//div[@class='hero-title caps']")
	private WebElement WestNavigate;
	
	public void click_West(){
		TextDestination.getTagName();
		West.click();
		System.out.println(WestNavigate);
		
	}
	
	public DestinationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
}
