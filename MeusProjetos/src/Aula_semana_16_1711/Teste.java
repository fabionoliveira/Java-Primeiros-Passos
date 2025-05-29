/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_16_1711;

/**
 *
 * @author FO
 */
public class Teste {

    public void calcularArea(Figura minhaFigura, double lado) {
        minhaFigura.calc_area(lado);
    }

    public static void main(String[] args) {
        Teste objFig = new Teste();

        objFig.calcularArea(new Quadrado(), 5);

        objFig.calcularArea(new Triangulo(), 5);

        objFig.calcularArea(new Pentagono(), 5);
    }
}
