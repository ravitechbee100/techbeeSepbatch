import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class Homepage extends Base
{
    WebDriver driver;
    By homeBtn = By.id("gh-la");
    By savedBtn = By.linkText("Saved");
    By motorsBtn = By.linkText("Motors");
    By electronicsBtn = By.linkText("Electronics");
    By artBtn = By.linkText("Collectibles & Art");
    By gardenBtn = By.linkText("Home & Garden");
    By clothingBtn = By.linkText("Clothing & Accessories");
    By toysBtn = By.linkText("Toys");
    By sportBtn = By.linkText("Sporting Goods");
    By businessBtn = By.linkText("Business & Industrial");
    By jewelryBtn = By.linkText("Jewelry & Watches");
    By advancedBtn = By.linkText("Advanced");
    By searchbar = By.id("gh-ac");
    By category = By.id("gh-cat");

//    public Homepage(WebDriver d)
//    {
//        driver = d;
//    }

    public void goHome(){driver.findElement(homeBtn).click();}
    public void goSaved(){driver.findElement(savedBtn).click();}
    public void goMotors(){driver.findElement(motorsBtn).click();}
    public void goElectronics(){driver.findElement(electronicsBtn).click();}
    public void goArt(){driver.findElement(artBtn).click();}
    public void goGarden(){driver.findElement(gardenBtn).click();}
    public void goClothing(){driver.findElement(clothingBtn).click();}
    public void goToys(){driver.findElement(toysBtn).click();}
    public void goSport(){driver.findElement(sportBtn).click();}
    public void goBusiness(){driver.findElement(businessBtn).click();}
    public void goJewelry(){driver.findElement(jewelryBtn).click();}
    public void goAdvanced(){driver.findElement(advancedBtn);}

    public void searchSearchbar(String name)
    {
        driver.findElement(searchbar).sendKeys(name);
    }

    public void searchCategory(String name)
    {
        Select categories = new Select(driver.findElement(category));

        switch(name){
            case "Antiques":
                categories.selectByValue("Antiques");
                break;
            case "Art":
                categories.selectByValue("Art");
                break;
            case "Baby":
                categories.selectByValue("Baby");
                break;
            case "Books":
                categories.selectByValue("Books");
                break;
            case "Business & Industrial":
                categories.selectByValue("Business & Industrial");
                break;
            case "Cameras & Photo":
                categories.selectByValue("Cameras & Photo");
                break;
            case "Cell Phones & Accessories":
                categories.selectByValue("Cell Phones & Accessories");
                break;
            case "Everything Else":
                categories.selectByValue("Everything Else");
                break;
        }
    }

    public void submitSearch(){driver.findElement(searchbar).click();}

    public void goDailyDeals()
    {dailyDeals().click();}


    public void advancedSearch()
    {
        driver.findElement(advancedBtn).click();
    }
}
