package org.xyz.automatio.abc;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class KeyboardMouse 
{

	@Test
	public void handlemouse()
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		//WebDriver driver = new EdgeDriver(); 
		
		driver.get("https://www.mphasis.com/home.html");
		
	//	driver.findElement(By.xpath("//a[text()='Our Approach']")).click();
		
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
	
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windid = driver.getWindowHandles();
		System.out.println(windid);
		
		Iterator<String> itr = windid.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		//driver.switchTo().window(win1);
		
	}
	
	@Test(enabled=false)
	public void handlekeyboard()
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		//WebDriver driver = new EdgeDriver(); 
		
		driver.get("https://www.facebook.com");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		act.sendKeys("user1").perform();
		//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass123").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
	
}
