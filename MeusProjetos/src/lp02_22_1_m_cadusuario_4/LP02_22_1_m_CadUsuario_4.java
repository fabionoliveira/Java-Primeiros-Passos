
package lp02_22_1_m_cadusuario_4;


public class LP02_22_1_m_CadUsuario_4 {

   
    public static void main(String[] args) {
        
        fr_CadUsuario_2   myTela = new  fr_CadUsuario_2 ();
        
       // myTela.setVisible(true);
        
        
        
        Tab_Usuario  usr = new Tab_Usuario ();
        
        usr.setId_usuario(10);
        usr.setNm_Usuario("Zé");
        usr.setDs_TpUsuario("ADM");
        usr.setDs_LoginUsuario("ZEZE");
        usr.setIs_Permitido_CD(true);
        usr.setIs_Permitido_PE(true);
        usr.setIs_Permitido_RA(true);
        usr.setIs_Permitido_RG(true);
        usr.setDs_Genero("M");
        usr.setDs_SenhaGeral("101010");
         System.out.println("usr" + usr.isSenhaGeralValida());
        
        Tab_Usuario_ADM adm = new Tab_Usuario_ADM ();
        adm.setId_usuario(1010);
        adm.setNm_Usuario("Zé10");
        adm.setDs_TpUsuario("ADM10");
        adm.setDs_LoginUsuario("ZEZE10");
        adm.setIs_Permitido_CD(true);
        adm.setIs_Permitido_PE(true);
        adm.setIs_Permitido_RA(true);
        adm.setIs_Permitido_RG(true);
        adm.setDs_Genero("NI");
        adm.setDs_SenhaGeral("12345678");
        adm.setDs_SenhaSistema("uiuiuiu");
        adm.setDs_SenhaSuperUsr("ttt");
        adm.setQtde_HoraExtra(50);
        
        System.out.println("adm" + adm.isSenhaGeralValida());
        
        
        
                
        
         Tab_Usuario_Diretoria dir = new Tab_Usuario_Diretoria ();
        
        dir.setId_usuario(1010);
        dir.setNm_Usuario("Zé10");
        dir.setDs_TpUsuario("ADM10");
        dir.setDs_LoginUsuario("ZEZE10");
        dir.setIs_Permitido_CD(true);
        dir.setIs_Permitido_PE(true);
        dir.setIs_Permitido_RA(true);
        dir.setIs_Permitido_RG(true);
        dir.setDs_Genero("NI");
        dir.setDs_SenhaGeral("12345678901");
        dir.setDs_SenhaDiretoria("jhjhjh");
        dir.setQtde_HorasLogada(200);
        
        
         System.out.println("dir" + dir.isSenhaGeralValida());
        
        
        
        
        
        
        
        
        
        
    }
    
}
