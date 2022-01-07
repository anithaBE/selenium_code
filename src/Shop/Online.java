package Shop;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Online {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\User\\eclipse-wor1\\Selenium Project\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='sf-with-ul']")).click();
		driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("scrollTo(0,1000)", "");
		driver.findElement(By.xpath("//span[@class='available-now']")).click();
		driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default'][1]")).click();
		driver.findElement(By.xpath("//span[@title='Close window']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("category")).click();
	
		js.executeScript("scrollTo(0,-1000)", "");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
		js.executeScript("scrollTo(0,2000)", "");
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		js.executeScript("scrollTo(0,-1000)", "");
		
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("anitaselvaraj011@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("anitha");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("s");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		WebElement drop1 = driver.findElement(By.id("days"));
		Select s=new Select(drop1);
		s.selectByIndex(30);
		WebElement drop2 = driver.findElement(By.id("months"));
		Select s1=new Select(drop2);
		s1.selectByValue("5");
		WebElement drop3 = driver.findElement(By.id("years"));
		Select s3=new Select(drop3);
		s3.selectByValue("1996");
		
		js.executeScript("scrollTo(0,1000)", "");
	driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("IBM");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("gouklflats mandaveli");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("vnr");
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("chennai");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s4=new Select(state);
		s4.selectByValue("14");
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("60601");
		WebElement country = driver.findElement(By.id("id_country"));
		Select s5=new Select(country);
		s5.selectByValue("21");
		driver.findElement(By.id("other")).sendKeys("vnr nagar virridhachalam");
		driver.findElement(By.id("phone")).sendKeys("04143 60000");
		driver.findElement(By.id("phone_mobile")).sendKeys("7373574496");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		driver.findElement(By.id("uniform-cgv")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		js.executeScript("scrollTo(0,1500)", "");
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		js.executeScript("scrollTo(0,500)", "");
		TakesScreenshot st=(TakesScreenshot) driver;//typecasting
		File screenshotAs = st.getScreenshotAs(OutputType.FILE);//syntax
		File store =new File("C:\\Users\\User\\eclipse-wor1\\Selenium Project\\Screenshot\\shoping.png");
		FileUtils.copyFile(screenshotAs, store);
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		

	}

}
