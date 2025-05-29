package Tarefa_05;

import javax.swing.JOptionPane;

public class A_Tarefa_05 {

    public int n1, n2;

    public void leitura() {
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º número inteiro: ","Entrada de Dados",JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2º número inteiro: ","Entrada de Dados",JOptionPane.QUESTION_MESSAGE));
    }

    public void multi3e2() {
        String saida, saida2;   
        if( n1 % 3 == 0 && n2 % 3 == 0){
            saida = "Os números " + n1 +" e "+ n2 +" são mútiplos de 3.";
        } else if (n1 % 3 != 0 && n2 % 3 == 0){
            saida = "O número "+ n2 +" é mútiplo de 3 e o número "+ n1 +" não é múltiplo de 3.";
        } else if ( n1 % 3 == 0 && n2 % 3 != 0){
            saida = "O número "+ n1 +" é mútiplo de 3 e o número "+ n2 +" não é múltiplo de 3.";
        } else {
            saida = "Os números " + n1 +" e "+ n2 +" não são mútiplos de 3.";
        }
                
        if (n1 % 2 == 0 && n2 % 2 == 0) {
            saida2 = "Os números "+ n1 +" e "+ n2 +" são mútiplos de 2.";
        } else if (n1 % 2 != 0 && n2 % 2 == 0) {
            saida2 = "O número "+ n2 +" é mútiplo de 2 e o número "+ n1 +" não é múltiplo de 2.";
        } else if(n1 % 2 == 0 && n2 % 2 != 0){
            saida2 = "O número "+ n1 +" é mútiplo de 2 e o número "+ n2 +" não é múltiplo de 2.";
        } else{
            saida2 = "Os números "+ n1 +" e "+ n2 +" não são mútiplos de 2.";
        }
    
        String sai = "O 1º número informado foi: "+n1+"\nO 2º número informado foi: "+n2+"\n"+saida+"\n"+ saida2;
        JOptionPane.showMessageDialog(null,sai,"RESULTADO",1);
    }
    public void controle(){
        int item;
        String menu;
    do{
        menu = "1 Ler N1 e N2\n2 Exibir Resultado\n3 Sair\nItem: ";
        item = Integer.parseInt(JOptionPane.showInputDialog(null,menu,"Menu Principal",3));      
        switch(item){
            
            case 1: leitura(); break;
            case 2: multi3e2(); break;
            case 3: System.exit(0); break;       
        }    
    
    } while(true);
       
    }

    public static void main(String[] args) {

        A_Tarefa_05 objA= new A_Tarefa_05();

        objA.controle();

    }

}
