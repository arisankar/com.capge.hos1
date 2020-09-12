package com.capge.hos1.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.capge.hos1.base.testbase;





public class loginpage extends testbase {
	
	@FindBy(xpath="//input[@aria-label='Phone number, username, or email']")
	WebElement loginid;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	WebElement pass;
	
	@FindBy(xpath="//button[@class='sqdOP  L3NKy   y3zKF     '][@type='submit']")
	WebElement login;
	
	@FindBy(xpath="//h1[text()='Instagram']")
	WebElement title;
	
	public loginpage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle()
	{
		String t=driver.getTitle();
		return t;
	}
	
	public String VerifyUrl()
	{
		String u=driver.getCurrentUrl();
		return u;
	}
	
	public void verifyloginid(String name)
	{
		loginid.sendKeys(name);
	}
	
	public void verifypass(String passs)
	{
		pass.sendKeys(passs);
	}
	
	public void verifyclick()
	{
		login.click();
	}
	
	public void verifytitle()
	{
		String tit = title.getText();
		System.out.println(tit);
		Assert.assertEquals(tit, "Instagram");
	}
	
	
	public void VerifyTest(String username,String password) throws InterruptedException
	{
		loginid.clear();
		loginid.sendKeys(username);
		Thread.sleep(2000);
		pass.clear();
		pass.sendKeys(password);
	}
	
	
	
	
	
	
	
	
	
	

}
