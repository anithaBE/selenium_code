package com.automation.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-wor1\\Selenium Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.youtube.com/");
		TakesScreenshot st=(TakesScreenshot) driver;
	    File screenshotAs = st.getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\User\\eclipse-wor1\\Selenium Project\\Screenshot\\goo.png");
	    FileUtils.copyFile(screenshotAs, dest);
	    
	    
		
	}

}

