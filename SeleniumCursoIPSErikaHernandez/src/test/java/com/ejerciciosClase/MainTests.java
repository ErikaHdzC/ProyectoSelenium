package com.ejerciciosClase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainTests {
	@Test
	public void f() {

		// Step 1 - Launch browser
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://computer-database.gatling.io/computers/new");

		// Implicit
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Explicit
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Computers database"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

		// Step2 - Insert computer name in text box
		driver.findElement(By.id("name")).sendKeys("Laptop HP");

		driver.close();
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
