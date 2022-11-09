import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products extends Base
{
    By search = By.id("gh-ac");
    By searchBtn = By.id("gh-btn");
    By allListings = By.xpath("//*[@id=\"s0-52-12-5-4[1]\"]/div[2]/div[1]/div/ul/li[1]/span");
    By acceptOffers = By.xpath("//*[@id=\"s0-52-12-5-4[1]\"]/div[2]/div[1]/div/ul/li[2]/a/span");
    By auction = By.xpath("//*[@id=\"s0-52-12-5-4[1]\"]/div[2]/div[1]/div/ul/li[3]/a/span");
    By buyItNow = By.xpath("//*[@id=\"s0-52-12-5-4[1]\"]/div[2]/div[1]/div/ul/li[4]/a/span");
    By condition = By.xpath("//*[@id=\"nid-ook-56\"]/button");
    By shipping = By.xpath("//*[@id=\"nid-ook-54\"]/button/span/span");
    By price = By.id("prcIsum");
    By description = By.id("ds_div");

    public Products(WebDriver d){driver = d;}

    public String checkPrice(String url)
    {
        By price = By.id("prcIsum");
        driver.get(url);
        return driver.findElement(price).getText();
    }

    public String checkDescription(String url)
    {
        driver.get(url);
        return driver.findElement(description).getText();
    }


}