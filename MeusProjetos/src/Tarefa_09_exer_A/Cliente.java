/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_09_exer_A;

public class Cliente extends Object
{ 
    public String tipo ;// Pessoa ou Empresa
    public String telefone;

 

    Cliente () {}
    
    Cliente ( String tp ) 
    {
       tipo = tp; 
    }

 

public void exibir()
{
  System.out.println( "\nTipo:" + tipo + "\nTelefone:" + telefone); 
}

 

}