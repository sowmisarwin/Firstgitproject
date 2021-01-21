package org.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','sowntharya')", user);
		js.executeScript("arguments[0].setAttribute('value','sss*123')", pass);
		WebElement btnlogin = driver.findElement(By.xpath("//input[@type='Submit']"));
		js.executeScript("arguments[0].click()", btnlogin);
		
	}
}
