/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo;
data: 24/04/2022
 */
package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       float precoCustoVeiculo,
             precoFinalVeiculo,
             precoImpostos,
             percentualDistribuidor =0.28f, 
             impostos=0.45f;
       
       System.out.println("Informe o preço de custo do veículo: ");
       precoCustoVeiculo = scan.nextFloat();
       
       precoImpostos = precoCustoVeiculo + precoCustoVeiculo * impostos;
       precoFinalVeiculo = precoImpostos + (precoImpostos * percentualDistribuidor);
       
       System.out.println("Preço de venda do veículo: "+precoFinalVeiculo);
    }
    
}
