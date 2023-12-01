package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesPkg.ReadPropFile;

public class UO_MenuPage
{

	WebDriver driver;
	
	
	//because "this.driver" is null
	
	public UO_MenuPage(WebDriver driver) 
	{
	
		this.driver=driver;
		
	}

	public void click_menu() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.readelementdata("UO_Menu_css"))).click();
		
	}
	
	public void click_signin() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelementdata("UO_Menu_signIn_xpath"))).click();
		
	}
	
	}
