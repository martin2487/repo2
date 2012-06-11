package com.practica;

import java.util.ArrayList;
import java.util.List;

public class EratostenesWkipedia implements AlgoritmoEratostenes {

	@Override
	public List<Long> getPrimos(double n) {
			//int n = Integer.parseInt(args[0]);
			//int n = N;
			int tope = (int) Math.floor(Math.sqrt(n)) + 1;

			List<Long> compuestos = new ArrayList<Long>();
			int pos = 0;
			for (int i = 2; i <= tope; i++) {
				if (!compuestos.contains(Long.valueOf(i))) {
					for (int j = i; j <= n / i + 1; j++)
						compuestos.add(Long.valueOf(i * j));
				}
			}

			List<Long> primos = new ArrayList<Long>();
			int c = 0;
			for (pos = 2; pos < n; pos++) {
				if (!compuestos.contains(Long.valueOf(pos)))
					//System.out.println(++c + ": " + pos);
					primos.add(Long.valueOf(pos));
			}
			
			return primos;
	}

}
