package com.automation.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrollup {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-wor1\\Selenium Project\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vikatan.com/avalvikatan");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		String currentUrl = driver.getCurrentUrl();
		//		System.out.println(currentUrl);
		//		driver.get("https://www.amazon.in/");
		//		driver.findElement(By.xpath("(//a[@class='nav_a'])[6]")).click();
		//		Thread.sleep(1000);
		//		driver.get("https://www.amazon.in/");
		JavascriptExecutor scrollupanddown =(JavascriptExecutor)driver;

		scrollupanddown.executeScript("window.scroll(0,1500)", "");
		Thread.sleep(2000);
		scrollupanddown.executeScript("window.scroll(0,-1500)", "");
		Thread.sleep(2000);
		scrollupanddown.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(1000);
		scrollupanddown.executeScript("window.scroll(0,0)", "");
	    Thread.sleep(2000);









	}
}
