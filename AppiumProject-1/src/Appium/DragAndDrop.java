package Appium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class DragAndDrop extends BaseClass{
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabillities();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
        view.click();
        WebElement dragAndDrop = driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']");
        dragAndDrop.click();
        TouchAction t = new TouchAction(driver);
        WebElement source = driver.findElementByXPath("//android.view.View[@index='1']");
        WebElement destination = driver.findElementByXPath("//android.view.View[@index='2']");
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source))).moveTo(ElementOption.element(destination)).release().perform();
    }
}
