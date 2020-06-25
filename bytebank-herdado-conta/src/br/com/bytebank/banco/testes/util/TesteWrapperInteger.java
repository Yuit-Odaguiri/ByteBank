package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nomes = new String[5];

		int idade = 29; // integer

		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();
		System.out.println(valor);

		String s = args[0];

		Integer numero = Integer.valueOf(s);
		int numero2 = Integer.parseInt(s);
		System.out.println(numero2);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);

	}
}
