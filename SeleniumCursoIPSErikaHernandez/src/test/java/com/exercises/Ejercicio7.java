package com.exercises;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.finalProject.Base;
import com.finalProject.GlobalVariables;
import com.exercises.MainPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



@Test
public class Ejercicio7 {
	
	
	WebDriver driver;
	Base base;
	MainPage mainPage;
	ExtentReports extent;
	ExtentTest logger;
	private String className = this.getClass().getSimpleName();
	
	
	@BeforeTest
	public void beforeTest() {
		
		base = new Base(driver);
		driver = base.chromeDriverCon();
		mainPage = new MainPage(driver);
		
	
		// Set up Extend reports
	   extent = new ExtentReports(System.getProperty(GlobalVariables.USER_DIR) + GlobalVariables.REPORT_PATH, true);
	   extent.addSystemInfo(GlobalVariables.EXTENT_QA_URL, GlobalVariables.QA_URL);
	   extent.loadConfig(new File(System.getProperty(GlobalVariables.USER_DIR) + GlobalVariables.CONFIG_EXTENT));
	}
	
@Test

	public void TC01() {

		// POM

	    logger = extent.startTest(className + " - " + new Object() {}.getClass().getEnclosingMethod().getName());
	
		base.launchBrowser(GlobalVariables.QA_URL);
		
		mainPage.AddComputer();

	
		logger.log(LogStatus.PASS, "Validation " + className + " - " + new Object() {}.getClass().getEnclosingMethod().getName() + " was successful");
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
//			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
			logger.log(LogStatus.FAIL, logger.addScreenCapture(base.takeScreenshot("fail")));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		}
		extent.endTest(logger);

	}
	
	
	@AfterTest
	public void afterTest() {
		// Close Extend report
		extent.flush();
		extent.close();
	    base.closeBrowser();
		
	}


}
