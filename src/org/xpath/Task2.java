package org.xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Task2 {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get(" http://www.greenstechnologys.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
}
}
