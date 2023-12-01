package org.xyz.automatio.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleFrames
{

	@Test
	public void handleframe() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		 
		
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe page')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		
		CaptureScreenshot.screenshotresults(driver,"handleframe");
		
		
	}
}
