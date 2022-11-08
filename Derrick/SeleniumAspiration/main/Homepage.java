import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage
{
    WebDriver driver;
    By getStarted = By.xpath("//*[@id=\"1EYrOibh6F5A0zi3c12Nuc\"]");
    By emailPopup = By.xpath("/html/body/div[4]/div/div");
    By spendSaveLink = By.linkText("Spend & Save");

    public Homepage(WebDriver d)
    {
        driver = d;
    }

    public WebElement getStarted() {return driver.findElement(getStarted);}
    public WebElement getEmailPopup() {return driver.findElement(emailPopup);}
    public WebElement getSpendSaveLink(){return driver.findElement(spendSaveLink);}
}
