package br.ce.pvlrsilva.appium.page;

import org.openqa.selenium.By;
import base.BasePage;

public class LoginPage extends BasePage {

	public void informarLogin() {
		/*clicar(By.id(""));
		escrever(By.id(""), "");*/
	}

	public void informarSenha() {
		/*clicar(By.id(""));
		escrever(By.id(""), "");*/
	}

	public void clicarBotaoEntrar() {
		//clicar(By.id(""));
	}
	
	public void clicarSemLogin() {
		clicar(By.id("br.com.petz:id/tv_start_without_login"));
	}
}
