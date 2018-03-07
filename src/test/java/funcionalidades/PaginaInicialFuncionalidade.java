package funcionalidades;

import org.openqa.selenium.WebDriver;

import pageobjects.PaginaInicialPage;
import util.Navegacao;
import util.PrintEvidencia;

public class PaginaInicialFuncionalidade {

	private WebDriver driver;
	private PaginaInicialPage paginaInicialPage;
	PrintEvidencia printEvidencia;
	private String url = "http://www.mercadolivre.com.br";

	public PaginaInicialFuncionalidade() {
		driver = Navegacao.getChromeDriver();
		paginaInicialPage = new PaginaInicialPage(driver);
		printEvidencia = new PrintEvidencia();
	}

	public void goToAcess() {
		try {
			driver.get(url);
			printEvidencia.tiraPrint(driver, "Acessando site...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean isPaginaInicial() {
		if (paginaInicialPage.getUrlIndex().contains("mercadolivre")){
			printEvidencia.tiraPrint(driver, "Validando carregamento de página...");
			return true;
		}
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
			printEvidencia.tiraPrint(driver, "Realizando pesquisa de produtos...");
			paginaInicialPage.clickBotaoPesquisar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
