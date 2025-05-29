/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_09_exer_A;


public class Empresa extends Cliente
{

  public String rua;
 
  Empresa()
  {
      super(); // construtor da classe mãe vazio
  } // construtor vazio
 

  Empresa ( String tp, String rua )
 {
   super ( tp ); // chama o construtor da classe mãe com parâmetros
  
   this.rua = rua;
 }

}
