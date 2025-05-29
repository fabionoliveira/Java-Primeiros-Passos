
package Tarefa_02;

import javax.swing.JOptionPane;

public class ValorPlanoSaude
{//ATRIBUTOS    
    public String nome,idade, msg;
    public double vlplano = 0.0d;
    
    //MÉTODOS
    public void leitura()
    {   msg = "Qual seu Nome?";
        nome = JOptionPane.showInputDialog(null,msg,"Nome",JOptionPane.QUESTION_MESSAGE);
        msg = "Qual sua idade?";
        idade = JOptionPane.showInputDialog(null,msg,"Idade",JOptionPane.QUESTION_MESSAGE);
        
        int ida = Integer.parseInt(idade);
               
        if (ida <= 0)
        { msg = "Idade Invalida!!!\nO programa será fechado."; 
         JOptionPane.showMessageDialog(null,msg,"ERRO!!!",JOptionPane.ERROR_MESSAGE);
         System.exit(0);
        }
        else if (ida >= 1 && ida <= 10)
            {vlplano = 30d;}
        else if (ida > 10 && ida <=29 )
            {vlplano = 60d;}
        else if (ida > 29 && ida <= 45)
            {vlplano = 120d;}
        else if (ida > 45 && ida <= 59)
            {vlplano = 150d;}
        else if (ida > 59 && ida <= 65)
            {vlplano = 250d;}
        else if (ida > 65)
            {vlplano = 400d;}
            
    // Até 10 anos – R$ 30,00       
    // Acima de 10 até 29 anos – R$ 60,00
    // Acima de 29 até 45 anos – R$ 120,00
    // Acima de 45 até 59 anos – R$ 150,00
    // Acima de 59 até 65 anos – R$ 250,00
    // Maior que 65 anos – R$ 400,00

    }
    public void exibir()
    { msg = "O valor de seu plano é R$"+ vlplano;
      JOptionPane.showMessageDialog(null,msg,"Valor por Idade.",1);
    
    }
        
    //MÉTODO PRINCIPAL
    public static void main(String [] args)
    {
        ValorPlanoSaude vl1 = new ValorPlanoSaude();
        
        vl1.leitura();
        vl1.exibir();
        System.exit(0);               
                
    }
}
