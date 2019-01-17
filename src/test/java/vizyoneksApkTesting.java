import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class vizyoneksApkTesting {
    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setup ( ) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName","RF8K10LFYQB");
        caps.setCapability("udid","ce11171b2301909e0d");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","8.0");
        caps.setCapability("app","C:\\Users\\ekin\\Desktop\\Mobil Şube_com.vizyoneks.ziraatemeklilik.apk");
        caps.setCapability("appPackage","com.vizyoneks.ziraatemeklilik");
        caps.setCapability("appActivity","com.vizyoneks.ziraatemeklilik.activity.MainNewActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver,10);
    }
    @Test
    public void basicTest ( ) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.vizyoneks.ziraatemeklilik:id/bireysel_emeklilik"))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.xpath(""))).click();
       // driver.findElementsByXPath("//android.widget.EditText[@text='Bireysel Emeklilik']");
    }


}
