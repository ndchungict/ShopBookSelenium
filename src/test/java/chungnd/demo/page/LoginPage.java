package chungnd.demo.page;

import chungnd.demo.common.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@id='main-nav']//a[text()='My Account']")
    WebElement myAccountMenu;

    @FindBy(id = "username")
    WebElement txtUsername;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@name='login']")
    WebElement btnLogin;

    @FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']//a[text()='Dashboard']")
    WebElement dashboard;


    public void clickOnMyAccountMenu(){
        myAccountMenu.click();
    }

    public void login(String username,String password){
        inputUsername(username);
        inputPassword(password);
        clickOnLoginButton();
    }

    public void inputUsername(String username){
        txtUsername.clear();
        txtUsername.sendKeys(username);
    }

    public void inputPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickOnLoginButton(){
        btnLogin.click();
    }

    public void verifyDashboardDisplayed(){
        Assertions.assertTrue(dashboard.isDisplayed());
    }
}
