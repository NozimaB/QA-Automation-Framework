import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpWithEmailTests extends BaseTest {
    @Test
    public void logInWithAudacyIsDisplayed() throws InterruptedException {
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ab-background')]")));
        WebElement closePopup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ab-close-button")));
        closePopup.click();
        WebElement signInBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("css-1azyhx4")));
        signInBtn.click();
        switchToChildWindow();
        WebElement signInPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.content")));
        WebElement signInWithAudacy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id = 'audacy-button']")));
        signInWithAudacy.click();
        WebElement logInWithAudacy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@id = 'OAuthRegister']")));
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#user_email")));
        emailField.sendKeys("hobate8118@necktai.com");
        WebElement pwdField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.pwdIconShow")));
        pwdField.sendKeys("Abc123456!");
        WebElement contBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitForm")));
        contBtn.click();
        switchToChildWindow();
//        WebElement page2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1jbf0xs")));
        WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label,'First')]")));
        firstName.sendKeys("Anna");
        WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label,'Last')]")));
        lastName.sendKeys("Karenina");
        WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Continue')]")));
        continueBtn.click();
        switchToChildWindow();
        WebElement genderField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@aria-haspopup='listbox']")));
        genderField.click();
        WebElement female = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@id,'FEMALE')]")));
        female.click();
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);
        WebElement birthField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label, 'Date')]")));
        birthField.click();
        birthField.sendKeys("10101985");
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);
        WebElement zipcodeField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@aria-label,'Zipcode')]")));
        zipcodeField.click();
        zipcodeField.sendKeys("35634");
        WebElement submitBtn = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))));
        submitBtn.click();
        switchToChildWindow();
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
        switchToChildWindow();
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
}
