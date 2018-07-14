package com.trivago.de.scripts;

import org.testng.annotations.Test;

import com.trivago.de.base.BaseTest;
import com.trivago.de.pages.DashboardPage;
import com.trivago.de.pages.SearchBarPage;

public class Subscribe_Newsletter extends BaseTest{
	@Test(description="Subscribe Newsletter", priority=3)		
	public void SearchBarCase() throws InterruptedException
	{
		DashboardPage dPage = new DashboardPage(driver);
		dPage.click_CookieButton();
		Thread.sleep(10000);
		dPage.selectConfirmCheckBox();
		dPage.sendEmail();
		dPage.clickInspireMe();
		
	}

}
