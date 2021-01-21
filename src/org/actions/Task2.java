package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();

		Actions a=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='WOMEN']"));
		a.moveToElement(element).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Kurtas & Kurtis']")).click();
}
}