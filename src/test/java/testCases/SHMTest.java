package testCases;
import envSetup.BaseClass;
import org.testng.annotations.Test;
import pageObjects.*;
import java.io.IOException;
import java.net.MalformedURLException;
public class SHMTest extends BaseClass {
    @Test(priority = 1)
    public void test_CSC_MCC_Clickable() throws InterruptedException {
        WelcomePage.click_CSC();
        WelcomePage.click_MCC();
        System.out.println("CSC and MCC Clicked ");
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
    }
    @Test(priority = 3,dependsOnMethods = "test_Welcome_to_SHM")
    public void test_Samsung_Health() throws InterruptedException {
        SamsungHealthPage.title_SH_assert();
        System.out.println("Samsung Health Title assert is Done");
        SamsungHealthPage.logo_SHM_visibility();
        System.out.println("logo_SHM_visibility is Done");
        SamsungHealthPage.logo_direction_visibility();
        System.out.println("logo_direction_visibility is Done");
        SamsungHealthPage.logo_SH_visibility();
        System.out.println("logo_SH_visibility is Done");
        SamsungHealthPage.sh_data_text_assert();
        System.out.println("SH Data text Assert is done");
        SamsungHealthPage.All_Permission_Assert();
        System.out.println("All Permissions assert is Done");
        Thread.sleep(5000);
        SamsungHealthPage.All_permissions_switch_Clickable();
        System.out.println("Switch Button is Clickable");
        Thread.sleep(3000);
        SamsungHealthPage.Allowed_title_visibility();
        System.out.println("Allowed title visibility is Done");
        SamsungHealthPage.Switch_button_visibility();
        System.out.println("Switch button visibility is Done");
        BaseClass.scrolling_down_screen();
        System.out.println("Scrolling down is Done");
        SamsungHealthPage.click_Done_button();
    }
    @Test(priority = 4,dependsOnMethods = "test_Samsung_Health")
    public void test_Create_Profile() throws InterruptedException, MalformedURLException {
        CreateProfilePage.title_CreateYourProfile_assert();
        System.out.println("Create your profile assert is done");
        CreateProfilePage.fill_up_Fname_Lname();
        System.out.println("Fast and Last Name is Done");
        CreateProfilePage.click_DateOfBirth();
        Thread.sleep(3000);
        CreateProfilePage.month_date_year_selection();
        System.out.println("Month date Year Selection is Done");
        CreateProfilePage.Gender_Selection_Continue_Button();
        System.out.println("Gender Selection is Done");
    }
    @Test(priority = 5,dependsOnMethods = "test_Create_Profile")
    public void test_Lockscreen_OpenApp() throws InterruptedException, IOException {
        //LockScreenPage.LocScreenOperations();
        LockScreenPage.click_setup_lock_screen_button();
        LockScreenPage.click_PIN_Button();
        LockScreenPage.PIN_field_sends();
        LockScreenPage.PIN_confirm_radio_button();
        LockScreenPage.click_Continue_OK_button();
        LockScreenPage.PIN_field_sends();
        LockScreenPage.click_Continue_OK_button();
        LockScreenPage.click_DoneButton();
        LockScreenPage.click_AgreeButton();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        BaseClass.HOME_Key();
        BaseClass.scrolling_down_screen();
        LockScreenPage.Phone_Search_field_Click();
        Thread.sleep(2000);
        LockScreenPage.opening_app_shm_search_field();

    }
    @Test(priority = 6,dependsOnMethods = "test_Lockscreen_OpenApp")
    public void test_HomePage_without_watch_connected() throws InterruptedException {
        HomePage_Without_Watch_Connected.verify_Logo_samsung_health_monitor();
        System.out.println("Assert of Logo Samsung Health Monitor");
        Thread.sleep(2000);
        HomePage_Without_Watch_Connected.verify_title_No_compatible_wf();
        System.out.println("verify_title_No_compatible_wf");
        Thread.sleep(2000);
        HomePage_Without_Watch_Connected.verify_description_No_compatible_wf();
        System.out.println("verify_description_No_compatible_wf");
        Thread.sleep(2000);
        HomePage_Without_Watch_Connected.click_MoreOptions();
        System.out.println("click_MoreOptions");
        Thread.sleep(2000);
        HomePage_Without_Watch_Connected.verify_MoreOptions();
        System.out.println("Verify MoreOptions");
        driver.navigate().back();
    }
    @Test(priority = 7,dependsOnMethods = "test_HomePage_without_watch_connected")
    public void test_How_to_use_page() throws InterruptedException {
        HomePage_Without_Watch_Connected.click_MoreOptions();
        HowtousePage_Without_Watch_Connected.Click_How_to_use();
        HowtousePage_Without_Watch_Connected.click_How_to_use_document_1();
        System.out.println("How_to_use_document_1 scrollable is Done");
        HowtousePage_Without_Watch_Connected.click_How_to_use_document_2();
        System.out.println("How_to_use_document_2 scrollable is Done");
        HowtousePage_Without_Watch_Connected.click_How_to_use_document_3();
        System.out.println("How_to_use_document_3 scrollable is Done");
        HowtousePage_Without_Watch_Connected.click_How_to_use_document_4();
        System.out.println("How_to_use_document_4 scrollable is Done");
    }
    @Test(priority = 8,dependsOnMethods = "test_How_to_use_page")
    public void test_ContactusPage() throws InterruptedException {
        ContactusPage.click_MoreOptions();
        ContactusPage.click_Contactus();
        ContactusPage.verify_title_contact_page();
        System.out.println("Verify_title_contact_page");
        ContactusPage.click_FAQ();
        System.out.println("FAQ link is going to their link");
        ContactusPage.click_My_questions();
        System.out.println("My questions is going to their link");
        ContactusPage.click_Back_button();
        System.out.println("Back to the Home Page without watch connected");
    }
    @Test(priority = 9,dependsOnMethods = "test_ContactusPage")
    public void test_SHM_SettingsPage()
    {
        SHM_SettingsPage_Without_Watch_Connected.click_MoreOptions();
        SHM_SettingsPage_Without_Watch_Connected.click_Settings();
        BaseClass.scrolling_up_screen();
        BaseClass.scrolling_down_screen();
    }

}
