package base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	private static AndroidDriver<MobileElement> driver;
	private static WebDriverWait wait;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}
	@SuppressWarnings("unchecked")
	private static void createDriver() {
		try {
			// Utilizar a versão 7 do android
			String localApk = "D:\\OneDrive\\Automation\\Desafio Itaú\\TestMobile\\src\\main\\resources\\br.com.petz_488_apps.evozi.com.apk";
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("platformName", "Android");
			desiredCapabilities.setCapability("deviceName", "emulator-5554");
			desiredCapabilities.setCapability("automationName", "uiautomator2");
			desiredCapabilities.setCapability(MobileCapabilityType.APP, localApk);

			URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver(remoteUrl, desiredCapabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebDriverWait waitWebDriver() {
		try {
			wait = new WebDriverWait(DriverFactory.getDriver(), 10);
			return wait;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
