package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class POM {
	@FindBy (id="gh-ac")
	public static WebElement search;
	
	@FindBy (id="gh-btn")
	public static WebElement searchButton;
	
	public static WebElement getSearch() {
		return search;
	}

	public static WebElement getSearchButton() {
		return searchButton;
	}

	@FindBy (xpath="(//span[text()='US $109.00'])[1]")
	public static WebElement Guitar;
	
	public static WebElement getGuitar() {
		return Guitar;
	}

	@FindBy (xpath="//h3[text()='Mitchell TD100 3/4 Size Surf Green Electric Guitar Starter Pack w/ Fender Strap']")
	public static WebElement guitarWindow;

	public static WebElement getGuitarWindow() {
		return guitarWindow;
	}
	

}
