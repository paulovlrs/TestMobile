package br.ce.pvlrsilva.appium.page;

import org.openqa.selenium.By;

import base.BasePage;

public class AlertPage extends BasePage {

	public void clicarAlertaConfirm() {
		cliquePorTexto("ALERTA CONFIRM");
	}

	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}

	public String obterMensagemAlerta() {
		return obterTexto(By.id("android:id/message"));
	}

	public void clicarBotaoConfirmar() {
		cliquePorTexto("CONFIRMAR");
	}

	public void clicarBotaoSair() {
		cliquePorTexto("SAIR");
	}

	public void clicarAlertaSimples() {
		cliquePorTexto("ALERTA SIMPLES");
	}

	public void clicarNaTelaCoordenada(int i, int j) {
		// TODO: Avaliar o erro org.openqa.selenium.InvalidElementStateException: Tap at [x=150.0, y=150.0] has failed
		try {
			Thread.sleep(1000);
			touchScreenCoordinate(i, j);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
