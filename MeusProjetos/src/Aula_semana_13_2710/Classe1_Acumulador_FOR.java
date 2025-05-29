/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_13_2710;

/**
 *
 * @author FO
 */
public class Classe1_Acumulador_FOR {

    Classe1_Acumulador_FOR() {
        double produto = 1;
        for (int i = 1; i <= 9; i++) {
            produto *= i; // produto = produto * i
        }
        System.out.println("Produto acumulado: "+ produto); }
    
    public static void main(String[] args) {
        Classe1_Acumulador_FOR obj1 = new Classe1_Acumulador_FOR();
    }
}




