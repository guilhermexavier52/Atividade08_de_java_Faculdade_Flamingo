package exercicio08;

/*Elaborar um programa que efetue a leitura de valores
 *positivos inteiros até que um valor negativo seja 
 *informado. Ao final devem ser apresentados o maior e o
 *menor valores informados pelo usuário.*/

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorMaior = Integer.MIN_VALUE;
		int valorMenor = Integer.MAX_VALUE;

		System.out.println("Digite valores inteiros positivos (digite um valor negativo para parar): ");

		int valor = sc.nextInt();

		while (valor >= 0) {
			
			if (valor > valorMaior) {
				valorMaior = valor;
			}
			
			if (valor < valorMenor) {
				valorMenor = valor;
			}
 
			valor = sc.nextInt();
		}

		if (valorMaior != Integer.MIN_VALUE && valorMenor != Integer.MAX_VALUE) {
			 System.out.println("Maior valor informado: " + valorMaior);
	            System.out.println("Menor valor informado: " + valorMenor);
	        } else {
	            System.out.println("Nenhum valor positivo foi informado.");
	    
	       }
		sc.close();
		}
		
		
	}


