package com.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Ejercicio6 {
	public void f() {

		// Ejercicio "Add a new computer"

		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://computer-database.gatling.io/computers");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Computers database"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add")));

		driver.findElement(By.id("add")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

		driver.findElement(By.id("name")).sendKeys("MacBook Air 13 Chip M1");
		driver.findElement(By.id("introduced")).sendKeys("2022-08-11");
		driver.findElement(By.id("discontinued")).sendKeys("2032-08-30");

		Select drpCompany = new Select(driver.findElement(By.id("company")));

		drpCompany.selectByVisibleText("Apple Inc.");
		driver.findElement(By.className("btn")).click();

		driver.close();
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
