import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ReusableBlocks {

	public void validater()
	{
System.out.println("Header Validated");

}
	
	public void FindElement(String strClass, String strElemt, AndroidDriver driver){
	
		List <WebElement> list = driver.findElements(By.className(strClass));

		   for (WebElement ele: list) {
		    
		    if (ele.getAttribute("text").equals(strElemt)) {
		     ele.click();
		     break;

		    }
	}
		   
}
	public void ClickProduct(AndroidDriver driver)
	{
		List <WebElement> listing = driver.findElements(By.className("android.widget.RelativeLayout"));
		
		for (WebElement prod : listing){
			/*prod.get
			prod.getAttribute("index");*/
			System.out.println(prod);	
		}
		
	}
}