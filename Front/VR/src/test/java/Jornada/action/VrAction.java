package Jornada.action;

import Jornada.screen.VrScreen;
import support.Commons;

public class VrAction extends Commons {
	VrScreen screen = new VrScreen(driver);

	public void acessandoSite() throws Exception {
		Commons.getInstance().waitForvisibiltyElement(screen.cmpPraVC);

	}

	public void clickPraVoce() {
		screen.cmpPraVC.click();

	}

	public void botaoClickOndeUsarCartao() throws Exception {
		Commons.getInstance().waitForvisibiltyElement(screen.cmpOndeUsar);
		screen.cmpOndeUsar.click();
	}

	public void visualizoMapaGoogle(String cidade) throws Exception {
		Commons.getInstance().waitForvisibiltyElement(screen.cmpMapaGoogle);
		Commons.getInstance().esperarElemento(3000);
		Commons.getInstance().screenShot("buscar");
		screen.cmpOpenCartaoVr.click();
		screen.cmpCartaoVrAlimentacao.click();
		screen.cmpVoltar.click();
		screen.cmpCidade.sendKeys(cidade);
		screen.cmpBuscar.click();
		driver.close();

	}

}
