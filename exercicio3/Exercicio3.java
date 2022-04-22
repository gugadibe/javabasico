/*
Escreva um algoritmo para determinar o consumo médio de um automóvel sendo 
fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;
 */
package exercicio3;

import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        float consumoTotal=0, distanciaPercorrida, combustivelUtilizado;
        
        System.out.println("Informe a distancia total percorrida:");
        distanciaPercorrida = scan.nextFloat();
        System.out.println("Informe a quantidade de combustivel utilizada");
        combustivelUtilizado = scan.nextFloat();
        
        consumoTotal = distanciaPercorrida / combustivelUtilizado;
        
        System.out.println("O consumo do carro em km por litro é: "
                            +consumoTotal);
    }
    
}
