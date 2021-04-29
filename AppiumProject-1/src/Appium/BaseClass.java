package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public static AndroidDriver<AndroidElement> capabillities() throws MalformedURLException {

        File f = new File("src");
        File fs = new File(f,"ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        //for Emulator
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sunny_Pixel_4_API_30");

        //for Real Device
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");

        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        return driver;
    }
}
