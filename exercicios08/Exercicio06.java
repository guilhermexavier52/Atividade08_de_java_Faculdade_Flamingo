package exercicio08;

import java.util.Scanner;

// Elaborar um programa que apresente como resultado o valor de uma potência de uma base

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Base: ");
		float base = sc.nextFloat();
		
	    System.out.println("Digite o Expoente: ");
	    float expoente = sc.nextFloat();
	    
	    float resultado = 1;
	    
	    int contador = 0;
	    
	    while (contador < expoente) {
			resultado *= base;
			contador++;
		}
	    System.out.println("O resultado de " + " elevado " + expoente + " é: " + resultado);
         
	    sc.close();	
	}
	
}
