/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Logica;

import digrafico.Interfaz.DialogAltaCarrera;
import digrafico.Interfaz.DialogAltaCorredor;
import digrafico.Interfaz.ListadoCarreras;
import digrafico.Interfaz.ListadoCorredores;
import digrafico.Logica.GestionCSV;
import digrafico.Modelo.Corredor;
import digrafico.Modelo.Carrera;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumnop
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    private LogicaAplicacion logicaMetodos = new LogicaAplicacion();
    //private java.util.List<Corredor> corredores;
    //private java.util.List<Carrera> carreras;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/aa");
    private GestionCSV gcsv = new GestionCSV();

    public PantallaPrincipal() {
        initComponents();
        try {
            gcsv.annadirListaCorredores(logicaMetodos.getCorredores());
        } catch (IOException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonDarAltaCorredor = new javax.swing.JButton();
        jLabelGestionCorredores = new javax.swing.JLabel();
        jButtonCorredoresListado = new javax.swing.JButton();
        jButtonCarreraAlta = new javax.swing.JButton();
        jButtonListadoCarrera = new javax.swing.JButton();
        jLabelCorredores = new javax.swing.JLabel();
        jLabelCarreras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonDarAltaCorredor.setText("Dar alta al corredor");
        jButtonDarAltaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarAltaCorredorActionPerformed(evt);
            }
        });

        jLabelGestionCorredores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelGestionCorredores.setText("Gestión de corredores");

        jButtonCorredoresListado.setText("Listado Corredores");
        jButtonCorredoresListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorredoresListadoActionPerformed(evt);
            }
        });

        jButtonCarreraAlta.setText("Dar alta a carrera");
        jButtonCarreraAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarreraAltaActionPerformed(evt);
            }
        });

        jButtonListadoCarrera.setText("Listado Carreras");
        jButtonListadoCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListadoCarreraActionPerformed(evt);
            }
        });

        jLabelCorredores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCorredores.setText("Corredores");

        jLabelCarreras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCarreras.setText("Carreras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabelGestionCorredores))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCarreras)
                            .addComponent(jLabelCorredores)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDarAltaCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarreraAlta))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonListadoCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCorredoresListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelGestionCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCorredores)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDarAltaCorredor)
                    .addComponent(jButtonCorredoresListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabelCarreras)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCarreraAlta)
                    .addComponent(jButtonListadoCarrera))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDarAltaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDarAltaCorredorActionPerformed
        try {
            DialogAltaCorredor pantallaDeFormulario = new DialogAltaCorredor(this, true, logicaMetodos);
            pantallaDeFormulario.setVisible(true);
            //System.out.println(corredores.toString());
            //jListCorredores.setModel(new DefaultListModel<String>());
            //rellenarTablaCorredores();
            gcsv.grabarFicheroCSV(logicaMetodos.getCorredores());
        } catch (ParseException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDarAltaCorredorActionPerformed

    private void jButtonCorredoresListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorredoresListadoActionPerformed
        // TODO add your handling code here:
        ListadoCorredores listadoCorredores = new ListadoCorredores(this, true, logicaMetodos);
        listadoCorredores.setVisible(true);
    }//GEN-LAST:event_jButtonCorredoresListadoActionPerformed

    private void jButtonListadoCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListadoCarreraActionPerformed
        ListadoCarreras listadoCarreras = new ListadoCarreras(this, true, logicaMetodos);
        listadoCarreras.setVisible(true);
    }//GEN-LAST:event_jButtonListadoCarreraActionPerformed

    private void jButtonCarreraAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarreraAltaActionPerformed
        // TODO add your handling code here:
        DialogAltaCarrera pantallaDeCarreras = new DialogAltaCarrera(this, true, logicaMetodos);
        pantallaDeCarreras.setVisible(true);

    }//GEN-LAST:event_jButtonCarreraAltaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Locale.setDefault(new Locale("es","ES"));
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarreraAlta;
    private javax.swing.JButton jButtonCorredoresListado;
    private javax.swing.JButton jButtonDarAltaCorredor;
    private javax.swing.JButton jButtonListadoCarrera;
    private javax.swing.JLabel jLabelCarreras;
    private javax.swing.JLabel jLabelCorredores;
    private javax.swing.JLabel jLabelGestionCorredores;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
