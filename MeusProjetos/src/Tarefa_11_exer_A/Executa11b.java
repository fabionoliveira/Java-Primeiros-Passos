/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_11_exer_A;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class Executa11b extends Classe11b {

    public static void main(String[] args){
        
        Executa11b obj2 = new Executa11b();

        String menu;
        menu = "\n1 Ler\n2 Exibir\n3 Sair\nItem:";
        while (true) {
            int itemmenu = Integer.parseInt(
                    JOptionPane.showInputDialog(null, menu));

            switch (itemmenu) {
                case 1:
                    obj2.Ler();
                    obj2.getMediaH();
                    obj2.getMediaM();
                    break;
                case 2:
                    obj2.exibir();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Programa Finalizado!!");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Selecione um item válido!","Erro",0);
                    break;
            }
        }

    }

}
