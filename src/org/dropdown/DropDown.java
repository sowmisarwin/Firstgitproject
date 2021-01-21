package org.dropdown;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		WebElement drop = driver.findElement(By.id("fruits"));
		Select s = new Select(drop);
		s.selectByValue("banana");
		s.selectByVisibleText("Grape");

		List<String> allOptions = new LinkedList<>();

		List<WebElement> options = s.getOptions();
		for (WebElement option : options) {

			allOptions.add(option.getText());
		}

		List<String> selectedOptions = new LinkedList<>();

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selected : allSelectedOptions) {
			selectedOptions.add(selected.getText());
		}

		for (String op : allOptions) {

			if (selectedOptions.contains(op)) {
				continue;
			} 
			else {
				System.out.println(op);
			}

		}

	}

}