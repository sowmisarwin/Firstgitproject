package org.windows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("iphone");
		WebElement btn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btn.click();
		Actions a1=new Actions(driver);
		WebElement phone = driver.findElement(By.xpath("//span[text()='Tracfone Apple iPhone 7 4G LTE Prepaid Smartphone - 32GB - Black - Carrier Locked']"));
		
		a1.contextClick(phone).perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		String parId = driver.getWindowHandle();
		System.out.println(parId);
		Set<String> allwinId = driver.getWindowHandles();
		System.out.println(allwinId);
		for (String x : allwinId) {
			if (!x.equals(parId)) {
				driver.switchTo().window(x);
				
			}
			
		}
		Thread.sleep(7000);
		WebElement add = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		add.click();
		Thread.sleep(6000);
		WebElement price = driver.findElement(By.xpath("(//span[text()='$198.99'])[1]"));
		System.out.println(price.getText());


}
}