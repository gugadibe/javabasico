/*
Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
data: 24/04/2022
 */
package exercicio14;

import java.util.Scanner;
public class Exercicio14 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA, numB;
        
        System.out.println("Informe o valor de numA: ");
        numA = scan.nextInt();
        System.out.println("Informe o valor d2 numB: ");
        numB = scan.nextInt();
        
        if(numA > numB){
            System.out.println("O valor de numA é maior que numB");
        }else {
          System.out.println("O valor de numB é maior que numA");
        }
        
    }
    
}
