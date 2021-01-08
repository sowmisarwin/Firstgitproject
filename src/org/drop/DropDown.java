package org.drop;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://output.jsbin.com/osebed/2");
	WebElement drop = driver.findElement(By.id("fruits"));
	Select s=new Select(drop);
	s.selectByValue("banana");
	s.selectByVisibleText("Grape");
	
	List<String> li=new ArrayList<String>();

	List<WebElement> opt = s.getOptions();
	
	for (WebElement x : opt) {
		String allopt = x.getText();
		li.add(allopt);
	//	System.out.println(allopt);
	}
	List<String> l2=new ArrayList<>();
	List<WebElement> sel = s.getAllSelectedOptions();
	for (WebElement x : sel) {
		String allsel = x.getText();
		l2.add(allsel);}
		
		//	System.out.println(allsel);}
	
	System.out.println(li.size()-l2.size());
System.out.println("print unselected value");
	
for (int i = 0; i <li.size(); i++) {
	if (l2.contains(li)) {
		continue;
	} else {
		String string = li.get(i);
		System.out.println(string);
	}
}
		
		
		
	
	
	
	
	
	
	
	
}
}