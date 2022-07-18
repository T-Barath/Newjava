package com.Maven.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\barat\\eclipse-workspace\\Selenium\\Driver 103\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void getUrl(String Url) {
		driver.get(Url);
	}
	
	public static void clr(WebElement element) {
		element.clear();
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("index")) {
			s.selectByIndex(0);
		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}

	public static void close() {
		driver.close();

	}

}
