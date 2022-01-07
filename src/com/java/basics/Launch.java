package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Launch extends Base_Class {
	public static void main(String[] args) {
		browser("chrome");
		geturl("https://www.facebook.com/");
		// close();
		//navigate(null);
		maximize();
		sendkeys(driver.findElement(By.id("email")), "ccc");
		sendkeys(driver.findElement(By.id("pass")), "hhh");
		scrolldown("scrollTo(0,100)", "");
}
}
