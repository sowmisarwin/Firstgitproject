package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		
		List<WebElement> alloptions = s.getOptions();
		for (int i = 0; i < alloptions.size(); i++) {
				s.selectByIndex(i);
				WebElement each = alloptions.get(i);
				System.out.println(each.getText());
		}
		WebElement option = s.getFirstSelectedOption();
		System.out.println("first selected option:"+option.getText());
		}
}
