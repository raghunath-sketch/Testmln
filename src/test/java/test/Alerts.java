package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Alerts {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.switchTo().frame("frm1");
		
		WebElement qwe=driver.findElement(By.cssSelector("select#course"));
		
		Select s =new Select(qwe);
		s.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		WebElement firstName=driver.findElement(By.cssSelector("input#firstName"));
		firstName.sendKeys("Automation");
		
		
		
		
		
	
		
	}

}
