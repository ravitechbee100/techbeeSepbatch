package SeleniumAutomation.AutomationAssignment;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayHomePage 
{
	// Instance variables
	String browser = "";
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException 
	{
		// Creates a file for iPhone results to be saved 
        FileWriter fw = new FileWriter("src/test/java/SeleniumAutomation/AutomationAssignment/eBay_iPhone_Results.txt", true);
        // URL for eBay
        String url = "https://www.ebay.com/";
        // Launches Chrome browser
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		// Opens eBay Home Page in Chrome browser
        driver.get(url);
        // Verifies that eBay Home Page displayed by locating "Sign in" link
        String signin = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).getText();
        if(signin.equals("Sign in"))
        {
        	System.out.println("Home page displayed successfully\n");
        }
        else
        {
        	System.out.println("Confirm url entered correctly\n");
        }
        // Locates eBay search textbox, types in "iphone," and clicks the 'search' button
        WebElement element = driver.findElement(By.id("gh-ac"));
        driver.findElement(By.id("gh-ac")).sendKeys("iphone");
        driver.findElement(By.id("gh-btn")).click();
        // Retrieves the amount of products listed on the page.
        int productLength = driver.findElements(By.className("s-item__title")).size();
        // Initializes String productTitle and productPrice
        String productTitle = "", productPrice = "";
        // Prints title and price of all iPhone search results to file that was created
        PrintWriter out = new PrintWriter(fw); 
        // Lists of elements for iPhone results - Title and Price
        List<WebElement> iphoneTitle = driver.findElements(By.className("s-item__title"));
        List<WebElement> iphonePrice = driver.findElements(By.className("s-item__price"));
        // Loop to print all products and prices listed on page 
        for(int i = 1; i < iphoneTitle.size(); i++)
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