package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayLinkedList {
	public static void main(String[] args) {
		
		LinkedList <Conta> lista = new LinkedList<Conta>();
		
		
		//Cliente cliente = new Cliente();
		//lista.add(cliente);
		
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
		
		Conta cc2 = new ContaCorrente(44,33);
		lista.add(cc2);
		
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(55,66);
		lista.add(cc);
		
		
		Conta cc4 = new ContaCorrente(77,88);
		lista.add(cc2);
		
		for(int i =0; i< lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		for(Conta Conta : lista) {
			System.out.println(Conta);
		}
		
	}
}
