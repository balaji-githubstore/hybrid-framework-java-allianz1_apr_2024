package com.allianz.basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1BrowserLaunch {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//call below method and print it
		//getTitle()
		//getCurrentUrl()
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
	}

}
