package pageObjects;

import envSetup.BaseClass;
import org.openqa.selenium.By;

public class SHM_SettingsPage_Without_Watch_Connected extends BaseClass {

    public static By button_MoreOptions=By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
    public static By Link_Settings=By.xpath("//android.widget.TextView[@text=\"Settings\"]");
    public static By button_Back=By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    public static void click_MoreOptions()
    {
        driver.findElement(button_MoreOptions).click();
    }
    public static void click_Settings()
    {
        driver.findElement(Link_Settings).click();
    }








}
