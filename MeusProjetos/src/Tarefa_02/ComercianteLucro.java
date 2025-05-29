    
package Tarefa_02;

import javax.swing.JOptionPane;
public class ComercianteLucro 
{//ATRIBUTOS
    
    public String vlproduto = "0";
    public double vlvenda = 0d;
    
    //MÉTODOS
    public void leitura()
    {
        vlproduto = JOptionPane.showInputDialog(null,"Qual o valor do Produto R$","Valor Produto",JOptionPane.PLAIN_MESSAGE);
    }
    
    public void calculo()
    { double vlp = Double.parseDouble(vlproduto);
      
        if (vlp <= 20)
        {vlvenda =(vlp + (vlp * 0.45));}
        else if (vlp > 20)
        {vlvenda = (vlp + (vlp * 0.30));}
    }
    
    public void exibir()
    { //double vlvenda = Double.parseDouble(vv);
      JOptionPane.showMessageDialog(null,"Valor para Venda é R$"+ vlvenda);
        
    }
            
    public static void main(String[] args)
    { ComercianteLucro obj1 = new ComercianteLucro();
        JOptionPane.showMessageDialog ( null, "*** Calcular Valor de Venda + Lucro double***");
            
        obj1.leitura();
        obj1.calculo();
        obj1.exibir();
        System.exit(0);
    }
}