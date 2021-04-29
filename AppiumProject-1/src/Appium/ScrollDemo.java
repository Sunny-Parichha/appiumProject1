package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ScrollDemo extends BaseClass{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabillities();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
        view.click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));");
    }
}
