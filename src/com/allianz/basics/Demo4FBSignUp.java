package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4FBSignUp {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//findElement - check for presence of element in 0.5s
		driver.findElement(By.linkText("Create new account")).click(); 
		
		//enter firstname as jack
		driver.findElement(By.name("firstname")).sendKeys("jack");
		
		//enter lastname as well
		//enter mobilenumber as 99999
		//enter password as jack123
		
		//20 Apr 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Apr");
//		selectMonth.selectByValue("4");
//		selectMonth.selectByIndex(3);
		
		
		//select year as 2000
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
	}

}
