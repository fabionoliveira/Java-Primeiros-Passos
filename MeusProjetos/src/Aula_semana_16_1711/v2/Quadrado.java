/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_16_1711.v2;

/**
 *
 * @author FO
 */
public class Quadrado extends Figura {

    private double lado;

    private void setFigura(double lado, String nome) {
        super.nome = nome;
        // super.area = 50; // Vai dar erro

        set_area(Math.pow(this.lado, 2));
    }

    public static void main(String[] args) {

        Quadrado q1 = new Quadrado();

        q1.lado = 11; // private classe filha
        q1.nome = "Quadrado"; // classe mãe

        q1.set_area(Math.pow(q1.lado, 2));// classe mãe
        q1.get_area(); // classe mãe
        q1.setFigura(10, "Quadrado"); // private classe filha

        //System.out.println(area); // private classe mãe
        q1.get_area();
    }
}
