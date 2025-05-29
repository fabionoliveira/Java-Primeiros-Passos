package Objetos;

public class Genero {

    private int    cd_genero;
    private String ds_genero; 
    private String abr_Genero;

    public int getCd_genero() {
        return cd_genero;
    }

    public void setCd_genero(int cd_genero) {
        this.cd_genero = cd_genero;
    }

    public String getDs_genero() {
        return ds_genero;
    }

    public void setDs_genero(String ds_genero) {
        this.ds_genero = ds_genero;
    }

    public String getAbr_Genero() {
        return abr_Genero;
    }

    public void setAbr_Genero(String abr_Genero) {
        this.abr_Genero = abr_Genero;
    }
    
    public String is_ds_GeneroValido ( String ds) {
        String saida="";
        
        if((ds.length()<5)||(ds.length()>30)) {
            saida="Descrição do Genero deve ter entre 5 e 30 caracteres.";
        }
        return saida;
    }
    
    public String is_abr_GeneroValido ( String abr) {
        String saida="";
        
        if((abr.length()==0)||(abr.length()>5)) {
            saida="A Abreviatura do Genero deve ter no máximo 5 caracteres.";
        }
        return saida;
    }
    
    
}
