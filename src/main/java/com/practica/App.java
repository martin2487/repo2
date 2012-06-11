package com.practica;

import java.util.ArrayList;
import java.util.List;

/**
 * Criba de Eratostenes (Mejorado)
 * 
 * Generacion de los n primeros primos mediante el algoritmo de la criba de
 * Eratostenes
 * 
 */
public class App {

	public static final int N = 120;
	public static void main(String[] args) {
		//int n = Integer.parseInt(args[0]);
		int n = N;
		int tope = (int) Math.floor(Math.sqrt(n)) + 1;

		List<Long> compuestos = new ArrayList<Long>();
		int pos = 0;
		for (int i = 2; i <= tope; i++) {
			if (!compuestos.contains(Long.valueOf(i))) {
				for (int j = i; j <= n / i + 1; j++)
					compuestos.add(Long.valueOf(i * j));
			}
		}

		int c = 0;
		for (pos = 2; pos < n; pos++) {
			if (!compuestos.contains(Long.valueOf(pos)))
				System.out.println(++c + ": " + pos);
		}
	}

}
