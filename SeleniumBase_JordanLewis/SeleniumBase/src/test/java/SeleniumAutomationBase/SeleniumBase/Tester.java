package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.WebDriver;
//import junit.framework.Assert;
import org.junit.*;
import org.junit.Assert;

public class Tester extends Base
{
	WebDriver driver;
	Base bs;
	SignInRegister signInRegister;
	DailyDeals dailyDeals;
	BrandOutlet brandOutlet;
	HelpContact helpContact;
	SellWatchMyEb sellWatchMyEb;
	NotifCart notifCart;
	Footer footer;
	Homepage hp;
	AdvancedSearch as;
	Products p;
	
	// Before Test - Initialization
	@Before
	public void init() throws InterruptedException
	{
		bs = new Base();
		driver = bs.browserInitialization("chrome");
		signInRegister = new SignInRegister(driver);
		dailyDeals = new DailyDeals(driver);
		brandOutlet = new BrandOutlet(driver);
		helpContact = new HelpContact(driver);
		sellWatchMyEb = new SellWatchMyEb(driver);
		notifCart = new NotifCart(driver);
		footer = new Footer(driver);
		hp = new Homepage(driver);
		as = new AdvancedSearch(driver);
		p = new Products(driver);
		
	}
	// Test for Sign-In
	//@Test
	public void SignInTest() throws InterruptedException
	{
		bs.signInLink().click();
		Thread.sleep(8000);
		Assert.assertEquals("Hello", signInRegister.welcomeMsg().getText());
		signInRegister.loginEbay("jordantlewis3@gmail.com", "pass");
	}
	// Test for Register
	//@Test
	public void RegisterTest() 
	{
		bs.registerLink().click();
		Assert.assertEquals("Create an account", signInRegister.createMsg().getText());
		signInRegister.createAccount("Jordan", "Lewis", "jordantlewis3@gmail.com", "pass");
	}
	// Test for Daily Deals
	//@Test
	public void DailyDealsTest() 
	{
		bs.dailyDeals().click();
		Assert.assertEquals("Deals", dailyDeals.dealsTitle().getText());
	}
	// Test for Brand Outlet
	//@Test
	public void BrandOutletTest() 
	{
		bs.brandOutlet().click();
		Assert.assertEquals("The Brand Outlet", brandOutlet.brandOutletTitle().getText());
	}
	// Test for Help & Contact
	//@Test
	public void HelpContactTest()
	{
		bs.helpContact().click();
		Assert.assertEquals("Customer Service", helpContact.helpContactTitle().getText());
	}
	// Test for Sell
	//@Test
	public void SellTest() 
	{
		bs.sell().click();
		Assert.assertEquals("Make money selling on eBay", sellWatchMyEb.sellTitle().getText());
	}
	// Test for Watchlist
	//@Test
	public void watchlistTest() 
	{
		bs.watchlist().click();
		Assert.assertEquals("to view items you are watching.", sellWatchMyEb.watchTitle().getText());
	}
	// Test for My eBay
	//@Test
	public void myEbTest()
	{
		bs.myEb().click();
		Assert.assertEquals("Hello", sellWatchMyEb.welcomeMsg().getText());
	}
	// Test for Notifications
	//@Test
	public void notifTest()
	{
		bs.notif().click();
		Assert.assertEquals("Please sign-in to view notifications.", notifCart.notifMsg().getText());
	}
	// Test for Cart
	//@Test
	public void cartTest()
	{
		bs.cart().click();
		Assert.assertEquals("Shopping cart", notifCart.cartTitle().getText());
	}
	// Test for About eBay
	//@Test
	public void aboutTest()
	{
		bs.about().click();
		Assert.assertEquals("Company", footer.compTitle().getText());
	}
	// Test for Announcements
	//@Test
	public void announTest()
	{
		bs.announ().click();
		Assert.assertEquals("Latest Announcements", footer.announTitle().getText());
	}
	// Test for Community
	//@Test
	public void commTest()
	{
		bs.comm().click();
		Assert.assertEquals("Welcome to the eBay Community!\n"
				+ "Find answers, ask questions and connect with our community of members and specialists.", footer.commTitle().getText());
	}
	// Test for Security Center
	//@Test
	public void secCentTest()
	{
		bs.secCent().click();
		Assert.assertEquals("Security Center", footer.secCentTitle().getText());
	}
	// Test for Seller Center
	//@Test
	public void sellCentTest()
	{
		bs.sellCent().click();
		Assert.assertEquals("Seller Center", footer.sellCentTitle().getText());
	}
	// Test for Policies
	//@Test
	public void policiesTest()
	{
		bs.policies().click();
		Assert.assertEquals("eBay rules and policies", footer.policiesTitle().getText());
	}
	// Test for Affiliates
	//@Test
	public void affiliatesTest()
	{
		bs.affiliates().click();
		Assert.assertEquals("Welcome to the eBay Partner Network", footer.affiliatesTitle().getText());
	}
	
	// Test for Help & Contact
	//@Test
	public void helpContactTest()
	{
		bs.helpContactFooter().click();
		Assert.assertEquals("Customer Service", footer.helpContactTitle().getText());
	}
	// Test for Site Map
	//@Test
	public void siteMapTest()
	{
		bs.siteMap().click();
		Assert.assertEquals("Sitemap", footer.siteMapTitle().getText());
	}
	// Test for Home
	//@Test
	public void homeTest()
	{
		hp.ebLogo().click();
		Assert.assertEquals("Home", hp.home().getText());
	}
	// Test for Saved
	//@Test
	public void savedTest()
	{
		hp.saved().click();
		Assert.assertEquals("Hello", hp.greeting().getText());
	}
	// Test for Motors
	//@Test
	public void motorsTest()
	{
		hp.motors().click();
        driver.manage().window().maximize();
		Assert.assertEquals("eBay Motors", hp.motorsTitle().getText());
	}
	// Test for Electronics
	//@Test
	public void electronicsTest()
	{
		hp.electronics().click();
        driver.manage().window().maximize();
		Assert.assertEquals("Electronics", hp.elecTitle().getText());
	}
	// Test for Collectibles & Art
	//@Test
	public void collectArtTest()
	{
		hp.collectArt().click();
        driver.manage().window().maximize();
		Assert.assertEquals("Collectibles & Art", hp.collectArtTitle().getText());
	}
	// Test for Home & Garden
	//@Test
	public void homeGardTest()
	{
		hp.homeGard().click();
        driver.manage().window().maximize();
		Assert.assertEquals("Home & Garden", hp.homeGardTitle().getText());
	}
	// Test for Clothing & Accessories
	//@Test
	public void clothAccTest()
	{
		hp.clothAcc().click();
        driver.manage().window().maximize();
		Assert.assertEquals("Clothing, Shoes & Accessories", hp.clothAccTitle().getText());
	}
	// Test for Toys
	//@Test
	public void toyTest()
	{
		hp.toys().click();
        driver.manage().window().maximize();
		Assert.assertEquals("Toys & Hobbies", hp.toyTitle().getText());
	}
	// Test for Sporting Goods
	//@Test
	public void sportGoodTest()
	{
		hp.sportGood().click();
        driver.manage().window().maximize();
		Assert.assertEquals("Sporting Goods & Equipment", hp.sportGoodTitle().getText());
	}
	// Test for Business & Industrial
	//@Test
	public void busIndustTest()
	{        
		driver.manage().window().maximize();
		hp.busIndust().click();
		Assert.assertEquals("Business & Industrial", hp.busIndustTitle().getText());
	}
	// Test for Jewelry & Watches
	//@Test
	public void jewelWatchTest()
	{        
		driver.manage().window().maximize();
		hp.jewelWatch().click();
		Assert.assertEquals("Jewelry & Watches", hp.jewelWatchTitle().getText());
	}
	// Test for eBay Refurbished
	//@Test
	public void eRefurbTest()
	{        
		driver.manage().window().maximize();
		hp.eRefurb().click();
		Assert.assertEquals("eBay Refurbished", hp.eRefurbTitle().getText());
	}
	// Test for Search
	//@Test
	public void searchTest()
	{        
		driver.manage().window().maximize();
		hp.search().sendKeys("");
		hp.searchBtn().click();
		Assert.assertEquals("All Categories", hp.searchCat().getText());
	}
	// Test for Search by Category
	//@Test
	public void seaCatTest()
	{        
		driver.manage().window().maximize();
		hp.seaCat().click();
		hp.seaCatMotors().click();
		Assert.assertEquals("eBay Motors", hp.motorsTitle().getText());
	}
	// Test for Advanced Search
	//@Test
	public void advSearchTest()
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
	}
	// Test for Advanced Search - Items in Stores
	//@Test
	public void advSearchInStoreTest()
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.inStore().click();
		Assert.assertEquals("Items in Stores", as.title().getText());
	}
	// Test for Advanced Search - Find items - keywords
	//@Test
	public void advSearchItemByKeyTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.searchBtn().click();
		Assert.assertEquals(keyWrd, as.resultsFor().getText());
	}
	// Test for Advanced Search - Search including - Title and Description
	//@Test
	public void advSearchInclTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.ttlDscCheckBox().click();
		as.lowerSearchBtn().click();
		Assert.assertEquals(keyWrd, as.resultsForSrchIncl().getText());
	}
	// Test for Advanced Search - Price
	//@Test
	public void advSearchPriceTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.priceRngCheckBox().click();
		String lwrBnd = "2000";
		as.priceLowerBnd().sendKeys(lwrBnd);
		String uprBnd = "5000";
		as.priceUpperBnd().sendKeys(uprBnd);
		as.lowerSearchBtn().click();
		Assert.assertEquals(keyWrd, as.resultsForSrchIncl().getText());
		Assert.assertEquals("$2,000.00 to $5,000.00\nRemove filter", as.priceRng().getText());
	}
	// Test for Advanced Search - Buying formats - Auction
	//@Test
	public void advSearchBuyFormTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.auctCheckBox().click();
		as.lowerSearchBtn().click();
		Assert.assertEquals(keyWrd, as.resultsForSrchIncl().getText());
		Assert.assertEquals("Auction", as.auctTab().getText());
	}
	// Test for Advanced Search - Condition - Used
	//@Test
	public void advSearchCondTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.usedCheckBox().click();
		as.lowerSearchBtn().click();
		Assert.assertEquals(keyWrd, as.resultsForSrchIncl().getText());
		Assert.assertEquals("Used\nRemove filter", as.usedFilter().getText());
	}
	// Test for Advanced Search - Show results - eBay for Charity
	//@Test
	public void advSearchShowResultTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.charityCheckBox().click();
		as.lowerSearchBtn().click();
		Assert.assertEquals(keyWrd, as.resultsForSrchIncl().getText());
		Assert.assertEquals("Benefits charity\nRemove filter", as.charityFilter().getText());
	}
	// Test for Advanced Search - Shipping options - Free shipping
	//@Test
	public void advSearchShippingOptTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.freeShipCheckBox().click();
		as.lowerSearchBtn().click();
		Assert.assertEquals(keyWrd, as.resultsForSrchIncl().getText());
		Assert.assertEquals("Free shipping\nRemove filter", as.freeShipFilter().getText());
	}
	// Test for Advanced Search - Sort by - Price + Shipping: lowest first
	//@Test
	public void advSearchSortByTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.sortComboBox().click();
		as.sortPricePlusShipLow().click();
		as.lowerSearchBtn().click();
		Assert.assertEquals(keyWrd, as.resultsForSrchIncl().getText());
	}
	// Test for Advanced Search - View results - Picture Gallery
	//@Test
	public void advSearchViewResultsTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.viewComboBox().click();
		as.picGallery().click();
		as.lowerSearchBtn().click();
		Assert.assertEquals(keyWrd, as.resultsForSrchIncl().getText());
	}
	// Test for Advanced Search - Clear Options
	//@Test
	public void advSearchClearOptTest() 
	{        
		driver.manage().window().maximize();
		hp.advSearch().click();
		Assert.assertEquals("Advanced Search", hp.advSearchTitle().getText());
		as.findItems().click();
		Assert.assertEquals("Find Items", as.title().getText());
		String keyWrd = "camaro supercharger";
		as.keyword().sendKeys(keyWrd);
		as.viewComboBox().click();
		as.picGallery().click();
		as.clearOpt().click();
	}
	// Test for Products Page - All listings
	//@Test
	public void allListTest() 
	{        
		driver.manage().window().maximize();
		p.searchBox().sendKeys("corvette");
		p.searchBtn().click();
		Assert.assertEquals("corvette", p.searchRes().getText());
		p.allList().click();
	}
	// Test for Products Page - Accepts Offers
	//@Test
	public void acceptsOffTest()  
	{        
		driver.manage().window().maximize();
		p.searchBox().sendKeys("corvette");
		p.searchBtn().click();
		Assert.assertEquals("corvette", p.searchRes().getText());
		p.acceptOff().click();
	}
	// Test for Products Page - Auction
	//@Test
	public void auctTest()  
	{        
		driver.manage().window().maximize();
		p.searchBox().sendKeys("corvette");
		p.searchBtn().click();
		Assert.assertEquals("corvette", p.searchRes().getText());
		p.auction().click();
	}
	// Test for Products Page - Buy It Now
	@Test
	public void buyItNowTest()  
	{        
		driver.manage().window().maximize();
		p.searchBox().sendKeys("corvette");
		p.searchBtn().click();
		Assert.assertEquals("corvette", p.searchRes().getText());
		p.buyItNow().click();
	}
}
