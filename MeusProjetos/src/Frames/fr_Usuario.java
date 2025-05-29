
package Frames;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


import java.util.ArrayList;
import Objetos.Genero;
import DAO.DAO_Genero;
import Objetos.Nacionalidade;
import DAO.DAO_Nacionalidade;


public class fr_Usuario extends javax.swing.JFrame {

    DAO_Genero dao_genero =  new DAO_Genero ();
    Genero     obj_genero;    
    ArrayList<Genero>  lista_genero = new ArrayList();
    
    DAO_Nacionalidade dao_nacionalidade =  new DAO_Nacionalidade ();
    Nacionalidade     obj_nacionalidade;    
    ArrayList<Nacionalidade>  lista_nacionalidade = new ArrayList();
    
    
    MaskFormatter mfData;
    
    public fr_Usuario() {
      
        try {
            mfData = new MaskFormatter ("##/##/####");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro Formatação Data.\n"+ex.getMessage(), "Erro", JOptionPane.ERROR);
        }
        
        initComponents();
        
        Carga_Combobox_Genero();
        
        Carga_Combobox_Nacionalidade();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_Codigo = new javax.swing.JLabel();
        tf_Codigo = new javax.swing.JTextField();
        lb_Nome = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        lb_DataNasc = new javax.swing.JLabel();
        lb_Genero = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        ftf_DataNasc = new javax.swing.JFormattedTextField(mfData);
        cb_Genero = new javax.swing.JComboBox<>();
        lb_Nacionalidade = new javax.swing.JLabel();
        cb_Nacionalidade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_Codigo.setText("Código:");

        lb_Nome.setText("Nome:");

        lb_DataNasc.setText("Data Nasc.:");

        lb_Genero.setText("Genero:");

        jToolBar1.setRollover(true);

        ftf_DataNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftf_DataNascFocusLost(evt);
            }
        });
        ftf_DataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftf_DataNascActionPerformed(evt);
            }
        });

        cb_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_GeneroActionPerformed(evt);
            }
        });

        lb_Nacionalidade.setText("Nacionalidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_DataNasc)
                    .addComponent(lb_Nome)
                    .addComponent(lb_Codigo)
                    .addComponent(lb_Genero)
                    .addComponent(lb_Nacionalidade))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftf_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cb_Nacionalidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_Genero, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lb_Nome)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_DataNasc)
                    .addComponent(ftf_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_Genero)
                        .addComponent(cb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Nacionalidade)
                    .addComponent(cb_Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_GeneroActionPerformed

    private void ftf_DataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftf_DataNascActionPerformed
        
    }//GEN-LAST:event_ftf_DataNascActionPerformed

    private void ftf_DataNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftf_DataNascFocusLost
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        
        try {
            Date date = sdf.parse(ftf_DataNasc.getText());
            ftf_DataNasc.setValue(sdf.format(date));
            
        } catch (ParseException ex) {
            ftf_DataNasc.setFocusLostBehavior(JFormattedTextField.PERSIST);
            ftf_DataNasc.setText("");
            ftf_DataNasc.setValue(null);
        }
    }//GEN-LAST:event_ftf_DataNascFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fr_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Genero;
    private javax.swing.JComboBox<String> cb_Nacionalidade;
    private javax.swing.JFormattedTextField ftf_DataNasc;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_Codigo;
    private javax.swing.JLabel lb_DataNasc;
    private javax.swing.JLabel lb_Genero;
    private javax.swing.JLabel lb_Nacionalidade;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JTextField tf_Codigo;
    private javax.swing.JTextField tf_Nome;
    // End of variables declaration//GEN-END:variables

private void Carga_Combobox_Nacionalidade() {
    
        try {
            lista_nacionalidade = dao_nacionalidade.Consulta_Nacionalidade();
        
            for ( int i=0; i< lista_nacionalidade.size(); i++) {
                
                cb_Nacionalidade.addItem(lista_nacionalidade.get(i).getDs_Nacionalidade());
                cb_Nacionalidade.setSelectedIndex(-1);
                
            }
        
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Erro na Carga Combobox Nacionalidade"+erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        
        }
    
}
private void Carga_Combobox_Genero() {
    
        try {
            
            lista_genero = dao_genero.Consulta_Genero();
            
            for ( int i=0; i<lista_genero.size(); i++) {
                
                cb_Genero.addItem(lista_genero.get(i).getDs_genero());
                cb_Genero.setSelectedIndex(-1);
                
            }
            
        } catch (Exception erro) {
             JOptionPane.showMessageDialog(null, "Erro na Carga Combobox Genero"+erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    
    
}


}
