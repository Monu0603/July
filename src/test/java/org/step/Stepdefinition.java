package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
public static WebDriver driver;
	@Given("User should be there at log in page")
	public void user_should_be_there_at_log_in_page() {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\Monu\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		
	    	}

	@When("user should enter valid username and password")
	public void user_should_enter_valid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("singh123456");
		driver.findElement(By.id("password")).sendKeys("singh@123456");
	
	
	}

	@Then("user should click on the login button")
	public void user_should_click_on_the_login_button() {
		driver.findElement(By.id("login")).click();
	
	}



	
}
