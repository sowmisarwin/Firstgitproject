package org.windows;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.click();
		search.sendKeys("iphone");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Black']")).click();
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
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		Thread.sleep(5000);
		WebElement print = driver.findElement(By.xpath("//div[text()='You Pay: ']"));
		System.out.println("print the text:\n"+print.getText());
}
}