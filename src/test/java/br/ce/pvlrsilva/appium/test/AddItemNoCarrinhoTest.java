package br.ce.pvlrsilva.appium.test;

import org.junit.Before;
import org.junit.Test;

import base.BaseTest;
import br.ce.pvlrsilva.appium.page.*;

public class AddItemNoCarrinhoTest extends BaseTest {

	private LoginPage loginPage = new LoginPage();
	private ComprarPage comprarPage = new ComprarPage();
	private ProdutoPage produtoPage = new ProdutoPage();
	private CarrinhoPage carrinhoPage = new CarrinhoPage();
	
	@Before
	public void inicializarDriver() {
		loginPage.clicarSemLogin();
	}
	
	@Test
	public void addItemNoCarrinho() {
		String valor, valorAssinante;
		
		comprarPage.clicarNoBotaoNegarAcessoALocalizacao();
		comprarPage.clicarBotaoPesquisa();
		// Pesquisa
		comprarPage.preencherPesquisa("ração");
		
		// Seleciona produto
		comprarPage.clicarOpcaoTresDaPesquisa();
		produtoPage.pegarValorProdutoEValorAssinante();			
		valor = produtoPage.getValor();
		valorAssinante = produtoPage.getValorAssinante();
		
		// Acessar o carrinho
		produtoPage.irParaOCarrinho();
		carrinhoPage.compararValoresPropagandaECarrinho(valor);
		carrinhoPage.compararValoresAssinanteECarrinho(valorAssinante);		
	}
}
