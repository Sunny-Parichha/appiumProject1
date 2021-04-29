package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseChromeBrowser {

    public static AndroidDriver<AndroidElement> capabillities() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        //for Emulator
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sunny_Pixel_4_API_30");

        //for Real Device
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");

        cap.setCapability("chromedriverExecutable" ,"C://Users//Abhishek//Downloads//SDET_Assignment//ChromeDriver83//chromedriver.exe");
//        cap.setCapability("chromedriver_autodownload", "true");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        return driver;
    }
}
