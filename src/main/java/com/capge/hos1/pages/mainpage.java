package com.capge.hos1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capge.hos1.base.testbase;

public class mainpage extends testbase{
	
	
	@FindBy(xpath="//button[text()='Not Now']")
	WebElement notnow;
	
	@FindBy(xpath="//span[@class='_2dbep qNELH']/img")
	WebElement image;
	
	@FindBy (xpath="//div[text()='Log Out']")
	WebElement logout;
	
	public mainpage()
	{
		super();
		PageFactory.initElements(driver, this);
	}

	public void verifynotnow()
	{
		notnow.click();
	}
	
	public void verifyimage()
	{
		image.click();
	}
	
	public void verifylogout()
	{
		logout.click();
	}
	
	
	
}
