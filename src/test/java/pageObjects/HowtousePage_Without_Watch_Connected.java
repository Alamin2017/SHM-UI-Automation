package pageObjects;

import envSetup.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
public class HowtousePage_Without_Watch_Connected extends BaseClass {

    public static By Link_How_to_use=By.xpath("//android.widget.TextView[@text=\"How to use\"]");
    public static By title_How_to_use=By.xpath("//android.widget.TextView[@text=\"How to use\"]");
    public static By button_Back=By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    public static By How_1=By.id("com.samsung.android.shealthmonitor:id/mHowToUseProfile");
    public static By How_2=By.id("com.samsung.android.shealthmonitor:id/mHowToUseOnBoarding");
    public static By How_3=By.id("com.samsung.android.shealthmonitor:id/mHowToUseMeasuring");
    public static By How_4=By.id("com.samsung.android.shealthmonitor:id/mHowToUseBpResult");

    public static void Click_How_to_use()
    {
        driver.findElement(Link_How_to_use).click();
        String text_how_to_use=driver.findElement(title_How_to_use).getText();
        Assert.assertEquals("How to use",text_how_to_use);
    }
    public static void click_How_to_use_document_1()
    {
        driver.findElement(How_1).click();
        BaseClass.scrolling_down_screen();
        driver.findElement(button_Back).click();
    }
    public static void click_How_to_use_document_2()
    {
        driver.findElement(How_2).click();
        BaseClass.scrolling_down_screen();
        BaseClass.scrolling_down_screen();
        driver.findElement(button_Back).click();
    }
    public static void click_How_to_use_document_3()
    {
        driver.findElement(How_3).click();
        BaseClass.scrolling_down_screen();
        BaseClass.scrolling_down_screen();
        driver.findElement(button_Back).click();
    }
    public static void click_How_to_use_document_4() throws InterruptedException {
        driver.findElement(How_4).click();
        BaseClass.scrolling_down_screen();
        driver.findElement(button_Back).click();
        System.out.println("Back button is working.");
        Thread.sleep(2000);
        driver.findElement(button_Back).click();
    }

}
