package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestClass extends BaseClass{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabillities();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout[@package='io.appium.android.apis'])[2]").click();
        driver.findElementByXPath("//android.widget.EditText[@resource-id='android:id/edit']").sendKeys("Hello");
        driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").click();

    }
}
