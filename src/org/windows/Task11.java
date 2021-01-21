                                   package org.windows;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
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
		search.sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='HP 15 Ryzen 3 Dual Core 3200U - (4 GB/1 TB HDD/Windows ...']")).click();
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
		WebElement price = driver.findElement(By.xpath("//div[text()='₹27,990']"));
		System.out.println(price.getText());
	}
}
