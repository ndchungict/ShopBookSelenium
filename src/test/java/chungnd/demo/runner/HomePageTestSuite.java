package chungnd.demo.runner;

import chungnd.demo.common.DriverFactory;
import chungnd.demo.page.HomePage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class HomePageTestSuite {
    WebDriver driver;
    HomePage homePage;

    @BeforeEach
    public void setUp() {
        driver = DriverFactory.createDriver();
        homePage = new HomePage(driver);
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void verify_sliders_number() {
        homePage.clickOnShopMenu();
        homePage.clickOnHomeMenuButton();
        homePage.verifyNumberOfSliders();
    }

    @Test
    public void verify_arrivals_number() {
        homePage.clickOnShopMenu();
        homePage.clickOnHomeMenuButton();
        homePage.verifyNumberOfArrivals();
    }

    @AfterEach
    public void closeBroswer() {
        driver.quit();
    }
}
