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
public class Classe2_Uso_de_Mod_FOR {

    Classe2_Uso_de_Mod_FOR() {
        int cont = 0;
        for (int i = 148; i <= 2950; i++) {
            if (i % 2 == 0) {
                cont++;
                if (cont == 54) {
                    System.out.println(i);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Classe2_Uso_de_Mod_FOR obj2 = new Classe2_Uso_de_Mod_FOR();
    }
}
