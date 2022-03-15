package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.*;

import java.util.List;

public class dubizzle {
    public WebDriver Idriver;
    public dubizzle(WebDriver rdriver)

    {

        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }
    @FindBy(xpath ="//a[contains(text(),'Apartment/Flat for Rent')]")
//   @FindBy(css = ".Searchbox__square:nth-child(5)")
    @CacheLookup
    WebElement clickrenttab;

    @FindBy(xpath ="//button[@class='FilterPanelWrapper__FilterToggler-j6rj8g-5 jithFs']")
    @CacheLookup
    WebElement pricerange;

    @FindBy(xpath ="//input[@data-testid='min_price_input']")
    @CacheLookup
    WebElement minvalue;

    @FindBy(xpath ="//input[@data-testid='max_price_input']")
    @CacheLookup
    WebElement maxvalue;

    @FindBy(xpath ="//button[@class='Button__Root-sc-1wygika-0 izAtLx Filters__Search-sc-1dn1deu-0 cXAwnN']")
    @CacheLookup
    WebElement search;

    @FindBy(xpath ="//a[@data-test='pagination-page-2']")
    @CacheLookup
    WebElement changepage;


    public void renttab() {
        clickrenttab.click();

    }
    public void pricerange(){
        pricerange.click();
    }


    public void setMinvalue(){
        minvalue.sendKeys(String.valueOf(60000));
    }
    public void setMaxvalue(){
        maxvalue.sendKeys(String.valueOf(80000));
    }

    public void clicksearch(){
        search.click();
    }
    public void nextpage(){
        changepage.click();
    }

    public void validateminvalue(){
        List<WebElement> min= Idriver.findElements(By.xpath("//span[contains(text(),'59,')]"));
        if ( min.size() > 0){
            System.out.println("min value " + " is present. ");
        } else {
            System.out.println("min value" + " is not present. ");
        }

    }
public void validatemaxvalue() {

    List<WebElement> max = Idriver.findElements(By.xpath("//span[contains(text(),'81,')]"));
    if (max.size() > 0) {
        System.out.println("max value " + " is present. ");
    } else {
        System.out.println("max value" + " is not present. ");
    }
}
    public void mouseover(){
        Actions actions = new Actions(Idriver);
        WebElement menuOption = Idriver.findElement(By.xpath("//a[@href='/en/property-for-rent/']"));
        actions.moveToElement(menuOption).perform();
    }
    public void sleep(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void sleepmore(){
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
