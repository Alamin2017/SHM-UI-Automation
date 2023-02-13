package pageObjects;
import envSetup.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
public class WelcomePage extends BaseClass {

    public static By CSC= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
    public static By MCC= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
    public static By shm_title=By.id("com.samsung.android.shealthmonitor:id/shealth_monitor_init_title");
    public static By shm_text=By.id("com.samsung.android.shealthmonitor:id/shealth_monitor_init_desc");
    public static By shm_icon=By.className("android.widget.ImageView");
    public static By tc_pp_text=By.id("com.samsung.android.shealthmonitor:id/shealth_monitor_init_pp_tnc_text");
    public static By accept_button=By.id("com.samsung.android.shealthmonitor:id/shealth_monitor_init_bottom_button");

    public static void click_CSC()
    {
        driver.findElement(CSC).click();
    }
    public static void click_MCC()
    {
        driver.findElement(MCC).click();
    }
    public static void shm_title_assert()
    {
        String title=driver.findElement(shm_title).getText();
        Assert.assertEquals("Samsung Health Monitor",title);
    }
    public static void shm_text_assert()
    {
        String text=driver.findElement(shm_text).getText();
        Assert.assertEquals("Comfortably and conveniently measure and record health information that you can share with a healthcare professional.",text);
    }
    public static void shm_icon_visible()
    {
        boolean icon_test=driver.findElement(shm_icon).isDisplayed();
        Assert.assertEquals(icon_test,true);
    }
    public static void tc_pp_text_print_assert()
    {
        String text_tc_pp=driver.findElement(tc_pp_text).getText();
        System.out.println("SHM TC_PP Text:"+text_tc_pp);
        Assert.assertEquals("By accepting, you agree to the Samsung Health Monitor Terms of Use and Privacy Policy.",text_tc_pp);
    }
    public static void accept_button_Visibility()
    {
        boolean button_accept=driver.findElement(accept_button).isDisplayed();
        System.out.println("Accept button Visibility:"+button_accept);
    }
    public static void click_acceptButton()
    {
        driver.findElement(accept_button).click();
    }





}
