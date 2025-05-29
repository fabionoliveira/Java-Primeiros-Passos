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
public class ArrayMultidimensionalMatriz {

    public static void main(String[] args) {
        String[][] agenda = {{"Peru", "Italia", "Japao"}, {"1", "2", "3"}};
        System.out.print("Indice| Nome\n");
        for (int i = 0; i < agenda.length; i++) {
            
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.print(j + "     | "+ agenda[i][j]+"\n");
            }
        }

        
    }

}
