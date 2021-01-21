package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.click();
		
		WebElement findElement1 = driver.findElement(By.id("twotabsearchtextbox"));
		findElement1.sendKeys("iphone");
		
		WebElement element = driver.findElement(By.className("nav-input"));
		element.click();
		
	}
}
