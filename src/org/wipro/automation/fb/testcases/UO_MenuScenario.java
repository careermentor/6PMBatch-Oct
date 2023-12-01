package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClassPkg.InitiateBrowser;
import org.wipro.automation.fb.pages.UO_MenuPage;

public class UO_MenuScenario extends InitiateBrowser
{

	@Test
	public void validatemenufunc() throws Exception
	{
		
		UO_MenuPage menu = new UO_MenuPage(driver);
		
		menu.click_menu();
		menu.click_signin();
		
	}
	
	
}
