import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.time.Duration;
import java.util.List;

public class EbayHomePage
{
    WebDriver driver;

    public EbayHomePage(String browser)
    {

        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.operadriver().setup();
        WebDriverManager.chromiumdriver().setup();
        WebDriverManager.iedriver().setup();

       switch(browser)
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

    public void searchEbay(String searchTerm) throws InterruptedException
    {
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(searchTerm);
        WebElement t = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("gh-btn")));
        driver.findElement(By.id("gh-btn")).click();

        WebElement seeAll = driver.findElement(By.xpath("//*[@id=\"s0-52-12-0-1-2-6-0-21[8]-6\"]/button"));//See all button under show only
        WebElement aboutEbay = driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[1]/a"));//About ebay button at bottom

        t = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(seeAll));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", seeAll);
        js.executeScript("arguments[0].scrollIntoView();", aboutEbay);

        List<WebElement> allElements = driver.findElements(By.tagName("li"));

        //System.out.println(allElements.size());
        for(WebElement temp: allElements)//Attempt to ensure all elements are loaded when getting values
        {
            js.executeScript("arguments[0].scrollIntoView();", temp);
        }

        List<WebElement> titles = driver.findElements(By.className("s-item__title"));//0, 8-15 useless
        List<WebElement> prices = driver.findElements(By.className("s-item__price"));//0, 8-15 useless


        titles.remove(0);//removes empty entry at top of list
        prices.remove(0);
        int i = 8;
        while(i <= 15)//removes the ad(?) prices with no title that appear in the middle
        {
            prices.remove(i);
            ++i;
        }

        //System.out.println(titles.size() + " " + prices.size());
        if(titles.size() == prices.size())
        {
            try
            {
                FileWriter text = new FileWriter("EbayIphone.txt");
                for(i = 0; i < titles.size(); ++i)
                {
                    text.write(titles.get(i).getText() + " " + prices.get(i).getText()+"\n");
                    //System.out.println(titles.get(i).getText() + " " + prices.get(i).getText());
                }
                System.out.println("Got all items successfully");
                text.close();
            }catch(Exception e){
                System.out.println("Something went wrong");
            }
        }
        else{
            System.out.println("all items didnt load");
        }
    }

    public void close()
    {
        driver.quit();
    }


    public static void main(String[] args) throws InterruptedException {
        EbayHomePage test = new EbayHomePage("edge");
        test.searchEbay("iphone");
        test.close();
    }
}
