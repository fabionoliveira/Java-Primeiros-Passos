/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp_Tarefa_07_Pilhas;

import java.util.Arrays;

/**
 *
 * @author FO
 */
public class Pilha_Y {
    public Object[] Pilha_Y;
       
    public int    posPY;
    
    public Pilha_Y (int tamanho) {
        this.Pilha_Y = new Object [tamanho];
        this.posPY = -1;        
    }
    
    public void maisEspaço () {
        Object temp[]  = new Object [this.Pilha_Y.length*2];
        for(int i=0;i<this.Pilha_Y.length;i++)  {
            temp[i] = this.Pilha_Y[i];
        }
        this.Pilha_Y = temp;
    }
    
    public void Push (Object valor) {
        if(this.posPY==this.Pilha_Y.length-1) {
            maisEspaço ();
        }
        this.posPY++;
        this.Pilha_Y[this.posPY] = valor;
    }
    
    public Object Pop () {
        Object saida = null;
        if(this.posPY!=-1) {
            
            saida = this.Pilha_Y[this.posPY];
            this.Pilha_Y[this.posPY] = null;
            this.posPY--;
            
        }
        return saida;
    }
    
    
    public Object Peek () {
        Object saida = null;
        if(this.posPY!=-1) {
            saida = this.Pilha_Y[this.posPY];
        }
        return saida;
    }
    
    public String imprimePilha () {
        return Arrays.toString(Pilha_Y);
    }
    
}
