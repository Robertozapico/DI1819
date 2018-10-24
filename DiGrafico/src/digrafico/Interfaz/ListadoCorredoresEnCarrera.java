/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Interfaz;

import digrafico.Logica.LogicaAplicacion;
import static digrafico.Logica.LogicaAplicacion.getSdf;
import digrafico.Modelo.Carrera;
import digrafico.Modelo.Corredor;
import java.awt.Dialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumnop
 */
public class ListadoCorredoresEnCarrera extends javax.swing.JDialog {
private LogicaAplicacion logicaMetodos;
    /**
     * Creates new form ListadoCorredoresEnCarrera
     */
    public ListadoCorredoresEnCarrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public ListadoCorredoresEnCarrera(Dialog owner, boolean modal, LogicaAplicacion logicaMetodos) {
        super(owner, modal);
        this.logicaMetodos=logicaMetodos;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredoresCarrera = new javax.swing.JTable();
        jButtonAnnadirCorredor = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jButtonEliminarCorredor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredoresCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Dni", "Dorsal", "Inscrito"
            }
        ));
        jScrollPane1.setViewportView(jTableCorredoresCarrera);
        if (jTableCorredoresCarrera.getColumnModel().getColumnCount() > 0) {
            jTableCorredoresCarrera.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(ListadoCorredoresEnCarrera.class, "ListadoCorredoresEnCarrera.jTableCorredoresCarrera.columnModel.title0")); // NOI18N
            jTableCorredoresCarrera.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(ListadoCorredoresEnCarrera.class, "ListadoCorredoresEnCarrera.jTableCorredoresCarrera.columnModel.title1")); // NOI18N
            jTableCorredoresCarrera.getColumnModel().getColumn(2).setHeaderValue(org.openide.util.NbBundle.getMessage(ListadoCorredoresEnCarrera.class, "ListadoCorredoresEnCarrera.jTableCorredoresCarrera.columnModel.title2")); // NOI18N
            jTableCorredoresCarrera.getColumnModel().getColumn(3).setHeaderValue(org.openide.util.NbBundle.getMessage(ListadoCorredoresEnCarrera.class, "ListadoCorredoresEnCarrera.jTableCorredoresCarrera.columnModel.title3")); // NOI18N
        }

        jButtonAnnadirCorredor.setText(org.openide.util.NbBundle.getMessage(ListadoCorredoresEnCarrera.class, "ListadoCorredoresEnCarrera.jButtonAnnadirCorredor.text")); // NOI18N

        jButtonCerrar.setText(org.openide.util.NbBundle.getMessage(ListadoCorredoresEnCarrera.class, "ListadoCorredoresEnCarrera.jButtonCerrar.text")); // NOI18N
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jButtonEliminarCorredor.setText(org.openide.util.NbBundle.getMessage(ListadoCorredoresEnCarrera.class, "ListadoCorredoresEnCarrera.jButtonEliminarCorredor.text")); // NOI18N
        jButtonEliminarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCorredorActionPerformed(evt);
            }
        });

        jLabel1.setText(org.openide.util.NbBundle.getMessage(ListadoCorredoresEnCarrera.class, "ListadoCorredoresEnCarrera.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAnnadirCorredor)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminarCorredor)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCerrar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnadirCorredor)
                    .addComponent(jButtonEliminarCorredor)
                    .addComponent(jButtonCerrar))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rellenarTablaCarreras() {
        String[] columnas = {"Nombre", "Dni", "Dorsal", "Inscrito"};
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0);
        for (Corredor corredor : logicaMetodos.getCorredores()) {
            String[] a = new String[4];
            a[0] = corredor.getNombre();
            a[1] = corredor.getDni();
            //meter boolean si o no y dorsales
            a[2] = "0";
            a[3] = "no";
            dtm.addRow(a);
        }
        jTableCorredoresCarrera.setModel(dtm);
    }
    
    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonEliminarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCorredorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarCorredorActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoCorredoresEnCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoCorredoresEnCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoCorredoresEnCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoCorredoresEnCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListadoCorredoresEnCarrera dialog = new ListadoCorredoresEnCarrera(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnadirCorredor;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonEliminarCorredor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableCorredoresCarrera;
    // End of variables declaration//GEN-END:variables
}
