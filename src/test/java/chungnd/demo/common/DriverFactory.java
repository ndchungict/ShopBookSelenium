package chungnd.demo.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import static io.github.bonigarcia.wdm.config.DriverManagerType.*;

public class DriverFactory {
        public static WebDriver createDriver() {

            String browser = System.getProperty("browser", "firefox");

            if ("firefox".equals(browser)) {
                WebDriverManager.getInstance(FIREFOX).setup();
                return new FirefoxDriver();
            } else if ("chrome".equals(browser)) {
                WebDriverManager.getInstance(CHROME).setup();
                return new ChromeDriver();
            }else if ("opera".equals(browser)) {
                WebDriverManager.getInstance(OPERA).setup();
                return new OperaDriver();
            }

            throw new RuntimeException("Unsupported webdriver: " + browser);
        }
}
