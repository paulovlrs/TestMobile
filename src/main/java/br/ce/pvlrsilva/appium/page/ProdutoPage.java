package br.ce.pvlrsilva.appium.page;

import org.openqa.selenium.By;

import base.BasePage;

public class ProdutoPage extends BasePage {
	String valor, valorAssinante;

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValorAssinante(String valorAssinante) {
		this.valorAssinante = valorAssinante;
	}

	public String getValorAssinante() {
		return this.valorAssinante;
	}

	public void adicionarAoCarrinho() {
		try {
			clicar(By.id("br.com.petz:id/rl_add_to_cart"));
		} catch (Exception e) {
			System.out.println("Não foi possível adicionar o item ao carrinho, erro: " + e.getMessage());
		}
	}

	public void clicarCarrinhoDeCompra() {
		clicar(By.id("br.com.petz:id/iv_cart_view"));
	}

	public void pegarValorProdutoEValorAssinante() {
		setValorAssinante(obterTexto(By.id("br.com.petz:id/tv_subscription_price")));
		setValorAssinante(obterTexto(By.id("br.com.petz:id/tv_prod_main_price")));
	}

	public void irParaOCarrinho() {
		try {
			clicar(By.xpath("//android.widget.LinearLayout//android.widget.RelativeLayout"));
		} catch (Exception e) {
			System.out.println("Não foi possível ir para o carrinho, erro: " + e.getMessage());
		}
	}
}
