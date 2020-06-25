package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		ContaCorrente cc1 = new ContaCorrente(123, 1234); 
		referencias[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(1234, 1567);
		referencias[1] = cp2; 
		
		ContaCorrente cc3 = new ContaCorrente(1237, 1568);
		referencias[2] = cc3; 
		
		Cliente cliente = new Cliente();
		referencias[3] = cliente;
		
		
		//System.out.println(referencias[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		
		System.out.println(ref.getNumero());
		
	}

}
