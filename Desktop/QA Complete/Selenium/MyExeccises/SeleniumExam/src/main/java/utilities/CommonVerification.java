package utilities;

import org.junit.Assert;

public class CommonVerification {

    public static void verifyTitle(String expectedTitle, String messageOnFailure) {
        String actualTitle = Browser.driver.getTitle();

        Assert.assertEquals(messageOnFailure, expectedTitle, actualTitle);
    }
}
