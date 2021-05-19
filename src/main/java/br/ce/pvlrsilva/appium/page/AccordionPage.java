package br.ce.pvlrsilva.appium.page;

import base.BasePage;

public class AccordionPage extends BasePage {

	public void clicarOpcao(int opcao) {
		cliquePorTexto("Op��o " + Integer.toString(opcao));
	}

	public boolean mensagemExibidaAposClicarBotao(String texto) {
		return existeElementoPorTexto(texto);
	}
}
