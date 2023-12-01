package org.xyz.automatio.abc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows
{

	@Test
	public void handletab()
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		 
		
		driver.get("https://www.mphasis.com/home.html");
		
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		
		
		Set<String> windid = driver.getWindowHandles();
		System.out.println(windid);
		
		Iterator<String> itr = windid.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		//driver.switchTo().window(win1);
	}
}
