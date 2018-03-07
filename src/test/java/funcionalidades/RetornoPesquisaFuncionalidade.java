package funcionalidades;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.RetornoPesquisaPage;
import util.Navegacao;
import util.PrintEvidencia;

public class RetornoPesquisaFuncionalidade {

	WebDriver driver;
	RetornoPesquisaPage retornoPesquisaPage;
	PrintEvidencia printEvidencia;

	public RetornoPesquisaFuncionalidade() {
		driver = Navegacao.getChromeDriver();
		retornoPesquisaPage = new RetornoPesquisaPage(driver);
		printEvidencia = new PrintEvidencia();
	}

	public void imprimindoResultadosGrid(int numeroLinha) {
		int cont = 1;
		List<WebElement> listaElementos = retornoPesquisaPage.getGridResultadosBusca();
		
		System.out.println("**********Resultados da Pesquisa**********\n");
		for (WebElement listWebElement : listaElementos) {
			
			System.out.println("Titulo: " + retornoPesquisaPage.getTituloProduto(listWebElement).getText() + ".\n");
			System.out.println("O Valor do produto é R$: " + retornoPesquisaPage.getValorProduto(listWebElement).getText() + ".\n");
			printEvidencia.tiraPrint(driver, "Tirando Print do retorno da pesquisa...");
			
			if (cont == numeroLinha) {
				break;
			}
			cont++;
		}
	}

	public void realizaPaginacao(String pag) {
		try {
			retornoPesquisaPage.clickPaginacao(pag);
			printEvidencia.tiraPrint(driver, "Realizando paginação...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
