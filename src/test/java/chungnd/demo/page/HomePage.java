package chungnd.demo.page;

import chungnd.demo.common.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//nav[@id='main-nav-wrap']//a[text()='Shop']")
    WebElement shopMenu;

    @FindBy(xpath = "//div[@id='content']/nav/a[text()='Home']")
    WebElement homeMenuButton;

    @FindBy(xpath = "//div[@class='row_inner']//div[@data-slide-duration='0']//img")
    List<WebElement> listSlider;

    @FindBy(xpath = "//div[@class='woocommerce']//a/img")
    List<WebElement> listArrivals;

    public void clickOnShopMenu(){
        shopMenu.click();
    }

    public void clickOnHomeMenuButton(){
        homeMenuButton.click();
    }

    public void verifyNumberOfSliders(int number){
        Assertions.assertEquals(number,listSlider.size());
    }

    public void verifyNumberOfArrivals(int number){
        Assertions.assertEquals(number,listArrivals.size());
    }
}
