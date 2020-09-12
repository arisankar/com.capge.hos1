package com.capge.hos1.utility;

import java.util.concurrent.TimeUnit;

import com.capge.hos1.base.testbase;

public class testutil extends testbase{
	
	public static void maximize()
	{
		driver.manage().window().maximize();
	}

	public static void implicitlywait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
}
