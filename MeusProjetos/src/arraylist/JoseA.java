/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author FO
 */
public class JoseA {

    public static void main(String[] args) {
        String[][] agenda = {{"Bill Gates", "22222-2222", "bill@email.com"},
        {"José de Assis", "29999-9999", "ze@email.com"},
        {"Linus Torvalds", "98989-1234", "linus@email.com"}};
        // recuperando o E-mail do Bill Gates
        // System.out.println(agenda[0][2]);
        // recuperando a agenda completa
        System.out.println("================================");
        System.out.println("====== Agenda de contatos ======");
        System.out.println("================================");
        System.out.println("");
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("______________________________");
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println(agenda[i][j]);
            }
        }
    }

}
