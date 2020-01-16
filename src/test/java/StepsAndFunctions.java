import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class StepsAndFunctions extends TestsToRun {
    public void testIfConnected() throws InterruptedException {
        MobileElement perm1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        perm1.click();
        Thread.sleep(2000);
        MobileElement perm2 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        perm2.click();
        Thread.sleep(2000);
        MobileElement el3 = driver.findElementByAccessibilityId("Settings");
        el3.click();
        Thread.sleep(2000);
        MobileElement el4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.Switch");
        el4.click();
        Thread.sleep(2000);
        MobileElement el5 = driver.findElementByAccessibilityId("Dashboard");
        el5.click();
        Thread.sleep(2000);
        MobileElement el6 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");
        if (el6.getAttribute("text").contains("DISCONNECT")) {
            System.out.println("Connection established!");
        } else if (el6.getAttribute("text").contains("Wifi disabled")) {
            System.out.println("No Connection!");
        }
    }

    public void getWifiList() throws InterruptedException {
        MobileElement perm1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        perm1.click();
        Thread.sleep(2000);
        MobileElement perm2 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        perm2.click();
        Thread.sleep(2000);
        MobileElement el3 = driver.findElementByAccessibilityId("Settings");
        el3.click();
        Thread.sleep(2000);
        MobileElement el4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.Switch");
        el4.click();
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Wifi\"]/android.widget.ImageView");
        el1.click();
        Thread.sleep(2000);

        List<MobileElement> elements = driver.findElements(By.className("android.widget.TextView"));

        System.out.println("There are " + elements.size() + " networks available: ");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println("Available WiFi are: " + elements.get(i).getAttribute("Text"));

        }
    }

    public void getWISPr() throws InterruptedException {
        MobileElement perm1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        perm1.click();
        Thread.sleep(2000);
        MobileElement perm2 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        perm2.click();
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Settings");
        el1.click();
        Thread.sleep(2000);
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.Switch");
        el2.click();
        Thread.sleep(2000);

        new TouchAction(driver).press(942, 1176).moveTo(917, 334).release().perform();
        new TouchAction(driver).press(759, 817).moveTo(809, 359).release().perform();
        new TouchAction(driver).press(746, 834).moveTo(692, 346).release().perform();

        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.RelativeLayout/android.widget.TextView");
        el5.click();
        Thread.sleep(2000);
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.CheckedTextView[6]");
        el6.click();
        Thread.sleep(2000);

        List<MobileElement> elements = driver.findElements(By.className("android.widget.TextView"));

        System.out.println("There are " + elements.size() + " WISPr logs");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getAttribute("Text"));
        }



    }
}



