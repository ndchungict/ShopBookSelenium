package chungnd.demo.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends PageFactory {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void waitForSec(int time){
        try {
            Thread.sleep(time*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
