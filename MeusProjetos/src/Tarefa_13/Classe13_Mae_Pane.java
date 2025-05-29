package Tarefa_13;

import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FO
 */
public class Classe13_Mae_Pane {

    public int N;

    public static ArrayList<Integer> arrayList;

    Classe13_Mae_Pane() {
    }

    public int LernIntPos() {

        return N;
    }

    public int fatorial(int x) {
        int fat = 1;
        for (int i = x; i >= 1; i--) {
            fat *= i; // fatora, Calcula o produto e armazena em fat

        }
        //String L2 = "\n=-=-=-=-=-=-=-= Exibir Resultado  =-=-=-=-=-==-=-=\n"
        String L2 = "O Número " + x + "!  é  " + fat + ".";
        JOptionPane.showMessageDialog(null, L2, "Calcular e Exibir Resultado Fatorial", 1);
        return fat;

    }

    public static boolean ehprimo(int n) {
        int contdiv = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contdiv++;
            }
        }

        if (contdiv == 2) {
            return true;
        } else {
            return false;
        }

    }

    public int getSomaNumPrimo(int x) {

        int somap = 0;
        for (int i = 1; i <= x; i++) {
            if (ehprimo(i) == true) {
                somap += i;
            }
        }
        JOptionPane.showMessageDialog(null, "Resultado do Somatório: " + somap, "Resultado Soma Números Primos", 1);
        return somap;

    }

    public void exibirNP(int x) {

        arrayList.clear();        
        String saida = "";
        int pos = 0;
        if (x > 0) {
            for (int i = 0; i < x+1; i++) {
                if (ehprimo(i) == true) {
                    arrayList.add(i);
                    pos = arrayList.lastIndexOf(i) ;
                }

            }
           
            JOptionPane.showMessageDialog(null, "São Primos " + arrayList.toString()+ "\nQuantidade de Elementos :  "+ arrayList.size()
                    +"\nO Elemento Menor :  "+arrayList.get(0)+"\nO Elemento Maior :  "+arrayList.get(pos), "Exibir Números Primos", 1);
        }

        if ( x < 0) {
            
            saida = ">>> NÃO TEM NÚMERO PRIMO!!!"
                    + "\n>>> POIS " + x + " É UM NÚMERO NEGATIVO.";
            JOptionPane.showMessageDialog(null, saida, "Exibir Números Primos", 1);
           
        }

    }

    /*
    public void exibirNumPrimos(int x) {

        arrayList.clear();
        boolean primo;
        String saida = "";
        if (x > 0) {
            for (int i = 0; i < x+1; i++) {
                primo = true;

                if (i == 1) {
                    primo = false;
                }

                if (primo) {
                    if ((i % 2 == 0) && (i != 2)) {
                        primo = false;
                    }
                }

                if (primo) {
                    for (int j = 3; j < (i / 2); j++) {
                        if (i % j == 0) {
                            primo = false;
                            break;
                        }

                    }

                }
                if (primo) {
                    arrayList.add(i);
                    
                }
            
            }
            JOptionPane.showMessageDialog(null, "São Primos " + arrayList.toString(), "Exibir Números Primos", 1);
        }
           
        if (x < 0) {
            primo = false;
            if (!primo) {

                saida = ">>> NÃO TEM NÚMERO PRIMO!!!"
                        + "\n>>> POIS " + x + " É UM NÚMERO NEGATIVO.";
                JOptionPane.showMessageDialog(null, saida, "Exibir Números Primos", 1);
                
            }
        }
        
    }

     */
}
