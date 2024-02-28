package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) {
		
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
	WebElement a=driver.findElement(By.xpath("//input[@id='user-name']"));
	a.sendKeys("standard_user");
	WebElement b=driver.findElement(By.xpath("//input[@id='password']"));
	b.sendKeys("secret_sauce");
	WebElement button=driver.findElement(By.xpath("//input[@id='login-button']"));
	button.click();
	
	}

}
