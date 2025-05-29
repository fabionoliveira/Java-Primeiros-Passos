
package Tarefa_02;

import javax.swing.JOptionPane;
public class ComercianteLucroFloat 
{//ATRIBUTOS
    public String vlproduto="0",vlp="0", msg, titulo;
    public float vlvenda = 0f;
    //MÉTODOS
    public void leitura()
    {  msg = "Qual o valor do Produto R$";
       titulo = "Valor Produto";
       vlproduto = JOptionPane.showInputDialog(null,msg,titulo,JOptionPane.QUESTION_MESSAGE);
    }
    
    public void calculo()
    {  float vlp = Float.parseFloat(vlproduto);
       if (vlp <= 20)
       {vlvenda =(vlp + (vlp * 0.45f));}
       else if (vlp > 20)
       {vlvenda = (vlp + (vlp * 0.30f));}
    }
    
    public void exibir()
    {  msg = "Valor para Venda será R$"+ vlvenda;
       titulo ="Novo Valor";
       JOptionPane.showMessageDialog(null,msg,titulo,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args)
    { ComercianteLucroFloat obj1 = new ComercianteLucroFloat();
        String msg = "Calcular Valor de Venda + Lucro";
        String titulo = ">>Programa<<";
        JOptionPane.showMessageDialog ( null,msg,titulo,JOptionPane.PLAIN_MESSAGE);
            
        obj1.leitura();
        obj1.calculo();
        obj1.exibir();
        System.exit(0);
    }
}