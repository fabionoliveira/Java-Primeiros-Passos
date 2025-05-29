package Objetos;

public class Nacionalidade {


    private int     cd_Nacionalidade;
    private String  ds_Nacionalidade;
    private String  abr_Nacionalidade;

    public int getCd_Nacionalidade() {
        return cd_Nacionalidade;
    }

    public void setCd_Nacionalidade(int cd_Nacionalidade) {
        this.cd_Nacionalidade = cd_Nacionalidade;
    }

    public String getDs_Nacionalidade() {
        return ds_Nacionalidade;
    }

    public void setDs_Nacionalidade(String ds_Nacionalidade) {
        this.ds_Nacionalidade = ds_Nacionalidade;
    }

    public String getAbr_Nacionalidade() {
        return abr_Nacionalidade;
    }

    public void setAbr_Nacionalidade(String abr_Nacionalidade) {
        this.abr_Nacionalidade = abr_Nacionalidade;
    }
    
     public String is_ds_NacionalidadeValido ( String ds) {
        String saida="";
        
        if((ds.length()<5)||(ds.length()>30)) {
            saida="Descrição do Nacionalidade deve ter entre 5 e 30 caracteres.";
        }
        return saida;
    }
    
    public String is_abr_NacionalidadeValido ( String abr) {
        String saida="";
        
        if((abr.length()==0)||(abr.length()>5)) {
            saida="A Abreviatura do Nacionalidade deve ter no máximo 5 caracteres.";
        }
        return saida;
    }
    
}

