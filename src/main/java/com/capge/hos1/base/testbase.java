package com.capge.hos1.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capge.hos1.utility.testutil;

public class testbase {
	
	File f;
	FileInputStream fis;
	Properties pro;
	public static WebDriver driver;
	
	public testbase()
	{
		try
		{
		f=new File(".//src//main//java//com//capge//hos1//config//configuration");
		fis= new FileInputStream (f);
		pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void open()
	{
		String browser = pro.getProperty("browsername");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",pro.getProperty("chromepath"));
			driver=new ChromeDriver();
		}
		
     driver.get(pro.getProperty("url"));
     
     testutil.maximize();
     testutil.implicitlywait();
		
	}
	
	
	

}
