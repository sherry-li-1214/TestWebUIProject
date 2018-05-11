package com.backupassist.mopdev.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

import com.backupassist.mopdev.utils.*;
import static org.testng.Assert.assertEquals;


//import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.backupassist.mopdev.utils.*;
//import  com.backupassist.mopdev.utils.BrowserType;

@SuppressWarnings("unused")
public class TestBase {
  WebDriver  webDriver = GlobalVariables.getWebDriver();
  
  @BeforeTest
 	
	public void beforeTest() throws Exception {
	  
	 // webDriver=DriverUtils.getDriver(browser);
      System.out.println("here");
    // webDriver.get(GlobalVariables.URL);
   	 GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
	
	 GlobalVariables.LOGGER.debug("Reading Chrome Driver Location:" + GlobalVariables.TESTPROP.getProperty("test.chromedriver.path"));

  }
	@AfterTest
	public void afterTest() {
	   try
	   {
		DriverUtils.tearDown();
	   } catch (Exception e){
		   e.printStackTrace();
	   }
	}
}
