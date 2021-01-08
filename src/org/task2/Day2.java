package org.task2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	/*	WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Greens");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("sss*123");
		
		WebElement loginBtn = driver.findElement(By.id("u_0_b"));
		loginBtn.click();*/
	
	}
}
