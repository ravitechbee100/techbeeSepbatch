import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tests extends Init
{
    Homepage home;
    SpendSave ss;

    @Before
    public void init()
    {
        driver = makeDriver("chrome");
        driver.get("https://www.aspiration.com");
        home = new Homepage(driver);
        ss = new SpendSave(driver);
    }

    @Test
    public void testNavSS1()
    {
        home.getSpendSaveLink().click();
        Actions actions = new Actions(driver);
        actions.moveToElement(ss.getAspirationPlus());
        Assert.assertEquals("ASPIRATION PLUS", ss.getAspirationPlus().getText());
    }

    @Test
    public void testNavSS2()
    {
        home.getSpendSaveLink().click();
        Actions actions = new Actions(driver);
        actions.moveToElement(ss.getAspiration());
        Assert.assertEquals("ASPIRATION", ss.getAspiration().getText());
    }

    @Test
    public void verifyPopop()
    {
        home.getStarted().click();
        WebElement model = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(home.emailPopup));
        assert(true);
    }

    @After
    public void closeDriver()
    {
        driver.close();
    }


}
