/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_05_Listas;

/**
 *
 * @author FO
 */
public class Listas_Tarefa05 {
    public static void main(String[] args) {
        int cont=0;
        
        Lista myLi = new Lista (4);
        
        
        myLi.addElemento("manga");
        myLi.addElemento(239);
        myLi.addElemento("Leopardo");
        myLi.addElemento(54.7);
        myLi.addElemento("@");
        myLi.addElemento("Azul");
        myLi.addElemento(false);
        myLi.addElemento("45");
        myLi.addElemento("TV");
        myLi.addElemento("celular");
        myLi.addElemento(true);
        myLi.addElemento(78);
        
        System.out.println("Imprimir Lista: \n"+ myLi.imprimeLista());
        System.out.println();
        System.out.println(">> EXTRA << Acha conteúdo: \"DiNoSauRo\" \n"+ myLi.acharConteudo("DiNoSauRo"));
        System.out.println();
        System.out.println("AQUI EU addElemento >> DiNoSauRo << lISTA ABAIXO. \n");
        myLi.addElemento("DiNoSauRo");
        System.out.println("Imprimir Lista: \n"+ myLi.imprimeLista());
        System.out.println();
        System.out.println("O que tem na posição (7)? \n");
        System.out.println("Conteúdo retornado na posição (7) é: "+ myLi.retornaConteudo(7));
        System.out.println();
        System.out.println("Imprimir Lista: \n"+ myLi.imprimeLista());
        System.out.println();
        System.out.println(">> EXTRA << Acha conteúdo POR NOME: \n"+ myLi.acharConteudo("DiNoSauRo"));
        System.out.println();
        System.out.println("Tamanho Atual da lista: "+ myLi.tamLista(cont));
        System.out.println();
        System.out.println("Qtd. Posição ocupada: " + myLi.posiOcupaLista(cont));
        
        System.out.println();
        System.out.println("Qtd. Posição vazia: "+ myLi.posiVaziaLista(cont));
        
        System.out.println();
        System.out.println("Tem conteúdo S ou N: "+ myLi.temConteudo_SN("manga"));
        System.out.println();
        System.out.println("Tem conteúdo S ou N: "+ myLi.temConteudo_SN("ABACAXI"));
        System.out.println();
        System.out.println("AQUI DELETO CONTEÚDO NA POSIÇÃO (2):");
        System.out.println(myLi.delElemento(2));
        System.out.println();
        System.out.println("Imprimir Lista: \n"+ myLi.imprimeLista());
        System.out.println();
        System.out.println("================================");
        
        
        
    }

}
