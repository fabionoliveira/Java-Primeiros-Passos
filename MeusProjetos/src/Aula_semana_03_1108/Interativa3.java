
package Aula_semana_03_1108;

import javax.swing.JOptionPane;

public class Interativa3 {
// Meus atributos 
    public String nome;
    public double altura;
    public double peso;
    public double imc;
    public String situacao;
    
    public void leitura()
    {
       nome = JOptionPane.showInputDialog(null, "Digite o nome:");
       altura = Double.parseDouble ( 
                  JOptionPane.showInputDialog(null, "Digite Altura:")
                      );
       peso = Double.parseDouble ( 
                  JOptionPane.showInputDialog(null, "Digite o Peso:")
                      );       
        
    }//LEITURA
    public void calcularImc()
    {
        imc = peso / Math.pow(altura, 2);
        if ( imc <= 18.5 )
        {situacao = "Abaixo do Peso";}
        else if (imc <= 24.9 )
        {situacao = "Peso normal";}
        else
        {situacao = "Acima do peso";}    
    
    }//CALCULAR
    public void mostrarResultados()
    {
        String linhasSaida;
        linhasSaida = "\n** Cálculo do I.m.c. ***\n";
        linhasSaida += "\nNome:" + nome;
        linhasSaida += "\nPeso:" + peso;
        linhasSaida += "\nAltura:" + altura;
        linhasSaida += "\nIMC...:" + imc;
        linhasSaida += "\nSituação:" + situacao;
        JOptionPane.showMessageDialog(null, linhasSaida);
        
    }//RESULTADOS
    
    public static void main(String[] args)
    {
        Interativa3 I1 = new Interativa3();
        
        I1.leitura();
        I1.calcularImc();
        I1.mostrarResultados();   
    
    }//MAIN
 
}////CLASSE
