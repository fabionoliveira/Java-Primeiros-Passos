/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JOptionPane;

import Objetos.Nacionalidade;
import DAO.DAO_Nacionalidade;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fr_Nacionalidade extends javax.swing.JFrame {

    
    private Nacionalidade      linha;
    private DAO_Nacionalidade dao = new  DAO_Nacionalidade();
    
    private char operacao;
    
    
    public fr_Nacionalidade() {
        initComponents();
        
        habilitarCampos ( false); // começar com campos desabilitados
        
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_Codigo = new javax.swing.JLabel();
        lb_Descicao = new javax.swing.JLabel();
        lb_Abreviatura = new javax.swing.JLabel();
        tf_Codigo = new javax.swing.JTextField();
        tf_Descricao = new javax.swing.JTextField();
        tf_Abreviatura = new javax.swing.JTextField();
        bt_Limpar = new javax.swing.JButton();
        bt_Relatorio = new javax.swing.JButton();
        bt_Alterar = new javax.swing.JButton();
        bt_Incluir1 = new javax.swing.JButton();
        bt_Salvar1 = new javax.swing.JButton();
        bt_Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Nacionalidade");

        lb_Codigo.setText("Código:");

        lb_Descicao.setText("Descrição:");

        lb_Abreviatura.setText("Abreviatura:");

        tf_Codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_CodigoFocusLost(evt);
            }
        });

        bt_Limpar.setText("Limpar");
        bt_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LimparActionPerformed(evt);
            }
        });

        bt_Relatorio.setText("Relatório");
        bt_Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RelatorioActionPerformed(evt);
            }
        });

        bt_Alterar.setText("Alterar");
        bt_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AlterarActionPerformed(evt);
            }
        });

        bt_Incluir1.setText("Incluir");
        bt_Incluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Incluir1ActionPerformed(evt);
            }
        });

        bt_Salvar1.setText("Salvar");
        bt_Salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Salvar1ActionPerformed(evt);
            }
        });

        bt_Excluir.setText("Excluir");
        bt_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_Abreviatura)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Abreviatura, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Descicao)
                            .addComponent(lb_Codigo))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bt_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(bt_Relatorio)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(bt_Incluir1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(bt_Alterar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(bt_Salvar1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(bt_Excluir)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Codigo)
                    .addComponent(tf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Descicao)
                    .addComponent(tf_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Abreviatura)
                    .addComponent(tf_Abreviatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_Limpar)
                        .addComponent(bt_Relatorio)
                        .addComponent(bt_Alterar)
                        .addComponent(bt_Incluir1)
                        .addComponent(bt_Salvar1)
                        .addComponent(bt_Excluir))
                    .addContainerGap(139, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LimparActionPerformed
        Limpar();
    }//GEN-LAST:event_bt_LimparActionPerformed

    private void bt_RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RelatorioActionPerformed
        fr_GeneroRelatorioGeralNacionalidade  fr_RelGeral = new fr_GeneroRelatorioGeralNacionalidade ();

        fr_RelGeral.setVisible(true);
    }//GEN-LAST:event_bt_RelatorioActionPerformed

    private void bt_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AlterarActionPerformed
        tf_Codigo.setEditable(true);
        operacao = 'A';

    }//GEN-LAST:event_bt_AlterarActionPerformed

    private void bt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ExcluirActionPerformed
        tf_Codigo.setEditable(true);
        operacao = 'E';
    }//GEN-LAST:event_bt_ExcluirActionPerformed

    private void tf_CodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_CodigoFocusLost
        
        try { 
            int Codigo = Integer.parseInt((tf_Codigo.getText().trim()));
            
            MontaTela(Codigo);
            
            if(operacao=='E') {
                Excluir(Codigo);
                Limpar();
            }
            
            if(operacao=='A') {
                 tf_Abreviatura.setEditable(true);
                 tf_Codigo.setEditable(false);
                 tf_Descricao.setEditable(true);
            }
            
            
        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Informe o Código Corretamente", "Erro tela", JOptionPane.ERROR_MESSAGE);
           
        } catch (Exception err1) {
            JOptionPane.showMessageDialog(null, "Carga de Dados BD com erro. Verifique.\n"+err1.getMessage(), "Erro BD", JOptionPane.ERROR_MESSAGE);
        } 
          
       
        
         
    }//GEN-LAST:event_tf_CodigoFocusLost

    private void bt_Salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Salvar1ActionPerformed
        
        if(ConsisteCampos()) {
            
        
            if(operacao=='A') {

                int resp  = JOptionPane.showConfirmDialog(null, "Confirma a Alteração", "Mensagem", JOptionPane.YES_NO_OPTION);
                if(resp==0) {
                    Alterar();
                }
            }    

            if(operacao=='I') {

                int resp  = JOptionPane.showConfirmDialog(null, "Confirma a Inclusão?", "Mensagem", JOptionPane.YES_NO_OPTION);
                if(resp==0) {
                    Incluir();
                }
            } 
        } 
        
        Limpar();
        
        
    }//GEN-LAST:event_bt_Salvar1ActionPerformed

    private void bt_Incluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Incluir1ActionPerformed
         operacao = 'I';
          tf_Abreviatura.setEditable(true);
          tf_Codigo.setEditable(false);
          tf_Descricao.setEditable(true);
    }//GEN-LAST:event_bt_Incluir1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Nacionalidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Alterar;
    private javax.swing.JButton bt_Excluir;
    private javax.swing.JButton bt_Incluir1;
    private javax.swing.JButton bt_Limpar;
    private javax.swing.JButton bt_Relatorio;
    private javax.swing.JButton bt_Salvar1;
    private javax.swing.JLabel lb_Abreviatura;
    private javax.swing.JLabel lb_Codigo;
    private javax.swing.JLabel lb_Descicao;
    private javax.swing.JTextField tf_Abreviatura;
    private javax.swing.JTextField tf_Codigo;
    private javax.swing.JTextField tf_Descricao;
    // End of variables declaration//GEN-END:variables

    
    
private boolean ConsisteCampos() {
    boolean saida = true;
    String msg = "";
    
    if((!tf_Descricao.getText().trim().isEmpty())&&
       (!tf_Abreviatura.getText().trim().isEmpty())) 
    {
    
         linha = new Nacionalidade ();
         
         msg = linha.is_abr_NacionalidadeValido(tf_Abreviatura.getText().trim());
         if (!msg.isEmpty()) {
             saida=false;
         }
         
         msg= msg + linha.is_ds_NacionalidadeValido(tf_Descricao.getText().trim());
         if (!msg.isEmpty()) {
             saida=false;
         }
         
         if (!msg.isEmpty()) {
             JOptionPane.showMessageDialog(null, "Erros de Tela: \n"+msg, "Erro", JOptionPane.ERROR_MESSAGE);
         } else {
             
             linha.setAbr_Nacionalidade(tf_Abreviatura.getText().trim());
             linha.setDs_Nacionalidade(tf_Descricao.getText().trim());
             if(operacao=='A') {
                linha.setCd_Nacionalidade(Integer.parseInt(tf_Codigo.getText().trim()));
             }
             
         }
        
    } else {
        
        JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        saida=false;
    }
    
    return saida;
}    
    
private void Incluir () {
    
    
        try {
            
            if(dao.incluir_Nacionalidade(linha)) {  
                 JOptionPane.showMessageDialog(null, "Inclusão Concluida com Sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Inclusão Não foi Concluida.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        } catch (Exception err) {
             JOptionPane.showMessageDialog(null, "Inclusão no BD com erro. Verifique.\n"+err.getMessage(), "Erro BD", JOptionPane.ERROR_MESSAGE);
        }

}

private void Alterar () {
    
    
        try {
            
            if(dao.altera_Nacionalidade(linha)) {
                 JOptionPane.showMessageDialog(null, "Alterção Concluida com Sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Alteração Não foi Concluida.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        } catch (Exception err) {
             JOptionPane.showMessageDialog(null, "Alteração no BD com erro. Verifique.\n"+err.getMessage(), "Erro BD", JOptionPane.ERROR_MESSAGE);
        }

}    
  
private void Excluir(int Codigo) {
    
    int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Mensage", JOptionPane.YES_NO_OPTION);
    
    if (resposta==0) {
        
        try {
            
            if(dao.Excluir_Nacionalidade(Codigo)) {
                 JOptionPane.showMessageDialog(null, "Exclusão Concluida com Sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            } else {
                 JOptionPane.showMessageDialog(null, "Exclusão Não foi Concluida.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
        } catch (Exception err) {
             JOptionPane.showMessageDialog(null, "Exclusão no BD com erro. Verifique.\n"+err.getMessage(), "Erro BD", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}     
    
private void MontaTela(int codigo) throws Exception {
    
    linha = dao.Consulta_Nacionalidade_Unitaria(codigo);
    
    System.out.println(linha.getDs_Nacionalidade());
    
    tf_Descricao.setText(linha.getDs_Nacionalidade());
    tf_Abreviatura.setText(linha.getAbr_Nacionalidade());
    
    
}    
private void habilitarCampos ( boolean parametro) {
    
    tf_Abreviatura.setEditable(parametro);
    tf_Codigo.setEditable(parametro);
    tf_Descricao.setEditable(parametro);
    
}

private void  Limpar() {
    
    tf_Abreviatura.setText(null);
    tf_Codigo.setText(null);
    tf_Descricao.setText(null);
    
    operacao=' ';
    habilitarCampos ( false);
    
}

}
