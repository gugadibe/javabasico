/*
Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
disponíveis com ousuário;
 */
package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        float cotacaoDolar, qtdDolarDisponivel, totalEmReais;
        
        System.out.println("Informe a cotação do dolar atual: ");
        cotacaoDolar = scan.nextFloat();
        System.out.println("Informe a quantidade de dolar disponivel: ");
        qtdDolarDisponivel = scan.nextFloat();
        
        totalEmReais = qtdDolarDisponivel * cotacaoDolar;
        System.out.println("Valor total em Reais: R$"+ totalEmReais);
        
    }
    
}
