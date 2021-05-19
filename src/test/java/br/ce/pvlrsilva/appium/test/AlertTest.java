package br.ce.pvlrsilva.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import base.BaseTest;
import br.ce.pvlrsilva.appium.page.AlertPage;
import br.ce.pvlrsilva.appium.page.MenuPage;

public class AlertTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AlertPage alerta = new AlertPage();

	@Before
	public void setup() {
		menu.acessarAlertas();
	}

	@Test
	public void deveConfirmarAlerta() {
		// clicar em alerta confirme
		alerta.clicarAlertaConfirm();

		// verificar o texto
		Assert.assertEquals("Info", alerta.obterTituloAlerta());
		Assert.assertEquals("Confirma a operação?", alerta.obterMensagemAlerta());

		// confirmar alerta
		alerta.clicarBotaoConfirmar();

		// verificar nova mensagem
		Assert.assertEquals("Confirmado", alerta.obterMensagemAlerta());

		// sair
		alerta.clicarBotaoSair();
	}

	@Test
	public void deveClicarForaAlerta() {
		// clicar alerta simples
		alerta.clicarAlertaSimples();
		// clicar fora da caixa
		alerta.clicarNaTelaCoordenada(150, 150);
		// verificar se mensagem está presente
		Assert.assertFalse(alerta.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));		
	}
}
