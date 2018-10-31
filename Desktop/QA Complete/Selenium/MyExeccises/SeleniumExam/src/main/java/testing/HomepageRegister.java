package testing;

import org.openqa.selenium.By;
import utilities.Browser;

public class HomepageRegister {
    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/");
    }

    public static void openAccountLoginPage() {
        Browser.driver.findElement(By.linkText("My Account")).click();
        Browser.driver.findElement(By.linkText("Register")).click();
    }
}
