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
public class Figura extends Object {

    protected double area = 0;
    protected String figura;

    protected void calc_area(double[] lados) {
        if (lados.length == 1) {
            figura = "Quadrado";
            area = Math.pow(lados[0], 2);
        }

        else if (lados.length == 3) {
            double p;
            p = (lados[0] + lados[1] + lados[2]) / 2;
            figura = "Triangulo";
            area = Math.sqrt(p * (p - lados[0]) * (p - lados[1]) * (p - lados[2]));
        }

        else if (lados.length == 4) {
            figura = "Retangulo";
            area = lados[0] * lados[1];
        }

        else if (lados.length == 5) {
            figura = "Pentágono";
            area = 5 * lados[1] * lados[0];
        }
    }

    protected void mostrarDados() {
        System.out.println("\nFigura: " + figura);
        System.out.println("Area..: " + String.format("%.2f", area) + "\n");
    }
}