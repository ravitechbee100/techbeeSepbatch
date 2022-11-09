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

public class SpendSaveStepDef 
{		
	WebDriver driver;
	
	@Given("user Aspiration website url")
	public void user_aspiration_website_url() 
	{
		driver = WebDriverManager.chromedriver().create();
		System.out.println("User with Aspiration url");
	}
	@When("user launches Aspiration website")
	public void user_launches_aspiration_website() 
	{
		driver.get("https://aspiration.com/");
	}
	@Then("user is on Aspiration homepage")
	public void user_is_on_aspiration_homepage() 
	{
		WebElement homePageMsg = driver.findElement(By.xpath("//*[@id=\'__next\']/div/section/section/div/div/h1"));
		Assert.assertEquals("You can change Climate Change", homePageMsg.getText());
		driver.quit();
	}
	
	@Given("open browser\\/launch Aspiration website")
	public void open_browser_launch_aspiration_website() 
	{
		driver = WebDriverManager.chromedriver().create();
		System.out.println("User with Aspiration url");
		driver.get("https://aspiration.com/");
	}
	@When("user clicks Spend & Save link at the top of the homepage")
	public void user_clicks_spend_save_link_at_the_top_of_the_homepage() 
	{
		WebElement spendSaveLink = driver.findElement(By.xpath("//*[@id=\'__next\']/div/header/ul[1]/li[1]/a"));
		spendSaveLink.click();
	}
	@Then("user can view products and prices Aspiration and Aspiration Plus")
	public void user_can_view_products_and_prices_Aspiration_and_Aspiration_Plus()  
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    WebElement spendSavePlans = driver.findElement(By.xpath("//*[@id=\'__next\']/div/div[2]/section[6]/div/div[1]/div[1]/h2"));
	    WebElement aspTitle = driver.findElement(By.xpath("//*[@id=\'__next\']/div/div[2]/section[6]/div/div[1]/div[1]/div[1]/div[1]/span"));
	    WebElement aspPlusTitle = driver.findElement(By.xpath("//*[@id=\'__next\']/div/div[2]/section[6]/div/div[1]/div[1]/div[2]/div[1]/span"));
	    Assert.assertEquals("Spend & Save Plans", spendSavePlans.getText());
	    Assert.assertEquals("ASPIRATION", aspTitle.getText());
	    Assert.assertEquals("ASPIRATION PLUS", aspPlusTitle.getText());
	    driver.quit();
	}
	
	
}
