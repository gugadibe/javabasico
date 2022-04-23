/*
Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês.Considere fixo o juro da poupança em 0,07% a. m;
data: 23/04/2022
 */
package exercicio9;

import java.util.Scanner;
public class Exercicio9 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float valorDepositado,valorComRendimento, juroFixo = 0.07f;
        
        System.out.println("Informe o valor do depósito:");
        valorDepositado = scan.nextFloat();
        valorComRendimento = valorDepositado + (valorDepositado * juroFixo);
        System.out.println("Rendimento no primeiro mês: "+ valorComRendimento);
    }
    
}
