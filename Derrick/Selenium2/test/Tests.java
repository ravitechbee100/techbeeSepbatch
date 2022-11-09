import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.dsig.SignedInfo;
import java.time.Duration;

public class Tests extends Base
{
    WebDriver driver;
    Signin sign;


    @Before
    public void init()
    {
        driver = getDriver();
        WebElement pageLoad = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(ebayLogo));
    }

    //Test for register
    //For testing register I get a disposable email from https://www.emailnator.com
    @Test
    public void testRegister()
    {
        startRegister();
        sign = new Signin(driver);
        sign.register("Drem", "Drem", "mageerauld+enjtf@gmail.com", "tasRd@331!");
        WebElement pageLoad = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(profileBtn));
        Assert.assertEquals("Drem", getProfileBtn().getText());
    }

    @Test
    public void signIn()
    {
        startLogin();
        sign = new Signin(driver);
        sign.login("qho3jaa@tmpmailtor.com", "tasRd@331!");
        //Values are disposable email to test sign in
        WebElement pageLoad = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(profileBtn));
        Assert.assertEquals("Drem", getProfileBtn().getText());
    }

    @After
    public void after()
    {
        driver.close();
    }
}
