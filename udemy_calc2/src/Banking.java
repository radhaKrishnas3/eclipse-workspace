import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import udemy_calc.Calculator;


public class Banking {
WebDriver driver;
	Calculator calc = new Calculator();
	public void addSalary() {
		calc.add();
	}
	
	public static void main(String[] args) {
		
//		Banking b = new Banking();
//		b.addSalary();
		
		
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
	}

}
