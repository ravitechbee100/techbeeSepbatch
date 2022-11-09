import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
    WebDriver driver;
    By userid = By.id("userid");
    By continueBtn = By.id("signin-continue-btn");
    By password = By.id("pass");
    By signinLink = By.linkText("Sign in");
    By signinBtn = By.id("sgnBt");
    By registerBtn = By.linkText("register");
    By dailyDealsBtn = By.linkText("Daily Deals");
    By brandOutlet = By.linkText(" Brand Outlet");
    By helpContact = By.linkText("Help & Contact");
    By sell = By.linkText(" Sell");
    By wishlist = By.linkText("Watchlist");
    By myEbay = By.linkText("My eBay");
    By notifs = By.id("gh-Alerts-i");
    By cart = By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]");
    By aboutEbay = By.linkText("About eBay");
    By announcements = By.linkText("Announcements");
    By community = By.linkText("Community");
    By copyright = By.className("gf-legal");
    By profileBtn = By.xpath("//*[@id=\"gh-ug\"]/b");
    By ebayLogo = By.xpath("//*[@id=\"gh-logo\"]");

    public Base()
    {
        Config configuration = new Config();
        switch(configuration.getBrowser())
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "ff":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        driver.get("https://www.ebay.com");
    }


    public WebDriver getDriver(){return driver;}
    public WebElement signin(){return driver.findElement(signinLink);}
    public WebElement registerBtn(){return driver.findElement(registerBtn);}
    public WebElement dailyDeals(){return driver.findElement(dailyDealsBtn);}
    public WebElement brandOutlet(){return driver.findElement(brandOutlet);}
    public WebElement HelpContact(){return driver.findElement(helpContact);}
    public WebElement sell(){return driver.findElement(sell);}
    public WebElement wishlist(){return driver.findElement(wishlist);}
    public WebElement myEbay(){return driver.findElement(myEbay);}
    public WebElement notification(){return driver.findElement(notifs);}
    public WebElement cart(){return driver.findElement(cart);}
    public WebElement aboutEbay(){return driver.findElement(aboutEbay);}
    public WebElement announcements(){return driver.findElement(announcements);}
    public WebElement community(){return driver.findElement(community);}
    public WebElement getProfileBtn(){return driver.findElement(profileBtn);}

    public void startLogin(){signin().click();}
    public void startRegister(){registerBtn().click();}

    public boolean verifyCopyright(){
        WebElement copyrightClass = driver.findElement(copyright);
        return copyrightClass.getText().contains("Copyright © 1995-2022 eBay Inc. All Rights Reserved. ");
    }

    public void close(){driver.close();}

//    public static void main(String[] args)
//    {
//        Base test = new Base();
//        test.close();
//    }
}
