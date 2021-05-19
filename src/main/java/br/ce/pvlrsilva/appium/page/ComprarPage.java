package br.ce.pvlrsilva.appium.page;

import org.openqa.selenium.By;

import base.BasePage;

public class ComprarPage extends BasePage {

	public void clicarBotaoPesquisa() {
		clicar(By.id("br.com.petz:id/menu_search"));
	}

	public void preencherPesquisa(String texto) {
		escrever(By.id("br.com.petz:id/et_search"), texto);
	}

	public void clicarOpcaoTresDaPesquisa() {
		try {
		 
			clicar(By.xpath("//androidx.recyclerview.widget.RecyclerView"
					+ "//android.widget.RelativeLayout[@index='2']" 
					+ "//android.widget.TextView"));
			//Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Não foi possível clicar na pesquisa, erro: " + e.getMessage());
			// e.printStackTrace();
		}
	}

	public void clicarNoBotaoNegarAcessoALocalizacao() {
		clicar(By.id("com.android.packageinstaller:id/permission_deny_button"));
	}
}
