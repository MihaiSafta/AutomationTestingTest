import io.appium.java_client.MobileElement;
import org.openqa.selenium.mobile.NetworkConnection;
import org.testng.annotations.Test;

public class TestsToRun extends  AndroidAppium{

@Test
public void testAppStart() throws InterruptedException {
StepsAndFunctions stepsAndFunctions = new StepsAndFunctions();
//stepsAndFunctions.testIfConnected();
//stepsAndFunctions.getWifiList();
stepsAndFunctions.getWISPr();
}
}
