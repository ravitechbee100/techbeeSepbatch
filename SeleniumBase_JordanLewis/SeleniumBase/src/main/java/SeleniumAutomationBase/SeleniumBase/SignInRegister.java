package SeleniumAutomationBase.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInRegister extends Base
{
    WebDriver driver;
    private By welcomeMsg = By.id("greeting-msg");
    private By userName = By.id("userid");
    private By continueBtn = By.id("signin-continue-btn");
    private By passWord = By.id("pass");
    private By signInBtn = By.id("sgnBt");
    private By createMsg = By.xpath("//*[@id='mainContent']/div[3]/h1");
    private By personalAcctRadio = By.id("personalaccount-radio");
    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By email = By.id("Email");
    private By password = By.id("password");
    private By createBtn = By.id("EMAIL_REG_FORM_SUBMIT");
	
    public SignInRegister(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
	public WebElement welcomeMsg()
	{
		return driver.findElement(welcomeMsg);
	}
	
	public WebElement userName()
	{
		return driver.findElement(userName);
	}
	
	public WebElement continueBtn()
	{
		return driver.findElement(continueBtn);
	}
	
	public WebElement passWord()
	{
		return driver.findElement(passWord);
	}
	
	public WebElement clickSignBtn()
	{
		return driver.findElement(signInBtn);
	}
	
	public WebElement createMsg()
	{
		return driver.findElements(createMsg).get(0);
	}
	
	public WebElement personalAcctRadio()
	{
		return driver.findElement(personalAcctRadio);
	}
	
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement lastName()
	{
		return driver.findElement(lastName);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement createBtn()
	{
		return driver.findElement(createBtn);
	}
	

	
	public void loginEbay(String userName, String passWord)
	{
		userName().sendKeys(userName);
		continueBtn().click();
		passWord().sendKeys(passWord);
		clickSignBtn().click();
	}	
	
	public void createAccount(String firstName, String lastName, String email, String pass)
	{
		personalAcctRadio().click();
		firstName().sendKeys(firstName);
		lastName().sendKeys(lastName);
		email().sendKeys(email);
		password().sendKeys(pass);
		createBtn().click();
	}
}
