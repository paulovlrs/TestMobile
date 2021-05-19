package br.ce.pvlrsilva.appium.test;

import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstalarAPK {

	@Test @SuppressWarnings("unchecked")
	public void DeveInstarAPK() {
		try {
		// Utilizar a versão 7 do android
		String localApk = "D:\\OneDrive\\Automation\\eclipse-workspace\\CursoAppium\\src\\main\\resources\\CTAppium_1_2.apk";
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, localApk);

		URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver<MobileElement> driver = new AndroidDriver(remoteUrl, desiredCapabilities);

		driver.quit();}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
