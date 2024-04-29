package com.allianz.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//name or id as string
public class Demo3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking"); 
		
		driver.switchTo().frame("login_page");

		//enter userid as john123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		//click on continue
		//linktext or partial linktext - match the font available on UI
		//xpath - match the html
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//switch to main html
		driver.switchTo().defaultContent();
		
	}

}
