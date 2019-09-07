package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
		testcaseName ="TC001_Login";
		testcaseDec = "Login";
		author = "Sarath";
		category = "smoke";
	}
	@Test(dataProvider="fetchData")
	public void runTC001(String username,String password) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin();
	}

}







