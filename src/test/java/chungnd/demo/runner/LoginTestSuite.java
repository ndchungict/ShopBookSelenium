package chungnd.demo.runner;

import chungnd.demo.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestSuite {
    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Setup\\webdrivers\\Chrome 91\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithValidUsernameAndPassword(){
        loginPage.clickOnMyAccountMenu();
        loginPage.login("chungnd@paraline.com.vn","ParalineAuto123@");
        loginPage.verifyDashboardDisplayed();
    }

    @After
    public void closeBroswer() {
        driver.quit();
    }
}
