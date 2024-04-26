package com.allianz.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//will be deleted
public class ZDemo1Test {
	
	@DataProvider
	public String[][] validData()
	{
		String[][] data=new String[3][2];
		//i--> number of test case
		//j-->number of paramters
		
		data[0][0]="saul";
		data[0][1]="saul123";
		
		data[1][0]="peter";
		data[1][1]="peter123";
	
		data[2][0]="kim";
		data[2][1]="kim123";
		
		return data;
	}
	
	@Test(dataProvider = "validData")
	public void validTest(String username,String password)
	{
		System.out.println("hello"+username+password);
	}

}
