package exercicio08;

import java.util.Scanner;

//Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero do tipo inteiro: ");
		int numero=sc.nextInt();
		
		int contador = 1;
		
		while(contador < 11) {
			System.out.println(contador +" X "+ numero +" = "+ numero * contador);
			contador++;
			
		}
		
		
		
		
		sc.close();
	}

}
