package qualityengineer.Appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Appium_Basics extends Base_test {

	@Test
	public void WifiSettingName() throws MalformedURLException {
		ConfigureAppium();
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies\']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String Title =driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(Title, "WiFi settings");
		
		driver.findElement(By.id("android:id/edit")).sendKeys("MahmoudWifi");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		
	}
}