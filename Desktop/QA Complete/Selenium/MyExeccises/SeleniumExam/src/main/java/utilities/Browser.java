package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {
    public static WebDriver driver;

    public static void open(String browser) {
        switch (browser) {
            case "chrome": {
                System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\Chrome\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            }

            case "firefox":{
            }

            case "ie" : {
            }

            default: throw new RuntimeException("There is no such browser, take a look at the method javadoc examples");
        }
    }
    public static void quit() {
        driver.quit();
    }

    }

