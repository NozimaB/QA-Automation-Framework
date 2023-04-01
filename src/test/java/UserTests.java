import POM.BasePage;
import POM.HomePage;
import POM.LoginPage;
import POM.SignUpPage;
import org.testng.annotations.Test;

public class UserTests extends BaseTest{

    @Test
    public void followStation(){
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.searchStation().goToStationPage().followStn().isFollowingDisplayed();
    }
}
