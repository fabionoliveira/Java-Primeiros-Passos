/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_12_exer_A;

/* Progama para calcular o valor de 5 Fatorial */
public class Fatorial {

    public static void main(String args[]) {

        double x = 7; // aqui criamos uma variável que irá armazenar o numero do fatorial
        double f = x; // aqui criamos outra var. Será o resultado temporário da multiplicação

        while (x > 1) { // Enquanto x for menor que 1 faça o que está entre as chaves

            f = f * (x - 1); // A variável temporária ira receber o resultado da multiplicação dela, pelo valor de x menos 1
            x--; // aqui decrementamos o valor de x em um, no final do loop
            System.out.println(f); // Esse comando imprime o valor de f. O último será o valor final do Fatorial.
        }
    }
}
