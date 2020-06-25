package br.com.bytebank.banco.testes;

public class TesteString {
	public static void main(String[] args) {

		String nome = "Alura";

		String vazio = " Alura  ";
		String outroVazio = vazio.trim();
		
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio.isEmpty());
	
		
		
//		System.out.println(nome.length());
//		
//		for(int i = 0; i <nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
		
		
//		String sub = nome.substring(1);
//		System.out.println(sub);

		
//		String outra = nome.toLowerCase();
		
		
//		System.out.println(nome);
//		System.out.println(outra);
	}
}
