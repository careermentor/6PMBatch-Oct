package org.xyz.automatio.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstAutomation3 
{

	@Test
	public void loginfunc()
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		//WebDriver driver = new EdgeDriver(); 
		
		String ExpURL = "https://www.facebook.com";
		
		driver.get(ExpURL);
		
		//Step1
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL);  //fail  //hard assertion//decision
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);  //soft assertion
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUnametextbox = "Email address or phone number";
		
		String ActUnametextbox = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUnametextbox);
		
		sa.assertEquals(ActUnametextbox, ExpUnametextbox);
		
		String Exploginbttn = "Log in";
		String Actloginbttn = driver.findElement(By.name("login")).getText();
		System.out.println(Actloginbttn);
		
		sa.assertEquals(Actloginbttn, Exploginbttn);
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		//System.out.println(driver.getPageSource());
		
		boolean loginbtnen = driver.findElement(By.name("login")).isEnabled();
		System.out.println(loginbtnen);
		sa.assertEquals(loginbtnen, true);
		
		sa.assertAll();//decision
		
	}
	
	@Test
	public void meth2()
	{
		
	}
	
}
