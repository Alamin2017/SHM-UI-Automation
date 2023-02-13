package pageObjects;

import envSetup.BaseClass;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

public class SamsungHealthPage extends BaseClass {

    public static By title_SH=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView");
    public static By logo_SHM=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView");
    public static By logo_direction=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView[1]");
    public static By logo_SH=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView[2]");
    public static By text_SH_data=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
    public static By All_permissions_title=By.xpath("//Switch[@content-desc=\"Off, All permissions\"]/android.widget.LinearLayout/android.widget.TextView");
    public static By All_permissions_switch=By.xpath("//Switch[@content-desc=\"Off, All permissions\"]/android.widget.Switch");
    public static By allowed_write_title=By.id("com.sec.android.app.shealth:id/header_text");
    public static By allowed_write_text=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");
    public static By BP_title=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView");
    public static By BP_switch=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.Switch");
    public static By ECG_title=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView");
    public static By ECG_switch=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.Switch");
    public static By allowed_read_title=By.id("com.sec.android.app.shealth:id/header_text");
    public static By allowed_read_text=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView");
    public static By User_profile_title=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
    public static By User_Profile_text=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]");
    public static By User_Profile_switch=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.Switch");
    public static By User_Profile_Full_Text=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView");
    public static By Done_button=By.id("com.sec.android.app.shealth:id/permission_popup_positive_button");
    public static By Cancel_button=By.id("com.sec.android.app.shealth:id/permission_popup_negative_button");
    public static void title_SH_assert()
    {
        String titleSH=driver.findElement(title_SH).getText();
        Assert.assertEquals("Samsung Health",titleSH);
    }
    public static void logo_SHM_visibility()
    {
        boolean logo_SHM_v=driver.findElement(logo_SHM).isDisplayed();
        Assert.assertEquals(logo_SHM_v,true);
    }
    public static void logo_direction_visibility() {
        boolean logo_direction_v=driver.findElement(logo_direction).isDisplayed();
        Assert.assertEquals(logo_direction_v,true);
    }
    public static void logo_SH_visibility()
    {
        boolean logo_SH_v=driver.findElement(logo_SH).isDisplayed();
        Assert.assertEquals(logo_SH_v,true);
    }
    public static void sh_data_text_assert()
    {
        String data_text_sh_v=driver.findElement(text_SH_data).getText();
        Assert.assertEquals("Allow this app to read and write Samsung Health data. Samsung isn't responsible for third-party services that we share data with.",data_text_sh_v);
    }
    public static void All_Permission_Assert()
    {
        String text_all_per=driver.findElement(All_permissions_title).getText();
        Assert.assertEquals("All permissions",text_all_per);
    }
    public static void All_permissions_switch_Clickable()
    {
        WebElement switch_button=driver.findElement(All_permissions_switch);
        switch_button.click();
    }
    public static void Allowed_title_visibility()
    {
        boolean allowed_text=driver.findElement(allowed_write_title).isDisplayed();
        Assert.assertEquals(true,allowed_text);
        boolean text_allowed=driver.findElement(allowed_read_title).isDisplayed();
        Assert.assertEquals(true,text_allowed);
    }
    public static void Switch_button_visibility()
    {
        boolean BP_switch_v=driver.findElement(BP_switch).isDisplayed();
        boolean ECG_switch_v=driver.findElement(ECG_switch).isDisplayed();
        boolean UP_switch_v=driver.findElement(User_Profile_switch).isDisplayed();
        Assert.assertEquals(true,BP_switch_v);
        Assert.assertEquals(true,ECG_switch_v);
        Assert.assertEquals(true,UP_switch_v);
    }
    public static void click_Done_button()
    {
        driver.findElement(Done_button).click();
    }





}
