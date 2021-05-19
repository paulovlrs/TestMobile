package br.ce.pvlrsilva.appium.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import base.BaseTest;
import br.ce.pvlrsilva.appium.page.*;

public class AccordionTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AccordionPage accordion = new AccordionPage();

	@Test
	public void deveInteragirComAccordion() {

		// acessar menu
		menu.acessarAccordion();

		// clicar op��o 1
		accordion.clicarOpcao(1);

		// verificar texto op 1
		assertTrue(accordion.mensagemExibidaAposClicarBotao("Esta � a descri��o da op��o 1"));		
	}
}
