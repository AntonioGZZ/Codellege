package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	// Use Cucumber to bind the feature file steps to Java code
	// Glue code - step definition - step implementation
	WebDriver driver = Hooks.driver;
	
	
	//Given the user is on the login page
	@Given("the user is on the login page")
	public void user_on_login_page() {
		System.out.println("I'm in the login!");
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		String title = driver.getTitle();
		System.out.println("El titulo es: "+title);
		Assert.assertEquals("SDET Training | Account Management", title);
	}
	
	//When the user enters valid credentials
	@When("the user enters valid credentials")
	public void user_enters_credentials() {
		WebElement txtUser = driver.findElement(By.id("MainContent_txtUserName"));
		txtUser.sendKeys("ipgb2207@gmail.com");
		WebElement txtPssw = driver.findElement(By.id("MainContent_txtPassword"));
		txtPssw.sendKeys("PASSWORD");
		System.out.println("I've already entered my stupids credentials don't u see mother fucker!!");
		

	}
	//When the user enters valid credentials
	@When("the user enters invalid credentials")
		public void user_enters_invalidcredentials() {
			WebElement txtUser = driver.findElement(By.id("MainContent_txtUserName"));
			txtUser.sendKeys("ipgb2207@gmail.com");
			WebElement txtPssw = driver.findElement(By.id("MainContent_txtPassword"));
			txtPssw.sendKeys("asdasdad");
			System.out.println("I've already entered my stupids credentials don't u see mother fucker!!");
		}
		
	@When ("^the user enters \"(.*)\" and \"(.*)\"$")
	public void username_and_password(String username, String password) {
		WebElement txtUser = driver.findElement(By.id("MainContent_txtUserName"));
		txtUser.sendKeys(username);
		WebElement txtPssw = driver.findElement(By.id("MainContent_txtPassword"));
		txtPssw.sendKeys("PASSWORD");
		click_login();
		}
		
	@When ("^the user enters username as \"(.*)\"$")
	public void username(String username) {
		WebElement txtUser = driver.findElement(By.id("MainContent_txtUserName"));
		txtUser.sendKeys(username);
	}
	
	@And ("^the user enters password as \"(.*)\"$")
	public void userpassword(String password) {
		WebElement txtPssw = driver.findElement(By.id("MainContent_txtPassword"));
		txtPssw.sendKeys("PASSWORD");
	}
	@And ("user clicks login")
	public void click_login(){
		WebElement btnLogin = driver.findElement(By.id("MainContent_btnLogin"));
		btnLogin.click();
	}
	
	//Then the user should be able to view account balance
	@Then("the user should be able to view account balance")
	public void user_able_to_view_credentials() {
		System.out.println("I'm seeing my credentials!");
		String bodyText = driver.findElement(By.xpath("html/body")).getText();
		Assert.assertTrue(bodyText.contains("Logged in"));
		
	}
}
