package com.backupassist.mopdev.utils;

import org.openqa.selenium.WebDriver;
//import com.paulhammant.ngwebdriver.NgWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;


public class GlobalVariables {
    public static Logger LOGGER = LogManager.getRootLogger();
	public static TestProperties TESTPROP = loadTestProperty();
    public static String HOST  = TESTPROP.getProperty("test.console.host");
    public static String PORT = TESTPROP.getProperty("test.console.port");
    public static String BROWSERTYPE=TESTPROP.getProperty("test.browsertype");
    
    public static String CHROMEDRIVERPATH=TESTPROP.getProperty("test.chromedriver.path"); 
    public static String FIREFOXDRIVERPATH=TESTPROP.getProperty("test.firefoxdriver.path"); 
    public static String IEDRIVERPATH=TESTPROP.getProperty("test.iedriver.path"); 
    //public static BrowserType BROWSERTYPE=BrowserType.CHROME;
    public static String URL = "http://" + HOST + ":" + PORT;
    public static WebDriver DRIVER;
    
    public static long TIMEOUT=Long.parseLong(TESTPROP.getProperty("test.timeout"));
    
	//public static NgWebDriver BROWSER;
	
    public static TestProperties loadTestProperty() {
     	TestProperties prop = new TestProperties();
      	
     	try {
     		LOGGER.debug("Reading test property file:" + System.getProperty("test.propertyFile"));
      		InputStream input = new FileInputStream(System.getProperty("test.propertyFile"));
      		prop.load(input);
        }
      	catch (IOException e){
      		e.printStackTrace();
      	}
      	
  		return prop;
    }
    
    
    public static WebDriver getWebDriver(){
		LOGGER.debug("begin to get webdriver:");
		BrowserType browserType=BrowserType.CHROME;
		String driverPath=CHROMEDRIVERPATH;
		switch (BROWSERTYPE) {
		case "FIREFOX":
			browserType=BrowserType.FIREFOX;
			driverPath=FIREFOXDRIVERPATH;
			break;
		case  "IE":
			browserType=BrowserType.IE;
			driverPath=IEDRIVERPATH;
        	break;
		default:
  			browserType=BrowserType.CHROME;
			driverPath=CHROMEDRIVERPATH;
		}
		
		DRIVER=DriverUtils.getDriver(browserType, driverPath);
		DRIVER.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
			 
		return DRIVER;			
		
       	
    }
    
   
}
