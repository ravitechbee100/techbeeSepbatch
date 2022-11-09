package AspirationSelenium.Aspiration;
import org.openqa.selenium.WebDriver;

import Helpers.ConfigSettings;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	WebDriver driver;
	ConfigSettings config = new ConfigSettings();
    
	public WebDriver browserInitialization(String browser) throws InterruptedException
	{

		if(browser.equals(config.browserName()))
		{
			driver = WebDriverManager.chromedriver().create();
		}
		else if (browser.equals(config.browserName()))
		{
			driver = WebDriverManager.firefoxdriver().create();
		}
		else if (browser.equals(config.browserName()))
		{
			driver = WebDriverManager.edgedriver().create();
		}
			//Thread.sleep(5000);
			driver.get(config.url());
			String url = driver.getCurrentUrl();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("The url is " + url);
			return driver;
	}
	
}

