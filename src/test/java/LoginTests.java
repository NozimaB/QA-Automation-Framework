import POM.BasePage;
import POM.HomePage;
import POM.LoginPage;
import POM.LoginPage;
import POM.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class LoginTests extends BaseTest {

    @Test
    public void logIn() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton()
                .clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.isForYouDisplayed();
    }
}
