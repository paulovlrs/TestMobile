package base;

import static base.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {
	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto+"\n");
	}
	
	public void confirmarTeclado(By by) {
		getDriver().findElement(by).sendKeys(Keys.ENTER);
	}

	public void textoPresenteNoElemento(By by, String texto) {
		DriverFactory.waitWebDriver().until(ExpectedConditions.textToBePresentInElementLocated(by, texto));
	}

	/**
	 * Retorna o texto do By informado
	 * 
	 * @param by
	 * @return
	 */
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	/**
	 * Realiza o click do texto informado pelo CheckedTextView
	 * 
	 * @param texto
	 */
	public void cliquePorTexto(String texto) {
		// getDriver().findElement(By.xpath("//android.widget.TextView[@text='" + texto
		// + "']")).click();
		getDriver().findElement(By.xpath("//*[@text='" + texto + "']")).click();
	}

	/**
	 * REaliza click atraves da classe "android.widget.CheckedTextView"
	 * 
	 * @param texto
	 */
	public void cliquePorTextoOpcao(String texto) {
		getDriver().findElement(By.xpath("//android.widget.CheckedTextView[@text='" + texto + "']")).click();
	}

	/**
	 * Informar o By do combobox e a opção que deseja clicar
	 * 
	 * @param by
	 * @param opcaoCombobox
	 */
	public void selecionarCombobox(By by, String opcaoCombobox) {
		getDriver().findElement(by).click();
		cliquePorTextoOpcao(opcaoCombobox);
	}

	/**
	 * Verifica se o checkbox está marcado
	 * 
	 * @param by
	 * @return
	 */
	public boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals("true");
	}

	/**
	 * Executa a ação de clicar de acordo com o parâmetro informado
	 * 
	 * @param by
	 */
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}

	/**
	 * Verifica se o valor informado se encontra nos elementos da página
	 * 
	 * @param texto
	 * @return
	 */
	public boolean existeElementoPorTexto(String texto) {
		List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='" + texto + "']"));
		return (elementos.size() > 0);
	}

	public void touchScreenCoordinate(int x, int y) {
		//new TouchAction(getDriver()).tap(PointOption.point(x, y)).perform();
		TouchAction touchAction = new TouchAction(getDriver());
		//touchAction.tap(PointOption.point(x, y)).release().perform();
		//touchAction.tap(new PointOption().withCoordinates(x, y)).release().perform();
		touchAction.press(new PointOption().withCoordinates(x, y)).release().perform();
	}
	
	public void comparaStringsIguais(String texto1, String texto2) {
		assertEquals(texto1, texto2);
	}
	
	public void comparaStringsDiferentes(String texto1, String texto2) {
		assertNotEquals(texto1, texto2);
	}
}