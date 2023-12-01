package org.xyz.automatio.abc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	
	public static void screenshotresults(WebDriver driver, String name) throws Exception
	{
		
		TakesScreenshot abc = (TakesScreenshot) driver;  //take screenshot (prtsc keyboard)
		
		File f = abc.getScreenshotAs(OutputType.FILE); 
		
		
		
		File fd = new File("./TestResults/" +name+   ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
	
	
	
}
