package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		Actions a=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(element).build().perform();
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(element2).build().perform();
		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		element3.click();
}
}