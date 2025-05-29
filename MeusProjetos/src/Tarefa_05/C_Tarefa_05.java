
package Tarefa_05;

import javax.swing.JOptionPane;

public class C_Tarefa_05 {
    
    public double X, Y, Z, aux;
    public String msg;
    
    public void leitura() {
        
        X = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para X: ","Entrada para valor de X",1));
        Y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para Y: ","Entrada para valor de Y",1));
        Z = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para Z: ","Entrada para valor de Z",1));
        
        if ( X < Y){
            aux = X;
            X = Y;
            Y = aux;
            
        } if ( X < Z){
            aux = X;
            X = Z;
            Z = aux;
        } if ( Y < X){
            aux = Y;
            Y = X;
            X = aux;
            
        } if (Y < Z){
            aux = Y;
            Y = Z;
            Z = aux;        
        } if ( Z < X){
            aux = Z;
            Z = X;
            X = aux;        
        } if ( Z < Y){
            aux = Z;
            Z = Y;
            Y = aux;       
        }          
    }
    
    public void exibir() {
        JOptionPane.showMessageDialog(null,"Valores X, Y e Z na ordem crescente "+ X +", "+ Y+", "+ Z);
         
    }
    public void controle() {
        int item;
        String menu;
        
        do{
            menu = "1 Ler X, Y e Z\n2 Exibir Resultado\n3 Sair\nItem: ";
            item = Integer.parseInt(JOptionPane.showInputDialog(null, menu,"Menu Principal",3));
            
            switch(item) {
                case 1: leitura(); break;
                case 2: exibir(); break;
                case 3: System.exit(0);break;            
            }
                
        }while(true);  
    
    }
    public static void main(String[] argas) {
        C_Tarefa_05 objC = new C_Tarefa_05();
        
        objC.controle();    
    }

}//fim clase
