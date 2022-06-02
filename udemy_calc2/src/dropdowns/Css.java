package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {
	public static void main(String[] args) {
		
		//xpath = //tagname[@attribute='value']
		//css= tagname[@attribute='value']
		
		WebDriver driver;
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\apoorv\\eclipse-workspace\\udemy_calc2\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("oReally?");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Nopes");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
//		driver.findElement(By.cssSelector("#Login")).click();
		
		/*	#Id- in Css selector
		/*	.Class- remove space and replace dot - in CSS selector
		/*
		/*
		/*
		 * */
		 
	}
}
