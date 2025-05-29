
package Objetos;

import java.util.Date;

public class Usuario {

    private int    Codigo;
    private String Nome;
    private Date   DataNasc;
    private int    cd_Genero;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Date DataNasc) {
        this.DataNasc = DataNasc;
    }

    public int getCd_Genero() {
        return cd_Genero;
    }

    public void setCd_Genero(int cd_Genero) {
        this.cd_Genero = cd_Genero;
    }
   
    
    
}
