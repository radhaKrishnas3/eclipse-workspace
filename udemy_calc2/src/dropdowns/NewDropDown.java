package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NewDropDown {

	public static void main(String[] args) {
		WebDriver driver;
		driver = BaseClass.InitiateDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
		WebElement addAdult = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		int i=1;
		while(i<8) {
			addAdult.click();
			i++;
		}
		String adultCount = driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]/div[1]")).getText();
		Assert.assertEquals(adultCount, "8 Adults");
	}
}
