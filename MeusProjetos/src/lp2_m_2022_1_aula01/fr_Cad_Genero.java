
package lp2_m_2022_1_aula01;

public class fr_Cad_Genero extends javax.swing.JFrame {

    public fr_Cad_Genero() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_Cd_Genero = new javax.swing.JLabel();
        lb_ds_Genero = new javax.swing.JLabel();
        lb_abr_genero = new javax.swing.JLabel();
        tf_Cd_Genero = new javax.swing.JTextField();
        tf_Ds_Genero = new javax.swing.JTextField();
        tf_Abr_Genero = new javax.swing.JTextField();
        bt_Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Genero");

        lb_Cd_Genero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_Cd_Genero.setText("Código:");

        lb_ds_Genero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_ds_Genero.setText("Descrição:");

        lb_abr_genero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_abr_genero.setText("Abreviatura:");

        bt_Limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Limpar.setText("Limpar");
        bt_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Limpar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_abr_genero)
                            .addComponent(lb_Cd_Genero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_ds_Genero, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Cd_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Ds_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Abr_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Cd_Genero)
                    .addComponent(tf_Cd_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ds_Genero)
                    .addComponent(tf_Ds_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_abr_genero)
                    .addComponent(tf_Abr_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(bt_Limpar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LimparActionPerformed
        
        tf_Cd_Genero.setText(null);
        tf_Ds_Genero.setText(null);
        tf_Abr_Genero.setText("");
        
    }//GEN-LAST:event_bt_LimparActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Cad_Genero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Limpar;
    private javax.swing.JLabel lb_Cd_Genero;
    private javax.swing.JLabel lb_abr_genero;
    private javax.swing.JLabel lb_ds_Genero;
    private javax.swing.JTextField tf_Abr_Genero;
    private javax.swing.JTextField tf_Cd_Genero;
    private javax.swing.JTextField tf_Ds_Genero;
    // End of variables declaration//GEN-END:variables

}//////////////////////////////////fim mundo //////////////////////////

