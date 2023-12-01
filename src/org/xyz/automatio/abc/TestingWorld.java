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

public class TestingWorld 
{

	@Test
	public void loginfunc()
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		//WebDriver driver = new EdgeDriver(); 
		
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("fld_username")).sendKeys("Java");
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		
		
		WebElement contr = driver.findElement(By.name("country"));
		
		
		Select con = new Select(driver.findElement(By.name("country")));
		
		con.selectByVisibleText("India");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Goa"));
		
		st.selectByVisibleText("Telangana");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Medak"));
		
		ct.selectByVisibleText("Hyderabad");
		
		
		
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());   //false
		
		driver.findElement(By.name("terms")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());   //true
		//driver.findElement(By.className("displayPopup")).click();
	
	}
	
}
