package org.windows;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		
		String parId = driver.getWindowHandle();
		System.out.println(parId);
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for (String x : allId) {
			if (!x.equals(parId)) {
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(7000);
	}		
}
