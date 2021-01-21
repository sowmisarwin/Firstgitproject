package org.dropdown;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));
		//Select s=new Select(state);
		boolean selected = state.isSelected();
	//	boolean multiple = s.isMultiple();
		System.out.println(selected);
		
		
}
}