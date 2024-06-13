package com.prjct.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prjct.qa.base.TestBase;
import com.prjct.qa.pages.ContactsPage;
import com.prjct.qa.pages.HomePage;
import com.prjct.qa.pages.LoginPage;

public class HomepageTest extends TestBase{

	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomepageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		
		initilization();
		loginPage =new LoginPage();
		homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test 
	public void verifytitlepageTest() {
		String homepagetitle= homePage.verifyHomepageTitle();
		Assert.assertEquals(homepagetitle, "Cogmento CRM");
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
}
