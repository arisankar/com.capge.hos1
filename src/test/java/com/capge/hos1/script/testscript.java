package com.capge.hos1.script;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.capge.hos1.base.testbase;
import com.capge.hos1.pages.loginpage;
import com.capge.hos1.pages.mainpage;




public class testscript extends testbase{
	
	
	loginpage logg;
	mainpage mainn;
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		open();
		logg = new loginpage();
	}
	
@Test(priority=1)
public void validateloginid()
{
	logg.verifyloginid("haris2366@gmail.com");
}


@Test(priority=2)
public void validatepass()
{
	logg.verifypass("8925473737");
}
	
@Test(priority=3)
public void validatelogin()
{
	logg.verifyclick();
}

@Test(priority=4)
public void validatetitle()
{
	logg.verifytitle();
	}

@Test(enabled=false)
public void validatenotnow() throws InterruptedException
{
	mainn.verifynotnow();
	Thread.sleep(3000);
}





@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
	

}
