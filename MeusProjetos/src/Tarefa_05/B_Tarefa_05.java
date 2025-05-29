
package Tarefa_05;

import javax.swing.JOptionPane;

public class B_Tarefa_05 {
    public int ano;
    public String msg;
    
    public void leitura() {
        
        ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um ano com 4 digitos: ","Entrada de Dados",1));
    }
    
    public void exibir() {
        if ( ano % 4 ==0) {
            msg = "O ano "+ano+" é Bissexto.";
        } else {
            msg = "O ano "+ ano+" não é Bissexto.";
        }
        JOptionPane.showMessageDialog(null, msg,"Resultado Ano Digitado",1);
    }
    
    public void controle() {
        int item;
        String menu;
        
        do{
            menu = "1 Ler Ano\n2 Exibir Resultado\n3 Sair\nItem: ";
            item = Integer.parseInt(JOptionPane.showInputDialog(null, menu,"Menu Principal",3));
            
            switch(item) {
                case 1: leitura(); break;
                case 2: exibir(); break;
                case 3: System.exit(0);break;            
            }
                
        }while(true);  
    
    }
    public static void main(String[] args) {
    
        B_Tarefa_05 objB = new B_Tarefa_05();
        
        objB.controle();   
    }

}//fim classe
