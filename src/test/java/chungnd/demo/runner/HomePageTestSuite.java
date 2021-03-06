package chungnd.demo.runner;

import chungnd.demo.page.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageTestSuite {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Setup\\webdrivers\\Chrome 91\\chromedriver.exe");
        driver = new ChromeDriver();
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

    @After
    public void closeBroswer() {
        driver.quit();
    }
}
