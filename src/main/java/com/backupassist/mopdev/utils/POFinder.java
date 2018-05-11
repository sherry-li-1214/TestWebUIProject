package com.backupassist.mopdev.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import com.paulhammant.ngwebdriver.*;

public class POFinder {
	public static WebElement getLabel(String text) {
		WebElement searchResult = GlobalVariables.DRIVER.findElement(By.linkText(text));
		
		return searchResult;
	}

	public static WebElement getButton(String text) {
		WebElement searchResult = GlobalVariables.DRIVER.findElement(By.className("button-inner"));
		
		return searchResult;
	}
}
