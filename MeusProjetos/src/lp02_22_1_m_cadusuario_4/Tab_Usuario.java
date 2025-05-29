package lp02_22_1_m_cadusuario_4;

public class Tab_Usuario {

    private   int      id_usuario;
    private   String   nm_Usuario;
    private   String   ds_LoginUsuario;
    private   String   ds_Genero;
    private   String   ds_TpUsuario;
    private   boolean  is_Permitido_RG;
    private   boolean  is_Permitido_CD;
    private   boolean  is_Permitido_RA;
    private   boolean  is_Permitido_PE;
    private   int      nr_NivelSeguraca;
    private   String   ds_HorarioTrabalho;
    protected String   ds_SenhaGeral;

    public String getDs_HorarioTrabalho() {
        return ds_HorarioTrabalho;
    }

    public void setDs_HorarioTrabalho(String ds_HorarioTrabalho) {
        this.ds_HorarioTrabalho = ds_HorarioTrabalho;
    }

    public String getDs_SenhaGeral() {
        return ds_SenhaGeral;
    }

    public void setDs_SenhaGeral(String ds_SenhaGeral) {
        this.ds_SenhaGeral = ds_SenhaGeral;
    }
    
    private void calculo () {
        
    }

    public int getNr_NivelSeguraca() {
        return nr_NivelSeguraca;
    }

    public void setNr_NivelSeguraca(int nr_NivelSeguraca) {
        this.nr_NivelSeguraca = nr_NivelSeguraca;
    }
    
    public void setId_usuario (int valor) {        
        this.id_usuario = valor;
    }
    
    public int getId_usuario () {
        return this.id_usuario;
    }

    public String getNm_Usuario() {
        return nm_Usuario;
    }

    public void setNm_Usuario(String nm_Usuario) {
        this.nm_Usuario = nm_Usuario;
    }

    public String getDs_LoginUsuario() {
        return ds_LoginUsuario;
    }

    public void setDs_LoginUsuario(String ds_LoginUsuario) {
        this.ds_LoginUsuario = ds_LoginUsuario;
    }

    public String getDs_Genero() {
        return ds_Genero;
    }

    public void setDs_Genero(String ds_Genero) {
        this.ds_Genero = ds_Genero;
    }

    public String getDs_TpUsuario() {
        return ds_TpUsuario;
    }

    public void setDs_TpUsuario(String ds_TpUsuario) {
        this.ds_TpUsuario = ds_TpUsuario;
    }

    public boolean isIs_Permitido_RG() {
        return is_Permitido_RG;
    }

    public void setIs_Permitido_RG(boolean is_Permitido_RG) {
        this.is_Permitido_RG = is_Permitido_RG;
    }

    public boolean isIs_Permitido_CD() {
        return is_Permitido_CD;
    }

    public void setIs_Permitido_CD(boolean is_Permitido_CD) {
        this.is_Permitido_CD = is_Permitido_CD;
    }

    public boolean isIs_Permitido_RA() {
        return is_Permitido_RA;
    }

    public void setIs_Permitido_RA(boolean is_Permitido_RA) {
        this.is_Permitido_RA = is_Permitido_RA;
    }

    public boolean isIs_Permitido_PE() {
        return is_Permitido_PE;
    }

    public void setIs_Permitido_PE(boolean is_Permitido_PE) {
        this.is_Permitido_PE = is_Permitido_PE;
    }

    public  String verNomeValido () {
        String Saida = "";
        if ((this.nm_Usuario.length()<5)||(this.nm_Usuario.length()>40)){
            Saida = "Nome deve ter entre 5 e 40 caracteres.";
        }
        return Saida;
    }
    
    
    public  String verLoginValido () {
        String Saida = "";
        if ((this.ds_LoginUsuario.length()<5)||(this.ds_LoginUsuario.length()>12)){
            Saida = "O Login deve ter entre 5 e 12 caracteres.";
        }
        return Saida;
    }
    
    public String verNivelSeguranca () {
        String Saida = "";
        if ((this.nr_NivelSeguraca<1)||(this.nr_NivelSeguraca>10)){
            Saida = "Nível Inválido. Selecione de 1 a 10. ";
        }
        return Saida;
    }
    
    
    public String isSenhaGeralValida () {
        String Saida = "";
        if ((this.ds_SenhaGeral.length()!=8)){
            Saida = "Senha Geral INVÁLIDA. Deve ter 8 Caracteres";
        }
        return Saida;
    }
}
