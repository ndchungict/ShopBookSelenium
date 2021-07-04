package chungnd.demo.steps;

import chungnd.demo.common.DriverFactory;
import chungnd.demo.page.HomePage;
import chungnd.demo.page.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    public LoginSteps() {
        this.driver = DriverFactory.createDriver();
        loginPage = new LoginPage(this.driver);
        homePage = new HomePage(this.driver);
    }

    @Given("^Open home page$")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @Given("^Click on My Account Menu$")
    public void clickOnMyAccountMenu() {
        loginPage.clickOnMyAccountMenu();
    }

    @Given("^Enter registered (.*) in username textbox$")
    public void enterUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("^Enter (.*) in password textbox$")
    public void enterPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("^Click on login button$")
    public void clickOnLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("^User must successfully login to the web page$")
    public void verifyLoginSuccess() {
        loginPage.verifyDashboardDisplayed();
    }

    @Given("^Nguoi dung thay thong bao loi (.*)$")
    public void verifyErrorMessage(String message) {
        loginPage.verifyErrorMessage(message);
    }


    @After
    public void afterTest(Scenario scenario) {
        if (true) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","anh"); //stick it in the report
        }
        homePage.getDriver().quit();
    }
}
