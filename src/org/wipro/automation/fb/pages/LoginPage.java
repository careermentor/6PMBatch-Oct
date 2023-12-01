package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesPkg.ReadPropFile;

public class LoginPage
{

	WebDriver driver;
	
	
	//because "this.driver" is null
	
	public LoginPage(WebDriver driver) 
	{
	
		this.driver=driver;
		
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelementdata("FB_Login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelementdata("FB_Login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.readelementdata("FB_Login_loginbttn_css"))).click();
	}
}
