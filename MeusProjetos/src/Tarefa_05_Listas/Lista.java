/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_05_Listas;

import java.util.Arrays;

/**
 *
 * @author FO
 */
public class Lista {
    
    public Object L [] ;
    public int pos;
    
    public Lista (int tamanho) {
        
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
    //METODO DAD POSIÇÃO RETORNA CONTEUDO
    public Object retornaConteudo(int posicao){
            Object saida = "";
            for( int i=0; i<this.L.length;i++){
                if (i == posicao){
                    saida = this.L[i];
                }
            }
            return saida; 
    }
        
    // METODO ( >> EXTRA << )DADO UM NOME CONTEÚDO PROCURA NA LISTA SE ACHAR RETORNA O CONTEÚDO
    public Object acharConteudo(Object conteudo){
            Object saida= "";
            for(int i=0; i<this.L.length; i++){
                if(this.L[i] == conteudo){
                    saida = this.L[i];
                    System.out.println("O conteúdo "+saida+ " está na posição "+i);
                    break;
                } else{
                    saida = "Conteúdo "+conteudo+" \"Nâo\" encontrado na LIsta!!";
                }
            }
            return saida;
    }
    //METODO DADO O CONTEUDO VOLTA TRUE SE ACHA E FALSE SE NÃO ACHA
    public Object temConteudo_SN(Object conteudo){
            Object saida= "";
            for(int i=0; i<this.L.length; i++){
                if(this.L[i] == conteudo){
                    saida = "true";
                    //______System.out.println("Têm "+saida+ " na posição "+i);
                    break;
                } else{
                    saida = "false";
                }
            }
            return saida;
    }
    
    
    //TAMANHO ATUAL DA LISTA
    public Object tamLista(int cont){
       
            for ( int i=0; i<this.L.length;i++){
                 if(i >=0 && i < this.L.length){

                     cont = this.L.length;
                 }
             }
            return cont;
    }
    //RETORNA QUANTAS POSIÇÕES TEM OCUPADA NA LISTA
    public Object posiOcupaLista(int cont){
           
            for ( int i = 0; i< this.L.length; i++){
                   
                   if(this.L[i] != null){
                         cont++;
                   }
            }
            return cont;
    }
    //RETORNA QUANTAS POSIÇÕES TEM VAZIAS TEM NA LISTA
    public Object posiVaziaLista(int cont){
           
            for ( int i = 0; i< this.L.length; i++){
                   
                   if(this.L[i] == null){
                         cont++;
                   }
            }
            return cont;
    }
    
    
    public String imprimeLista () {
        return Arrays.toString(L);
    }
    
}
