package org.xyz.automatio.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleAlerts
{

	@Test
	public void handlealert() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		 
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.screenshotresults(driver,"handlealert");
		
		
	}
}
