package org.wipro.automation.fb.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClassPkg.InitiateBrowser;
import org.wipro.automation.fb.pages.LoginPage;
import org.wipro.automation.fb.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void validatesignupfunc() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		
		driver.findElement(By.name("lastname")).sendKeys("java");
		
	}
	
}
