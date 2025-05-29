/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeste;

/**
 *
 * @author FO
 */
import java.util.ArrayList;
public class ListaArrayList {

public static void main(String[] args) {
  // Criar um novo ArrayList de Strings com capacidade inicial de 10 elementos (padrão)
  ArrayList<String> frutas = new ArrayList<>();

  frutas.add("Maçã"); // Adicionar um item à lista
  frutas.add(0, "Uva"); // Inserir a fruta Uva na posição de índice 0
  System.out.println("Mostrar o conteúdo do ArrayList usando laço for convencional:");

  for (int i = 0; i < frutas.size(); i++)
    System.out.printf(" %s\n", frutas.get(i));
 /*
  // Mostrar as frutas com o método mostrar(). Passamos a lista e um frase-cabeçalho
  mostrar(frutas,"%nMostrando a lista de frutas com o método mostrar:");

  frutas.add("Tangerina"); // Adicionar tangerina ao final da lista
  frutas.add("Morango"); // Idem com Morango
  mostrar(frutas, "Nova visualização da lista após adicionar frutas:");

  frutas.remove("Uva"); // remover a fruta Uva"
  mostrar(frutas, "Nova visualização da lista após remover frutas:");

  frutas.remove(1); // Remover item na posição de índice 1
  mostrar(frutas, "Remover o segundo elemento da lista (índice 1):");

  // Verificar número de elementos na lista
  System.out.printf("Tamanho atual do ArrayList: %s itens%n", frutas.size());

  // Verificar se um item existe na lista
  System.out.printf("A fruta \"Tangerina\" %sestá na lista%n", frutas.contains("Tangerina") ? "": "não ");
    */
}

// criar método para mostrar os elementos do ArrayList frutas
public static void mostrar(ArrayList<String> frutas, String cabecalho) {
  System.out.printf(cabecalho); // mostrar cabeçalho

  for (String item : frutas)
    System.out.printf(" %s", item);
    System.out.println();
  }
}
