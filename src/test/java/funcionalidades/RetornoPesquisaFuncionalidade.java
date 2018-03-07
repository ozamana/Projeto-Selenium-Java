package funcionalidades;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.RetornoPesquisaPage;
import util.Navegacao;

public class RetornoPesquisaFuncionalidade {

	WebDriver driver;
	RetornoPesquisaPage retornoPesquisaPage;

	public RetornoPesquisaFuncionalidade() {
		driver = Navegacao.getChromeDriver();
		retornoPesquisaPage = new RetornoPesquisaPage(driver);
	}

	public void imprimindoResultadosGrid(int numeroLinha) {
		int cont = 1;
		List<WebElement> listaElementos = retornoPesquisaPage.getGridResultadosBusca();
		
		System.out.println("**********Resultados da grid**********\n");
		for (WebElement listWebElement : listaElementos) {
			
			System.out.println("Titulo: " + retornoPesquisaPage.getTituloProduto(listWebElement).getText() + ".\n");
			System.out.println(
					"O Valor do produto é R$: " + retornoPesquisaPage.getValorProduto(listWebElement).getText() + ".\n");

			if (cont == numeroLinha) {
				break;
			}
			cont++;
		}
	}

	public void realizaPaginacao(String pag) {
		try {
			retornoPesquisaPage.clickPaginacao(pag);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
