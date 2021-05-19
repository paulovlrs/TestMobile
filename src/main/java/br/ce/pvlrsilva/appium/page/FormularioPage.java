package br.ce.pvlrsilva.appium.page;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.MobileBy;

public class FormularioPage extends BasePage {

	/**
	 * Preenche o campo nome
	 * 
	 * @param nome : recebe o valor que será inserido na tela
	 */
	public void escreverNome(String nome) {
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}

	public String obterNome() {
		return obterTexto(MobileBy.AccessibilityId("nome"));
	}

	public void selecionarCombo(String valor) {
		selecionarCombobox(MobileBy.AccessibilityId("console"), valor);
	}

	public String obterValorCombo() {
		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}

	public void clicarSwitch() {
		clicar(MobileBy.AccessibilityId("switch"));
	}

	public void clicarCheck() {
		clicar(By.className("android.widget.CheckBox"));
	}

	public boolean isCheckBoxMarcado() {
		return isCheckMarcado(By.className("android.widget.CheckBox")); // verifico status inicial do check box
	}

	public boolean isSwitcharcado() {
		return isCheckMarcado(MobileBy.AccessibilityId("switch")); // verifico status inicial do switch
	}

	public void salvar() {
		cliquePorTexto("SALVAR");
	}

	public void salvarDemorado() {
		cliquePorTexto("SALVAR DEMORADO");
	}

	public String obterNomeCadastrado() {
		// view
		return obterTexto(By.xpath("//android.widget.TextView[contains(@text, 'Nome:')]"));
	}

	public String obterConsoleCadastrado() {
		// view
		return obterTexto(By.xpath("//android.widget.TextView[contains(@text,'Console:')]"));
	}

	public String obterCheckboxCadastrado() {
		// view
		return obterTexto(By.xpath("//android.widget.TextView[contains(@text,'Checkbox:')]"));
	}

	public String obterSwitchCadastrado() {
		// view
		return obterTexto(By.xpath("//android.widget.TextView[contains(@text,'Switch:')]"));
	}

	public String obterDataCadastrado() {
		// view
		return obterTexto(By.xpath("//android.widget.TextView[contains(@text,'Data:')]"));
	}

	public String obterHoraCadastrado() {
		// view
		return obterTexto(By.xpath("//android.widget.TextView[contains(@text,'Hora:')]"));
	}

	public void clicarCalendario(String valor) {
		cliquePorTexto("01/01/2000");
		cliquePorTexto(valor);
		cliquePorTexto("OK");
	}

	/**
	 * Recebe o valor do tipo inteiro e realiza a conversão para string
	 * 
	 * @param hora   o valor deve ser de 1 a 12
	 * @param minuto o valor deve ser de 0 a 59
	 */
	public void alteraHoraMinuto(int hora, int minuto) {
		if (hora >= 1 && hora <= 12 && minuto >= 0 && minuto <= 59) {
			cliquePorTexto("06:00");
			clicar(MobileBy.AccessibilityId(Integer.toString(hora)));

			// Caso o valor seja "0", é passado uma string com o valor "00"
			if (minuto == 0) {
				clicar(MobileBy.AccessibilityId("00"));
			} else {
				clicar(MobileBy.AccessibilityId(Integer.toString(minuto)));
			}
			cliquePorTexto("OK");
		} else
			Assert.fail("O não compativel, a hora deve ser de 1 a 12 e minutos de 0 a 59");
	}
}
