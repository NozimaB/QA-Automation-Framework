package POM;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By forYou = By.xpath("//h1[contains(text(),'For You')]");
    By searchField = By.id("term");
    By tripleDots = By.xpath("//div[@class='css-ncj1jm']//button[@aria-label='CNN Options']");
    By goToStation = By.xpath("//span[contains(text(),'Go')]");
    By followBtn = By.xpath("//button[@aria-label='Follow CNN']");
    By followingStn = By.xpath("//span[text()='Following CNN']");
    By myAudio = By.xpath("//span[contains(text(),'My audio')]");
    By myStations = By.cssSelector("#tab-label-3");
    By editBtn = By.cssSelector(".css-vmk53c");
    By cnnRadioBtn = By.xpath("//button[@aria-label='CNN']");
    By unfollowBtn = By.cssSelector(".css-ulecpx");
    By unfollowPopUp = By.xpath("//span[text()='Removed from Stations']");
    By cnn = By.xpath("//span[text()='CNN']");
//    By weeiStation = By.xpath("//div[@class='css-16e12e5']//*[contains(text(),'Boston')]");
    By weeiStation = By.xpath("//a[@class='css-14wpruh' and  @href='/stations/weei']");
    By liveBtn = By.xpath("//button[contains(@aria-label,'Live')]");
    By pauseBtn = By.xpath("//button[@aria-label='Pause']");
    By stationsTab = By.cssSelector("#tab-label-2");
    By podcastsTab = By.cssSelector("#tab-label-3");
    By showsTab = By.cssSelector("#tab-label-4");
    By holidayStn = By.xpath("//span[text()='Holiday']");
    By musicMenu = By.xpath("//li//span[contains(text(),'Music')]");
//    By podcastsMenu = By.xpath("//li//span[contains(text(),'Podcasts')]");
//    By podcastsMenu = By.xpath("//li//span[contains(text(),'Podcasts')]");
    By podcastsMenu = By.xpath("//a[@class='css-v1pgas' and @href='/podcast']");
    By podcastCJunkie = By.xpath("//div[@aria-label='Slide 3 of 8']");
    By followJunkieBtn = By.xpath("//button[@aria-label='Follow Crime Junkie']");
    By backBtn = By.xpath("//div[@class='css-fdpdf0']//button");
    By podcastDateline = By.xpath( "//div[@aria-label='Slide 1 of 8']//*[contains(text(),'Dateline')]"); //"//div[@aria-label='Slide 1 of 10']//*[contains(text(),'Dateline')]");
    By podcastsShows = By.cssSelector("#tab-label-4");
    By cJunkiePMyAudio = By.xpath("//a[@aria-label='View Crime Junkie']");


    public boolean isForYouDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forYou));
        return true;
    }

    public HomePage clickSearch( String searchInput) {
        wait.until(ExpectedConditions.elementToBeClickable(searchField)).sendKeys(searchInput.toLowerCase(), Keys.ENTER);
        return this;
    }

    public HomePage goToStationPage() {
        wait.until(ExpectedConditions.elementToBeClickable(tripleDots)).click();
        wait.until(ExpectedConditions.elementToBeClickable(goToStation)).click();
        return this;
    }

    public HomePage followStn() {
        wait.until(ExpectedConditions.elementToBeClickable(followBtn)).click();
        return this;
    }

    public boolean isFollowingDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(followingStn));
        return true;
    }

    public HomePage clickMyAudio() {
        wait.until(ExpectedConditions.elementToBeClickable(myAudio)).click();
        return this;
    }

    public HomePage clickMyStations() {
        wait.until(ExpectedConditions.elementToBeClickable(myStations)).click();
        return this;
    }

    public HomePage clickEdit() {
        wait.until(ExpectedConditions.elementToBeClickable(editBtn)).click();
        return this;
    }

    public HomePage clickCnnRadioBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(cnnRadioBtn)).click();
        return this;
    }

    public HomePage clickUnfollow() {
        wait.until(ExpectedConditions.elementToBeClickable(unfollowBtn)).click();
        return this;
    }

    public boolean isUnfollowPopUpDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(unfollowPopUp));
        return true;
    }

    public boolean cnnIsNotFollowed() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(cnn));
        return true;
    }

    public HomePage clickWeeiStn() {
        wait.until(ExpectedConditions.elementToBeClickable(weeiStation)).click();
        return this;
    }

    public HomePage clickLive() {
        wait.until(ExpectedConditions.elementToBeClickable(liveBtn)).click();
        return this;
    }
    public HomePage clickPauseBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(pauseBtn)).click();
        return this;
    }

    public boolean isPauseDisplayed() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(pauseBtn));
        return true;
    }

    public void scrollDownToStn() throws InterruptedException {
        WebElement weeiStn = driver.findElement(By.xpath("//div[@aria-label='Slide 1 of 2']//span[contains(text(),'WEEI')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", weeiStn);
//        js.executeScript("window.scrollBy(0,2000)", weeiStn);
//        wait.until(ExpectedConditions.stalenessOf(weeiStn));
    }
    public HomePage scrollDownClickCMore() throws InterruptedException {
        WebElement seeMoreBtn = driver.findElement(By.cssSelector(".css-1r2y8e7"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        seeMoreBtn.click();
        Thread.sleep(5000);
        return this;
    }
    public HomePage scrollDownToMusic() throws InterruptedException {
        WebElement exploreMusic = driver.findElement(By.xpath("//section//h2[contains(text(),'Explore')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", exploreMusic);
        Thread.sleep(3000);
        return this;
    }

    public boolean isAustinDisplayed() {
        List<WebElement> stnCarousel = driver.findElements(By.xpath("//div[contains(@aria-label,'of 5')]"));
        for (WebElement stn : stnCarousel) {
            if (stn.getText().contains("Austin")) {
            }
        }
        return true;
    }
//                  List<WebElement> stnCarousel = driver.findElements(By.xpath("//div[contains(@aria-label,'of 5')]"));
//                  for(int i = 0; i < stnCarousel.size(); i++) {
//                  if (stnCarousel.get(i).getText().contains("Austin")) {
//                  }} return true;}}  // another for loop to go through webelements
    public boolean doesSearchWork(String resultContains) {
        List<WebElement> results = driver.findElements(By.xpath("//li[@tabindex]"));
        for (WebElement result : results) {
            if (result.getText().toLowerCase().contains(resultContains.toLowerCase())) {
            }
        }
    return true;
    }
    public HomePage clickStationsTab() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(stationsTab)).click();
        Thread.sleep(3000);
        return this;
    }
    public HomePage clickPodcastsTab() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(podcastsTab)).click();
        Thread.sleep(3000);
        return this;
    }
    public HomePage clickShowsTab() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(showsTab)).click();
        Thread.sleep(3000);
        return this;
    }
    public HomePage clickMusicMenuOptn() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(musicMenu)).click();
        Thread.sleep(2000);
        return this;
    }
    public HomePage clickCaretRightBtn() throws InterruptedException{
        WebElement exploreMusic = driver.findElement(By.xpath("//section//h2[contains(text(),'Explore')]"));
        actions.moveToElement(exploreMusic).perform();
        Thread.sleep(2000);
        WebElement caretRightBtn = driver.findElement(By.xpath("//div[@data-index='2']//button[@aria-label='Next slides']"));
        caretRightBtn.click();
        Thread.sleep(2000);
        return this;
//        wait.until(ExpectedConditions.elementToBeClickable(caretRightBtn)).click();
    }
    public boolean isHolidayDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(holidayStn));
        return true;
    }
    public HomePage clickPodcasts()throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(podcastsMenu)).click();
        Thread.sleep(2000);
        return this;
    }
    public HomePage clickCaretRightBtnPodcasts() throws InterruptedException{
        WebElement exploreMusic = driver.findElement(By.xpath("//section//h2[contains(text(),'Charts')]")); ////div[@class='css-14gdf82']//h2[contains(text(), 'Charts')]
        actions.moveToElement(exploreMusic).perform();
        Thread.sleep(2000);
        WebElement caretRightBtn = driver.findElement(By.xpath("//div[@data-index='1']//button[@aria-label='Next slides']"));
        caretRightBtn.click();
        Thread.sleep(2000);
        return this;
//        wait.until(ExpectedConditions.elementToBeClickable(caretRightBtn)).click();
    }
    public boolean isCJunkiePDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(podcastCJunkie));
        return true;
    }
    public HomePage clickCaretLeftBtnPodcasts() throws InterruptedException{
        WebElement exploreMusic = driver.findElement(By.xpath("//section//h2[contains(text(),'Charts')]"));
        actions.moveToElement(exploreMusic).perform();
        Thread.sleep(2000);
        WebElement caretRightBtn = driver.findElement(By.xpath("//div[@data-index='1']//button[@aria-label='Previous slides']"));
        caretRightBtn.click();
        Thread.sleep(2000);
        return this;
//        wait.until(ExpectedConditions.elementToBeClickable(caretRightBtn)).click();
    }
    public boolean isDatelinePDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(podcastDateline));
        return true;
    }
    public HomePage clickCJunkieP() {
        wait.until(ExpectedConditions.elementToBeClickable(podcastCJunkie)).click();
        return this;
    }
    public HomePage clickCJunkiePFollow() {
        wait.until(ExpectedConditions.elementToBeClickable(followJunkieBtn)).click();
        return this;
    }
    public HomePage clickBackArrow() {
        wait.until(ExpectedConditions.elementToBeClickable(backBtn)).click();
        return this;
    }
    public HomePage clickPodcastsShows() {
        wait.until(ExpectedConditions.elementToBeClickable(podcastsShows)).click();
        return this;
    }
    public boolean isCJunkiePMyAudioDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cJunkiePMyAudio));
        return true;
    }
}