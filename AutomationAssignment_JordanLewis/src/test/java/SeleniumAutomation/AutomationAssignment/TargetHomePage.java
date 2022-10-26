package SeleniumAutomation.AutomationAssignment;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TargetHomePage {

	// Instance variables
	String browser = "";
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// Creates a file for iPhone results to be saved 
        FileWriter fw = new FileWriter("src/test/java/SeleniumAutomation/AutomationAssignment/Target_iPhone_Results.txt", true);
        // URL for Target
        String url = "https://www.target.com/";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		// Opens Target Home Page in Chrome browser
        driver.get(url);
        driver.manage().window().maximize();
        // Verifies that Target Home Page displayed by locating "Privacy policy" link
        String privacy = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/a")).getText();
        if(privacy.equals("Privacy policy"))
        {
        	System.out.println("Home page displayed successfully\n");
        }
        else
        {
        	System.out.println("Confirm url entered correctly\n");
        }
        // Locates Target search textbox, types in "iphone," and clicks the 'search' button        
        driver.findElement(By.id("search")).sendKeys("iphone");
        driver.findElement(By.xpath("//*[@id='headerPrimary']/div[6]/form/button[2]")).click();
        // Prints title and price of all iPhone search results to file that was created
        PrintWriter out = new PrintWriter(fw); 
        Actions at = new Actions(driver);
        // Slows down the script while scrolling down to load all elements accordingly
        Thread.sleep(3000);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);    
        // Lists of elements for iPhone results - Title and Price
        List<WebElement> iphoneTitle = driver.findElements(By.xpath("//a[contains(@data-test, 'product-title')]"));
        List<WebElement> iphonePrice = driver.findElements(By.xpath("//span[contains(@data-test, 'current-price')]"));
        // Loop to print all products and prices listed on page 
        for(int i = 0; i < iphoneTitle.size(); i++)
        {
        	// Prints product titles
        	String title = iphoneTitle.get(i).getText();
        	//System.out.println(title);
        	out.println(title);
        	// Prints product prices
        	String price = iphonePrice.get(i).getText();
        	//System.out.println(price + "\n");
        	out.println("- " + price + "\n");
        }
        // Closes file
        out.close();
	}
}
