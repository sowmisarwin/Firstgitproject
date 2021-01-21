package org.actions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		Actions a=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(src, des).build().perform();
		
		Thread.sleep(5000);
		WebElement src1 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		a.dragAndDrop(src1, des1).perform();
		
		
		
		
	
	}
}