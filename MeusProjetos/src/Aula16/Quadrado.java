/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula16;

/**
 *
 * @author FO
 */
public class Quadrado extends Figura {
    protected void calc_area(double[] lados) {
        figura = "Quadrado";
        area = Math.pow(lados[0], 2);
    }
}
