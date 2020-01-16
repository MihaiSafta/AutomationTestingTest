import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;




public class AndroidAppium {

    static AndroidDriver<MobileElement> driver;
    @BeforeTest
    public void setup(){
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "02577c3845ebb8ac");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "app.connectivitymanager.android.telekom.de.connectivitytestapp");
        dc.setCapability("appActivity", "de.telekom.android.connectivitymanager.app.MainActivity");
        dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15);
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url,dc);

        } catch(Exception exception){
            System.out.println("Cause is : " + exception.getCause());
            System.out.println("Message is :"  + exception.getMessage());
            exception.printStackTrace();
        }

    }

    @Test
    public void sampleTest() {
        System.out.println("Test is running!");
    

    }








    @AfterTest
    public void teardown(){

    }


}
