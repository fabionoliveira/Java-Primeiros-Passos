/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_09_2209;

/**
 *
 * @author FO
 */
public class Classe2 {
public int x [ ]={1,2,3,4,5};
Classe2 ( ) { } // construtor vazio
Classe2 ( int [] tb ) {
for ( int valor: tb )
System.out.println(valor);
}
public static void main (String []args) {
Classe2 c1 = new Classe2 ();
Classe2 c2 = new Classe2 (c1.x); } }