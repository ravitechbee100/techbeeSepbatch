package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotifCart 
{
	WebDriver driver;
    private By notifMsg = By.xpath("//*[@id=\'ghn-err\']/span/a");
    private By cartTitle = By.xpath("//*[@id=\'mainContent\']/div/div[1]/h1");
    
	public NotifCart(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement notifMsg()
	{
		return driver.findElement(notifMsg);
	}
	
	public WebElement cartTitle()
	{
		return driver.findElement(cartTitle);
	}
}
