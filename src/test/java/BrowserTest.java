import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;


public class BrowserTest {

    public static AndroidDriver<?> mobiledriver;

    @BeforeTest
    public void beforeTest( ) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION,"1.9.1");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.O");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"RF8K10LFYQB");
        capabilities.setCapability(MobileCapabilityType.UDID,"ce11171b2301909e0d");

        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        capabilities.setCapability("newCommandTimeout",2000);

        mobiledriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }


    @Test
    public void launchBrowser() {
        mobiledriver.get("http://appium.io/");
        Assert.assertEquals(mobiledriver.getCurrentUrl(), "http://appium.io/", "URL Mismatch");
        Assert.assertEquals(mobiledriver.getTitle(), "Appium: Mobile App Automation Made Awesome.", "Title Mismatch");
    }

    @AfterTest
    public void afterTest( ) {
        mobiledriver.quit();
    }
}
