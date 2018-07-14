package com.trivago.de.scripts;

import org.testng.annotations.Test;

import com.trivago.de.base.BaseTest;
import com.trivago.de.pages.DashboardPage;
import com.trivago.de.pages.SearchBar;

public class SearchBarTest extends BaseTest{
	@Test		
		public void SearchBarCase() throws InterruptedException
		{
			DashboardPage dPage = new DashboardPage(driver);
			dPage.click_search_icon();
			SearchBar sBar=new SearchBar(driver);
			sBar.send_SearchString();
			sBar.click_CloseSearch();
			
		}
	
}
