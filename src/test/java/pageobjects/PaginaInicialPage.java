package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicialPage extends Page {

	public PaginaInicialPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getCampoPesquisa() {
		return getElement(".//input[@class = 'nav-search-input']");
	}

	public void setCampoPesquisa(String pesquisa) {
		getCampoPesquisa().sendKeys(pesquisa);
	}

	public WebElement getBotaoPesquisar() {
		return getElement(".//button[@class = 'nav-search-btn']");
	}

	public void clickBotaoPesquisar() {
		getBotaoPesquisar().click();
	}
}
