package com.allianz.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5CitiJsWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp"); 
		
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		
		//approach 1
		//driver.findElement(By.id("bill-date-long")).sendKeys("20/07/2010");
		
		//approach 2 - try to automate calendar
		
		//approach 3 - use javascript
		//document.querySelector('#bill-date-long').value='20/07/2010'
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("document.querySelector('#bill-date-long').value='20/07/2010'");
		
		WebElement element1= driver.findElement(By.xpath("//input[@id='bill-date-long']"));
		js.executeScript("arguments[0].value='20/07/2010'",element1);
	}

}
