import POM.BasePage;
import POM.HomePage;
import POM.LoginPage;
import POM.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SignUpWithEmailTests extends BaseTest {
    @Test
    public void signUpWAudacy() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);


        signUpPage.clickSignInButton().clickAudacy();
        signUpPage.enterEmail().enterPwd().continueBtn();
        basepage.switchToChildWindow();
        signUpPage.firstNameField().lastNameField().clickContinueBtn();
        basepage.switchToChildWindow();
        signUpPage.clickGenderField().selectFemale().enterDOB().enterZipCode().clickSubmit();
        basepage.switchToChildWindow();
        homePage.isForYouDisplayed();

    }
    @Test
    public void emailExists() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);


        signUpPage.clickSignInButton().clickAudacy();
        signUpPage.enterEmail().enterPwd().continueBtn().isAccountExistsMDisplayed();
        }
    @Test
    public void emptyFNFields() {
        WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='First name text input - ']")));
        firstName.click();
        firstName.sendKeys("D");
        firstName.clear();
        WebElement nameRed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-t2ztlr")));
        Assert.assertTrue(nameRed.isDisplayed());
    }
    @Test
    public void emptyLNFields() {
        WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Last name text input - ']")));
        lastName.click();
        lastName.sendKeys("D");
        lastName.clear();
        WebElement nameRed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-t2ztlr")));
        Assert.assertTrue(nameRed.isDisplayed());
    }
}