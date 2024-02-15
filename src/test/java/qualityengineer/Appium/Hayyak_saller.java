package qualityengineer.Appium;

//import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;



public class Hayyak_saller extends Hayyak_Base {

	@Test (priority = 1, description="Traveler Name Error Message")
	public void Create_Traveler() throws MalformedURLException, InterruptedException {
		ConfigureAppium();
		login();
		Thread.sleep(200);   
		 driver.findElement(AppiumBy.accessibilityId("input-Name")).sendKeys("Issam Sasa");

		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"🇯🇴, 962\"]")).click();
		Thread.sleep(2000);

//		driver.findElement(By.className("android.widget.EditText")).click();
//		driver.findElement(By.className("android.widget.EditText")).sendKeys("United");
//		driver.hideKeyboard();
//		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Egypt\"));")); 
		Thread.sleep(200);   
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"🇪🇬, Egypt, +20\"]")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"🇪🇬, Egypt, +20\"]")).click();
		Thread.sleep(200);   
		//driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"🇺🇸, United States, +1\"]")).click(); DELETE
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")); DELETE
		  driver.findElement(AppiumBy.accessibilityId("input-phone")).sendKeys("2018237603");
		  driver.findElement(AppiumBy.accessibilityId("input-email")).sendKeys( "Sasa@gmail.com"); 
		  Date();
		  Subscription();
//		  Activity activity = new Activity("com.hayyak.agentsoncloud" , "com.hayyak.agentsoncloud.MainActivity");
//		  driver.startActivity(activity);
		  }

	
		  
//		  @Test (priority = 2,description="Phone Number Error Message")
//			public void Phone_Error() throws InterruptedException  {
//			  login();
//				driver.findElement(AppiumBy.accessibilityId("input-Name")).sendKeys("Issam Sasa");
//				  driver.findElement(AppiumBy.accessibilityId("input-phone")).sendKeys("0777");
//				  Date();
//					driver.findElement(AppiumBy.accessibilityId("input-select-package")).click();
//					driver.findElement(AppiumBy.accessibilityId("10 JD")).click();
//				Subscription();
//				String actualErrorTitle = driver.findElement(By.id("android:id/message")).getText();
//		    	Assert.assertEquals(actualErrorTitle, "Please enter a valid phone number.");
//		    	Assert.assertTrue(driver.findElement(By.id("android:id/message")).isDisplayed());
//		    	System.out.printf(actualErrorTitle);
//		    	System.out.print("\n");
//		    	driver.findElement(By.className("android.widget.Button")).click();
//				}
	
//		driver.findElement(AppiumBy.accessibilityId("input-select-package")).click();
//		driver.findElement(AppiumBy.accessibilityId("10 JD")).click();
//		Thread.sleep(200);
//		ScrollToEndAction();
//		Subscription();
//		Thread.sleep(200);
//		String actualErrorTitle = driver.findElement(By.id("android:id/message")).getText();
//    	Assert.assertEquals(actualErrorTitle, "Please enter a valid Name.");
//    	Assert.assertTrue(driver.findElement(By.id("android:id/message")).isDisplayed());
//    	System.out.printf(actualErrorTitle);
//    	driver.findElement(By.className("android.widget.Button")).click();
//		Thread.sleep(200);
		
//		String actualTitle = driver.findElement(AppiumBy.accessibilityId("input-price")).getText();
//		Assert.assertEquals(actualTitle, "Total price");
//		System.out.print(actualTitle);
//    	Assert.assertEquals(actualTitle, "Total price");
//    	Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("input-price")).isDisplayed());
//		driver.findElement(By.id("input-btn-subscription")).click();
//		Thread.sleep(200);
		

//		
//		driver.navigate().back();// To back one page 
		
	
//	@Test(priority = 2,description="Phone Number Error Message")
//	public void error_name() throws InterruptedException {
//	
//		Thread.sleep(200);
//
//		driver.findElement(AppiumBy.accessibilityId("input-Name")).sendKeys("Adel Emam");
//		driver.findElement(AppiumBy.accessibilityId("input-phone")).sendKeys("07768571765454545454");
////		driver.findElement(AppiumBy.accessibilityId("input-email")).sendKeys("Ahmad@gmail.com");
////		driver.findElement(AppiumBy.accessibilityId("input-select-package")).click();
////		driver.findElement(AppiumBy.accessibilityId("10 JD")).click();
//		Subscription();
//		Thread.sleep(200);
//		String actualErrorTitle = driver.findElement(By.id("android:id/message")).getText();
//    	Assert.assertEquals(actualErrorTitle, "Please enter a valid phone number.");
//    	Assert.assertTrue(driver.findElement(By.id("android:id/message")).isDisplayed());
//    	System.out.printf(actualErrorTitle);
//    	driver.findElement(By.className("android.widget.Button")).click();
//		Thread.sleep(200);
//
//}
//	@Test(priority = 3,description="Email Error Message NJN")
//	public void error_phone() throws InterruptedException {
//
//		driver.findElement(AppiumBy.accessibilityId("input-Name")).sendKeys("Ahmad Jaber");
//		driver.findElement(AppiumBy.accessibilityId("input-phone")).sendKeys("+504786178460");
//		driver.findElement(AppiumBy.accessibilityId("input-email")).sendKeys("Ahmadgmail.com");
//		
//		Thread.sleep(200);
//		Subscription();
//
//		String actualErrorTitle = driver.findElement(By.id("android:id/message")).getText();
//    	Assert.assertEquals(actualErrorTitle, "Please enter a valid Email.");
//    	Assert.assertTrue(driver.findElement(By.id("android:id/message")).isDisplayed());
//    	System.out.printf(actualErrorTitle); 
//    	driver.findElement(By.id("android:id/button1")).click();	
//		
//	}
//	@Test(priority = 4,description="Package Type Error Message")
//	public void d() throws InterruptedException {
//		
//		driver.findElement(AppiumBy.accessibilityId("input-Name")).sendKeys("Samah");
//		driver.findElement(AppiumBy.accessibilityId("input-phone")).sendKeys("0776857174");
//		driver.findElement(AppiumBy.accessibilityId("input-email")).sendKeys("Ahmad@gmail.com");
////		driver.findElement(AppiumBy.accessibilityId("input-select-package")).click();
////		driver.findElement(AppiumBy.accessibilityId("10 JD")).click();
//		Subscription();
//		String actualErrorTitle = driver.findElement(By.id("android:id/message")).getText();
//    	Assert.assertEquals(actualErrorTitle, "Please enter Subscription Type.");
//    	Assert.assertTrue(driver.findElement(By.id("android:id/message")).isDisplayed());
//    	System.out.printf(actualErrorTitle); 
//    	driver.findElement(By.id("android:id/button1")).click();		
//	}
//	
//	@Test(priority = 5,description="Invalid Voucher 10")
//	public void a() throws InterruptedException {
//		
//		
//		driver.findElement(AppiumBy.accessibilityId("input-select-package")).click();
//		driver.findElement(AppiumBy.accessibilityId("10 JD")).click();
//		driver.findElement(AppiumBy.accessibilityId("input-voucher")).sendKeys("TR1");
//		driver.hideKeyboard();    
//		
//        int packagePrice = 10;
//
//		 if (packagePrice == 10) {
//	            System.out.println("10 Passed");
//	        } else {
//	            System.out.println("There is a wrong");
//	        }
//			Subscription();	
//	}
	
	

	
	
	
	
//	@Test(priority = 6,description="Invalid Voucher")
//	public void l() throws InterruptedException {
//	}
	
	
	
	
	
	
	
//	@Test(priority = 7,description="Buy Subsciption")
//	public void x() throws InterruptedException {
//	}
	
	
	
	
	
	
	
}