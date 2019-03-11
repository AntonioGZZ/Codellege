package testing.disney;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Examples {
	private WebDriver driver;
	private String codeFolder = "C:/Users/ipgb2/Desktop/Pat/Development/Selenium/testpages/";

	@BeforeTest 
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\i.gonzalez.badillo\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (enabled=true)
	public void test29() {
		driver.get("https://learn.letskodeit.com/p/practice");
		
		
	}
	
	@Test (enabled=true)
	public void test30() {
		driver.get("https://google.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//String titulo = js.executeScript("document.getTitle;").toString();
		//System.out.println("El titulo es: " + titulo);
		System.out.println("El titulo con selenium es: "+driver.getTitle());
		WebElement btnBuscar = driver.findElement(By.id("lst-ib"));
		btnBuscar.sendKeys("Sergio Garcia Gonzalez");
		btnBuscar.sendKeys(Keys.ENTER);
	}
		
	
	@AfterTest
	public void cleanUp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
