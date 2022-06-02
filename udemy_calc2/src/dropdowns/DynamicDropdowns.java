package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicDropdowns {
	public static void main(String[] args) {
		WebDriver driver = BaseClass.InitiateDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'AIP')]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//div[contains(text(),'To')]")).clear();
		driver.findElement(By.xpath("//div[contains(text(),'KQH')]")).click();
		
	}
}
