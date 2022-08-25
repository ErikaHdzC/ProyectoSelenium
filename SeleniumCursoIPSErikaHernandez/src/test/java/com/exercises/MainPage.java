package com.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.finalProject.Base;

public class MainPage extends Base {

	public MainPage(WebDriver driver) {
		super(driver);
	}

	By txtFilterCompName = By.id("searchbox");
	By btnFilterByName = By.id("searchsubmit");
	By tblActualFirstRow = By.xpath("//tbody/tr[1]/td[1]");

	public void filterComputerByName(String computer) {
		verifyTitleContains("Computers");
		verifyVisibilityElement(txtFilterCompName);
		type(txtFilterCompName, computer);
		takeScreenshot("beforeClickFilter");
		click(btnFilterByName);
		takeScreenshot("afterClickFilter");
	}

	public boolean verifyComputerTable(String expectedComputer) {
		String actualComputer = getText(tblActualFirstRow);
		takeScreenshot("verifyComputer");
		if (expectedComputer.equals(actualComputer)) {
			return true;
		} else {
			return false;
		}
		
	
	}
	
	public void AddComputer()
	{
		
		verifyTitleContains("Computers database");
		verifyVisibilityElement(By.id("add"));
		click(By.id("add"));
		verifyVisibilityElement(By.id("name"));
		type(By.id("name"), "MacBook Air 13 Chip M1");
		type(By.id("introduced"), "2022-08-11");
		type(By.id("discontinued"), "2032-08-30");
		select(By.id("company"), "Apple Inc.");
		
		takeScreenshot("ComputerToBeAdded");
		click(By.className("btn"));
		
		takeScreenshot("ComputerAdded");
	}
	
	
}

