package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products extends Base
{
	WebDriver driver;
	private By searchBox = By.id("gh-ac");
	private By searchBtn = By.id("gh-btn");
	private By searchRes = By.xpath("//*[@id=\'mainContent\']/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]");
	private By allList = By.xpath("//*[@id=\'s0-52-12-5-4[0]\']/div[2]/div[1]/div/ul/li[1]");
	private By acceptOff = By.xpath("//*[@id=\'x-refine__group__4\']/ul/li[2]/div/a/div/span/input");
	private By auction = By.xpath("//*[@id=\'x-refine__group__4\']/ul/li[3]/div/a/div/span/input");
	private By buyItNow = By.xpath("//*[@id=\'x-refine__group__4\']/ul/li[4]/div/a/div/span/input");
	
	public Products(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement searchBox()
	{
		return driver.findElement(searchBox);
	}
	
	public WebElement searchBtn()
	{
		return driver.findElement(searchBtn);
	}
	
	public WebElement searchRes()
	{
		return driver.findElement(searchRes);
	}
	
	public WebElement allList()
	{
		return driver.findElement(allList);
	}
	
	public WebElement acceptOff()
	{
		return driver.findElement(acceptOff);
	}
	
	public WebElement auction()
	{
		return driver.findElement(auction);
	}
	
	public WebElement buyItNow()
	{
		return driver.findElement(buyItNow);
	}
	
}
