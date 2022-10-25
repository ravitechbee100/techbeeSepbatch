import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ebaytestcase {

	
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver ebaydriver = new ChromeDriver();
		ebaydriver.manage().window().maximize();
		ebaydriver.get("https://ebay.com");
		ebaydriver.findElement(By.id("gh-ac")).sendKeys("iphone");
		ebaydriver.findElement(By.xpath("//*[@id='gh-btn']")).click();

		java.util.List<WebElement> no_of_items = ebaydriver.findElements(By.cssSelector("#srp-river-results > ul > li:nth-child(3)"));

		File file = new File("/Users/atomicgorillaz/Desktop/SDETtraining/EbayTestCase.txt");
		PrintStream stream = new PrintStream(file);

			for(int i = 0; i<no_of_items.size(); i++) {
				WebElement productTitle = ebaydriver.findElement(By.xpath("/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li[2]/div/div[2]/a/div/span"));
				WebElement productPrice = ebaydriver.findElement(By.xpath("/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li[2]/div/div[2]/div[3]/div[1]"));
	
			
			System.setOut(stream);
			System.out.println(i+ "Product title: "+productTitle.getText()+"Product Price: \n"+productPrice.getText());
			}
			
		
			ebaydriver.close();
			}
}

