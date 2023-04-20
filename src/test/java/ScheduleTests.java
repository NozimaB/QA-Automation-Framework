import POM.BasePage;
import POM.SchedulePage;
import org.testng.annotations.Test;

public class ScheduleTests extends BaseTest {

    @Test
    public void coClinicVisits() throws InterruptedException {
        BasePage basepage = new BasePage(driver);
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.selectSchedule()
                .selectLocation().selectService().selectDate().isCODisplayed();
        // TC3 - Search Results for Colorado under Clinic Visits (automated): // Steps: // 1. Navigate to https://www.zoomcare.com/schedule// 2. Click drop-down for Location // 3. Select "Denver, CO" // 4. Click drop-down for Service // 5. Select "Illness/Injury" // 6. Click drop-down for Date // 7. Select today's date // 8. Click "Search" button // AC: The page displays all Illness/Injury Clinic Visits in Colorado
        }
        }