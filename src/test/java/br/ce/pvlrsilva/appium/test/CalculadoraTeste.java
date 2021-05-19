package br.ce.pvlrsilva.appium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTeste {
	
	@Test @SuppressWarnings("unchecked")
	public void SomarDoisValores() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.tricolorcat.calculator");
		desiredCapabilities.setCapability("appActivity", "com.tricolorcat.calculator.MainActivity");
		desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

		MobileElement el1 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/btOK");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/two");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/plus");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/five");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/equal");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/display");
		el6.click();

		System.out.println(el6.getText());
		
		Assert.assertEquals("7", el6.getText());
		
		driver.quit();
	}
}
