/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_6;

/**
 *
 * @author FO
 */
public class P1_6 {

    private String nm_Loja;
    private char   nm_RZSocial;
    private char   nm_Loja_Fantasia;
    private int    qtde_Funcionario;

    public String getNm_Loja() {
        return nm_Loja;
    }

    public void setNm_Loja(String nm_Loja) {
        this.nm_Loja = nm_Loja;
    }

    public char getNm_RZSocial() {
        return nm_RZSocial;
    }

    public void setNm_RZSocial(char nm_RZSocial) {
        this.nm_RZSocial = nm_RZSocial;
    }

    public char getNm_Loja_Fantasia() {
        return nm_Loja_Fantasia;
    }

    public void setNm_Loja_Fantasia(char nm_Loja_Fantasia) {
        this.nm_Loja_Fantasia = nm_Loja_Fantasia;
    }

    public int getQtde_Funcionario() {
        return qtde_Funcionario;
    }

    public void setQtde_Funcionario(int qtde_Funcionario) {
        this.qtde_Funcionario = qtde_Funcionario;
    }
    
    public void validarLoja(){
        if (nm_RZSocial > 40){
            System.out.println("O número maxímo é de 40 caracteres");
            System.out.println("Digite novamente");
        } else{ System.exit(3);}
        
        if (nm_Loja_Fantasia > 20){
            System.out.println("O número maxímo é de 20 caracteres!");
            System.out.println("Digite novamente");
                
        }else{ System.exit(3);}
    
    
    
    }

        
    
    
    public static void main(String[] args) {
        P1_6 p = new P1_6();
        
        p.setNm_Loja("Lua Nova");
        /*p.setNm_RZSocial();
        p.setNm_Loja_Fantasia();*/
        p.setQtde_Funcionario(12);
        
        System.out.println("Nome Loja: " + p.nm_Loja);
        System.out.println("Razao Social: " + p.nm_RZSocial);
        System.out.println("Nome Fantasia: " + p.nm_Loja_Fantasia);
        System.out.println("Quantidade Funcionario: " + p.qtde_Funcionario);
    }
    
}
