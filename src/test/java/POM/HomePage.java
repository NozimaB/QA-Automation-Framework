package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage {
    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By forYou = By.xpath("//h1[contains(text(),'For You')]");

    public boolean isForYouDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forYou));
        return true;
    }
}
