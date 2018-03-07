package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import funcionalidades.PaginaInicialFuncionalidade;
import funcionalidades.RetornoPesquisaFuncionalidade;

public class CasosDeTestes {

	PaginaInicialFuncionalidade paginaInicialFuncionalidade = new PaginaInicialFuncionalidade();
	RetornoPesquisaFuncionalidade retornoPesquisaFuncionalidade = new RetornoPesquisaFuncionalidade();
	
	@Before
	public void setup(){
		paginaInicialFuncionalidade.goToAcess();
		paginaInicialFuncionalidade.isPaginaInicial();		
	}
	
	@Test
	public void testRealizarPesquisa() {
		try {
			paginaInicialFuncionalidade.realizandoPesquisa("Celular");
			retornoPesquisaFuncionalidade.imprimindoResultadosGrid(5);
			retornoPesquisaFuncionalidade.realizaPaginacao("2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@After
	public void quit(){
		paginaInicialFuncionalidade.tearDown();
	}
}
