/*
Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
data: 21/05/2022

*/

package exercicio;

import java.util.Scanner;
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num1 = 0;
        int num2 = 0;
        int totalSoma = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor:");
        num1 = scan.nextInt();
        System.out.println("Informe o segundo valor:");
        num2 = scan.nextInt();
        totalSoma = num1 + num2;
        System.out.println("O total da soma é: "+ totalSoma);
    }
    
}
