/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_09_2209;
public class Principal
{
   
public static void main (String [] args)
{
  // Usando o construtor vazio da classe filha
  // para acessar tudo o que tem na mãe e na filha
  // 1 exemplo
    Empresa e1 = new Empresa(); // construtor
    // Tenho acesso a tudo que tem na filha e na mãe
   
    e1.tipo = "Empresa";
    e1.telefone = "11-9995-8852";
    e1.rua = "Rua do Bairro";
   
    String saida;
    saida = "\nTipo:" + e1.tipo;
    saida += "\nTelfone:" + e1.telefone;
    saida += "\nrua:" + e1.rua;
    System.out.println(saida);
   
   
   
    // 2 objeto e2 usando o construtor com parametros
    Empresa e2 = new Empresa ( "Empresa", "Rua da Cidade" );
   
    e2.telefone = "35-5522-6688";
   
    saida = "\nTipo:" + e2.tipo;
    saida += "\nTelfone:" + e2.telefone;
    saida += "\nrua:" + e2.rua;
    System.out.println(saida);
   
   
   
  System.exit(0);
}
   
}