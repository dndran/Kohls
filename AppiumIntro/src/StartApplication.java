import java.io.File;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class StartApplication {
 public static AndroidDriver driver;
 public static void main(String args[]) throws MalformedURLException, InterruptedException {
  try {
   //File appDir = new File("src");
   //File app = new File (appDir, "selendroid-test-app-0.17.0.apk");
   DesiredCapabilities cap = new DesiredCapabilities();

   cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZX1G22QTC3");
   cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

   cap.setCapability("appPackage", "com.kohls.mcommerce.opal");
   cap.setCapability("appActivity", "com.kohls.mcommerce.opal.framework.view.activity.KohlsSplashScreen");



   cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");

   driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.findElementById("com.kohls.mcommerce.opal:id/id_actionBar_list_icon").click();

  //Reusable Functions start here
   
  ReusableBlocks reUse = new ReusableBlocks();
  reUse.FindElement("android.widget.TextView", "Shop by Category", driver);
  Thread.sleep(10000);
  reUse.FindElement("android.widget.TextView", "Men", driver);
  Thread.sleep(5000);
  reUse.FindElement("android.widget.TextView", "Shoes", driver);
  Thread.sleep(5000);
  reUse.FindElement("android.widget.TextView", "Boots", driver);
  Thread.sleep(5000);
  reUse.ClickProduct(driver);
  } catch (Exception e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } finally {

   Thread.sleep(20000);
  }
  Thread.sleep(5000);
 }
}