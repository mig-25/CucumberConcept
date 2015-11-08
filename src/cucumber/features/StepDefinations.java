package cucumber.features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	
	WebDriver driver = null;
	
	@Given("^I am on the login page$")
	public void shouldNavigateToLoginPage() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://gladahundarx.businesscatalyst.com/form_toggle.html");
	}

	@When("^I input my user name and password$")
	public void submitUserNameAndPassword() throws Throwable {
		driver.findElement(By.name("login")).sendKeys("sohail");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.id("show")).click();
	}

	@Then("^I should get confirmation$")
	public void shouldGetConfirmationOfLogin() throws Throwable {
		Assert.assertTrue("Logged In",
				driver.getTitle().equals("Login"));

}
	}
