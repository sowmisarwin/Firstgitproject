package org.windows;

import java.awt.AWTException;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='headerSearch']"));
		search.click();
		search.sendKeys("celling fan");
		driver.findElement(By.id("headerSearchButton")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Ashby Park 52 in. White Color Changing Integrated LED Brushed Nickel Ceiling Fan with Light Kit and Remote Control']")).click();
		String parId = driver.getWindowHandle();
		System.out.println(parId);
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
			
		for (String x : allId) {
			if (!x.equals(parId)) {
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		
		
		
	}
}
