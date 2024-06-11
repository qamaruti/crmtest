package com.prjct.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prjct.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement loginbutton;
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement lgnbutton;
	@FindBy(xpath="//a[@class='brand-name']")
	WebElement logo;
	
	
	//Initialize page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateloginpageTitle() {
		return driver.getTitle();
	}
	public boolean crmlogo() {
		return logo.isDisplayed();
	}
	public HomePage login(String un,String pwd) {
		loginbutton.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		lgnbutton.click();
		return new HomePage();
		
	}
}
