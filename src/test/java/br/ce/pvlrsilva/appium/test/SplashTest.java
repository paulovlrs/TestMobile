package br.ce.pvlrsilva.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.pvlrsilva.appium.page.MenuPage;
import br.ce.pvlrsilva.appium.page.SplashPage;

public class SplashTest {

	private MenuPage menu = new MenuPage();
	private SplashPage splash = new SplashPage();
	
	@Test
	public void deveAguardarSplashSumir() {
		// acessar splash
		menu.acessarSplash();
		
		// verificar splash
		splash.splashVisivelNaTela();
		
		// aguardar saida do splash
		splash.aguardarSlashSumir();
		
		// verificar que o formulario esta aparecendo
		Assert.assertTrue(splash.existeElementoPorTexto("Formulário"));
	}
}
