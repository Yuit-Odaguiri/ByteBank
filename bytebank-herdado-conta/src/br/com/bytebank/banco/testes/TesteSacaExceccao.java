package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSacaExceccao {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(123,321);
		c1.deposita(200.0);
		
		try {
			c1.sacar(210.0);
		}catch (Exception ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		
		
		System.out.println(c1.getSaldo());
	}
}
