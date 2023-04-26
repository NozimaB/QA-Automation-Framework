package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

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

    By contBtn = By.cssSelector("#submitForm");
    By continueBtn = By.xpath("//span[contains(text(),'Continue')]");
   By genderField = By.xpath("//span[@aria-haspopup='listbox']");

   By submitBtn =By.xpath("//button[@type='submit']");
  By accountExists = By.cssSelector("span.error.serverError");
//    By emailField = By.cssSelector("input#user_email");
//    By passwordField = By.cssSelector("input.pwdIconShow");


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
    public SignUpPage enterEmail(){
        WebElement emailField =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#user_email")));
        emailField.click();
        emailField.sendKeys("vekaw18429@raotus.com");
        return this;
    }
    public SignUpPage enterPwd(){
        WebElement pwdField =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.pwdIconShow")));
       pwdField.click();
       pwdField.sendKeys("Test12345!");
        return this;
    }
    public SignUpPage continueBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(contBtn)).click();
        return this;
    }
    public SignUpPage firstNameField(){
        WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label,'First')]")));
        firstName.sendKeys("Anna");
        return this;
    }
    public SignUpPage lastNameField(){
        WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label,'Last')]")));
        lastName.sendKeys("Karenina");
        return this;
    }
    public SignUpPage clickContinueBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
        return this;
    }
    public SignUpPage clickGenderField(){
        wait.until(ExpectedConditions.elementToBeClickable(genderField)).click();
        return this;
    }
    public SignUpPage selectFemale(){
        WebElement female = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@id,'FEMALE')]")));
        female.click();
        actions.sendKeys(Keys.TAB).perform();
        return this;
    }
    public SignUpPage enterDOB(){
        WebElement birthField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label, 'Date')]")));
        birthField.click();
        birthField.sendKeys("10101985");
        actions.sendKeys(Keys.TAB).perform();
        return this;
    }
    public SignUpPage enterZipCode() {
        WebElement zipcodeField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label,'Zipcode')]")));
        zipcodeField.click();
        zipcodeField.sendKeys("92831");
        return this;
    }
    public SignUpPage clickSubmit(){
       wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }
    public boolean isAccountExistsMDisplayed() {
      wait.until(ExpectedConditions.visibilityOfElementLocated(accountExists));
       return true;
    }
   }









