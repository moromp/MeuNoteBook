package br.com.moromp.Teste;


import org.junit.Assert;
import org.junit.Test;


public class validarTeste {

	@Test
	public void testar(){
		int ret;
		teste teste = new teste();
		ret = teste.soma(10, 15);
		
		Assert.assertEquals(25, ret);
	}

}
