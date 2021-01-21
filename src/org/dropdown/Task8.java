package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement userId = driver.findElement(By.id("username"));
		userId.sendKeys("sowntharya");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("sss*123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s=new Select(loc);
		s.selectByVisibleText("Sydney");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomType);
		s2.selectByVisibleText("Super Deluxe");
		WebElement roomNo = driver.findElement(By.id("room_nos"));
		Select s3=new Select(roomNo);
		s3.selectByVisibleText("1 - One");
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adultRoom);
		s4.selectByVisibleText("1 - One");
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select s5=new Select(childRoom);
		s5.selectByVisibleText("1 - One");
		
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("first_name")).sendKeys("sowmi");
		driver.findElement(By.id("last_name")).sendKeys("sarwin");
		driver.findElement(By.id("address")).sendKeys("chennai");
		driver.findElement(By.id("cc_num")).sendKeys("8098765432109876");
		
		WebElement cc = driver.findElement(By.id("cc_type"));
		Select a=new Select(cc);
		a.selectByVisibleText("VISA");
		WebElement mon = driver.findElement(By.id("cc_exp_month"));
		Select b=new Select(mon);
		b.selectByVisibleText("February");
		WebElement yr = driver.findElement(By.id("cc_exp_year"));
		Select w=new Select(yr);
		w.selectByVisibleText("2021");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("567");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(10000);

		WebElement down = driver.findElement(By.id("search_hotel"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id("order_no"));
		System.out.println("order no:"+element.getAttribute("value"));

	

	
	
}


}








