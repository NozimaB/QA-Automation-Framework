package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By login = By.cssSelector(".arrowIcon");
    By emailField = By.cssSelector("input#loginId");
    By passwordField = By.xpath("//input[@type='password']");
    By continueBtn = By.cssSelector("#submitForm");
    LogInPage HomePage;

    public LogInPage emailInput(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys(email);
        return this;
    }

    public LogInPage passwordInput(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys(email);
        return this;
    }

    public LogInPage clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
        return this;
    }

    public LogInPage logIn(String email, String password) {
        emailInput(email).passwordInput(password).clickContinue();
        switchToChildWindow();
        return HomePage;
    }
    public LogInPage clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        return this;
    }
}
