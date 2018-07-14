package com.trivago.de.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class HomePage extends BasePage{
	
	@FindBy(xpath="//a[@class='logo router-link-exact-active router-link-active']")
	private WebElement TrivagoMagazine_Link;

	@FindBy(xpath="//div[@class='search-icon']")
	private WebElement search_icon;
	
	@FindBy(xpath="//div[@class='nav-icon']")
	private WebElement NavigateIcon;
	
	public void click_TrivagoMagazine_Link(){
		TrivagoMagazine_Link.click();
	}
	
	public void click_search_icon(){
		search_icon.click();
	}
	
	public void click_NavigateIcon(){
		NavigateIcon.click();
	}
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
}