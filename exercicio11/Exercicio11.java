/*
Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
data: 24/04/2022
 */
package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        float precoCusto=0.0f, precoVenda, percentual =0.0f;
        
        System.out.println("Informe o preço de custo do produto: ");
        precoCusto = scan.nextFloat();
        System.out.println("Informe o percentual de acrescimo: ");
        percentual = scan.nextFloat();
        
        precoVenda = precoCusto + (precoCusto * percentual);
        
        System.out.println("Valor preço de venda: " + precoVenda);
    }
    
}
