package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.xpath("//button[@id='menu1']"));
		a.click();
		List<WebElement> dropdownvalues =	driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		for(WebElement t : dropdownvalues)
		{
			String value = t.getText();
			if(value.equals("CSS"))
			{
				t.click();
				break;
			}
		}
	}

}
