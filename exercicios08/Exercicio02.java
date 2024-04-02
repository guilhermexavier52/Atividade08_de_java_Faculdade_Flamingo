package exercicio08;

//Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

public class Exercicio02 {
	public static void main(String[] args) {
		
		int soma = 0;
		
		int i = 1;
		
		while (i <= 100) {
			soma += i;
			i++;
			
		}
		System.out.println("A soma dos cem primeiros numeros inteiros é: " + soma);
	}

}
