package dev.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CalculServiceTest {
	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);


	@Test
	public void testAdditionner() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		//TODO
		CalculService addition = new CalculService();
		
		
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4"); 
		//TODO
		int somme = addition.additionner("1+3+4");
		somme = 8;
		LOG.info("Alors j'obtiens le résultat 8");
		// TODO
		assertThat(somme).isEqualTo(8);
	};
	
	@Test
	public void testRuntimeException() throws Exception {
		
	}
	
}


