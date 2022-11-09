import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpendSave
{
    WebDriver driver;
    By aspiration = By.xpath("//*[@id=\"__next\"]/div/div[2]/section[6]/div/div[1]/div[1]/div[1]/div[1]/span");
    By aspirationPlus = By.xpath("//*[@id=\"__next\"]/div/div[2]/section[6]/div/div[1]/div[1]/div[2]/div[1]/span");
    By plusPrice = By.xpath("//*[@id=\"__next\"]/div/div[2]/section[6]/div/div[1]/div[1]/div[2]/div[2]/p[1]/text()[1]");

    public SpendSave(WebDriver d){driver = d;}

    public WebElement getAspiration(){return driver.findElement(aspiration);}
    public WebElement getAspirationPlus(){return driver.findElement(aspirationPlus);}
    public WebElement getPlusPrice(){return driver.findElement(plusPrice);}
}
