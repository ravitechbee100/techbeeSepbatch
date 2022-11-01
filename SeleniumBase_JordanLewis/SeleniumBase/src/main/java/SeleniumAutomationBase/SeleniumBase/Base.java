package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Helpers.ConfigSettings;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	WebDriver driver;
	ConfigSettings config = new ConfigSettings();
	// Sign In
	private By signIn = By.xpath("//*[@id='gh-ug']/a");
    // Register
	private By registerLink = By.xpath("//*[@id='gh-ug-flex']/a");
    // Daily Deals
	private By dailyDeals = By.xpath("//*[@id=\'gh-p-1\']/a");
    // Brand Outlet
    private By brandOutlet = By.xpath("//*[@id=\'gh-p-4\']/a");
    // Help & Contact
    private By helpContact = By.xpath("//*[@id=\'gh-p-3\']/a");	
    // Sell
    private By sell = By.xpath("//*[@id=\'gh-p-2\']/a");
    // Watchlist
    private By watchlist = By.xpath("//*[@id=\'gh-wl-click\']/div/a[1]");
    // My eBay
    private By myEb = By.xpath("//*[@id=\'gh-eb-My\']/div/a[1]");
    // Notifications
    private By notif = By.id("gh-Alerts-i");
    // Cart
    private By cart = By.xpath("//*[@id=\'gh-minicart-hover\']/div/a[1]");
    // About
    private By about = By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[4]/h3/a");
    // Announcements
    private By announ = By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[5]/ul[2]/li[1]/a");
    // Community
    private By comm = By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[5]/h3[2]/a");
    // Security Center
    private By secCent = By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[2]/ul[2]/li[2]/a");
    // Seller Center
    private By sellCent = By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[5]/ul[1]/li[1]/a");
    // Policies
    private By policies = By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[4]/ul/li[9]/a");
    // Affiliates
    private By affiliates = By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[2]/ul[1]/li[4]/a");
    // Help & Contact
    private By helpContactFooter = By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[5]/h3[1]/a");
    // Site Map
    private By siteMap = By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[2]/ul[2]/li[3]/a");
    
	public WebDriver browserInitialization(String browser) throws InterruptedException
	{
		WebDriverManager.chromedriver().create();
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
			Thread.sleep(5000);
			driver.get(config.url());
			String url = driver.getCurrentUrl();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("The url is " + url);
			return driver;
	}
	
	public WebElement signInLink()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement registerLink()
	{
		return driver.findElement(registerLink);
	}
	
	public WebElement dailyDeals()
	{
		return driver.findElement(dailyDeals);
	}
	
	public WebElement brandOutlet()
	{
		return driver.findElement(brandOutlet);
	}
	
	public WebElement helpContact()
	{
		return driver.findElement(helpContact);
	}
	
	public WebElement sell()
	{
		return driver.findElement(sell);
	}
	
	public WebElement watchlist()
	{
		return driver.findElement(watchlist);
	}
	
	public WebElement myEb()
	{
		return driver.findElement(myEb);
	}

	public WebElement notif()
	{
		return driver.findElement(notif);
	}
	
	public WebElement cart()
	{
		return driver.findElement(cart);
	}
	
	public WebElement about()
	{
		return driver.findElement(about);
	}
	
	public WebElement announ()
	{
		return driver.findElement(announ);
	}
	
	public WebElement comm()
	{
		return driver.findElement(comm);
	}
	
	public WebElement secCent()
	{
		return driver.findElement(secCent);
	}
	
	public WebElement sellCent()
	{
		return driver.findElement(sellCent);
	}
	
	public WebElement policies()
	{
		return driver.findElement(policies);
	}
	
	public WebElement affiliates()
	{
		return driver.findElement(affiliates);
	}
	
	public WebElement helpContactFooter()
	{
		return driver.findElement(helpContactFooter);
	}
	
	public WebElement siteMap()
	{
		return driver.findElement(siteMap);
	}
}

