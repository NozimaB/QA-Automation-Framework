package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By login = By.cssSelector(".arrowIcon");
    By emailField = By.cssSelector("input#loginId");
    By passwordField = By.xpath("//input[@type='password']");
    By continueBtn = By.cssSelector("#submitForm");
    LoginPage HomePage;
    //    public LogInPage clickLogin() {
//        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
//        return this;
//    }
    public LoginPage emailInput(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys(email);
        return this;
    }
    public LoginPage passwordInput(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys(email);
        return this;
    }
    public LoginPage clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
        return this;
    }
    public LoginPage logIn(String email, String password){
        emailInput(email).passwordInput(password).clickContinue();
        switchToChildWindow();
        return HomePage;
    }
    public LoginPage clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        return this;
    }
}