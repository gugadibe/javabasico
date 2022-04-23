/*
Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
trocados;
data:22/04/2022
 */
package exercicio6;

import java.util.Scanner;
public class Exercicio6 {
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int valorA, valorB, aux;
       System.out.println("Informe o primeiro valor: ");
       valorA = scan.nextInt();
       System.out.println("Informe o segundo valor: ");
       valorB = scan.nextInt();
       
       System.out.println("ValorA: " + valorA);
       System.out.println("ValorB: " + valorB);
       
       aux = valorA;
       valorA = valorB;
       valorB = aux;
       System.out.println("ValorA: " + valorA);
       System.out.println("ValorB: " + valorB);
       
    }
    
}
