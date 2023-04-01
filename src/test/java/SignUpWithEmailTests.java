import POM.BasePage;
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

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();


        WebElement signInPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.content")));
        WebElement signInWithAudacy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id = 'audacy-button']")));
        signInWithAudacy.click();
        WebElement logInWithAudacy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@id = 'OAuthRegister']")));
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#user_email")));
        emailField.sendKeys("gedip24524@huvacliq.com");
        WebElement pwdField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.pwdIconShow")));
        pwdField.sendKeys("Abc123456!");
        WebElement contBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitForm")));
        contBtn.click();
//        switchToChildWindow();
        WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label,'First')]")));
        firstName.sendKeys("Anna");
        WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label,'Last')]")));
        lastName.sendKeys("Karenina");
        WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Continue')]")));
        continueBtn.click();
//        switchToChildWindow();
        WebElement genderField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@aria-haspopup='listbox']")));
        genderField.click();
        WebElement female = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@id,'FEMALE')]")));
        female.click();
        actions.sendKeys(Keys.TAB).perform();
        WebElement birthField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label, 'Date')]")));
        birthField.click();
        birthField.sendKeys("10101985");
        actions.sendKeys(Keys.TAB).perform();
        WebElement zipcodeField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label,'Zipcode')]")));
        zipcodeField.click();
        zipcodeField.sendKeys("35634");
        WebElement submitBtn = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))));
        submitBtn.click();
//        switchToChildWindow();
        WebElement forYou = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'For You')]")));
        Assert.assertTrue(forYou.isDisplayed());
    }
    @Test
    public void emailExists() {
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ab-background')]")));
        WebElement closePopup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ab-close-button")));
        closePopup.click();
        WebElement signInBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("css-1azyhx4")));
        signInBtn.click();
//        switchToChildWindow();
        WebElement signInPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.content")));
        WebElement signInWithAudacy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id = 'audacy-button']")));
        signInWithAudacy.click();
        WebElement logInWithAudacy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@id = 'OAuthRegister']")));
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#user_email")));
        emailField.sendKeys("gedip24524@huvacliq.com");
        WebElement pwdField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.pwdIconShow")));
        pwdField.sendKeys("Abc123456!");
        WebElement contBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitForm")));
        contBtn.click();
        WebElement accountExists = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.error.serverError")));
        Assert.assertTrue(accountExists.isDisplayed());
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