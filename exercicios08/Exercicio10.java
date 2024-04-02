package exercicio08;

/* Elaborar um programa que apresente os resultados da soma e
 * da média aritmética dos valores pares situados na faixa numérica de 50 a 70.*/


public class Exercicio10 {

	public static void main(String[] args) {
		
		int soma = 0;
		int contador = 0;
		int numero = 50;
		
		while (numero <= 70) {
			if (numero % 2 == 0) {
				soma += numero;
				contador++;
			}
			numero++;
		}
		float media = (float) soma / contador;
		
		System.out.println("soma dos numeros pares: " + soma);
		System.out.println("Média dos Numeros pares: " + media);

	}

}
