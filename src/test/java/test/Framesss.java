package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framesss {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		String parentid= driver.getWindowHandle();
		WebElement ele= driver.findElement(By.cssSelector("button#newTabsWindowsBtn"));
		ele.click();
	
		
		Set<String> childid= driver.getWindowHandles();
		for(String a :childid)
		{
			if(!parentid.equals(a))
				driver.switchTo().window(a);
				
				WebElement firstName=driver.findElement(By.cssSelector("input#firstName"));
				firstName.sendKeys("Automation");
		}
				
		
	}

}
