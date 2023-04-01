package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
public class HomePage extends BasePage {

    Actions actions;

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }
    By forYou = By.xpath("//h1[contains(text(),'For You')]");
    By searchField = By.id("term");
    By tripleDots = By.xpath("//div[@class='css-ncj1jm']//button[@aria-label='CNN Options']");
    By goToStation = By.xpath("//span[contains(text(),'Go')]");
    By followBtn = By.xpath("//button[@aria-label='Follow CNN']");
    By  followingStn= By.xpath("//span[text()='Following CNN']");
    public boolean isForYouDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(forYou));
        return true;
    }
    public HomePage searchStation(){
        wait.until(ExpectedConditions.elementToBeClickable(searchField)).sendKeys("CNN",Keys.ENTER);
        return this;
    }
    public HomePage goToStationPage() {
        wait.until(ExpectedConditions.elementToBeClickable(tripleDots)).click();
        wait.until(ExpectedConditions.elementToBeClickable(goToStation)).click();
        return this;
    }
    public HomePage followStn(){
        wait.until(ExpectedConditions.elementToBeClickable(followBtn)).click();
        return this;
    }
    public boolean isFollowingDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(followingStn));
        return true;
    }
}
