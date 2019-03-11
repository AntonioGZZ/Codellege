package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;
	
	@Before
	public void setup() {
		//Initiate WebDriver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\i.gonzalez.badillo\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
