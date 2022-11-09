import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Signin
{
    By userid = By.id("userid");
    By continueBtn = By.id("signin-continue-btn");
    By siginPassword = By.id("pass");
    By signinBtn = By.id("sgnBt");
    By profileBtn = By.id("gh-ug");
    By firstName = By.id("firstname");
    By lastName = By.id("lastname");
    By email = By.id("Email");
    By registerPassword = By.id("password");
    By registerContinue = By.id("EMAIL_REG_FORM_SUBMIT");


    WebDriver driver;

    public Signin(WebDriver d){driver = d;}

    public void enterName(String name){
        WebElement userField = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(userid));
        userField.sendKeys(name);
    }

    public void enterSigninPassword(String name)
    {
        WebElement passwordField = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(siginPassword));
        passwordField.sendKeys(name);
    }

    public void hitContinue(){driver.findElement(continueBtn).click();}
    public void hitSubmit(){driver.findElement(signinBtn).click();}
    public WebElement getFirstName(){return driver.findElement(firstName);}
    public WebElement getLastName(){return driver.findElement(lastName);}
    public WebElement getEmail(){return driver.findElement(email);}
    public WebElement getRegisterPassword(){return driver.findElement(registerPassword);}
    public void hitRegisterCreate(){driver.findElement(registerContinue).click();}


    public void login(String email, String pass)
    {
        enterName(email);
        hitContinue();
        enterSigninPassword(pass);
        hitSubmit();
    }

    public void register(String first, String last, String email, String pass) {
        WebElement pageLoad = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(registerContinue));
        getFirstName().sendKeys(first);
        getLastName().sendKeys(last);
        getEmail().sendKeys(email);
        getRegisterPassword().sendKeys(pass);
        pageLoad = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(registerContinue));
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        hitRegisterCreate();
    }

}
