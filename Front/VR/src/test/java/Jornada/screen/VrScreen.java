package Jornada.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VrScreen {
	   public VrScreen(WebDriver driver) {

	        PageFactory.initElements(driver, this);
	    }
	   @FindBy(xpath = "(//li[@class='vr-main-navigation__item'])[3]")
	    public WebElement cmpPraVC;

	   @FindBy(xpath = "//a[@class='vr-button vr-button--negative ']")
	    public WebElement cmpOndeUsar;
	   
	   
	   @FindBy(xpath = "//div[@style='z-index: 3; position: absolute; height: 100%; width: 100%; padding: 0px; border-width: 0px; margin: 0px; left: 0px; top: 0px; touch-action: pan-x pan-y;']")
	    public WebElement cmpMapaGoogle;
	   
	   
	   @FindBy(id = "buttonFiltrar")
	    public WebElement cmpOpenCartaoVr;
	   
	   @FindBy(xpath  = "//label[@class='vr-map__card--title']")
	    public WebElement cmpCartaoVrAlimentacao;
	   
	   @FindBy(id = "close-card")
	    public WebElement cmpVoltar;
	   

	   @FindBy(id = "endereco")
	    public WebElement cmpCidade;
	   
	   @FindBy(id = "buscarResultados")
	    public WebElement cmpBuscar;
}
