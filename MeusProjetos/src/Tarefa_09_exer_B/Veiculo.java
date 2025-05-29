/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_09_exer_B;

/**
 *
 * @author FO
 */
public class Veiculo extends Object{
    
    public String Marca;
    public String Modelo;
    public int Ano;
    
    
    Veiculo(){
       
    } 
    public void Cadastrar(String Marca, String Modelo, int Ano){
        
            
    }
    public void Exibir(){
        
        System.out.println("\nMarca.........: " + Marca + ""
                         + "\nModelo........: "+ Modelo +""
                         + "\nAno Fabricação: "+ Ano);
    }
}
