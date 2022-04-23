/*
Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
data: 23/04/2022
 */
package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float celsius = 0.0f;
        float fahrenheit = 0.0f;
        
        System.out.println("Informe a temperatuda em Celsius: ");
        celsius = scan.nextFloat();
        
        fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("Conversão de Celsius para Fahrenheit: " + fahrenheit);
    }
    
}
