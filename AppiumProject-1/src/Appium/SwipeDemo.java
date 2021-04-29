package Appium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SwipeDemo extends BaseClass{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabillities();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
        view.click();
        WebElement dateWidgets = driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
        dateWidgets.click();
        WebElement inlineOption = driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']");
        inlineOption.click();
        WebElement hourHand = driver.findElementByXPath("//*[@content-desc='9']");
        hourHand.click();
//        WebElement minutesHand = driver.findElementByXPath("//*[@content-desc='45']");
//        minutesHand.click();
        WebElement sourceLocator = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement destinationLocator = driver.findElementByXPath("//*[@content-desc='45']");
        TouchAction t = new TouchAction(driver);
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(sourceLocator)).withDuration(Duration.ofSeconds(2))).moveTo(ElementOption.element(destinationLocator)).release().perform();

        driver.navigate().back();
    }
}
