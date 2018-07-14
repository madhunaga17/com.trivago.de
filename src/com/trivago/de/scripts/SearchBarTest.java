package com.trivago.de.scripts;

import org.testng.annotations.Test;

import com.trivago.de.base.BaseTest;
import com.trivago.de.pages.DashboardPage;
import com.trivago.de.pages.SearchBarPage;

public class SearchBarTest extends BaseTest{
	@Test(description="Search for any location on Room5 by using the search bar", priority=0)		
		public void SearchBarCase() throws InterruptedException
		{
			DashboardPage dPage = new DashboardPage(driver);
			dPage.click_search_icon();
			SearchBarPage sBar=new SearchBarPage(driver);
			sBar.send_SearchString();
			sBar.click_CloseSearch();
			
		}
	
}
