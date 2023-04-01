
import POM.BasePage;
import org.testng.annotations.Test;

public class LandingPageTests extends BaseTest {

    @Test
    public void xOutPopup() {
        BasePage basepage = new BasePage(driver);

        basepage.closePopUp().isSignInDisplayed();
    }
}