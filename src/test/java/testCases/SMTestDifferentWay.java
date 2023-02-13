package testCases;
import envSetup.BaseClass;
import org.testng.annotations.Test;
import pageObjects.LockScreenPage;
import pageObjects.WelcomePage;
import java.io.IOException;

public class SMTestDifferentWay extends BaseClass {
    @Test(priority = 1)
    public void test_CSC_MCC_Clickable() throws InterruptedException {
        WelcomePage.click_CSC();
        WelcomePage.click_MCC();
        System.out.println("CSC and MCC Click is Done ");
        Thread.sleep(3000);
    }
    @Test(priority = 2,dependsOnMethods = "test_CSC_MCC_Clickable")
    public void test_Welcome_to_SHM() throws InterruptedException, IOException {
        WelcomePage.shm_title_assert();
        System.out.println("SHM Title assert is Done");
        WelcomePage.shm_text_assert();
        System.out.println("SHM Text assert is Done");
        WelcomePage.shm_icon_visible();
        System.out.println("SHM Icon is Visible");
        WelcomePage.tc_pp_text_print_assert();
        System.out.println("TC PP assert is done");
        WelcomePage.accept_button_Visibility();
        System.out.println("Accept button is Visible");
        WelcomePage.click_acceptButton();
        Thread.sleep(3000);
        BaseClass.HOME_Key();
        Thread.sleep(3000);
        BaseClass.scrolling_down_screen();
        Thread.sleep(3000);
        LockScreenPage.Phone_Search_field_Click();
        Thread.sleep(3000);
        LockScreenPage.opening_app_shm_search_field();
        Thread.sleep(3000);
        WelcomePage.click_acceptButton();
        Thread.sleep(3000);
        BaseClass.App_Switch_Key();


    }
}
