package com.allianz.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ZDemo4Extent {
	public static void main(String[] args) {
		
		//initialization of report - should run only once
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		//create a test - @BeforeMethod
		ExtentTest test= extent.createTest("MyFirstTest-Balaji");
		
		//log the test pass or fail or skip - @AfterMethod
		test.log(Status.FAIL, "This is a logging event for MyFirstTest, and it passed!");
		
		//generate the report-should run only once
		extent.flush();

		
	}

}
