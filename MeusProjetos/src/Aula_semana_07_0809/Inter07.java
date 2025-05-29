

/*
Faça uma classe que leia o valor uma
dívida e dias de atraso, calcule o valor a pagar atualizado
adicionando 1% de juros ao mês + 2% de multa sobre o
valor da dívida.

 

Diagrama de Classes  ( métodos não void e void)

 

Inter7.java
---------------------
vlDivida    double   // valor da dívida que será lido
qtdeDias    int      // ler a qtde de dias
txJurosDia  double   // definir no inicio 1/100/30 
txMulta     double   // definir no inicio 2/100

 

---------------------
ler ( divida, dias )  void  //  método de leitura
get_VlJurosDia()      double // armazena o Juros Diário
get_vlMulta()         double // armazena a multa
get_vlPagar( vlJurosDia, vlMulta )         double // armazena o valor a pagar
mostrar ( vlJurosDia, vlMulta, vlPagar ) void   // mostrar os resultados
controle()            void   // conterá o menu

 

*/

 

package Aula_semana_07_0809;

 

import javax.swing.JOptionPane;

 

public class Inter07 
{
    public double vlDivida;
    public int    qtdeDias;
    public final double txJurosDia = 0.00033;
    public final double txMulta = 0.02;
    
    
    public void ler ( double divida, int dias )
    {
        vlDivida = divida;
        qtdeDias = dias; 
    }
    
    public double get_VlJurosDia()
    {
         double valorJurosdiario;
         valorJurosdiario = qtdeDias * vlDivida * txJurosDia;
         
         return valorJurosdiario; // armazena no método    
    }
    
    public double get_vlMulta() 
    {
       double valormulta;
       valormulta = txMulta * vlDivida;
       return valormulta;
    }
    
    public double get_vlPagar( double vlJurosDia, double vlMulta )  
    {
       double valorpagar;
       valorpagar = vlJurosDia + vlMulta + vlDivida;
       
       return valorpagar;
    }
    
    
    public void mostrar( double vlJurosDia, double vlMulta, double vlPagar ) 
    {
        String linhasSaida;
        linhasSaida=   "\n*** Tela de Saída ***";
        
        linhasSaida += "\nValor Divida: " + vlDivida;
        linhasSaida += "\nDias atraso.:" + qtdeDias; 
        
        linhasSaida += "\nTx de juros.:" + String.format("%.5f", txJurosDia );
        linhasSaida += "\nvalor Juros.:" + vlJurosDia;
        
        linhasSaida += "\nTx de Multa.:" + txMulta; 
        linhasSaida += "\nvalor Multa.:" + vlMulta; 
        
        linhasSaida += "\nvalor Pagar.:" + vlPagar; 
        
        linhasSaida += "\n*** Fim do relatório de saída ***"; 
        
        JOptionPane.showMessageDialog(null, linhasSaida);
    }
    
   public void controle()
   {
       String menu;
       int itemMenu;
       menu = "\n*** Menu de Controle ***";
       menu += "\n1 Ler valor da dívida e dias em atraso";
       menu += "\n2 Mostrar relatório com valor a pagar";
       menu += "\n3 Finalizar programa\nitemMenu:";
       
       // while do menu
       while ( true) 
       {
          itemMenu = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
          
          switch ( itemMenu )
          {
              case 1: double divida = 
                      Double.parseDouble ( 
                      JOptionPane.showInputDialog(null, "Digite valor da dívida:"));
              
                      int dias = 
                      Integer.parseInt ( 
                      JOptionPane.showInputDialog(null, "Digite os dias em atraso:"));
                   
                      ler( divida, dias );
                       break;
                      
              case 2: double juros = get_VlJurosDia();
                      double multa = get_vlMulta();
                      double valorPagar = get_vlPagar ( juros, multa );  
                      mostrar ( juros, multa, valorPagar ) ;

 

                  
                       break;
              
              case 3: System.exit(0); break;
          }
       }
     }
   
    public static void main(String[] args) 
    {
    
        Inter07 i1 = new Inter07();
        i1.controle();
      
    }
}
 









