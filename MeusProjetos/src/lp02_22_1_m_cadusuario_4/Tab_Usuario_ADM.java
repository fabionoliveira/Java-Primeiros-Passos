package lp02_22_1_m_cadusuario_4;

public class Tab_Usuario_ADM extends Tab_Usuario{
    
    private String ds_SenhaSistema;
    private String ds_SenhaSuperUsr;
    private int    qtde_HoraExtra;

    public String getDs_SenhaSistema() {
        return ds_SenhaSistema;
    }

    public void setDs_SenhaSistema(String ds_SenhaSistema) {
        this.ds_SenhaSistema = ds_SenhaSistema;
    }

    public String getDs_SenhaSuperUsr() {
        return ds_SenhaSuperUsr;
    }

    public void setDs_SenhaSuperUsr(String ds_SenhaSuperUsr) {
        this.ds_SenhaSuperUsr = ds_SenhaSuperUsr;
    }

    public int getQtde_HoraExtra() {
        return qtde_HoraExtra;
    }

    public void setQtde_HoraExtra(int qtde_HoraExtra) {
        this.qtde_HoraExtra = qtde_HoraExtra;
    }

    public String isSenhaGeralValida (int parametro ) {
        String Saida = "";
        if ((this.ds_SenhaGeral.length()!=11)){
            Saida = "Senha Geral INVÁLIDA. Deve ter 11 Caracteres";
        }
        return Saida;
    }
     public String isSenhaGeralValida ( ) {
        String Saida = "";
        if ((this.ds_SenhaGeral.length()!=10)){
            Saida = "Senha Geral INVÁLIDA. Deve ter 10 Caracteres";
        }
        return Saida;
    }
}
