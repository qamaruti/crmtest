package com.prjct.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prjct.qa.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//i[contains(text()='contacts')]")
	WebElement Contactsmenu;
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[2]/button/i")
	WebElement AddContacts;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement Save;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomepageTitle() {
		
		 return driver.getTitle();
	}
	
	public void clickContactmenu() {
		Contactsmenu.click();
	}
	public ContactsPage addcontacts() {
		AddContacts.click();
		return new ContactsPage();
	}
	public void enterfirstname(String fn) {
		firstname.sendKeys(fn);
	}
	public void enterlastname(String ln) {
		lastname.sendKeys(ln);
	}
	public void clicksavebtn() {
		Save.click();
	}
}
