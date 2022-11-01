package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer 
{
	WebDriver driver;
    private By compTitle = By.xpath("//*[@id=\'main-nav-menu\']/nav/ul/li[2]/a");
    private By announTitle = By.xpath("//*[@id=\'lia-body\']/div[2]/center/div[1]/div/div/div/div[1]/div[2]/div[1]/div/div/section/h2");
    private By commTitle = By.xpath("//*[@id=\'lia-body\']/div[2]/center/div[1]/div/div/div/div[1]/div[1]/div/div/div/div[3]/div/div/div/div/div[1]/span");
    private By secCentTitle = By.id("security_nav_title");
    private By sellCentTitle = By.xpath("//*[@id=\'sellercenter-page\']/div[1]/h2/a");
    private By policiesTitle = By.xpath("//*[@id=\'bc\']/nav/ul/li[5]/a");
    private By affiliatesTitle = By.xpath("//*[@id=\'body\']/div/div[3]/div/div/div[1]/div/div[1]/h1");
    private By helpContactTitle = By.id("gh-title");
    private By siteMapTitle = By.xpath("/html/body/div[2]/div[1]/h1");
    
	public Footer(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement compTitle()
	{
		return driver.findElement(compTitle);
	}
	
	public WebElement announTitle()
	{
		return driver.findElement(announTitle);
	}
	
	public WebElement commTitle()
	{
		return driver.findElement(commTitle);
	}
	
	public WebElement secCentTitle()
	{
		return driver.findElement(secCentTitle);
	}
	
	public WebElement sellCentTitle()
	{
		return driver.findElement(sellCentTitle);
	}
	
	public WebElement policiesTitle()
	{
		return driver.findElement(policiesTitle);
	}
	
	public WebElement affiliatesTitle()
	{
		return driver.findElement(affiliatesTitle);
	}
	
	public WebElement helpContactTitle()
	{
		return driver.findElement(helpContactTitle);
	}
	
	public WebElement siteMapTitle()
	{
		return driver.findElement(siteMapTitle);
	}
}

