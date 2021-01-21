package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement find1 = driver.findElement(By.id("sign-in-icon-down"));
		find1.click();
		
		WebElement find2 = driver.findElement(By.id("signInLink"));
		find2.click();
		Thread.sleep(3000);
		
		WebElement find3 = driver.findElement(By.id("mobileNoInp"));
		find3.sendKeys("9876556789");
		
	}
}
