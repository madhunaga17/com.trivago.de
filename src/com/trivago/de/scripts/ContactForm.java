package com.trivago.de.scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.trivago.de.base.BaseTest;
import com.trivago.de.pages.ContactFormPage;
import com.trivago.de.pages.DashboardPage;

public class ContactForm extends BaseTest{
	@Test(description="Fill in the contact form and send it (accessible through the footer)", priority=1)		
		public void ContactFormCase() throws InterruptedException
		{
			DashboardPage dPage = new DashboardPage(driver);
			dPage.click_CookieButton();
			Thread.sleep(10000);
			dPage.switchToWindows();
			dPage.click_ContactForm();
			dPage.switchToWindowsChild();
			System.out.println("Switched to child browser");
			ContactFormPage cPage= new ContactFormPage(driver);
			cPage.sendContactMsg();
			cPage.sendFullName();
			cPage.sendContactEmail();
			cPage.checkConfirmCheckBox();
			cPage.clickSubmit();			
		}
	
}
