package com.hackerrank.selenium;

import org.openqa.selenium.WebDriver;

public class XPathLocator {

    public static String relativeXPathForInput(WebDriver driver, String pageUrl) {

    	String locator ="//div//input";
    	return locator;
    }

    public static String absoluteXPathForInput(WebDriver driver, String pageUrl) {
    	String locator ="//html//div//input";
    	return locator;
    }
}
