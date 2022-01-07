package com.automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\User\\eclipse-wor1\\Selenium Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		//WebElement first = driver.findElement(By.id("wrapframe"));
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		String another = driver.findElement(By.id("Click")).getText();
		System.out.println(another);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		

	}

}
