package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DailyDeals extends Base
{
	WebDriver driver;
    private By dealsTitle = By.xpath("//*[@id=\"refit-spf-container\"]/div[1]/h1/a");
	
	public DailyDeals(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement dealsTitle()
	{
		return driver.findElement(dealsTitle);
	}
	
}
