package com.DemoPOM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.BasePage;

public class TestPage1 extends BasePage {
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public void BC() {
		report = new ExtentReports("Report/"+"ExtentReportResults.html");
		test = report.startTest("Demo POM");
		setup();
		}
	@Test
	public void Test1() {
		openUrl("https://demoqa.com/");
		test.log(LogStatus.PASS,"Test 1 Passed");

	}
	@Test
	public void Test2() {
		el.clickOnElements();
		test.log(LogStatus.PASS,"Test 2 Passed");

	}
	@Test
	public void Test3() {
		el.clickonTextBox();
		test.log(LogStatus.PASS,"Test 3 Passed");

	}
	@Test
	public void Test4() throws InterruptedException {
		el.creatAccount("abdul", "abdul@gmail.com", "bronx", "Bronx");
		test.log(LogStatus.PASS,"Test 4 Passed");

	}
	@Test
	public void Test5() throws InterruptedException {
		el.clickCheckbox();
		test.log(LogStatus.PASS,"Test 5 Passed");

	}
	@Test
	public void Test6() throws InterruptedException {
		el.clickOnRadioButton();
		test.log(LogStatus.PASS,"Test 6 Passed");

	
	}
	@Test
	public void Test7() throws InterruptedException {
		//el.clickOnElements();
		el.clickonWebTablet("Mohi", "Khan", "m@gmail.com", "30", "20000", "It");
		test.log(LogStatus.PASS,"Test 7 Passed");

	}
	@Test
	public void Test8() throws InterruptedException {
		openUrl("https://demoqa.com/");
        afw.clickOnAlertFrame();
        afw.clickonwindow();
		test.log(LogStatus.PASS,"Test 8 Passed");

	}
		
	
		
	
	@AfterClass
	public void CB() throws InterruptedException {
		closeBrowser();
		report.endTest(test);
		report.flush();
	}
	

}
