package org.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	//	user.sendKeys("9894803890");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	//	pass.sendKeys("LaliMa");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','9894803890')", user);
		js.executeScript("arguments[0].setAttribute('value','LaliMa')", pass);
		WebElement btn = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		btn.click();
		js.executeScript("arguments[0].click()", btn);
		
		
		
		
		
	}
}
