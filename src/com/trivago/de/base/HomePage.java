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
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	private WebElement ContactForm;
	
	@FindBy(xpath="//div[@class='Cookie__button']")
	private WebElement CookieButton;
	
	@FindBy(id="confirm")
	private WebElement ConfirmCheckBox;
	
	@FindBy(name="email")
	private WebElement Email;
	
	@FindBy(xpath="//button[@class='submit']")
	private WebElement Inspire_Me;
	
	public void click_TrivagoMagazine_Link(){
		TrivagoMagazine_Link.click();
	}
	
	public void click_search_icon(){
		search_icon.click();
	}
	
	public void click_NavigateIcon(){
		NavigateIcon.click();
	}
	
	public void click_ContactForm(){
		ContactForm.click();
	}
	
	public void click_CookieButton(){
		CookieButton.click();
	}
	
	public void selectConfirmCheckBox(){
		ConfirmCheckBox.click();
	}
	
	public void sendEmail(){
		Email.sendKeys("madhu.anjanappa@outlook.com");
	}
	
	public void clickInspireMe(){
		Inspire_Me.click();
		System.out.println("Newsletter Subscribed");
	}
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
}