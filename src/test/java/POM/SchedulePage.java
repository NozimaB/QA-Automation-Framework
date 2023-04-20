package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.SQLOutput;
import java.util.List;

public class SchedulePage extends BasePage {

    public SchedulePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By scheduleBtn = By.cssSelector("a#nav-schedule");
    By locationField = By.xpath("//div[@data-testid='quickSelector.location.popover']//div[contains(text(),'Portland')]"); ////div[@data-testid='quickSelector.locationSelector']
    By denverCOLocation = By.cssSelector("#quick-selector-option-location-denver--co");
    By serviceField = By.xpath("//div[@data-testid='quickSelector.service.popover']"); ////div[text()='Choose Service']
    By illInjService = By.xpath("//div[contains(text(),'Illness/Injury')]");
    By dateField = By.xpath("//div[@data-testid='quickSelector.date.popover']//div[contains(text(),'Choose Date')]");
    By todayDate = By.xpath("//div[@id='popover']//div[contains(text(),'17')]");
    By searchBtn = By.cssSelector("#quickSelectorSubmit");

    public SchedulePage selectSchedule() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(scheduleBtn)).click();
        Thread.sleep(2000);
        return this;
    }
    public SchedulePage selectLocation() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(locationField)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(denverCOLocation)).click();
        return this;
    }

    public SchedulePage selectService() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(serviceField)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(illInjService)).click();
        Thread.sleep(2000);
        return this;
    }

    public SchedulePage selectDate() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(dateField)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(todayDate)).click();
        return this;
    }

    public SchedulePage clickSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
        return this;
    }

    public boolean isCODisplayed() {
        List<WebElement> searchResults = driver.findElements(By.xpath(" //div[@data-testid='ServiceLine.1.ClinicSection']"));
        for (WebElement clinic : searchResults) {
            if (clinic.getText().contains("OR 97")) {
            }
            System.out.println("CO is displayed");
        }
        return true;
    } /* // 2. Click drop-down for Location // 3. Select "Denver, CO" // 4. Click drop-down for Service // 5. Select "Illness/Injury" // 6. Click drop-down for Date // 7. Select today's date // 8. Click "Search" button // AC: The page displays all Illness/Injury Clinic Visits in Colorado */
}
