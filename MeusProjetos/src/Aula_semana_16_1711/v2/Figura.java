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
public class Figura extends Object {

    public String nome;

    private double area;

    public void set_area(double area) {
        this.area = area;
    }

    public void get_area() {
        System.out.println(area + "\n" + this.nome);
    }

}
