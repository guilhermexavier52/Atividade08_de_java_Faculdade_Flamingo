package exercicio08;

import java.util.Scanner;

/* Elaborar um programa que efetue a leitura de 10 valores numéricos
 *e apresente no final o total do somatório e a média aritmética dos valores lidos.*/

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1 = 0;
		float numero2 = 0;
		
		
		System.out.println("Digite 10 valores\n ");
		
		while (numero1 < 10) {
			
			System.out.println("Digite o valor: ");
			float valor = sc.nextFloat();
		    numero2 += valor;
		    numero1++;
		}
		
		float media = numero2 / 10;
		
		System.out.println("Total da Soma: " + numero2);
		System.out.println("Media aritimetica: " + media);
		
		sc.close();
	}

}
