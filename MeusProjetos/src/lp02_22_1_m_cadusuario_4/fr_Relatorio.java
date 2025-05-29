package lp02_22_1_m_cadusuario_4;

import java.util.ArrayList;

public class fr_Relatorio extends javax.swing.JFrame {

    public fr_Relatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Relat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório");

        ta_Relat.setColumns(20);
        ta_Relat.setRows(5);
        jScrollPane1.setViewportView(ta_Relat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_Relat;
    // End of variables declaration//GEN-END:variables

    public void MontaRelat(ArrayList<Tab_Usuario> lista_tab_usuario) {

        String msg = "Relatório\n\n";

        for (int i = 0; i < lista_tab_usuario.size(); i++) {
            String Permissoes = "";
            if (lista_tab_usuario.get(i).isIs_Permitido_CD()) {
                Permissoes = "CD";
            }
            if (lista_tab_usuario.get(i).isIs_Permitido_PE()) {
                Permissoes = Permissoes + " PE";
            }
            if (lista_tab_usuario.get(i).isIs_Permitido_RG()) {
                Permissoes = Permissoes + " RG";
            }
            if (lista_tab_usuario.get(i).isIs_Permitido_RA()) {
                Permissoes = Permissoes + " RA";
            }

            msg = msg + "\n\nNome:       " + lista_tab_usuario.get(i).getNm_Usuario();
            msg = msg + "\nLogin:      " + lista_tab_usuario.get(i).getDs_LoginUsuario();
            msg = msg + "\nGenero:     " + lista_tab_usuario.get(i).getDs_Genero();
            msg = msg + "\nTipoUsuario:" + lista_tab_usuario.get(i).getDs_TpUsuario();
            msg = msg + "\nPermissões: " + Permissoes;
            msg = msg + "\nSenhaG:     " + lista_tab_usuario.get(i).getDs_SenhaGeral();
            msg = msg + "\nHorárioTrab:" + lista_tab_usuario.get(i).getDs_HorarioTrabalho();
        }
        ta_Relat.setText(msg);

    }

}
