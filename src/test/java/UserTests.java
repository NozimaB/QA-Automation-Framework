import POM.BasePage;
import POM.HomePage;
import POM.LoginPage;
import POM.SignUpPage;
import org.testng.annotations.Test;

public class UserTests extends BaseTest {

    @Test(priority = 0)
    public void followStation() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.clickSearch("CNN").goToStationPage().followStn().isFollowingDisplayed();
    }

    @Test(priority = 1)
    public void unfollowStation() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.clickMyAudio().clickMyStations().clickEdit().clickCnnRadioBtn().clickUnfollow()
                .isUnfollowPopUpDisplayed();
    }

    @Test(priority = 2)
    public void cnnNotFollowed() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.cnnIsNotFollowed();
    }

    @Test(priority = 3)
    public void stationPlaying() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.scrollDownToStn();
        homePage.clickTalk1370Stn().clickLive().isPauseDisplayed();
    }

    @Test(priority = 4)
    public void stationsNearYou() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.isAustinDisplayed();
    }

    @Test(priority = 5)
    public void searchFunction() {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.clickSearch("KIDS").doesSearchWork("KIDs");
    }

    @Test(priority = 6)
    public void expandedSearch() throws InterruptedException {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.clickSearch("KIDS");
        homePage.scrollDownClickCMore().doesSearchWork("KiDs");
    }
    @Test(priority = 7)
    public void expandedSearchTabs() throws InterruptedException {
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.clickSearch("abc");
        homePage.doesSearchWork("abc");
        homePage.clickStationsTab().doesSearchWork("abc");
        homePage.clickPodcastsTab().doesSearchWork("abc");
        homePage.clickShowsTab().doesSearchWork("abc");
    }
    @Test(priority = 8)
    public void moveToRightMusic() throws InterruptedException{
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.clickMusicMenuOptn().scrollDownToMusic().clickCaretRightBtn().isHolidayDisplayed();
    }
    @Test(priority = 9)
    public void podcastsCarets() throws InterruptedException{
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.clickPodcasts().clickCaretRightBtnPodcasts().isCJunkiePDisplayed();
        homePage.clickCaretLeftBtnPodcasts().isDatelinePDisplayed();
    }
    @Test(priority = 10)
    public void followCJunkieP() throws InterruptedException{
        BasePage basepage = new BasePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage logInPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        basepage.closePopUp();
        signUpPage.clickSignInButton().clickAudacy();
        logInPage.clickLogin().logIn("dana.kibizova@gmail.com", "Austin_2019");
        homePage.clickPodcasts().clickCaretRightBtnPodcasts()
                .clickCJunkieP().clickCJunkiePFollow().clickBackArrow().clickMyAudio().clickPodcastsShows().isCJunkiePMyAudioDisplayed();
    }
}
