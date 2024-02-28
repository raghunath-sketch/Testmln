package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagesteps {
	
WebDriver driver= new ChromeDriver();
	@Given("user launch the url")
	public void user_launch_the_url() {
		driver.get("https://www.saucedemo.com/");
	   
	}

	
	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String user, String pass) {
		WebElement username=driver.findElement(By.cssSelector("input#user-name"));
		username.sendKeys(user);
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		password.sendKeys(pass);
	
	}

	

	@When("click on login button")
	public void click_on_login_button() {
		WebElement loginbutton=driver.findElement(By.cssSelector("input#login-button"));
		loginbutton.click();
	 
	}

	@Then("validate succesful login")
	public void validate_succesful_login() {
		System.out.print("Login Successfully");

	}
}
