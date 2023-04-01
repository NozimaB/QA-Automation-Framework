import POM.BasePage;
import POM.SignUpPage;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest {

    @Test
    public void signInWFacebook() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickFacebook().isFacebookDisplayed();
    }

    @Test
    public void signInWApple() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickApple().isAppleDisplayed();
    }

    @Test
    public void signInWAudacy() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy().isAudacyDisplayed();
    }
}
