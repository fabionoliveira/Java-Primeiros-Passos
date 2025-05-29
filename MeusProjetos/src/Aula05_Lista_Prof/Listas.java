
package Aula05_Lista_Prof;

import java.util.Arrays;

public class Listas {
    
    public Object L [] ;
    public int pos;
    
    public Listas (int tamanho) {
        
        L    = new Object [tamanho];
        pos  = 0;
    }

    private void maisEspaco () {
    
        Object temp [] = new Object [this.L.length*2];
        
        for(int i=0;i<this.L.length;i++) {
            temp[i] = this.L[i];
        }
        
        this.L = temp;
    }
    
    public void addElementoPosLivre (Object Valor) {
        
        for(int i=0;i<this.L.length;i++) {
            if(this.L[i]==null) {
                this.L[i]=Valor;
                break;
            }
        }
    } 
    
    public void addElemento (Object valor) {
        
        if(this.pos>=this.L.length) {
            maisEspaco();
        }
        this.L[pos] = valor;
        pos++;
        
    }
    
    
    public Object delElemento (int posicao) {
            Object saida = "";
            if(posicao<this.L.length) {
            
                saida = this.L[posicao];
                this.L[posicao] = null;// APAGA O VALOR DA POSIÇÃO
            }
            
            return saida;
    }
    
    
    public String imprimeLista () {
        return Arrays.toString(L);
    }
    

}
