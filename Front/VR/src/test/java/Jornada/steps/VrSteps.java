package Jornada.steps;

import org.openqa.selenium.ScreenOrientation;

import Jornada.action.VrAction;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import support.Commons;

public class VrSteps {
	public VrSteps() {
	}

	VrAction action = new VrAction();

	@Dado("^que acesse site$")
	public void que_acesse_site() throws Throwable {
		this.action.acessandoSite();

	}

	@Dado("^clicar no botao pra voce$")
	public void clicar_no_botao_pra_voce() throws Throwable {
		this.action.clickPraVoce();
	}

	@Quando("^clicar no botao onde usar meu cartao$")
	public void clicar_no_botao_onde_usar_meu_cartao() throws Throwable {
		this.action.botaoClickOndeUsarCartao();
	}

	@Entao("^visualizo mapa do google na tela \"([^\"]*)\"$")
	public void visualizoMapaDoGoogleNaTela(String cidade) throws Throwable {
		this.action.visualizoMapaGoogle(cidade);

	}
}
