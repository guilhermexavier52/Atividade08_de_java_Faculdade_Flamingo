package exercicio08;
/*Apresentar todos os valores numéricos inteiros
 *ímpares situados na faixa de 0 a 20. Para verificar 
 *se o número é ímpar, efetuar dentro da malha a verificação 
 *lógica desta condição com a instrução se, perguntando se o 
 *número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.*/


public class Exercicio04 {

	public static void main(String[] args) {
	
		int numero = 0;
		
		while (numero <= 20) { // Condição corrigida
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
		}
		
	}
	
}
