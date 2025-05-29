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
public class Tab_Qualificacao extends Tab_Cargo{
    
    private int cod_Qualificacao;
    private String ds_Qualificacao;

    @Override
    public String getDs_cargo() {
        return ds_cargo;
    }

    
    @Override
    public void setDs_cargo(String ds_cargo) {
        this.ds_cargo = ds_cargo;
    }

    public int getCod_Qualificacao() {
        return cod_Qualificacao;
    }

    public void setCod_Qualificacao(int cod_Qualificacao) {
        this.cod_Qualificacao = cod_Qualificacao;
    }

    public String getDs_Qualificacao() {
        return ds_Qualificacao;
    }

    public void setDs_Qualificacao(String ds_Qualificacao) {
        this.ds_Qualificacao = ds_Qualificacao;
    }
    
}
