/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author FO
 */
public class Departamento {

    private int cod_Departamento;
    private String ds_Departamento;
    private String abr_Departamento;

    public int getCod_Departamento() {
        return cod_Departamento;
    }

    public void setCod_Departamento(int cod_Departamento) {
        this.cod_Departamento = cod_Departamento;
    }

    public String getDs_Departamento() {
        return ds_Departamento;
    }

    public void setDs_Departamento(String ds_Departamento) {
        this.ds_Departamento = ds_Departamento;
    }

    public String getAbr_Departamento() {
        return abr_Departamento;
    }

    public void setAbr_Departamento(String abr_Departamento) {
        this.abr_Departamento = abr_Departamento;
    }

    public String is_ds_DepartamentoValido(String ds) {
        String saida = "";

        if ((ds.length() < 5) || (ds.length() > 30)) {
            saida = "Descrição do Departamento deve ter entre 5 e 30 caracteres.";
        }
        return saida;
    }

    public String is_abr_DepartamentoValido(String abr) {
        String saida = "";

        if ((abr.length() == 0) || (abr.length() > 5)) {
            saida = "A Abreviatura do Departamento deve ter no máximo 5 caracteres.";
        }
        return saida;
    }

}
