package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button= driver.findElement(By.cssSelector("#menu1"));
		button.click();
		
		List<WebElement> dropdownlist =driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		for(WebElement ele : dropdownlist)
		{
			String s= ele.getText();
			if(s.equals("About Us"))
			{
				ele.click();
				break;
			}
		}
	}

}
