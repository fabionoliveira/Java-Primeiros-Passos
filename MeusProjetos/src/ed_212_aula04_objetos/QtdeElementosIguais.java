
package ed_212_aula04_objetos;

import javax.swing.JOptionPane;

public class QtdeElementosIguais {
    
    public int[] Valores;
    public int x = 77;
        
    public QtdeElementosIguais (int parametro[], int x){
        
        Valores = parametro;
    }
    
    public int NumIguais(){
        
        int saida=0;
        //x = Integer.parseInt(JOptionPane.showInternalInputDialog(null,"Digite um valor para pesquisar","Valor X",JOptionPane.QUESTION_MESSAGE));
        
        for (int i=0; i<Valores.length;i++) {
            
            if(Valores[i]== x){
                saida++;
            }
        }
        
        return saida;
       }
    
 }// fim classe