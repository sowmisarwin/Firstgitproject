package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		
		List<WebElement> alloptions = s.getOptions();
		for (int i = 0; i < alloptions.size(); i++) {
			if (i%2==1) {
				s.selectByIndex(i);
				WebElement each = alloptions.get(i);
				System.out.println(each.getText());
			}
		}
		
		List<WebElement> allSel = s.getAllSelectedOptions();
		System.out.println("selected option size:"+allSel.size());
		
		System.out.println("unselected option size:"+(alloptions.size()-allSel.size()));
			
	}
		
		
}
