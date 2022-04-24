/*
Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
data: 24/04/2022
 */
package exercicio15;

import java.util.Scanner;
public class Exercicio15 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num = 0;
       
       System.out.println("Informe um valor: ");
       num = scan.nextInt();
       
       if(num >= 100 && num <= 200)
       {
           System.out.println("Valor informado está no intervalo entre 100 e 200");
       }
       
    }
    
}
