package org.windows;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.click();
		search.sendKeys("hand Sanitizer");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//p[text()='Germi Fight Hand Sanitizer 200 mL Pack of 1']")).click();
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
		driver.findElement(By.xpath("//span[text()='ADD TO CART']")).click();
		

}
}