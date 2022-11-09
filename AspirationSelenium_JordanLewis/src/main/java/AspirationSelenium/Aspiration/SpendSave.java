package AspirationSelenium.Aspiration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpendSave extends Base
{
    WebDriver driver = super.driver;
    private By spendSaveLink = By.xpath("//*[@id=\'__next\']/div/header/ul[1]/li[1]/a");
    private By homeCookies = By.xpath("//*[@id=\'onetrust-close-btn-container\']/button");
    private By spendSaveTitle = By.xpath("//*[@id=\"__next\"]/div/section/div/div[1]/h1");
    private By aspTitle = By.xpath("//*[@id=\'__next\']/div/div[2]/section[6]/div/div[1]/div[1]/div[1]/div[1]/span");
    private By aspPlusTitle = By.xpath("//*[@id=\'__next\']/div/div[2]/section[6]/div/div[1]/div[1]/div[2]/div[1]/span");
    private By annualPrice = By.xpath("//*[@id=\'__next\']/div/div[2]/section[6]/div/div[1]/div[1]/div[2]/div[2]/p[2]");
    private By regPrice = By.xpath("//*[@id='__next']/div/div[2]/section[6]/div/div[1]/div[1]/div[2]/div[2]/p[1]");
    
    

	
    public SpendSave(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
	public WebElement spendSaveLink()
	{
		return driver.findElement(spendSaveLink);
	}
	
	public WebElement spendSaveTitle()
	{
		return driver.findElement(spendSaveTitle);
	}
	
	public WebElement homeCookies()
	{
		return driver.findElement(homeCookies);
	}
	
	public WebElement aspTitle()
	{
		return driver.findElement(aspTitle);
	}
	
	public WebElement aspPlusTitle()
	{
		return driver.findElement(aspPlusTitle);
	}
	
	public WebElement annualPrice()
	{
		return driver.findElement(annualPrice);
	}
	
	public WebElement regPrice()
	{
		return driver.findElement(regPrice);
	}
	
	public void navSpendSave()
	{
		homeCookies().click();
		spendSaveLink().click();
	}

	
//	public void loginEbay(String userName, String passWord)
//	{
//		userName().sendKeys(userName);
//		continueBtn().click();
//		passWord().sendKeys(passWord);
//		clickSignBtn().click();
//	}	

}
