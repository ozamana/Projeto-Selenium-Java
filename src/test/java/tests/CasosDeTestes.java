package tests;

import org.junit.Test;

import funcionalidades.PaginaInicialFuncionalidade;
import funcionalidades.RetornoPesquisaFuncionalidade;

public class CasosDeTestes {

	PaginaInicialFuncionalidade paginaInicialFuncionalidade = new PaginaInicialFuncionalidade();
	RetornoPesquisaFuncionalidade retornoPesquisaFuncionalidade = new RetornoPesquisaFuncionalidade();

	@Test
	public void realizarPesquisa() {
		try {
			paginaInicialFuncionalidade.goToAcess();
			paginaInicialFuncionalidade.isPaginaInicial();
			paginaInicialFuncionalidade.realizandoPesquisa("TV 4K");
			retornoPesquisaFuncionalidade.imprimindoResultadosGrid(5);
			retornoPesquisaFuncionalidade.realizaPaginacao("2");
			paginaInicialFuncionalidade.tearDown();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
