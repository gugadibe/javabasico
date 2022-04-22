/*
Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
multiplicação e a divisão dos dois números lidos;
data: 22/05/2022
 */
package exercicio2;

import java.util.Scanner;

public class Exercicio2{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        int resultadoOperacao;
        
        System.out.println("Digite o primeiro valor!");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo valor!");
        num2 = scan.nextInt();
        
        resultadoOperacao = num1 + num2;
        System.out.println("Resultado adição: "+ resultadoOperacao);
        
        resultadoOperacao = num1 - num2;
        System.out.println("Resultado subtração: "+ resultadoOperacao);
        
        resultadoOperacao = num1 * num2;
        System.out.println("Resultado multiplicação: "+ resultadoOperacao);

        resultadoOperacao = num1 / num2;
        System.out.println("Resultado divisão: "+ resultadoOperacao);

    }
    
}
