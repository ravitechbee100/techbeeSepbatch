package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage 
{
	WebDriver driver;
	private By ebLogo = By.id("gh-la");
	private By home = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[1]/span");
	private By saved = By.xpath("//*[@id='mainContent']/div[1]/ul/li[2]/a");
	private By greeting = By.id("greeting-msg");
	private By motors = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[3]/a");
	private By motorsTitle = By.xpath("/html/body/div[5]/div[2]/section/div[1]/div[2]/h1");
	private By electronics = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[4]/a");
	private By elecTitle = By.xpath("/html/body/div[4]/div[2]/h1/span");
	private By collectArt = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[5]/a");
	private By collectArtTitle = By.xpath("/html/body/div[4]/div[2]/section/div[1]/div[2]/h1");
	private By homeGard = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[6]/a");
	private By homeGardTitle = By.xpath("/html/body/div[4]/div[2]/section/div[1]/div[2]/h1");
	private By clothAcc = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[7]/a");
	private By clothAccTitle = By.xpath("/html/body/div[4]/div[2]/h1/span");
	private By toys = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[8]/a");
	private By toyTitle = By.xpath("/html/body/div[4]/div[2]/section/div[1]/div[2]/h1");
	private By sportGood = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[9]/a");
	private By sportGoodTitle = By.xpath("/html/body/div[4]/div[2]/section/div[1]/div[2]/h1");
	private By busIndust = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[10]/a");
	private By busIndustTitle = By.xpath("/html/body/div[4]/div[2]/h1/span");
	private By jewelWatch = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[11]/a");
	private By jewelWatchTitle = By.xpath("/html/body/div[4]/div[2]/h1/span");
	private By eRefurb = By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[12]/a");
	private By eRefurbTitle = By.xpath("/html/body/div[4]/div[2]/section/div[1]/div[2]/h1");
	private By search = By.id("gh-ac");
	private By searchBtn = By.id("gh-btn");
	private By searchCat = By.xpath("//*[@id=\'wrapper\']/div[1]/div/div/div[2]/div[1]/h1");
	private By seaCat = By.id("gh-shop-a");
	private By seaCatMotors = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[1]/a");
	private By advSearch = By.id("gh-as-a");
	private By advSearchTitle = By.id("gh-title");
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement ebLogo()
	{
		return driver.findElement(ebLogo);
	}
	
	public WebElement home()
	{
		return driver.findElement(home);
	}
	
	public WebElement saved()
	{
		return driver.findElement(saved);
	}
	
	public WebElement greeting()
	{
		return driver.findElement(greeting);
	}
	
	public WebElement motors()
	{
		return driver.findElement(motors);
	}
	
	public WebElement motorsTitle()
	{
		return driver.findElement(motorsTitle);
	}
	
	public WebElement electronics()
	{
		return driver.findElement(electronics);
	}
	
	public WebElement elecTitle()
	{
		return driver.findElement(elecTitle);
	}
	
	public WebElement collectArt()
	{
		return driver.findElement(collectArt);
	}
	
	public WebElement collectArtTitle()
	{
		return driver.findElement(collectArtTitle);
	}
	
	public WebElement homeGard()
	{
		return driver.findElement(homeGard);
	}
	
	public WebElement homeGardTitle()
	{
		return driver.findElement(homeGardTitle);
	}
	
	public WebElement clothAcc()
	{
		return driver.findElement(clothAcc);
	}
	
	public WebElement clothAccTitle()
	{
		return driver.findElement(clothAccTitle);
	}
	
	public WebElement toys()
	{
		return driver.findElement(toys);
	}
	
	public WebElement toyTitle()
	{
		return driver.findElement(toyTitle);
	}
	
	public WebElement sportGood()
	{
		return driver.findElement(sportGood);
	}
	
	public WebElement sportGoodTitle()
	{
		return driver.findElement(sportGoodTitle);
	}
	
	public WebElement busIndust()
	{
		return driver.findElement(busIndust);
	}
	
	public WebElement busIndustTitle()
	{
		return driver.findElement(busIndustTitle);
	}
	
	public WebElement jewelWatch()
	{
		return driver.findElement(jewelWatch);
	}
	
	public WebElement jewelWatchTitle()
	{
		return driver.findElement(jewelWatchTitle);
	}
	
	public WebElement eRefurb()
	{
		return driver.findElement(eRefurb);
	}
	
	public WebElement eRefurbTitle()
	{
		return driver.findElement(eRefurbTitle);
	}
	
	public WebElement search()
	{
		return driver.findElement(search);
	}
	
	public WebElement searchBtn()
	{
		return driver.findElement(searchBtn);
	}
	
	public WebElement searchCat()
	{
		return driver.findElement(searchCat);
	}

	public WebElement seaCat()
	{
		return driver.findElement(seaCat);
	}
	
	public WebElement seaCatMotors()
	{
		return driver.findElement(seaCatMotors);
	}
	
	public WebElement advSearch()
	{
		return driver.findElement(advSearch);
	}
	
	public WebElement advSearchTitle()
	{
		return driver.findElement(advSearchTitle);
	}
}
