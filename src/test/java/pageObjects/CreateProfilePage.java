package pageObjects;
import envSetup.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.util.List;
public class CreateProfilePage extends BaseClass {


    public static By Back_Button=By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    public static By title_CreateYourProfile=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView");

    public static By Header_name=By.xpath("//android.widget.TextView[@content-desc=\"Name, Header\"]");
    public static By First_Name_Text=By.id("com.samsung.android.shealthmonitor:id/mEditTextFirstName");
    public static By Last_Name_Text=By.id("com.samsung.android.shealthmonitor:id/mEditTextLastName");

    public static By Header_DOM=By.xpath("//android.widget.TextView[@content-desc=\"Date of birth, Header\"]");
    public static By Edit_DOM=By.id("com.samsung.android.shealthmonitor:id/mEditBirthDay");
    public static By date_picker_title_popup=By.id("com.samsung.android.shealthmonitor:id/sesl_date_picker_calendar_header_text");

    public static By month_year=By.xpath("//android.widget.TextView[@content-desc=\"January 1980, Double tap to switch to calendar view.\"]");

    public static By month_1=By.xpath("//android.widget.EditText[@text='JAN, Month']");
    public static By day_1=By.xpath("//android.widget.EditText[@text='01, Day']");
    public static By year_1=By.xpath("//android.widget.EditText[@text='1980, Year']");

    public static By cancel_button_popup=By.id("com.samsung.android.shealthmonitor:id/negative_button");
    public static By save_button_popup=By.id("com.samsung.android.shealthmonitor:id/positive_button");

    public static By Header_Gender=By.xpath("//android.widget.TextView[@content-desc=\"Gender, Header\"]");
    public static By Edit_Gender=By.id("com.samsung.android.shealthmonitor:id/mEditTextGender");

    public static By title_gender_popup=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView");
    public static By Male_radio_button_popup=By.xpath("//android.widget.LinearLayout[@content-desc=\"Male, Radio button, Not selected\"]");
    public static By Female_radio_button_popup=By.xpath("//android.widget.LinearLayout[@content-desc=\"Female, Radio button, Not selected\"]");
    public static By prefer_not_to_disclosure_radio_button_popup=By.xpath("//android.widget.LinearLayout[@content-desc=\"Prefer not to disclose, Radio button, Not selected\"]/android.widget.TextView");

    public static By Continue_button=By.id("com.samsung.android.shealthmonitor:id/mFinishButton");

    public static void title_CreateYourProfile_assert()
    {
        String CPA=driver.findElement(title_CreateYourProfile).getText();
        Assert.assertEquals(CPA,"Create your profile");
    }
    public static void fill_up_Fname_Lname() throws InterruptedException {
        driver.findElement(First_Name_Text).sendKeys("Mrs");
        Thread.sleep(200);
        driver.findElement(Last_Name_Text).sendKeys("Ayesha");
        Thread.sleep(200);
        driver.navigate().back();
    }
    public static void click_DateOfBirth()
    {
        driver.findElement(Edit_DOM).click();
    }
    public static void month_date_year_selection() throws InterruptedException {
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"APR, Month\").instance(0))"));
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"24, Day\"))"));
        //AndroidElement month= (AndroidElement) driver.findElement(By.xpath("//android.widget.EditText[@text='JAN, Month']"));
//        List<MobileElement> values=driver.findElements(By.className("android.widget.EditText"));

//        System.out.println("Month:"+values.get(0).getText());
//        System.out.println("Day:"+values.get(1).getText());
//        System.out.println("Year:"+values.get(2).getText());

//        values.get(0).sendKeys("JAN");
//        Thread.sleep(200);
//        values.get(1).sendKeys("12");
//        Thread.sleep(200);
//        values.get(2).sendKeys("2001");
//        Thread.sleep(200);



//        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
//                        ".scrollIntoView(new UiSelector().text(\"JAN\"))"));

        driver.findElement(month_year).click();
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Thursday, January 31, 1980\"]")).click();
        driver.findElement(save_button_popup).click();
        Thread.sleep(200);
//
//        MobileElement month_tap= (MobileElement) driver.findElement(month_1);
//        TouchAction action= new TouchAction(driver).tap(TapOptions.tapOptions().withElement(ElementOption.element(month_tap)));
//        action.perform();
//
//        action.press(PointOption.point(523,1825)).release().perform();
//        Thread.sleep(200);
//        action.press(PointOption.point(213,1482)).release().perform();
//        Thread.sleep(200);
//        action.press(PointOption.point(523,1494)).release().perform();
//        Thread.sleep(200);
//        action.press(PointOption.point(858,1984)).release().perform();
//        Thread.sleep(200);
//        driver.findElement(save_button_popup).click();
//        Thread.sleep(200);



    }
    public static void Gender_Selection_Continue_Button() throws MalformedURLException, InterruptedException {
        Thread.sleep(200);
        driver.findElement(Edit_Gender).click();
        Thread.sleep(200);
        driver.findElement(Female_radio_button_popup).click();
        Thread.sleep(200);
        driver.findElement(save_button_popup).click();
        Thread.sleep(200);
        driver.findElement(Continue_button).click();
        Thread.sleep(200);

    }








}
