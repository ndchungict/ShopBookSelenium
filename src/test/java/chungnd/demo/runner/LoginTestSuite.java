package chungnd.demo.runner;

import chungnd.demo.common.DriverFactory;
import chungnd.demo.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTestSuite {
    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp() {
        driver = DriverFactory.createDriver();
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
