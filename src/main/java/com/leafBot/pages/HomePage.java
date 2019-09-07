package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id = "username") WebElement eleUserName;
//	@CacheLookup
	@FindBy(id="password") WebElement elePassword;
	@FindBy(className = "decorativeSubmit") WebElement eleLogin;
	
	public HomePage enterUserName(String userName) {
		clearAndType(eleUserName, userName);
		return this;
	}
	public HomePage enterPassword(String userName) {
		clearAndType(elePassword, userName);
		return this;

	}
	public void clickLogin() {
		click(eleLogin);
		
	}
	
}





