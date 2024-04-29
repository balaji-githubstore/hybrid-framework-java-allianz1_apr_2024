package com.allianz.inheritance;

interface WebDriver1 {
	public abstract void get(String url);

	void quit();
}
interface Javascriptor1
{
	void executeScript(String script);
}

class ChromeDriver implements WebDriver1,Javascriptor1 {
	public ChromeDriver() {
		System.out.println("launch chrome browser");
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("navigate to url in chrome");
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("quit chrome browser");
	}

	@Override
	public void executeScript(String script) {
		// TODO Auto-generated method stub
		System.out.println("execute script in chrome");
	}
}

class FirefoxDriver implements WebDriver1,Javascriptor1 {
	public FirefoxDriver() {
		System.out.println("launch firefox browser");
	}

	@Override
	public void get(String url) {
		System.out.println("navigate to url in firefox");

	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("quit firefox");
	}

	@Override
	public void executeScript(String script) {
		// TODO Auto-generated method stub
		System.out.println("run script in firefox");
		
	}

}
class XBrowser implements WebDriver1,Javascriptor1
{
	public XBrowser()
	{
		System.out.println("launch X browser");
	}
	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void executeScript(String script) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Demo3Interface {
	public static void main(String[] args) {
		
		WebDriver1 driver=new FirefoxDriver();
		//method to be called is resolved runtime
		driver.get("");
		driver.quit();
		
		Javascriptor1 js= (Javascriptor1) driver;
		js.executeScript("");
		
//		ChromeDriver d=(ChromeDriver) driver;
//		d.executeScript("");
	}

}
