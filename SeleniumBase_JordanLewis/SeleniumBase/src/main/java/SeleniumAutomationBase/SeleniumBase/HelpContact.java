package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpContact 
{
	WebDriver driver;
    private By helpContactTitle = By.id("gh-title");
	
	public HelpContact(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement helpContactTitle()
	{
		return driver.findElement(helpContactTitle);
	}
}
