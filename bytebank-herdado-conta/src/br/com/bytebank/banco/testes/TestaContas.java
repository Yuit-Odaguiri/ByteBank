package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaContas {
	public static void main(String[] args) {

	ContaCorrente cc = new ContaCorrente(111,111);
	cc.deposita(100.0);
	
	ContaPoupanca cp = new ContaPoupanca(222, 222);
	cp.deposita(200.0);
		
	cc.transfere(10.0, cp);
	
	System.out.println(cc.getSaldo());
	System.out.println(cp.getSaldo());
	
	System.out.println(Conta.getTotal());
	}
}
