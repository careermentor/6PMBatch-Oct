package org.xyz.automatio.abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InstaCart 
{

	@Test
	public void loginfunc()
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		//WebDriver driver = new EdgeDriver(); 
		
		driver.get("https://www.instacart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.cssSelector("[id='search-bar-input']")).sendKeys("Banana");
		
		
		/*
		
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/nav/div[3]/button[1]/span")).click();
		
		driver.findElement(By.xpath("//label[text()='Email']")).sendKeys("user1");
		driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("pass1");
		
		driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[1]/form/div[4]/button/span")).click();
		*/
		}
	
}
