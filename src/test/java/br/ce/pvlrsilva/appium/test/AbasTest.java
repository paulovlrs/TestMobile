package br.ce.pvlrsilva.appium.test;

import org.junit.Assert;
import org.junit.Test;

import base.BaseTest;
import br.ce.pvlrsilva.appium.page.AbasPage;
import br.ce.pvlrsilva.appium.page.MenuPage;

public class AbasTest extends BaseTest {
	private MenuPage menu = new MenuPage();
	private AbasPage aba = new AbasPage();

	@Test
	public void deveInteragirComAbas() {

		// acessar menu abas
		menu.acessarAbas();

		// verificar aba atual
		Assert.assertEquals("Este é o conteúdo da Aba 1", aba.abaAtual());

		// acessar aba 2
		aba.clicarAba2();
		Assert.assertTrue(aba.verificaTextoEsperadoAbaAtual("Este é o conteúdo da Aba 2"));

		// verificar que está na aba 2
		Assert.assertEquals("Este é o conteúdo da Aba 2", aba.abaAtual());
	}
}
