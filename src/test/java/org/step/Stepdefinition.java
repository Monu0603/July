package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

	@Given("user should enter valid {string} and {string}")
	public void user_should_enter_valid_and(String string, String string2) {
	    driver.findElement(By.id("username")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(string2);
	    
	    
	}

	@Given("user should click on the login button")
	public void user_should_click_on_the_login_button() {
	  driver.findElement(By.id("login")).click();
	 
	}

	@When("user has to select location")
	public void user_has_to_select_location() {
	   
		WebElement findElement = driver.findElement(By.id("location"));
		Select s = new Select(findElement);
		s.selectByVisibleText("Sydney");
	}

	@When("user has to select the given drop down")
	public void user_has_to_select_the_given_drop_down() {
	   
		WebElement f = driver.findElement(By.id("hotels"));
		Select s = new Select(f);
		s.selectByIndex(1);
		WebElement k = driver.findElement(By.id("room_type"));
		Select b = new Select(k);
		b.selectByIndex(1);
		driver.findElement(By.id("Submit")).click();
	}

	
	
}
