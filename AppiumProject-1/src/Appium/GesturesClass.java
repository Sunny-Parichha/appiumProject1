package Appium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class GesturesClass extends BaseClass{

//    @FindBy(xpath = "//android.widget.TextView[@text='Views']")
//    static
//    WebElement view;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver driver = capabillities();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//        driver.findElementByXPath("//android.widget.TextView[@resource-id='android:id/text1']").click();
        WebElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");



        TouchAction t = new TouchAction(driver);
//        Thread.sleep(500);
        t.tap(TapOptions.tapOptions().withElement(element(view))).perform();
//        Thread.sleep(500);
        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        t.tap(TapOptions.tapOptions().withElement(element(expandList))).perform();
//        Thread.sleep(500);
        WebElement customAdapter = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
        t.tap(TapOptions.tapOptions().withElement(element(customAdapter))).perform();
//        Thread.sleep(500);
        WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        t.longPress(LongPressOptions.longPressOptions().withElement(element(peopleNames))).perform();

        WebElement sampleAction = driver.findElementByXPath("//android.widget.TextView[@text='Sample action']");
        t.tap(TapOptions.tapOptions().withElement(element(sampleAction))).perform();
    }
}
