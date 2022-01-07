package com.java.basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver browser(String Browsername) {
		try {
			if (Browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (Browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + (""));
				driver = new InternetExplorerDriver();

			} else
				System.out.println("invalid");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void GetCurrentUrl(Object url) {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public static void simplealert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	public static void confirmationalert(String ok,String cancel) {
try {
	if (ok.equalsIgnoreCase("ok")) {
		driver.switchTo().alert().accept();
	}else if (cancel.equalsIgnoreCase("cancel")) {
		driver.switchTo().alert().dismiss();
		
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
public static void promptalert(String ok,String value,String cancel) {
	try {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();
			
		}else if (cancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
	public static void actionmethod(WebElement element ) {
  try {
	Actions a=new Actions(driver);
	  a.contextClick(element).build().perform();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
	public static void enabled(WebElement element) {
	

	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	public static void navigate(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
   
	}
	public static void navigateback() {
try {
	driver.navigate().back();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	public static void navigateforwad() {
try {
	driver.navigate().forward();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	

	public static void sendkeys(WebElement element, String sendkeys) {
		try {
			element.sendKeys(sendkeys);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(WebElement ck) {
		try {
			ck.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void drop(WebElement drop, String options, String value) {
		try {
			Select s = new Select(drop);
			if (options.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(options);
				s.selectByIndex(parseInt);
			} else if (options.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
			} else if (options.equalsIgnoreCase("byvisibletext")) {
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}
	public static void scrollupanddown(WebElement Element) {
try {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scrollTo(0,500)", "");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	public static void scrolldown(String element,String Element) {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scrollTo(0,100)", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public static void maximize() {
		driver.manage().window().maximize();

	}
}


