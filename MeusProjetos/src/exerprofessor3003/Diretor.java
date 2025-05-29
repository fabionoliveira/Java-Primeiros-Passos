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
public class Diretor extends Professor1{
    
    private int nr_anoInicioMandato;
    private int nr_anoFimMandato;

    public int getNr_anoInicioMandato() {
        return nr_anoInicioMandato;
    }

    public void setNr_anoInicioMandato(int nr_anoInicioMandato) {
        this.nr_anoInicioMandato = nr_anoInicioMandato;
    }

    public int getNr_anoFimMandato() {
        return nr_anoFimMandato;
    }

    public void setNr_anoFimMandato(int nr_anoFimMandato) {
        this.nr_anoFimMandato = nr_anoFimMandato;
    }
    
    public double CalculaSalario(){
        double salario = this.vlr_horaaula * 220 * 1.3; 
        
        return salario;       
        
    }
    public double CalculaSalario(double bonus){
        double salario = this.vlr_horaaula * 220 * 1.3 + bonus; 
        
        return salario;       
        
    }
    
}
