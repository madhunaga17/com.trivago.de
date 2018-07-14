package com.trivago.de.scripts;

import org.testng.annotations.Test;

import com.trivago.de.base.BaseTest;
import com.trivago.de.pages.DashboardPage;
import com.trivago.de.pages.DestinationPage;
import com.trivago.de.pages.SearchBarPage;

public class Destination extends BaseTest{
	@Test(description="Destination", priority=4)		
	public void DestinationCase() throws InterruptedException
	{
		DashboardPage dPage = new DashboardPage(driver);
		dPage.click_NavigateIcon();
		DestinationPage dePage= new DestinationPage(driver);
		dePage.click_West();
		Thread.sleep(10000);
		
	}

}
