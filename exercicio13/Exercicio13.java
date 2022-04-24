/*
Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
data: 24/04/2022
 */
package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Informe um valor inteiro: ");
        num = scan.nextInt();
        
        if(num > 10){
            System.out.println("Número maior que 10");
        }
        
    }
    
}
