/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_funcionario_2022.pkg;

/**
 *
 * @author FO
 */
public class Tab_Cargo extends Tab_Funcionario{
    
    private int cod_cargo;
    private String nm_cargo;
    protected String ds_cargo;
    private double salario_cargo;

    public int getCod_cargo() {
        return cod_cargo;
    }

    public void setCod_cargo(int cod_cargo) {
        this.cod_cargo = cod_cargo;
    }

    public String getNm_cargo() {
        return nm_cargo;
    }

    public void setNm_cargo(String nm_cargo) {
        this.nm_cargo = nm_cargo;
    }

    public String getDs_cargo() {
        return ds_cargo;
    }

    public void setDs_cargo(String ds_cargo) {
        this.ds_cargo = ds_cargo;
    }

    public double getSalario_cargo() {
        return salario_cargo;
    }

    public void setSalario_cargo(double salario_cargo) {
        this.salario_cargo = salario_cargo;
    }
       
}
