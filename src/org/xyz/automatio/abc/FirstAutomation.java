package org.xyz.automatio.abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.facebook.com/");  //60 seconds
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	@Test
	public void loginfunc()
	{
		WebElement a = driver.findElement(By.id("email"));
		
		a.sendKeys("modisantosh@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]")).sendKeys("");
		
		//driver.findElement(By.cssSelector(null))
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abc");
		
	}
	
	@Test
	public void signupfunc() throws Exception
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();  // 0 secs
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		
	}
	
}
