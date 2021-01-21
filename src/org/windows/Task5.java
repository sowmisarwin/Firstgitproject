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

public class Task5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		act.moveToElement(course).build().perform();
		driver.findElement(By.xpath("(//span[text()='Python'])[1]")).click();
		Thread.sleep(5000);
		WebElement curriculum = driver.findElement(By.xpath("//h2[text()='Curriculum']"));
		Thread.sleep(6000);
		act.contextClick(curriculum).build().perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
		
		String parId = driver.getWindowHandle();
		System.out.println(parId);
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for (String x : allId) {
			if (!x.equals(parId)) {
				driver.switchTo().window(x);
			}
		}
		
		System.out.println("done!!!!!!");
		
		
		
	}
}