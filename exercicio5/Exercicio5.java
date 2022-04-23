/*
Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No finalinformar o nome do aluno e a sua média (aritmética);
data: 22/04/2022
 */
package exercicio5;

import java.util.Scanner;
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeAluno;
        float nota1,nota2,nota3,mediaAluno;
        
        System.out.println("Informe o nome do aluno: ");
        nomeAluno = scan.nextLine();
        
        System.out.println("Informe a primeira nota do Aluno: ");
        nota1 = scan.nextFloat();
        System.out.println("Informe a segunda nota do Aluno: ");
        nota2 = scan.nextFloat();
        System.out.println("Informe a terceira nota do Aluno: ");
        nota3 = scan.nextFloat();
        
        mediaAluno = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média final: "+ mediaAluno);
        
    }
    
}
