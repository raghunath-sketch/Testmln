package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\raghu\\eclipse-workspace\\com.Bat\\src\\test\\java\\test\\env.properties");
		Properties prop= new Properties();
		prop.load(file);
		
		WebDriver driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		WebElement username= driver.findElement(By.cssSelector("input#user-name"));
		username.sendKeys(prop.getProperty("username"));
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		password.sendKeys(prop.getProperty("password"));
		WebElement button=driver.findElement(By.cssSelector("input#login-button"));
		button.click();
	
	
		
	}

}
