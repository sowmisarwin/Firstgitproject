package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("//div[text()='Share this page']"));
		js.executeScript("arguments[0].scrollIntoView()", down);
		Thread.sleep(5000);
		
		WebElement up = driver.findElement(By.xpath("//span[text()='Latest Tutorials']"));
		js.executeScript("arguments[0].scrollIntoView()", up);
		
		
		
	}
}
