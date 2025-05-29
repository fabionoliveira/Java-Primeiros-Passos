package lp02_22_1_m_cadusuario_4;

public class Tab_Usuario_Diretoria extends Tab_Usuario_ADM{
    
     private String ds_SenhaDiretoria;
     private int    qtde_HorasLogada;

    public String getDs_SenhaDiretoria() {
        return ds_SenhaDiretoria;
    }

    public void setDs_SenhaDiretoria(String ds_SenhaDiretoria) {
        this.ds_SenhaDiretoria = ds_SenhaDiretoria;
    }

    public int getQtde_HorasLogada() {
        return qtde_HorasLogada;
    }

    public void setQtde_HorasLogada(int qtde_HorasLogada) {
        this.qtde_HorasLogada = qtde_HorasLogada;
    }
     
     
     public String isSenhaGeralValida ( ) {
        String Saida = "";
        if ((this.ds_SenhaGeral.length()!=12)){
            Saida = "Senha Geral INVÁLIDA. Deve ter 12 Caracteres";
        }
        return Saida;
    }
    
}
