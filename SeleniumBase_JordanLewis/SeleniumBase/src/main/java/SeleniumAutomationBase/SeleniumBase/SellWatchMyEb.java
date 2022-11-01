package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellWatchMyEb extends Base
{
	WebDriver driver;
    private By sellTitle = By.xpath("//*[@id=\'image_banner_1\']/div/div/h2");
    private By watchTitle = By.xpath("//*[@id=\"gh-wl-click-body\"]/div/div/div/span[2]");
    private By myEbTitle = By.xpath("//*[@id=\'gh-eb-My\']/div/a[1]");
    private By welcomeMsg = By.id("greeting-msg");
    
	public SellWatchMyEb(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement sellTitle()
	{
		return driver.findElement(sellTitle);
	}
	
	public WebElement watchTitle()
	{
		return driver.findElement(watchTitle);
	}
	
	public WebElement myEbTitle()
	{
		return driver.findElement(myEbTitle);
	}
	
	public WebElement welcomeMsg()
	{
		return driver.findElement(welcomeMsg);
	}
}
