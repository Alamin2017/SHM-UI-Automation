package envSetup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class BaseClass {
    public static AppiumDriver driver;
    @BeforeSuite
    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
        cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\amin.al\\Desktop\\2022 Health Monitor\\ADB\\ADB\\Fake_Country_App_BP_ECG_1.1.1.227.apk");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AppiumDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void close()
    {
        driver.closeApp();
    }
    //need to create various method for reuse_ability
    public static void scrolling_down_screen()
    {
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"+
//                ".scrollIntoView(new UiSelector().text(\"User profile\"));"));
        AndroidTouchAction touchAction=new AndroidTouchAction((PerformsTouchActions) driver);
        Dimension dimension=driver.manage().window().getSize();
        int start_x=(int) (dimension.width)/2;
        int start_y=(int) (dimension.height*8)/9;
        int end_x=(int) (dimension.width)/2;
        int end_y=(int) (dimension.height)/9;
        touchAction.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x,end_y)).release().perform();
    }
    public static void scrolling_up_screen()
    {
        AndroidTouchAction touchAction=new AndroidTouchAction((PerformsTouchActions) driver);
        Dimension dimension=driver.manage().window().getSize();
        int start_x=(int) (dimension.width)/2;
        int start_y=(int) (dimension.height*2)/9;
        int end_x=(int) (dimension.width)/2;
        int end_y=(int) (dimension.height*8)/9;
        touchAction.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x,end_y)).release().perform();
    }
    public static void HOME_Key() throws IOException, InterruptedException {
        String cmd = "adb shell input keyevent 3";
        Runtime.getRuntime().exec(cmd);
        Thread.sleep(3000);
    }
    public static void App_Switch_Key() throws IOException, InterruptedException {
        String cmd="adb shell input keyevent 187";
        Runtime.getRuntime().exec(cmd);
        Thread.sleep(3000);
    }



}
