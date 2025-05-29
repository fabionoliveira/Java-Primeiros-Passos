
package Frames;


import DAO.DAO_Genero;
import Objetos.Genero;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

        

public class fr_GeneroRelatorioGeralGenero extends javax.swing.JFrame {

    DAO_Genero dao = new DAO_Genero ();

    ArrayList<Genero>  lista = new ArrayList ();
    
    public fr_GeneroRelatorioGeralGenero() {
        initComponents();
        
        try {
            geraRelatorio();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na Emissão Relatório\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Relatorio = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Genero de Pessoas");

        ta_Relatorio.setColumns(20);
        ta_Relatorio.setRows(5);
        jScrollPane1.setViewportView(ta_Relatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_GeneroRelatorioGeralGenero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_Relatorio;
    // End of variables declaration//GEN-END:variables

private void geraRelatorio() throws Exception {
    
    String st = "Relatório de Generos de Pessoas\n\n";
    lista = dao.Consulta_Genero();
    
    for ( int i = 0; i< lista.size(); i++) {
        
        st = st + "\n     Código: " + lista.get(i).getCd_genero();
        st = st + "\n  Descrição: " + lista.get(i).getDs_genero();
        st = st + "\nAbreviatura: " + lista.get(i).getAbr_Genero();
        st = st + "\n\n";
        
    }
    
    ta_Relatorio.setText(st);
}


}
