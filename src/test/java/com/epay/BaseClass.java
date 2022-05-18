package com.epay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement findElement;
	

	public static WebDriver getDriver() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
	}
	public static void launchUrl(String url) {
	driver.get(url);

}
}