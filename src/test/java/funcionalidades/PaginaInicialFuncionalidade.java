package funcionalidades;

import org.openqa.selenium.WebDriver;

import pageobjects.PaginaInicialPage;
import util.Navegacao;

public class PaginaInicialFuncionalidade {

	private WebDriver driver;
	private PaginaInicialPage paginaInicialPage;
	private String url = "http://www.mercadolivre.com.br";

	public PaginaInicialFuncionalidade() {
		driver = Navegacao.getChromeDriver();
		paginaInicialPage = new PaginaInicialPage(driver);
	}

	public void goToAcess() {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean isPaginaInicial() {
		if (paginaInicialPage.getUrlIndex().contains("mercadolivre"))
			return true;
		return false;
	}

	public void tearDown() {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void realizandoPesquisa(String pesquisa) {
		try {
			paginaInicialPage.setCampoPesquisa(pesquisa);
			paginaInicialPage.clickBotaoPesquisar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
