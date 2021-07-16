package chungnd.demo.page;

import chungnd.demo.common.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//nav[@id='main-nav-wrap']//a[text()='Shop']")
    WebElement shopMenu;

    @FindBy(xpath = "//div[@id='content']/nav/a[text()='Home']")
    WebElement homeMenuButton;

    @FindBy(xpath = "//div[@class='row_inner']//div[@data-slide-duration='0']//img")
    List<WebElement> listSlider;

    @FindBy(xpath = "//div[@class='woocommerce']//a/img")
    List<WebElement> listArrivals;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(){
        getDriver().get("http://practice.automationtesting.in/");
    }

    public void clickOnShopMenu(){
        shopMenu.click();
        waitForSec(3);
    }

    public void clickOnHomeMenuButton(){
        homeMenuButton.click();
    }

    public void verifyNumberOfSliders(){
        Assertions.assertEquals(3,listSlider.size());
    }

    public void verifyNumberOfArrivals(){
        Assertions.assertEquals(3,listArrivals.size());
    }
}
