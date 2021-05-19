package br.ce.pvlrsilva.appium.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import base.DriverFactory;

public class SplashPage extends BasePage{

	public boolean splashVisivelNaTela() {
		return existeElementoPorTexto("Splash!");
	}

	public void aguardarSlashSumir() {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		DriverFactory.waitWebDriver().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
	}
}
