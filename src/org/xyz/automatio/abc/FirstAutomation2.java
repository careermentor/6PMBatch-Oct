package org.xyz.automatio.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstAutomation2 
{

	@Test
	public void loginfunc() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		
		//driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);		
		driver.navigate().back();
		
		Thread.sleep(5000);	
		driver.navigate().forward();
		
		Thread.sleep(5000);	
		driver.navigate().refresh();
		
		//driver.close();  //will close one window at a time
		driver.quit();  //will close multiple window at a time
		
		
	}
	
}
