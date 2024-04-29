package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5Sales {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk"); 
		
		//enter first name as jack
		driver.findElement(By.name("UserFirstName")).sendKeys("jack");
		//enter lastname as wick
		driver.findElement(By.xpath("//input[contains(@id,'UserLastName')]")).sendKeys("fennel");
		
		//select country as UK
		Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByVisibleText("United Kingdom");
		driver.findElement(By.name("CompanyName")).sendKeys("jack");
		//click on checkbox
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
	}

}
