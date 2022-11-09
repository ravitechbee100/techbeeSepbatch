import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.time.Duration;
import java.util.List;

public class Target
{
    WebDriver driver;
    public Target(String browser)
    {

        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.chromiumdriver().setup();

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

        driver.get("https://www.target.com/");
    }

    public void searchTarget(String searchTerm) throws InterruptedException
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement t = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("search")));
        driver.findElement(By.id("search")).sendKeys(searchTerm);
        driver.findElement(By.id("search")).sendKeys(Keys.RETURN);

        t = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div[1]/div[2]/div/div[1]/div/div[1]/button")));
        t = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("utilityNav-weeklyAd")));

        for(int j = 0; j < 20; ++j)//Scrolls through entire page
        {
            new Actions(driver).scrollByAmount(0,300).perform();
        }

        List<WebElement> phones = driver.findElements(By.xpath("//a[contains(@data-test, 'product-title')]"));
        List<WebElement> prices = driver.findElements(By.xpath("//span[contains(@data-test, 'current-price')]"));

        try
        {
            FileWriter text = new FileWriter("TargetPhones.txt");
            for(int i = 0; i < phones.size(); ++i)
            {
                text.write(phones.get(i).getText() + " " + prices.get(i).getText()+"\n");
                //System.out.println(titles.get(i).getText() + " " + prices.get(i).getText());
            }
            System.out.println("Got all items successfully");
            text.close();
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
    public void close(){driver.close();}

    public static void main(String[] main) throws InterruptedException {
        Target target = new Target("edge");
        target.searchTarget("iphone");
        target.close();
    }
}
