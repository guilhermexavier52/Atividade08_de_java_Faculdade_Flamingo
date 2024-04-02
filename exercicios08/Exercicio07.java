package exercicio08;

/*Escreva um programa que apresente a série de Fibonacci 
 *até o décimo quinto termo. A série de Fibonacci é formada
 *pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta
 *série se caracteriza pela soma de um termo atual com o seu 
 *anterior subseqüente, para que seja formado o próximo valor 
 *da seqüência. Portanto começando com os números 1, 1 o 
 *próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, 
 *o próximo 3+5=8, etc.*/

public class Exercicio07 {

	public static void main(String[] args) {
		
	int primeiro = 1;
	int segundo = 1;
	int seguinte;
	
	System.out.println("Serie de Fibonacci ate decimo quinto termo: ");
	System.out.println(primeiro + "");
    System.out.println(segundo + "");
    
    int conta = 2;
    
    while (conta < 15) {
    	seguinte = primeiro + segundo;
    	System.out.println(seguinte + "");
		primeiro = segundo;
		segundo = seguinte;
		conta++;
	}
    
    
    
    
    
    
	
	}

}
