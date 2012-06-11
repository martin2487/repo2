package com.practica;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;



public class AppTest  {
	private AlgoritmoEratostenes eratostenes;
	private static final int NUMERO = 120;
	
	private void imprimirPimos(List<Long> primos) {
		System.out.println("*** NUMEROS PRIMOS ***");
		for (int i = 0; i < primos.size(); i++) {
			System.out.println(i + 1 + ": " + primos.get(i)); 
		}
	}
	
	@Test
	public void testEratostenesWikipedia() {
		eratostenes = new EratostenesWkipedia();
		imprimirPimos(eratostenes.getPrimos(NUMERO));
	}
	
	@Ignore("Test not ready to run")
	@Test
	public void testEratostenesMio() {
		eratostenes = new EratostenesMio();
		imprimirPimos(eratostenes.getPrimos(NUMERO));
	}
}
