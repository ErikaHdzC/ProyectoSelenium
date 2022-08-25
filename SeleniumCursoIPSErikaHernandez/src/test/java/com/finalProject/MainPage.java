package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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


public void login()
{
	
	verifyTitleContains(GlobalVariables.TITLE);
	verifyVisibilityElement(By.name("username"));
	type(By.name("username"), GlobalVariables.LOGIN_USERNAME);
	type(By.name("password"),GlobalVariables.LOGIN_PASSWORD );
	click(By.xpath("//button[@type=\"submit\"]"));

}

public boolean  ValidateLogin()
{
	
    verifyVisibilityElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]"));
    takeScreenshot("After_Login");
    return isDisplayed(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]"));
    
  
   	
}

public void addUser(String username)
{
	
	

	click(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]"));

	implicitWait();

	click(By.xpath("//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]"));
	
	type(By.xpath("//*[contains(text(),'Username')]//following::input"),username );

	type(By.xpath("//*[contains(text(),'Password')]//following::input"), GlobalVariables.PASSWORD);

	type(By.xpath("//*[contains(text(),'Confirm Password')]//following::input"), GlobalVariables.PASSWORD);

	click(By.xpath("//*[contains(text(),'User Role')]//following::div"));

	click(By.xpath("//div[@role=\"option\"][2]"));

	click(By.xpath("//*[contains(text(),'Status')]//following::div"));

	click(By.xpath("//div[@role=\"option\"][2]"));

	type(By.xpath("//*[contains(text(),'Employee Name')]//following::input"), GlobalVariables.NAME);

	verifyVisibilityElement(By.xpath("//div[@role=\"option\"]//span[text()="+ '"' +    GlobalVariables.EMPLOYEE +  '"' + "]"));

	click(By.xpath("//div[@role=\"option\"]//span[text()="+ '"' +    GlobalVariables.EMPLOYEE +  '"' + "]"));

	takeScreenshot("UserIsCreated");
	
	click(By.xpath("//button[@type=\"submit\"]"));
	
	takeScreenshot("AfterUserIsCreated");
	
}

public void searchUser(String username)
{
	
	click(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]"));
	
	verifyVisibilityElement(By.xpath("//form/div/div/div/div/div[2]/input"));
	
	clear(By.xpath("//form/div/div/div/div/div[2]/input"));

	type(By.xpath("//form/div/div/div/div/div[2]/input"), username);
	
	click(By.xpath("//form"));

	click(By.xpath("//form//button[2]"));
}

public void selectUser()
{
	verifyVisibilityElement(By.xpath("//div/div/div/div[2]/div/div[2]/div[3]/div/div[1]/div/div/div/label"));
	
    click(By.xpath("//div/div/div/div[2]/div/div[2]/div[3]/div/div[1]/div/div/div/label"));
}


public void deleteUser()
{
	
	  click(By.xpath("//i[@class=\"oxd-icon bi-trash-fill oxd-button-icon\"]"));
	  
	  takeScreenshot("UserToBeDeleted");
	    
	  click(By.xpath("//div[@class=\"orangehrm-modal-footer\"]/button[2]"));
	  
	  takeScreenshot("UserDeleted");
}


public boolean userNotFound()
{
	verifyVisibilityElement(By.xpath("//span[text()=\"No Records Found\"]"));
	takeScreenshot("UserNotFound");
	return isDisplayed(By.xpath("//span[text()=\"No Records Found\"]"));
	
	
}


public boolean userFound()
{
	verifyVisibilityElement(By.xpath("//span[text()=\"(1) Record Found\"]"));
	takeScreenshot("UserFound");
	return isDisplayed(By.xpath("//span[text()=\"(1) Record Found\"]"));
}

}
