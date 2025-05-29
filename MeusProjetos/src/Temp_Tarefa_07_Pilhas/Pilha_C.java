package Temp_Tarefa_07_Pilhas;

import java.util.Arrays;

public class Pilha_C{

    public Object[] Pilha_C;
       
    public int    posPC;
    
    public Pilha_C (int tamanho) {
        this.Pilha_C = new Object [tamanho];
        this.posPC = -1;        
    }
    
    public void maisEspaço () {
        Object temp[]  = new Object [this.Pilha_C.length*2];
        for(int i=0;i<this.Pilha_C.length;i++)  {
            temp[i] = this.Pilha_C[i];
        }
        this.Pilha_C = temp;
    }
    
    public void Push (Object valor) {
        if(this.posPC==this.Pilha_C.length-1) {
            maisEspaço ();
        }
        this.posPC++;
        this.Pilha_C[this.posPC] = valor;
    }
    
    public Object Pop () {
        Object saida = null;
        if(this.posPC!=-1) {
            
            saida = this.Pilha_C[this.posPC];
            this.Pilha_C[this.posPC] = null;
            this.posPC--;
            
        }
        return saida;
    }
    
    
    public Object Peek () {
        Object saida = null;
        if(this.posPC!=-1) {
            saida = this.Pilha_C[this.posPC];
        }
        return saida;
    }
    
    public String imprimePilha () {
        return Arrays.toString(Pilha_C);
    }
    
    
    
}