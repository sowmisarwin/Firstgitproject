package org.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Task3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
	}
	
}
