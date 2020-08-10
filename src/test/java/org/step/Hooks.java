package org.step;


import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public WebDriver driver;
	@Before
	
	public void beforetest() {
		
		Date d = new Date();
		System.out.println(d);
		
	}
	
	@After
	public void Aftertest(Scenario Scenario) {
		
		if (Scenario.isFailed()) {
			
			TakesScreenshot sc = (TakesScreenshot)driver;
			 byte[] screenshotAs = sc.getScreenshotAs(OutputType.BYTES);
			Scenario.embed(screenshotAs,"img/png");
		}	

		}
		
		

	}


