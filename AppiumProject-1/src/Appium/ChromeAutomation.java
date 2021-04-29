package Appium;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class ChromeAutomation extends BaseChromeBrowser{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabillities();

        driver.get("https://www.legatohealth.com");
    }
}
