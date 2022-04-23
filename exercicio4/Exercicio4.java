/*
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
data: 22/04/2022
 */
package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        String nome;
        float totalVendas;
        float salario, salarioFinal = 0.0f;
        
        System.out.println("Informe o nome do vendedor:");
        nome = scan.nextLine();
        System.out.println("Informe o valor total de vendas: ");
        totalVendas = scan.nextFloat();
        System.out.println("Informe o salário: ");
        salario = scan.nextFloat();
        
        salarioFinal = salario + (totalVendas * 0.15f);
        
        System.out.println("Vendedor: " + nome);
        System.out.println("Salário: "+ salario);
        System.out.println("Total de vendas: "+ totalVendas);
        System.out.println("Salário final: " + salarioFinal);
        
    }
    
}
