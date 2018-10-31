package positive;

import org.junit.Before;
import org.junit.Test;
import testing.AccountPage;
import testing.HomepageRegister;
import utilities.Browser;
import utilities.CommonVerification;

public class PageRegisterTest {
    @Before
    public void setup() {
        Browser.open("chrome");
        HomepageRegister.goTo();
    }
    @Test
    public void sucessfulRegister(){
        HomepageRegister.openAccountLoginPage();
        CommonVerification.verifyTitle("Register Account", "You are not on right page");
        // added new comment

    }

}
