package pageObjects;

import envSetup.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ContactusPage extends BaseClass {

    public static By button_MoreOptions=By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
    public static By Link_Contact_us=By.xpath("//android.widget.TextView[@text=\"Contact us\"]");

    public static By button_Back=By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    public static By title_contact_us=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView");

    public static By FAQ=By.id("com.samsung.android.shealthmonitor:id/mFAQ");
    public static By Contact_us=By.id("com.samsung.android.shealthmonitor:id/mContactUs");
    public static By My_questions=By.id("com.samsung.android.shealthmonitor:id/mMyQuestion");

    public static void click_MoreOptions()
    {
        driver.findElement(button_MoreOptions).click();
    }
    public static void click_Contactus()
    {
        driver.findElement(Link_Contact_us).click();
    }
    public static void verify_title_contact_page()
    {
        String title_actual=driver.findElement(title_contact_us).getText();
        Assert.assertEquals(title_actual,"Contact us");
    }
    public static void click_FAQ() throws InterruptedException {
        driver.findElement(FAQ).click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
    public static void click_My_questions() throws InterruptedException {
        driver.findElement(My_questions).click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
    public static void click_Back_button()
    {
        driver.findElement(button_Back).click();
    }



}
