package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    By closePopUp = By.cssSelector("button.ab-close-button");
    By signInBtn = By.className("css-1azyhx4");
    public BasePage(WebDriver givenDriver) {
        driver = givenDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }
    public BasePage closePopUp(){
        wait.until(ExpectedConditions.elementToBeClickable(closePopUp)).click();
        return this;
    }
    public boolean isSignInDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInBtn));
        return true;
    }
    public void switchToChildWindow() {
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();}
        driver.switchTo().window(subWindowHandler); // switch to popup window
    }
}