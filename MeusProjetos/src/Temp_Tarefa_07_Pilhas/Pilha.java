package Temp_Tarefa_07_Pilhas;

import java.util.Arrays;

public class Pilha {

    public Object Pilha [];
       
    public int    posPilha;
    
    public Pilha (int tamanho) {
        this.Pilha = new Object [tamanho];
        this.posPilha = -1;        
    }
    
    public void maisEspaço () {
        Object temp[]  = new Object [this.Pilha.length*2];
        for(int i=0;i<this.Pilha.length;i++)  {
            temp[i] = this.Pilha[i];
        }
        this.Pilha = temp;
    }
    
    public void Push (Object valor) {
        if(this.posPilha==this.Pilha.length-1) {
            maisEspaço ();
        }
        this.posPilha++;
        this.Pilha[this.posPilha] = valor;
    }
    
    public Object Pop () {
        Object saida = null;
        if(this.posPilha!=-1) {
            
            saida = this.Pilha[this.posPilha];
            this.Pilha[this.posPilha] = null;
            this.posPilha--;
            
        }
        return saida;
    }
    
    
    public Object Peek () {
        Object saida = null;
        if(this.posPilha!=-1) {
            saida = this.Pilha[this.posPilha];
        }
        return saida;
    }
    
    public String imprimePilha () {
        return Arrays.toString(Pilha);
    }
    
    
    
}