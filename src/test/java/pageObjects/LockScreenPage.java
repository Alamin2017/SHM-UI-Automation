package pageObjects;
import envSetup.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import java.io.IOException;
import java.net.MalformedURLException;
public class LockScreenPage extends BaseClass {

    public static By Lock_title=By.id("com.samsung.android.shealthmonitor:id/title");
    public static By Lock_alert_text=By.id("com.samsung.android.shealthmonitor:id/alert_text");
    public static By NotNowButton=By.id("com.samsung.android.shealthmonitor:id/negative_button");
    public static By setup_lock_screen_button=By.id("com.samsung.android.shealthmonitor:id/positive_button");
    public static By PIN_button=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout");
    public static By PIN_field=By.id("com.android.settings:id/password_entry");
    public static By PIN_confirm_radio_button=By.id("com.android.settings:id/radio_btn");
    public static By Continue_OK_button=By.id("com.android.settings:id/next_button");
    public static By Done_button=By.id("com.android.settings:id/button_done");
    public static By Agree_Button=By.id("android:id/button1");

    public static By Phone_Search_field=By.id("com.sec.android.app.launcher:id/app_search_edit_text_wrapper");
    public static By app_shm=By.xpath("//android.widget.TextView[@content-desc=\"Samsung Health Monitor\"]");

    public static void click_setup_lock_screen_button()
    {
        driver.findElement(setup_lock_screen_button).click();
        System.out.println("Setup lock screen button clicked");
    }
    public static void click_PIN_Button()
    {
        driver.findElement(PIN_button).click();
        System.out.println("PIN field clicked");
    }
    public static void PIN_field_sends ()
    {
        driver.findElement(PIN_field).sendKeys("1111");
        System.out.println("Send keys for PIN ");
    }
    public static void PIN_confirm_radio_button()
    {
        driver.findElement(PIN_confirm_radio_button).click();
        System.out.println("PIN Radio button clicked");
    }
    public static void click_Continue_OK_button()
    {
        driver.findElement(Continue_OK_button).click();
        System.out.println("Continue ok button clicked");
    }
    public static void click_DoneButton()
    {
        driver.findElement(Done_button).click();
        System.out.println("Done button is clicked ");
    }
    public static void click_AgreeButton()
    {
        driver.findElement(Agree_Button).click();
        System.out.println("Agree Button is Clicked ");
    }
    public static void Phone_Search_field_Click()
    {
        driver.findElement(Phone_Search_field).click();
    }
    public static void opening_app_shm_search_field() throws InterruptedException {
        driver.findElement(app_shm).click();
        Thread.sleep(2000);
    }

}
