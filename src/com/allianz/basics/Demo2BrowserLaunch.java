package com.allianz.basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2BrowserLaunch {

	public static void main(String[] args) {
		
		String browser="edge";
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("edge"))
		{
			 driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("ff"))
		{
			 driver=new FirefoxDriver();
		}
		else {
			 driver=new ChromeDriver();
		}

		
		

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
