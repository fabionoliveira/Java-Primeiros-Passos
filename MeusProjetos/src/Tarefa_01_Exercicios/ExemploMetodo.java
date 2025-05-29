
package Tarefa_01_Exercicios;

import javax.swing.JOptionPane;

public class ExemploMetodo 
{
    public static void main(String[] args) {

        double Valores []  = {23,55,800,35,23,1,8,900};
        
       
        JOptionPane.showMessageDialog(null, Invertido(Valores), "Resultado Inversão", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, Media(Valores), "Resultado Media", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, Pares(Valores), "Resultado Pares", JOptionPane.INFORMATION_MESSAGE);
        
    } /// final do main

    public static String Pares (double [] Valores) {
        String Saida="";
        
        for(int i=0;i<Valores.length;i++) {
        
            if(Valores[i]%2==0) {
                Saida = Saida + Valores[i] + "\n";
            }
        }
        
        return Saida;
    }

    public static double Media (double [] Valores ) {
        double saida=0,soma=0,media=0;
        
        for(int i=0;i<Valores.length;i++){
            soma=soma+Valores[i];
        }
        media = soma/Valores.length;
        saida = media;
        return saida;
    }

    public static String Invertido (double  [] Valores) {
        String saida="";
        
        for(int i=Valores.length-1;i>=0;i--) {
            saida = saida + Valores[i] +"  ";
        }
        
        return saida;
    }

}
