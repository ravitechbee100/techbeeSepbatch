package AspirationSelenium.Aspiration;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetStarted 
{
    WebDriver driver;
    Random random = new Random();
    int rand = random.nextInt(100000);
    private By getStartedLink = By.id("1EYrOibh6F5A0zi3c12Nuc");
    private By emailText = By.xpath("//*[@id=\'__next\']/div/section/section/div/div/div[1]/form/div[1]/div/input");
    private By getStartedBtn = By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[2]/button");
    private By getStartedMsg = By.xpath("//*[@id=\'__next\']/div[1]/div/div/div[1]/div[2]/div/div[1]/div[2]");
    
    public GetStarted(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
	public WebElement getStartedLink()
	{
		return driver.findElement(getStartedLink);
	}
	
	public WebElement emailText()
	{
		return driver.findElement(emailText);
	}
	
	public WebElement getStartedBtn()
	{
		return driver.findElement(getStartedBtn);
	}
	
	public WebElement getStartedMsg()
	{
		return driver.findElement(getStartedMsg);
	}
	
	public void signUp()
	{
		getStartedLink().click();
		emailText().sendKeys("jordaninaz" + rand + "@gmail.com");
		getStartedBtn().click();
	}
	
}
