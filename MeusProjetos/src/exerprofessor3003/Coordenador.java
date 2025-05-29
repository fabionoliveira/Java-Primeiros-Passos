/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerprofessor3003;

/**
 *
 * @author FO
 */
public class Coordenador extends Professor1{
    
    private int qtde_HorasCoord; 
    
    
    
    public int getQtde_HorasCoord() {
        return qtde_HorasCoord;
    }

    public void setQtde_HorasCoord(int qtde_HorasCoord) {
        this.qtde_HorasCoord = qtde_HorasCoord;
    }
    
       
    public double CalculaSalario(){
        double salario = this.vlr_horaaula * 220 * 1.1; 
        
        return salario;       
    
    }
    
    public double CalculaSalario(double bonus){
        double salario = this.vlr_horaaula * 220 * 1.1 + bonus; 
        
        return salario;       
        
    }
    
}

