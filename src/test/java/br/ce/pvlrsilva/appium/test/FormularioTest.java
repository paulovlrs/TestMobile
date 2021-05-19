package br.ce.pvlrsilva.appium.test;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import base.BaseTest;
import br.ce.pvlrsilva.appium.page.FormularioPage;
import br.ce.pvlrsilva.appium.page.MenuPage;

public class FormularioTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private FormularioPage formulario = new FormularioPage();

	@Before
	public void inicializarDriver() {
		menu.acessarFormulario();
	}

	@Test
	public void preencherNome() {
		// Escrever nome
		formulario.escreverNome("Paulo");

		// checar se o nome foi preenchido
		Assert.assertEquals("Paulo", formulario.obterNome());
	}

	@Test
	public void preencherCombobox() throws MalformedURLException {

		formulario.selecionarCombo("PS4");
		Assert.assertEquals("PS4", formulario.obterValorCombo());
	}

	@Test
	public void marcarCheckBoxSwitch() throws MalformedURLException {

		// Verificar status dos elementos
		Assert.assertFalse(formulario.isCheckBoxMarcado()); // verifico status inicial do check box
		Assert.assertTrue(formulario.isSwitcharcado()); // verifico status inicial do check box

		// clicar no check box e no switch
		formulario.clicarCheck();
		formulario.clicarSwitch();

		// verificar status alterado
		// verifico status inicial do check box
		Assert.assertTrue(formulario.isCheckBoxMarcado());
		// verifico status inicial do switch
		Assert.assertFalse(formulario.isSwitcharcado());
	}

	@Test
	public void preencherFormulario() throws MalformedURLException {
		// valido status dos campos inicialmente
		Assert.assertFalse(formulario.isCheckBoxMarcado()); // verifico status inicial do check box
		Assert.assertTrue(formulario.isSwitcharcado()); // verifico status inicial do check box

		// Informo os campos
		formulario.escreverNome("Paulo Victor");
		formulario.selecionarCombo("PS4");
		formulario.clicarCheck();
		formulario.clicarSwitch();
		formulario.alteraHoraMinuto(5,10);
		formulario.clicarCalendario("20");
		formulario.salvar();

		// valido se os campos foram preenchidos
		Assert.assertTrue(formulario.obterNomeCadastrado().contains("Paulo"));
		Assert.assertTrue(formulario.obterConsoleCadastrado().contains("ps4"));
		Assert.assertTrue(formulario.obterCheckboxCadastrado().contains("Marcado"));
		Assert.assertTrue(formulario.obterSwitchCadastrado().contains("Off"));
		Assert.assertTrue(formulario.obterDataCadastrado().contains("20/2/2000"));
		Assert.assertTrue(formulario.obterHoraCadastrado().contains("05:10"));
	}
	
	@Test
	public void preencherFormularioSalvarDemorado() throws MalformedURLException {
		// Informo os campos
		formulario.escreverNome("Paulo Victor");
		formulario.salvarDemorado();

		// valido se os campos foram preenchidos
		Assert.assertTrue(formulario.obterNomeCadastrado().contains("Paulo"));
	}
	
	@Test
	public void deveClicarSeekbar() {
		// clicar no seekbar
		   //formulario.clicarSeekbar();
		// salvar
		
		// obter valor
	}
}