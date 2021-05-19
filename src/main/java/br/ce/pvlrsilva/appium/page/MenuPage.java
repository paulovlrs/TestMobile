package br.ce.pvlrsilva.appium.page;

import base.BasePage;

public class MenuPage extends BasePage {

	public void acessarFormulario() {
		cliquePorTexto("Formulário");
	}

	public void acessarSplash() {
		cliquePorTexto("Splash");
	}
	
	public void acessarAlertas() {
		cliquePorTexto("Alertas");
	}
	
	public void acessarAbas() {
		cliquePorTexto("Abas");
	}

	public void acessarAccordion() {
		cliquePorTexto("Accordion");
	}
}
