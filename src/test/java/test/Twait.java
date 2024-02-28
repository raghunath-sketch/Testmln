package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Twait {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebElement ele =driver.findElement(By.xpath("//select[@id='BlogArchive1_ArchiveMenu']"));
		WebDriverWait t=new WebDriverWait(driver,Duration.ofSeconds(10));
		t.until(ExpectedConditions.visibilityOf(ele));
				
	       
		
		Select s=new Select(ele);
		s.selectByValue("https://www.hyrtutorials.com/2022/12/");
	}

}
