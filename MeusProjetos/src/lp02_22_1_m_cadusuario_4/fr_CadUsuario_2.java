
package lp02_22_1_m_cadusuario_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class fr_CadUsuario_2 extends javax.swing.JFrame {

     
    private Tab_Usuario   tab_usuario; 
    private fr_Relatorio  local_fr_Relatorio;
    
    private ArrayList<Tab_Usuario>  lista_tab_usuario = new ArrayList();
    
    String TipoUsuario;
    
    private int Id;
    private int Nr_NivelSeg;
     
    
    public fr_CadUsuario_2() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_Id = new javax.swing.JLabel();
        tf_Id = new javax.swing.JTextField();
        lb_Nome = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        lb_Login = new javax.swing.JLabel();
        tf_Login = new javax.swing.JTextField();
        lb_TipoUser = new javax.swing.JLabel();
        rb_Administrador = new javax.swing.JRadioButton();
        rb_Funcionario = new javax.swing.JRadioButton();
        lb_Permissoes = new javax.swing.JLabel();
        ckb_RelatoriosGerais = new javax.swing.JCheckBox();
        ckb_RelatoriosAnaliticos = new javax.swing.JCheckBox();
        ckb_CadastroUsuarios = new javax.swing.JCheckBox();
        rb_Visitante = new javax.swing.JRadioButton();
        ckb_PontoEletronico = new javax.swing.JCheckBox();
        lb_Genero = new javax.swing.JLabel();
        cb_Genero = new javax.swing.JComboBox<>();
        lb_Limpar = new javax.swing.JButton();
        bt_Valida = new javax.swing.JButton();
        bt_Relatorio = new javax.swing.JButton();
        tf_NivelSeguranca = new javax.swing.JTextField();
        lb_NivelSeguranca = new javax.swing.JLabel();
        lb_HorarioTrab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_HorarioTrab = new javax.swing.JComboBox<>();
        tf_SenhaG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");

        lb_Id.setText("Id:");

        tf_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_IdActionPerformed(evt);
            }
        });

        lb_Nome.setText("Nome:");

        lb_Login.setText("Login:");

        lb_TipoUser.setText("Tipo User:");

        rb_Administrador.setText("Administrador");
        rb_Administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_AdministradorActionPerformed(evt);
            }
        });

        rb_Funcionario.setText("Funioário");
        rb_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_FuncionarioActionPerformed(evt);
            }
        });

        lb_Permissoes.setText("Permissões:");

        ckb_RelatoriosGerais.setText("Relatórios Gerais");

        ckb_RelatoriosAnaliticos.setText("Relatórios Analíticos");

        ckb_CadastroUsuarios.setText("Cadastro Usuários");

        rb_Visitante.setText("Visitante");
        rb_Visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_VisitanteActionPerformed(evt);
            }
        });

        ckb_PontoEletronico.setText("Ponto Eletrônico");

        lb_Genero.setText("Gênero:");

        cb_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Não Informado" }));
        cb_Genero.setSelectedIndex(-1);

        lb_Limpar.setText("Limpar");
        lb_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lb_LimparActionPerformed(evt);
            }
        });

        bt_Valida.setText("Valida");
        bt_Valida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ValidaActionPerformed(evt);
            }
        });

        bt_Relatorio.setText("Relatório");
        bt_Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RelatorioActionPerformed(evt);
            }
        });

        lb_NivelSeguranca.setText("Nível Segurança:");

        lb_HorarioTrab.setText("Horario Trabalho:");

        jLabel2.setText("SenhaGeral:");

        cb_HorarioTrab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8h-17h", "9h-18h", "12 por 36", "17h - 2h" }));
        cb_HorarioTrab.setSelectedIndex(-1);

        tf_SenhaG.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lb_Genero)
                                .addGap(18, 18, 18)
                                .addComponent(cb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_HorarioTrab)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_HorarioTrab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_SenhaG))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lb_Permissoes)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ckb_RelatoriosGerais)
                                        .addComponent(ckb_RelatoriosAnaliticos)
                                        .addComponent(ckb_CadastroUsuarios)
                                        .addComponent(ckb_PontoEletronico)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_Nome)
                                        .addComponent(lb_Id))
                                    .addGap(68, 68, 68)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_TipoUser)
                                        .addComponent(lb_Login)
                                        .addComponent(lb_NivelSeguranca))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rb_Administrador)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rb_Funcionario)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rb_Visitante))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_NivelSeguranca, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_Login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lb_Limpar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_Valida)
                                    .addGap(109, 109, 109))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(266, 266, 266)
                                    .addComponent(bt_Relatorio))))
                        .addContainerGap(81, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Id)
                    .addComponent(tf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nome)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Login)
                    .addComponent(tf_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_NivelSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_NivelSeguranca))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TipoUser)
                    .addComponent(rb_Administrador)
                    .addComponent(rb_Funcionario)
                    .addComponent(rb_Visitante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Permissoes)
                    .addComponent(ckb_RelatoriosGerais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckb_RelatoriosAnaliticos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckb_CadastroUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckb_PontoEletronico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Genero)
                    .addComponent(cb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_HorarioTrab)
                    .addComponent(cb_HorarioTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_SenhaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Limpar)
                    .addComponent(bt_Valida)
                    .addComponent(bt_Relatorio))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_AdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_AdministradorActionPerformed
        setTipoUsuario( true, false, false);
    }//GEN-LAST:event_rb_AdministradorActionPerformed

    private void rb_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_FuncionarioActionPerformed
        setTipoUsuario( false,  true, false);
    }//GEN-LAST:event_rb_FuncionarioActionPerformed

    private void rb_VisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_VisitanteActionPerformed
        setTipoUsuario( false,  false, true);
    }//GEN-LAST:event_rb_VisitanteActionPerformed

    private void bt_ValidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ValidaActionPerformed
        
       Carrega_TabUsuario ();
       if (Validacao())  {
           
            limpar_Tela();
        }
       
    }//GEN-LAST:event_bt_ValidaActionPerformed

    private void bt_RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RelatorioActionPerformed
        if(!lista_tab_usuario.isEmpty()) {
                
            local_fr_Relatorio =  new fr_Relatorio ();
            local_fr_Relatorio.MontaRelat(lista_tab_usuario);
            local_fr_Relatorio.setVisible(true);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Sem Registros para Exibir", "Erro", JOptionPane.ERROR_MESSAGE);
        }    
        
    }//GEN-LAST:event_bt_RelatorioActionPerformed

    private void lb_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lb_LimparActionPerformed
       
        limpar_Tela();
        
 
    }//GEN-LAST:event_lb_LimparActionPerformed

    private void tf_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_IdActionPerformed

   
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_CadUsuario_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Relatorio;
    private javax.swing.JButton bt_Valida;
    private javax.swing.JComboBox<String> cb_Genero;
    private javax.swing.JComboBox<String> cb_HorarioTrab;
    private javax.swing.JCheckBox ckb_CadastroUsuarios;
    private javax.swing.JCheckBox ckb_PontoEletronico;
    private javax.swing.JCheckBox ckb_RelatoriosAnaliticos;
    private javax.swing.JCheckBox ckb_RelatoriosGerais;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_Genero;
    private javax.swing.JLabel lb_HorarioTrab;
    private javax.swing.JLabel lb_Id;
    private javax.swing.JButton lb_Limpar;
    private javax.swing.JLabel lb_Login;
    private javax.swing.JLabel lb_NivelSeguranca;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_Permissoes;
    private javax.swing.JLabel lb_TipoUser;
    private javax.swing.JRadioButton rb_Administrador;
    private javax.swing.JRadioButton rb_Funcionario;
    private javax.swing.JRadioButton rb_Visitante;
    private javax.swing.JTextField tf_Id;
    private javax.swing.JTextField tf_Login;
    private javax.swing.JTextField tf_NivelSeguranca;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_SenhaG;
    // End of variables declaration//GEN-END:variables

private void Carrega_TabUsuario () {
    
        try {
            Id = Integer.parseInt(tf_Id.getText().trim());
            Nr_NivelSeg = Integer.parseInt(tf_NivelSeguranca.getText().trim());
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores Inteiros em Id e Nivel Segurança", "ERRO", JOptionPane.ERROR_MESSAGE);
      
        }
            
        if (rb_Administrador.isSelected()) { TipoUsuario = "ADM";}
        else if (rb_Funcionario.isSelected()) { TipoUsuario = "FUNC";} 
             else if (rb_Visitante.isSelected()) { TipoUsuario = "VISITANTE";} 
                  else {TipoUsuario = null;}
    
        tab_usuario = new Tab_Usuario ();
     
        tab_usuario.setId_usuario(Id);
        tab_usuario.setNr_NivelSeguraca(Nr_NivelSeg);
        
        tab_usuario.setNm_Usuario(tf_Nome.getText().trim());
        tab_usuario.setDs_TpUsuario(TipoUsuario);
        tab_usuario.setDs_LoginUsuario(tf_Login.getText().trim());
        tab_usuario.setDs_SenhaGeral(tf_SenhaG.getText().trim());
        
        tab_usuario.setDs_Genero(cb_Genero.getSelectedItem().toString());
        tab_usuario.setDs_HorarioTrabalho(cb_HorarioTrab.getSelectedItem().toString());
        
        
        if (ckb_CadastroUsuarios.isSelected()) { tab_usuario.setIs_Permitido_CD(true);}
        if (ckb_PontoEletronico.isSelected()) {  tab_usuario.setIs_Permitido_PE(true);}
        if (ckb_RelatoriosGerais.isSelected()) { tab_usuario.setIs_Permitido_RG(true);}
        if (ckb_RelatoriosAnaliticos.isSelected()) {  tab_usuario.setIs_Permitido_RA(true);}
        
        
        
}    
    
private boolean ValidaTipoUsuario () {
    boolean saida=true;
    if ((!rb_Administrador.isSelected())&&
        (!rb_Funcionario.isSelected())&&            
        (!rb_Visitante.isSelected())
       )    
    { 
        saida=false;
    }
    return saida;
}
    
private boolean ValidaTipoPermissao () {
    boolean saida=true;
    if ((!ckb_CadastroUsuarios.isSelected())&&
        (!ckb_PontoEletronico.isSelected())&&    
        (!ckb_RelatoriosAnaliticos.isSelected())&&    
        (!ckb_RelatoriosGerais.isSelected())
       )    
    { 
        saida=false;
    }
    return saida;
}    

    
private boolean ValidaLogin () {
    boolean saida=true;
    if ((tf_Login.getText().trim().length()<5)||(tf_Login.getText().trim().length()>12)) {
        saida=false;
    }
    return saida;
}    

    
private boolean ValidaNome () {
    boolean saida=true;
    if ((tf_Nome.getText().trim().length()<5)||(tf_Nome.getText().trim().length()>40)) {
        saida=false;
    }
    return saida;
}    
    
    
 private void setTipoUsuario (boolean adm, boolean func, boolean vis) {
        rb_Administrador.setSelected(adm);
        rb_Funcionario.setSelected(func);
        rb_Visitante.setSelected(vis);
    }


 private void limpar_Tela() {
        
        rb_Administrador.setSelected(false);
        rb_Funcionario.setSelected(false);
        rb_Visitante.setSelected(false);
        ckb_CadastroUsuarios.setSelected(false);
        ckb_PontoEletronico.setSelected(false);
        ckb_RelatoriosAnaliticos.setSelected(false); 
        ckb_RelatoriosGerais.setSelected(false);
        tf_Id.setText(null);
        tf_Login.setText(null);
        tf_Nome.setText(null);
        tf_NivelSeguranca.setText(null);
        tf_SenhaG.setText(null);
        
        cb_Genero.setSelectedIndex(-1);
        cb_HorarioTrab.setSelectedIndex(-1);
 
 }
 
 
 public boolean Validacao() {
    boolean saida = true; 
     
    try{
        
        String msg = tab_usuario.verNomeValido();
        if(!msg.isEmpty()) {
            throw new Exception (msg);
        }
        
        msg = tab_usuario.verLoginValido();
        if(!msg.isEmpty()) {
            throw new Exception (msg);
        }
        
        msg = tab_usuario.verNivelSeguranca();
        if(!msg.isEmpty()) {
            throw new Exception (msg);
        }
        
        msg = tab_usuario.isSenhaGeralValida();
        if(!msg.isEmpty()) {
            throw new Exception (msg);
        }
        
        if (!ValidaTipoPermissao()) {
            throw new Exception ("Selecione ao menos uma permissão.");
        }
        
        if (!ValidaTipoUsuario()) {
            throw new Exception ("Selecione UM tipo de Usuário.");
        }
        
        if (cb_Genero.getSelectedIndex()==-1) {
            throw new Exception ("Selecione UM Gênero para o  Usuário.");
        }
        
         lista_tab_usuario.add(tab_usuario);
        
    }   catch (Exception erro) {
        JOptionPane.showMessageDialog(null,"Erro de Validação de Tela:"+erro.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);

    }
    
     
    return saida; 
        /*
        if (!ValidaNome ()) {
            JOptionPane.showMessageDialog(null, "Nome deve ter entre 5 e 40 caracteres.", "Validação Tela", JOptionPane.ERROR_MESSAGE);
        }
       
        if (!ValidaLogin())  {
            
            JOptionPane.showMessageDialog(null, "O Login deve ter entre 5 e 12 caracteres.", "Validação Tela", JOptionPane.ERROR_MESSAGE);
        }
        
  
       */
        
        
        
                
        
 }
 
 
}//////////////////////////////////////////////////////////////////////////////////////////////////////////
