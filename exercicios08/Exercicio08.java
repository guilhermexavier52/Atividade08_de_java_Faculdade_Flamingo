package exercicio08;

/*Elaborar um programa que apresente os valores de 
 *conversão de graus Celsius em Fahrenheit, de 10 
 *em 10 graus, iniciando a contagem em 10 graus 
 *Celsius e finalizando em 100 graus Celsius. O programa 
 *deve apresentar os valores das duas temperaturas. A fórmula
 *de conversão é F = (9*C +160) /5, sendo F a temperatura em 
 *Fahrenheit e C a temperatura em Celsius.*/

public class Exercicio08 {
	public static void main(String[] args) {
		int celsius = 10;

		while (celsius <= 100) {
			double fahrenheit = (9.0 * celsius + 160) / 5.0;

			System.out.printf("%d graus Celsius = %.2f graus Fahrenheit\n", celsius, fahrenheit);

			celsius += 10;

		}

	}

}
