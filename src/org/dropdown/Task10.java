package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement userId = driver.findElement(By.id("username"));
		userId.sendKeys("sowntharya");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("sss*123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s=new Select(loc);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
		
	
	
	
}
}