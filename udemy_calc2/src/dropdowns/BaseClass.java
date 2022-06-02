package dropdowns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	static WebDriver driver;
	
	public static WebDriver InitiateDriver() {
		if(driver== null) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/msedgedriver.exe");
			driver = new EdgeDriver();
		}
	return driver;	
	}
	
}
