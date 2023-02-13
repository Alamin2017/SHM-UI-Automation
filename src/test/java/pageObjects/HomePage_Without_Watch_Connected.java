package pageObjects;
import envSetup.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
public class HomePage_Without_Watch_Connected extends BaseClass {

    public static By logo_samsung_health_monitor=By.xpath("//android.widget.ImageView[@content-desc=\"Samsung Health Monitor\"]");

    public static By button_MoreOptions=By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");

    public static By title_No_compatible_wf=By.id("com.samsung.android.shealthmonitor:id/mTitle");

    public static By description_No_compatible_wf=By.id("com.samsung.android.shealthmonitor:id/mDescription");

    public static By button_Retry=By.id("com.samsung.android.shealthmonitor:id/mRetry");

    public static By Link_How_to_use=By.xpath("//android.widget.TextView[@text=\"How to use\"]");

    public static By Link_Label=By.xpath("//android.widget.TextView[@text=\"Label\"]");

    public static By Link_Settings=By.xpath("//android.widget.TextView[@text=\"Settings\"]");

    public static By Link_Contact_us=By.xpath("//android.widget.TextView[@text=\"Contact us\"]");

    public static void verify_Logo_samsung_health_monitor()
    {
        boolean logo_exist=driver.findElement(logo_samsung_health_monitor).isDisplayed();
        Assert.assertEquals(logo_exist,true);
    }
    public static void verify_title_No_compatible_wf()
    {
        String text_title=driver.findElement(title_No_compatible_wf).getText();
        Assert.assertEquals("No compatible watch found",text_title);
    }
    public static void verify_description_No_compatible_wf()
    {
        String text_descriptions=driver.findElement(description_No_compatible_wf).getText();
        Assert.assertEquals("To use this feature, you need a Galaxy Watch Active 2 or later model that was released in a country where this feature has been approved.",text_descriptions);
    }
    public static void click_MoreOptions()
    {
        driver.findElement(button_MoreOptions).click();
    }
    public static void verify_MoreOptions()
    {
        boolean how_to_use=driver.findElement(Link_How_to_use).isDisplayed();
        boolean label=driver.findElement(Link_Label).isDisplayed();
        boolean settings=driver.findElement(Link_Settings).isDisplayed();
        boolean contact_us=driver.findElement(Link_Contact_us).isDisplayed();
        System.out.println("How to use Exist:"+how_to_use);
        System.out.println("Label Exist:"+label);
        System.out.println("Settings Exist:"+settings);
        System.out.println("Contact us Exist:"+contact_us);
    }















}
