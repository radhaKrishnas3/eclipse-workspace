package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BaseClass{
	public static void main(String[] args) {
		WebDriver driver;
		driver = InitiateDriver();
//		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
//		WebElement sel = driver.findElement(By.xpath("//select[@name='country']"));
//		Select s = new Select(sel);
//		s.selectByIndex(2);
//		s.selectByVisibleText("ALGERIA");
		driver.get("https://www.wikipedia.org/");
		WebElement sel = driver.findElement(By.id("searchLanguage"));
		Select s = new Select(sel);
		s.selectByValue("ast");
		s.selectByValue("be");
		
		List<WebElement> ls =driver.findElements(By.tagName("option"));
		for(WebElement l: ls) {
			System.out.println(l.getAttribute("lang"));
			
		}
		System.out.println(ls.get(7).getText());
		
		
	}
}
