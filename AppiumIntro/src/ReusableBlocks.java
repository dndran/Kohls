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
		driver.findElementById("com.kohls.mcommerce.opal:id/id_product_itemOriginalPriceTxt").click();
	}
	
	public void ClickSelectSize(AndroidDriver driver){
		
		driver.findElementById("com.kohls.mcommerce.opal:id/spinner_text").click();
	}
	public void SelectSize(AndroidDriver driver){
		List <WebElement> size = driver.findElements(By.id("csom.kohls.mcommerce.opal:id/spinner_text"));
		size.get(0).click();
	}
}