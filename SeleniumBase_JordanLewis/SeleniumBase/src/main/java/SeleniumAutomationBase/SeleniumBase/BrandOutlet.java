package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrandOutlet 
{
	WebDriver driver;
    private By brandOutletTitle = By.xpath("/html/body/div[4]/div[2]/h1/span");
    
	public BrandOutlet(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement brandOutletTitle()
	{
		return driver.findElement(brandOutletTitle);
	}
}
