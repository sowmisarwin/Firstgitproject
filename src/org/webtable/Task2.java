package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table"));
		List<WebElement> allrow = table.findElements(By.tagName("tr"));
		for (int i = 0; i < allrow.size(); i++) {
			if (i==0) {
			WebElement eachRow = allrow.get(i);
			List<WebElement> allData = eachRow.findElements(By.tagName("td"));
			for (int j = 0; j < allData.size(); j++) {
				WebElement eachData = allData.get(j);
				System.out.println(eachData.getText());
			}
			
			}
			
		}
}
}
