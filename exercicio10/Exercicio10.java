/*
A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
data: 23/04/2022
 */
package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float totalCompra;
        
        System.out.println("Informe o valor total da compra: ");
        totalCompra = scan.nextFloat();
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Parcela "+ i + "x "+ (totalCompra / 5));
        }
    }
    
}
