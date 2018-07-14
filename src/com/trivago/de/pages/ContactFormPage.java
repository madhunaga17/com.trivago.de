package com.trivago.de.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.trivago.de.base.HomePage;

public class ContactFormPage extends HomePage{ 
	
	@FindBy(xpath="//textarea[@class='contact-msg']")
	private WebElement ContactMsg;
	
	@FindBy(xpath="//div[contains(@class,'row')]//div[1]//input[1]")
	private WebElement FullName;
	
	@FindBy(id="contact-email")
	private WebElement ContactEmail;
	
	@FindBy(id="confirm")
	private WebElement ConfirmCheckBox;
	
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	private WebElement Submit;
	
	public void sendContactMsg(){
		ContactMsg.sendKeys("Test Contact MSG validation");
		System.out.println("Contact msg entered");
	}
	
	public void sendFullName(){
		FullName.sendKeys("Madhu Anjanappa");
		System.out.println("Full name entered");
		
	}
	
	public void sendContactEmail(){
		ContactEmail.sendKeys("madhu.anjanappa@outlook.com");
		System.out.println("Contact email entered");
	}
	
	public void checkConfirmCheckBox(){
		ConfirmCheckBox.click();
		System.out.println("Check box selected");
	}
	
	public void clickSubmit(){
		Submit.click();
		System.out.println("Contact form msg sent");
	}
	
	public ContactFormPage(WebDriver driver) {
		super(driver);
	}


}