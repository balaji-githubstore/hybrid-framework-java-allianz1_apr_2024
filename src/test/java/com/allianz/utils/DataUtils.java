package com.allianz.utils;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	@DataProvider
	public Object[][] validLoginData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "admin";
		data[0][1] = "pass";
		data[0][2] = "OpenEMR";

		data[1][0] = "accountant";
		data[1][1] = "accountant";
		data[1][2] = "OpenEMR";

		return data;
	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException
	{
		//Sheetname is same as @Test method name
		String currentTestMethodName=mtd.getName();
		Object[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("src/test/resources/open_emr_data.xlsx", currentTestMethodName);
		return data;
	}

}
