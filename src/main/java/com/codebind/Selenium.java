package com.codebind;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
WebDriver driver ;
	
	public boolean retryingFindClick(By by) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            driver.findElement(by).click();
	            result = true;
	            break;
	        } catch(StaleElementReferenceException e) {
	        }
	        attempts++;
	    }
	    return result;
	}
	
	public void dropdownGetAllOptions(By locator) {

		Select oselect = new Select(driver.findElement(locator));
		List<WebElement> olist = oselect.getOptions();
		String oValueDT = "ewt.wete.rey.wte.";
		String[] str = oValueDT.split(".");
		if (str.length == olist.size()) {

			for (int i = 0; i < str.length; i++) {
				if (olist.get(i).equals(str[i])) {
					System.out.println("The Value  is as expected " + olist.get(i));
				} else {
					System.out.println("The Value  is not as expected " + olist.get(i));
				}
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	}

}
