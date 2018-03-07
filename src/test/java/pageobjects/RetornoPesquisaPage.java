package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RetornoPesquisaPage extends Page {

	public RetornoPesquisaPage(WebDriver driver) {
		super(driver);
	}

	public List<WebElement> getGridResultadosBusca() {
		List<WebElement> listaElementos = null;
		try {
			listaElementos = driver.findElements(By.xpath(".//ol[@id = 'searchResults']//li//a"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaElementos;
	}

	public WebElement getTituloProduto(WebElement elemento) {
		WebElement tituloProduto = null;
		try {
			tituloProduto = elemento.findElement(By.xpath("//h2//span"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return tituloProduto;
	}

	public WebElement getValorProduto(WebElement elemento) {
		WebElement elementoValorProduto = null;
		try {
			elementoValorProduto = elemento.findElement(By.xpath("//div[contains(@class, 'item__price')]//span[2]"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return elementoValorProduto;
	}

	public WebElement getPaginacao(String pag) {
		return getElement(".//li[@class = 'pagination__page']//a[text() = '" + pag + "']");
	}

	public void clickPaginacao(String pag) {
		getPaginacao(pag).click();
	}
}
