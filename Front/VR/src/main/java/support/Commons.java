package support;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commons {

	public static WebDriver driver;

	private static Commons instance;

	public static Commons getInstance() {

		if (instance == null) {
			instance = new Commons();
		}
		return instance;
	}

	public void validarElementoPorTexto(WebElement element, String textEsperado) throws IOException, Exception {

		String elemento = (element).getText();
		Assert.assertEquals(elemento, textEsperado);
	}

	public void waitForvisibiltyElement(WebElement elemento) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(elemento));

	}

	public void fecharBrowser() {
		driver.quit();
	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencia/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}
	public void esperarElemento(int valor) throws InterruptedException {
		Thread.sleep(valor);
	}

}
