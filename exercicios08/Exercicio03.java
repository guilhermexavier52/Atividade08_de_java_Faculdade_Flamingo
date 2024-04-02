package exercicio08;

//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		int somatorio = 0;
		
		int numero = 1;
		
		while (numero <= 500) {
			if (numero % 2 == 0) {
				somatorio += numero;
			}
			numero++;
		}
				
		System.out.println("O somatorio dos valores pares de 1 ate 500 é: " + somatorio);		
		
	}

}
