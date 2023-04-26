import POM.BasePage;
import POM.HomePage;
import POM.LoginPage;
import POM.SignUpPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void logIn() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

//        basepage.closePopUp();
        signUpPage.clickSignInButton()
                .clickAudacy();
        logInPage.clickLogin().logIn("Pigotska.vasylyna@gmail.com", "@Rabota2023!");
        homePage.isForYouDisplayed();
    }
}
