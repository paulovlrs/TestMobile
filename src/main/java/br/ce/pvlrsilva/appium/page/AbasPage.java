package br.ce.pvlrsilva.appium.page;

import org.openqa.selenium.By;

import base.BasePage;

public class AbasPage extends BasePage {

	public String abaAtual() {
		return obterTexto(By.xpath("//android.support.v4.view.ViewPager//android.widget.TextView"));
	}

	public void clicarAba1() {
		cliquePorTexto("ABA 1");
	}
	
	public void clicarAba2() {
		cliquePorTexto("ABA 2");
	}
	
	/**
	 * Verifica se retorna o texto esperado na aba
	 * @param texto
	 * @return
	 */
	public boolean verificaTextoEsperadoAbaAtual(String texto) {
		textoPresenteNoElemento(By.xpath("//android.support.v4.view.ViewPager//android.widget.TextView"), texto);
		return true;
	}
}
