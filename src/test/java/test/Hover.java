package test;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebElement hover=driver.findElement(By.xpath("//ul[@id='nav1']/li[2]/a"));
		
		Actions a =new Actions(driver);
		a.moveToElement(hover).build().perform();
		
		
		WebElement below=driver.findElement(By.xpath("//ul[@id='nav1']/li/ul/li[4]/a"));
		a.moveToElement(below).build().perform();
		
		
		
	}

}
