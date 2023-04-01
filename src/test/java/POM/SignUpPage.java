package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    By facebook = By.xpath("//button[contains(text(), 'Facebook')]");
    By loginWFacebook = By.xpath("//div[contains(text(),'Facebook')]");
    By apple = By.xpath("//button[contains(text(),'Apple')]");
    By loginWApple = By.cssSelector(".ac-localnav-title");
    By audacy = By.xpath("//button[contains(text(),'Audacy')]");
    By loginwAudacy = By.cssSelector(".page-body.container ");

    public SignUpPage clickSignInButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInBtn)).click();
        switchToChildWindow();
        return this;
    }
    public SignUpPage clickFacebook() {
        wait.until(ExpectedConditions.elementToBeClickable(facebook)).click();
        switchToChildWindow();
        return this;
    }
    public boolean isFacebookDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginWFacebook));
        return true;
    }
    public SignUpPage clickApple() {
        wait.until(ExpectedConditions.elementToBeClickable(apple)).click();
        switchToChildWindow();
        return this;
    }
    public boolean isAppleDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginWApple));
        return true;
    }
    public SignUpPage clickAudacy() {
        wait.until(ExpectedConditions.elementToBeClickable(audacy)).click();
        switchToChildWindow();
        return this;
    }
    public boolean isAudacyDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginwAudacy));
        return true;
    }
}