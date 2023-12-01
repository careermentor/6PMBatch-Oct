package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesPkg.ReadPropFile;

public class SignupPage
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
	
		this.driver=driver;
		
	}

	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelementdata("FB_Signup_CreateNewAccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelementdata("FB_Signup_Firstname_name"))).sendKeys(fname);
	}
	
}
