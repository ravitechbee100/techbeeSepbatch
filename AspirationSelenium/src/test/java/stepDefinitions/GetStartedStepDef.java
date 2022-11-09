package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.junit.Assert;

public class GetStartedStepDef 
{
	WebDriver driver;
	
	@Given("open browser\\/launch Aspiration homepage")
	public void open_browser_launch_aspiration_homepage() 
	{
		driver = WebDriverManager.chromedriver().create();
		System.out.println("User with Aspiration url");
		driver.get("https://aspiration.com/");
	}
	
	@When("user clicks Get Started")
	public void user_clicks_get_started() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    WebElement getStartedBtn = driver.findElement(By.id("1EYrOibh6F5A0zi3c12Nuc"));
	    getStartedBtn.click();
	}
	@Then("user can view modal containing input field for email address")
	public void user_can_view_modal_containing_input_field_for_email_address() 
	{
	    WebElement enterEmail = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/h5"));
	    Assert.assertEquals("Enter your email to get started", enterEmail.getText());
	    driver.quit();
	}
}
