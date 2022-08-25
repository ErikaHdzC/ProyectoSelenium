package com.finalProject;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ProyectoFinal {
	
	WebDriver driver;
	Base base;
	MainPage mainPage;
	ExtentReports extent;
	ExtentTest logger;
	private String className = this.getClass().getSimpleName();
	int min = 100;
    int max = 999;
    String username= GlobalVariables.USERNAME + Double.toString(Math.floor(Math.random()*(max-min+1)+min));
    

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
	public void TC001() {

		// POM


		logger = extent.startTest(className + " - " + new Object() {}.getClass().getEnclosingMethod().getName());
		

		base.launchBrowser(GlobalVariables.PROJ_URL);
		
		mainPage.login();
		
		Assert.assertTrue(mainPage.ValidateLogin());
		
		mainPage.addUser(username);
			 
	   logger.log(LogStatus.PASS, "Validation " + className + " - " + new Object() {}.getClass().getEnclosingMethod().getName() + " was successful");
		    
		
		
	}
	
	@Test
	public void TC002() {
		
		
		logger = extent.startTest(className + " - " + new Object() {}.getClass().getEnclosingMethod().getName());
		
        base.launchBrowser(GlobalVariables.PROJ_URL);
		
		mainPage.searchUser(username);
		
		Assert.assertTrue(mainPage.userFound());
			
		mainPage.selectUser();
		
		mainPage.deleteUser();
	 
		mainPage.searchUser(username);
		
		Assert.assertTrue(mainPage.userNotFound());
		
			
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
