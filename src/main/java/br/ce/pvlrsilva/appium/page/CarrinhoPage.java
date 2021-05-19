package br.ce.pvlrsilva.appium.page;

import base.BasePage;

public class CarrinhoPage extends BasePage{
	String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public void compararValoresPropagandaECarrinho(String valorPropaganda) {
		comparaStringsIguais(valor , valorPropaganda);
	}

	public void compararValoresAssinanteECarrinho(String valorAssinante) {
		comparaStringsDiferentes(valor , valorAssinante);
	}

}
