package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinksAndUrl {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.edge.setup", System.getProperty("user.dir")+"msedgedriver.exe");
		driver =  BaseClass.InitiateDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		//all links
//		List<WebElement> ls = driver.findElements(By.xpath("//a"));
//		for(int i=0;i<ls.size();i++) {
//			System.out.println("the link for "+ ls.get(i).getAttribute("title") + ls.get(i).getAttribute("lang")+" is "+ ls.get(i).getAttribute("href"));
//		}
//		System.out.println("Total links: "+ ls.size());
		
		
		//specific links
		//Thos technique can also be used to find second or third element with same id or matches from the page
		WebElement block = driver.findElement(By.xpath("//div[@class='footer']"));
		
		List<WebElement> ls = block.findElements(By.tagName("a"));
		System.out.println("Elements under a block are: "+ ls.size());
		
	}
}
