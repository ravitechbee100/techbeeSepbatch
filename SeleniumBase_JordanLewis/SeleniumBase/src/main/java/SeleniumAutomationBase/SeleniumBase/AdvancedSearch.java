package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearch extends Base
{
	WebDriver driver;
	private By inStore = By.xpath("//*[@id=\'LeftPanel\']/div[2]/div/ul/li[1]/a");
	private By title = By.xpath("//*[@id=\"mainContent\"]/h2");
	private By findItems = By.xpath("//*[@id=\'LeftPanel\']/div[1]/div/ul/li[1]/a");
	private By keyword = By.id("_nkw");
	private By searchBtn = By.xpath("//*[@id=\'adv_search_from\']/fieldset[1]/div[3]/button");
	private By resultsFor = By.xpath("//*[@id=\'mainContent\']/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]");
	private By ttlDscCheckBox = By.id("LH_TitleDesc");
	private By lowerSearchBtn = By.id("searchBtnLowerLnk");
	private By resultsForSrchIncl = By.xpath("//*[@id=\'mainContent\']/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]");
	private By priceRngCheckBox = By.id("_mPrRngCbx");
	private By priceLowerBnd = By.xpath("//*[@id=\'adv_search_from\']/fieldset[3]/input[2]");
	private By priceUpperBnd = By.xpath("//*[@id=\'adv_search_from\']/fieldset[3]/input[3]");
	private By priceRng = By.xpath("//*[@id=\'s0-52-12-6-3-4[0]-3-1-1-list\']/li/div/a");
	private By auctCheckBox = By.id("LH_Auction");
	private By auctTab = By.xpath("//*[@id=\'s0-52-12-5-4[0]\']/div[2]/div[1]/div/ul/li[3]/span");
	private By usedCheckBox = By.id("LH_ItemConditionUsed");
	private By usedFilter = By.xpath("//*[@id=\'s0-52-12-6-3-4[0]-3-1-1-list\']/li/div/a");
	private By charityCheckBox = By.id("LH_Charity");
	private By charityFilter = By.xpath("//*[@id=\'s0-52-12-6-3-4[0]-3-1-1-list\']/li/div/a");
	private By freeShipCheckBox = By.id("LH_FS");
	private By freeShipFilter = By.xpath("//*[@id=\'s0-52-12-6-3-4[0]-3-1-1-list\']/li/div/a");
	private By sortComboBox = By.id("LH_SORT_BY");
	private By sortPricePlusShipLow = By.xpath("//*[@id=\'LH_SORT_BY\']/option[3]");
	private By viewComboBox = By.id("LH_VIEW_RESULTS_AS");
	private By picGallery = By.xpath("//*[@id=\'LH_VIEW_RESULTS_AS\']/option[2]");
	private By clearOpt = By.xpath("//*[@id=\'adv_search_from\']/div[3]/a");
	
	public AdvancedSearch(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement inStore()
	{
		return driver.findElement(inStore);
	}
	
	public WebElement title()
	{
		return driver.findElement(title);
	}
	
	public WebElement findItems()
	{
		return driver.findElement(findItems);
	}
	
	public WebElement keyword()
	{
		return driver.findElement(keyword);
	}
	
	public WebElement searchBtn()
	{
		return driver.findElement(searchBtn);
	}
	
	public WebElement resultsFor()
	{
		return driver.findElement(resultsFor);
	}
	
	public WebElement ttlDscCheckBox()
	{
		return driver.findElement(ttlDscCheckBox);
	}
	
	public WebElement lowerSearchBtn()
	{
		return driver.findElement(lowerSearchBtn);
	}
	
	public WebElement resultsForSrchIncl()
	{
		return driver.findElement(resultsForSrchIncl);
	}
	
	public WebElement priceRngCheckBox()
	{
		return driver.findElement(priceRngCheckBox);
	}
	
	public WebElement priceLowerBnd()
	{
		return driver.findElement(priceLowerBnd);
	}
	
	public WebElement priceUpperBnd()
	{
		return driver.findElement(priceUpperBnd);
	}
	
	public WebElement priceRng()
	{
		return driver.findElement(priceRng);
	}
	
	public WebElement auctCheckBox()
	{
		return driver.findElement(auctCheckBox);
	}
	
	public WebElement auctTab()
	{
		return driver.findElement(auctTab);
	}
	
	public WebElement usedCheckBox()
	{
		return driver.findElement(usedCheckBox);
	}
	
	public WebElement usedFilter()
	{
		return driver.findElement(usedFilter);
	}
	
	public WebElement charityCheckBox()
	{
		return driver.findElement(charityCheckBox);
	}
	
	public WebElement charityFilter()
	{
		return driver.findElement(charityFilter);
	}
	
	public WebElement freeShipCheckBox()
	{
		return driver.findElement(freeShipCheckBox);
	}
	
	public WebElement freeShipFilter()
	{
		return driver.findElement(freeShipFilter);
	}
	
	public WebElement sortComboBox()
	{
		return driver.findElement(sortComboBox);
	}
	
	public WebElement sortPricePlusShipLow()
	{
		return driver.findElement(sortPricePlusShipLow);
	}
	
	public WebElement viewComboBox()
	{
		return driver.findElement(viewComboBox);
	}
	
	public WebElement picGallery()
	{
		return driver.findElement(picGallery);
	}
	
	public WebElement clearOpt()
	{
		return driver.findElement(clearOpt);
	}
	
}
