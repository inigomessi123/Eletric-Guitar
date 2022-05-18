package com.epay;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pom.POM;

public class Epay extends BaseClass {
	@Test
	private void Runner() {
		POM p=new POM();
		getDriver();
		launchUrl("https://www.ebay.com/");
		
		PageFactory.initElements(driver,POM.class);
		p.getSearch().sendKeys("electric guitar");
		
		p.getSearchButton().click();
		
		p.getGuitarWindow().click();
		String wind = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String wins : windowHandles) {
			if (!wind.equals(windowHandles)) {
				driver.switchTo().window(wins);
				
			}
		}
		
		WebElement text = p.getGuitar();
		 String t = text.getText();
		 System.out.println(t);
		
	}

}
