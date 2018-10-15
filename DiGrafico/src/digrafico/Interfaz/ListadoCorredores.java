/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Interfaz;

import digrafico.Logica.GestionCSV;
import digrafico.Logica.LogicaAplicacion;
import static digrafico.Logica.LogicaAplicacion.getSdf;
import digrafico.Modelo.Corredor;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumnop
 */
public class ListadoCorredores extends javax.swing.JDialog {

    private LogicaAplicacion logicaMetodos;
    private GestionCSV gcsv = new GestionCSV();

    /**
     * Creates new form ListadoCorredores
     */
    public ListadoCorredores(java.awt.Frame parent, boolean modal, LogicaAplicacion logicaAplicacion) {
        super(parent, modal);
        initComponents();
        this.logicaMetodos = logicaAplicacion;
        rellenarTablaCorredores();

    }

    private void rellenarTablaCorredores() {
        String[] columnas = {"Nombre", "Dni", "Fecha de nacimiento", "Dirección", "Teléfono"};
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0);
        for (Corredor corredor : logicaMetodos.getCorredores()) {
            //String[] a = new String[]{alumno.getNombre(),
            //                          alumno.getCurso()};
            String[] a = new String[5];
            a[0] = corredor.getNombre();
            a[1] = corredor.getDni();
            a[2] = getSdf().format(corredor.getFechaNacimiento());
            a[3] = corredor.getDireccion();
            a[4] = Integer.toString(corredor.getTelefono());
            dtm.addRow(a);
        }
        jTableCorredores.setModel(dtm);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jLabelListado = new javax.swing.JLabel();
        jButtonDarAltaCorredor = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Dni", "Fecha de Nacimiento", "Dirección", "Teléfono"
            }
        ));
        jTableCorredores.setToolTipText("");
        jScrollPane2.setViewportView(jTableCorredores);

        jLabelListado.setText("Listado Corredores");

        jButtonDarAltaCorredor.setText("Dar alta al corredor");
        jButtonDarAltaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarAltaCorredorActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabelListado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDarAltaCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jButtonModificar)
                        .addGap(219, 219, 219)
                        .addComponent(jButtonCerrar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelListado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDarAltaCorredor)
                    .addComponent(jButtonCerrar)
                    .addComponent(jButtonModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
            Logger.getLogger(ListadoCorredores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListadoCorredores.class.getName()).log(Level.SEVERE, null, ex);
        }
        rellenarTablaCorredores();
    }//GEN-LAST:event_jButtonDarAltaCorredorActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        try {
            int corredorSeleccionado = jTableCorredores.getSelectedRow();
            Corredor corredorAModificar = logicaMetodos.getCorredores().get(corredorSeleccionado);
            DialogAltaCorredor pantallaDeFormulario = new DialogAltaCorredor(this, true, logicaMetodos, corredorAModificar);
            pantallaDeFormulario.setVisible(true);
            gcsv.grabarFicheroCSV(logicaMetodos.getCorredores());
            rellenarTablaCorredores();
        } catch (ParseException ex) {
            Logger.getLogger(ListadoCorredores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListadoCorredores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonDarAltaCorredor;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelListado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
