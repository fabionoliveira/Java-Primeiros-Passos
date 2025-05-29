/*
 * Exemplo 3 Cálculo do Saldo Médio 
 */
package Aula_semana_10_2909;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class Classe3
{
    public int   cont  = 0;
    public float saldo = 0;
    public float valor = 0;
    

 

public float getMedia()
{
  return ( saldo / cont );
}

 

public void resumo()
{
    String saida = "\n*** Resumo da Conta ***";
    saida += "\nSaldo................:" + String.format("R$ %.2f" , saldo);
    saida += "\nNúmero de lançamentos:" + cont;
    saida += "\nSaldo Médio..........:" + String.format("R$ %.2f", getMedia() );
    JOptionPane.showMessageDialog(null, saida);
}

 

public void controle() 
{ 
  int itemMenu;
  String menu = "\n***Menu de Controle***";
  menu += "\n1 Depositar\n2 Resumo da conta\n3 Sair\nitem:";
  
  
while ( true )
{   
   itemMenu = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
   
   switch ( itemMenu )
    {
        case 1: valor = Float.parseFloat( JOptionPane.showInputDialog(null, "Informe valor do depósito:"));
                saldo = saldo + valor;  // acumular/somar o deposito com saldo
                cont = cont + 1;        // contabilizar o depósito
                break;
                
        case 2: resumo();
                break;
        
        case 3: System.exit(0); 
                break;
    }
}}

 

    public static void main(String[] args) {
        Classe3 c3 = new Classe3();
        c3.controle();
    }
}