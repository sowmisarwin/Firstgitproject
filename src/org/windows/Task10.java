                                   package org.windows;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("sowmimca9297@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("sowmi*9297");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		Thread.sleep(6000);
	
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.click();
		search.sendKeys("mask");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Savlon Mask - Pack of 4 | BIS Certified FFP2 S Mask (co...']")).click();
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
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
		pincode.sendKeys("600100");
	}
}
