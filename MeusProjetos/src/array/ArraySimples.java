/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author FO
 */
public class ArraySimples {

    public static void main(String[] args) {
        String[] nomes = {"Maria", "Lucia", "Rosana"};
        char[] letras = {'A', 'B', 'C', 'D'};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        double[] valores = {10, 16.7, 90, 100.3};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nomes: " + nomes[i]);
        }
        for (int j = 0; j < letras.length; j++) {
            System.out.println("Letras: " + letras[j]);
        }
        for (int k = 0; k < numeros.length; k++) {
            System.out.println("Números: " + numeros[k]);
        }
        for (int l = 0; l < valores.length; l++) {
            System.out.println("Valores: " + valores[l]);
        }
    }
}
