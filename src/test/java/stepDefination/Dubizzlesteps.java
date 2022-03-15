package stepDefination;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.*;

import pageObjects.dubizzle;

public class Dubizzlesteps {
    public WebDriver driver;
    public dubizzle db;

    @Given("I launch Chrome browser")

    public void i_launch_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "/home/vend-arsalan/Downloads/Munchiesobjective/SeleniumCucumber/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        db = new dubizzle(driver);

    }
    @When("User open URL {string}")

    public void user_open_URL(String url) {
        driver.get(url);
    }

    @Then("click on rent tab")
    public void click_on_rent_tab() {
        db.mouseover();
        db.sleep();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("disable-infobars");
        db.renttab();
        db.sleepmore();
       /* db.pricerange();
        db.sleep();
        db.setMinvalue();
        db.setMaxvalue();
        db.sleep();
        db.clicksearch();
        db.sleep();
       db.validateminvalue();
       db.validatemaxvalue();
        db.sleep();
        db.nextpage();
        db.sleep();
        db.validateminvalue();
        db.validatemaxvalue();
        driver.close();*/
    }
    @Then("search with price")
    public void search_with_price() {
        db.pricerange();
        db.sleep();
        db.setMinvalue();
        db.setMaxvalue();
        db.sleep();
        db.clicksearch();
        db.sleep();
    }
    @Then("validate min and max")
    public void validate_min_and_max() {

        db.validateminvalue();
        db.validatemaxvalue();
        db.sleep();
    }
    @Then("move to page 2")
    public void move_to_page_2() {

        db.nextpage();
        db.sleep();
    }
    @Then("validate min and max again")
    public void validate_min_and_max_again() {
        db.validateminvalue();
        db.validatemaxvalue();
    }
    @Then("close scenario")
    public void close_scenario() {

        driver.close();
    }
}
