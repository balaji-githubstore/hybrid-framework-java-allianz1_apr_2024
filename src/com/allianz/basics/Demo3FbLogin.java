package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3FbLogin {
	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("hello1234455@gmail.com");
		
		By locator=By.id("email");
		WebElement ele= driver.findElement(locator);
		ele.sendKeys("hello1233@gmail.com");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("hello");
		
		driver.findElement(By.id("pass")).sendKeys("welcome@123");
		//click on login
		driver.findElement(By.name("login")).click();
		
		
	}

}
