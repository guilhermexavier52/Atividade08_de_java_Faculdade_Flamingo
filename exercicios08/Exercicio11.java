package exercicio08;

import java.util.Scanner;

/* Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
 banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada
 do nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
 do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar calculando
 novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor total acumulado da área residencial.*/

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float area = 0;
        String resposta = "sim";

        while (resposta.equalsIgnoreCase("sim")||resposta.equalsIgnoreCase("SIM")) {
            System.out.println("Digite o nome do comodo: ");
            String nomeComodo = sc.nextLine();

            System.out.println("Digite o comprimento do comodo em metros: ");
            float comprimento = sc.nextFloat();

            System.out.println("Digite a largura do comodo em metros: ");
            float largura = sc.nextFloat();

            float areaComodo = largura * comprimento;
            area += areaComodo;

            
            sc.nextLine();

            System.out.println("Deseja continuar calculando novos cômodos? (SIM/NAO)");
            resposta = sc.nextLine();

        }

        System.out.println("Area total da residencia: " + area + " metros quadrados.");

        sc.close();

    }
}