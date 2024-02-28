package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Assertprogram {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebElement username=driver.findElement(By.cssSelector("input#user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.cssSelector("input#login-button"));
		loginbutton.click();
		
		WebElement productheader=driver.findElement(By.cssSelector("span.title"));
		//String header=productheader.getText();
		//assertEquals(header, "Product");
		
		assertTrue(productheader.isDisplayed());
	}

}
