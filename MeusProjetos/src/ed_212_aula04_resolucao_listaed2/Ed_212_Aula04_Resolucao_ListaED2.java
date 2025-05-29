
package ed_212_aula04_resolucao_listaed2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/*
Exercício 1: Crie um método que recebe um array de inteiros e retorna 
a quantidade de elementos do array que são números negativos. 

Exercício 2: Crie um método que recebe um array de inteiros a e um valor 
inteiro x e retorna a quantidade de vezes que x aparece no array a. 

Exercício 3: Escreva um método que recebe um array de inteiros a e 
devolve um array de boolean onde, cada posição indique true se o 
elemento da posição correspondente de a é positivo e false caso seja negativo ou zero.

{1,-1,5,-5,8,-9} >> { true,false,true,false,true,false}

Exercício 4: Escreva um método que recebe um array de números e devolve 
a posição onde se encontra o maior valor do array. 
Se houver mais de um valor maior, devolver a posição da primeira ocorrência. 

{100,5,6,330,90,4,100} >>> 330 4



Exercício 5: Crie um método que recebe um array de inteiros  e 
substitui seus elementos de valor ímpar por -1 e os pares por +1

*/

public class Ed_212_Aula04_Resolucao_ListaED2 {

    
    public static void main(String[] args) {
        
        int Valores [] = {10,100,-1,2,33,34,35,6,37,8,10,33,-10,-9,100,-11,-12,0,10,10,10}; 
        int Valores2 [] = {1,-2,3,-4,5,-6,7,-8}; 
        int e02 = 33;
        
        JOptionPane.showMessageDialog(null, Exercicio01(Valores), "Qtde de Negativos", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, Exercicio02(Valores,e02), "Qtde de elementos iguais a "+e02, JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, Exercicio02v02(Valores,e02), "Qtde de elementos iguais a "+e02, JOptionPane.INFORMATION_MESSAGE);
           
        JOptionPane.showMessageDialog(null, Arrays.toString(Exercicio03(Valores2)), "Array Remodelada", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, Exercicio04(Valores), "Maior valor e posição", JOptionPane.INFORMATION_MESSAGE);
    
        
        JOptionPane.showMessageDialog(null, Arrays.toString(Exercicio05(Valores2)), "Array Remodelada Exec05", JOptionPane.INFORMATION_MESSAGE);
    } /// final do main
    
    
    public static int [] Exercicio05 (int [] parametro) {
        
        for  (int i=0;i<parametro.length;i++) {
            if(parametro[i]%2==0){
                parametro[i]=1;
            } else {
                parametro[i]=-1;
            }
        }
        
        return parametro;
    }
    
    
    public static String Exercicio04 (int [] parametro) {
        String saida="";
        int Maior=parametro[0],posicao=0;
        
        for (int i=0;i<parametro.length;i++) {
            
            if(parametro[i]>Maior) {
                
                Maior = parametro[i];
                posicao = i;
            }
            
        }
        
        saida = "O maior valor é "+Maior+"\nSua posição é "+posicao;
        
        
        return saida;
    }
    
    public static boolean []  Exercicio03 (int [] parametro) {    
        
        boolean saida [] = new boolean [parametro.length];
        
        for(int i=0; i<parametro.length;i++) {
        
            if(parametro[i]>=0) {
                saida[i]=true;
            } else {
                saida[i]=false;
            }
        }
        
        return saida;
    }
    
    
    public static int  Exercicio02 (int [] parametro, int x)  {
        int saida=0;
        
        for (int i=0; i<parametro.length;i++) {
            
            if(parametro[i]==x){
                saida++;
            }
        }
        
        return saida;
    }
    
    public static int  Exercicio02v02 (int [] parametro, int x)  {
        int saida=0;
        int i = 0;
        
        while(i<parametro.length) {
             
            if(parametro[i]==x){
                saida++;
            } 
           i++;
        }
        
     
        return saida;
    }
    
    
    public static int Exercicio01 (int [] parametro) {
       int saida=0;
       
       for(int i=0; i<parametro.length;i++) {
           
           if(parametro[i]<0) {
               saida++; // saida=saida+1;
           }
       }
       
       return saida; 
    }
    
    
    
    
} ////////////////////////////////////////////////////////// fim classe
