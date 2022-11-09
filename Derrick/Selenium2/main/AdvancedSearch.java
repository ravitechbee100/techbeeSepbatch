import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearch
{
    WebDriver driver;

    By keywordBar = By.id("_nkw");
    By keywordCheckbox = By.id("_in_kw");
    By category = By.id("e1-1");
    By search_titleDescription = By.id("LH_TitleDesc");
    By search_completedListings = By.id("LH_Complete");
    By search_soldListings = By.id("LH_Sold");
    By showPriceRangeCheckbox = By.id("_mPrRngCbx");
    By priceRangeLower = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[2]");
    By priceRangeHigher = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[3]");
    By auctionCheckbox = By.id("LH_Auction");
    By buyNowCheckbox = By.id("LH_BIN");
    By classifiedCheckbox = By.id("LH_CAds");
    By conditionNew = By.id("LH_ItemConditionNew");
    By conditionUsed = By.id("LH_ItemConditionUsed");
    By conditionNS = By.id("LH_ItemConditionNS");
    By listingsCheckbox = By.id("LH_Time");
    By timeQualifier = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[6]/div[1]/select[1]");
    By time = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[6]/div[1]/select[2]");
    By numBidsCheckbox = By.id("LH_NOB");
    By numBidsLower = By.id("_sabdlo");
    By numBidsHigher = By.id("_sabdhi");
    By numListingsCheckbox = By.id("LH_MIL");
    By numListingsLower = By.id("_samilow");
    By numListingsHigher = By.id("_samihi");
    By saleItemsCheckbox = By.id("LH_SaleItems");
    By bestOfferCheckbox = By.id("LH_BO");
    By charityCheckbox = By.id("LH_Charity");
    By freeShippingCheckbox = By.id("LH_FS");
    By localPickupCheckbox = By.id("LH_LPickup");
    By locatedCheckbox = By.id("LH_Located");
    By locatedMiles = By.id("_sadis");
    By locatedZipcode = By.id("_stpos");
    By preferredCheckbox = By.id("LH_PrefLocRadio");
    By locatedCountry = By.id("LH_LocatedInRadio");
    By showItemsCheckbox = By.id("_fss");
    By specificSellersCheckbox = By.id("LH_SpecificSeller_id");
    By includeExclude = By.id("_saslop");
    By includeExcludeText = By.id("_sasl");
    By savedSellerCheckbox = By.id("LH_FavSellers_id");
    By ebayStoreSellerCheckbox = By.id("LH_SellerWithStore_id");
    By sortBy = By.id("LH_SORT_BY");
    By viewResults = By.id("LH_VIEW_RESULTS_AS");
    By resultsPerPage = By.id("LH_IPP");
    By higherSearchBtn = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[1]/div[3]/button");
    By lowerSearchBtn = By.id("searchBtnLowerLnk");
    By clearOptions = By.linkText("Clear options ");

    public AdvancedSearch(WebDriver d){driver = d;}

    public WebElement getKeywordBar() {
        return driver.findElement(keywordBar);
    }

    public WebElement getKeywordCheckbox() {
        return driver.findElement(keywordCheckbox);
    }

    public WebElement getCategory() {
        return driver.findElement(category);
    }

    public WebElement getSearch_titleDescription() {
        return driver.findElement(search_titleDescription);
    }

    public WebElement getSearch_completedListings() {
        return driver.findElement(search_completedListings);
    }

    public WebElement getSearch_soldListings() {
        return driver.findElement(search_soldListings);
    }

    public WebElement getShowPriceRangeCheckbox() {
        return driver.findElement(showPriceRangeCheckbox);
    }

    public WebElement getPriceRangeLower() {
        return driver.findElement(priceRangeLower);
    }

    public WebElement getPriceRangeHigher() {
        return driver.findElement(priceRangeHigher);
    }

    public WebElement getAuctionCheckbox() {
        return driver.findElement(auctionCheckbox);
    }

    public WebElement getBuyNowCheckbox() {
        return driver.findElement(buyNowCheckbox);
    }

    public WebElement getClassifiedCheckbox() {
        return driver.findElement(classifiedCheckbox);
    }

    public WebElement getConditionNew() {
        return driver.findElement(conditionNew);
    }

    public WebElement getConditionUsed() {
        return driver.findElement(conditionUsed);
    }

    public WebElement getConditionNS() {
        return driver.findElement(conditionNS);
    }

    public WebElement getListingsCheckbox() {
        return driver.findElement(listingsCheckbox);
    }

    public WebElement getTimeQualifier() {
        return driver.findElement(timeQualifier);
    }

    public WebElement getTime() {
        return driver.findElement(time);
    }

    public WebElement getNumBidsCheckbox() {
        return driver.findElement(numBidsCheckbox);
    }

    public WebElement getNumBidsLower() {
        return driver.findElement(numBidsLower);
    }

    public WebElement getNumBidsHigher() {
        return driver.findElement(numBidsHigher);
    }

    public WebElement getNumListingsCheckbox() {
        return driver.findElement(numListingsCheckbox);
    }

    public WebElement getNumListingsLower() {
        return driver.findElement(numListingsLower);
    }

    public WebElement getNumListingsHigher() {
        return driver.findElement(numListingsHigher);
    }

    public WebElement getSaleItemsCheckbox() {
        return driver.findElement(saleItemsCheckbox);
    }

    public WebElement getBestOfferCheckbox() {
        return driver.findElement(bestOfferCheckbox);
    }

    public WebElement getCharityCheckbox() {
        return driver.findElement(charityCheckbox);
    }

    public WebElement getFreeShippingCheckbox() {
        return driver.findElement(freeShippingCheckbox);
    }

    public WebElement getLocalPickupCheckbox() {
        return driver.findElement(localPickupCheckbox);
    }

    public WebElement getLocatedCheckbox() {
        return driver.findElement(locatedCheckbox);
    }

    public WebElement getLocatedMiles() {
        return driver.findElement(locatedMiles);
    }

    public WebElement getLocatedZipcode() {
        return driver.findElement(locatedZipcode);
    }

    public WebElement getPreferredCheckbox() {
        return driver.findElement(preferredCheckbox);
    }

    public WebElement getLocatedCountry() {
        return driver.findElement(locatedCountry);
    }

    public WebElement getShowItemsCheckbox() {
        return driver.findElement(showItemsCheckbox);
    }

    public WebElement getSpecificSellersCheckbox() {
        return driver.findElement(specificSellersCheckbox);
    }

    public WebElement getIncludeExclude() {
        return driver.findElement(includeExclude);
    }

    public WebElement getIncludeExcludeText() {
        return driver.findElement(includeExcludeText);
    }

    public WebElement getSavedSellerCheckbox() {
        return driver.findElement(savedSellerCheckbox);
    }

    public WebElement getEbayStoreSellerCheckbox() {
        return driver.findElement(ebayStoreSellerCheckbox);
    }

    public WebElement getSortBy() {
        return driver.findElement(sortBy);
    }

    public WebElement getViewResults() {
        return driver.findElement(viewResults);
    }

    public WebElement getResultsPerPage() {return driver.findElement(resultsPerPage);}

    public WebElement getHigherSearchBtn() {
        return driver.findElement(higherSearchBtn);
    }

    public WebElement getLowerSearchBtn() {
        return driver.findElement(lowerSearchBtn);
    }

    public WebElement getClearOptions() {
        return driver.findElement(clearOptions);
    }
}
