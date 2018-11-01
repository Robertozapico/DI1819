/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Interfaz;

import digrafico.Logica.GestionCSV;
import digrafico.Logica.LogicaAplicacion;
import static digrafico.Logica.LogicaAplicacion.getSdf;
import digrafico.Logica.MetodosGestionFicherosObjetos;
import digrafico.Modelo.Carrera;
import digrafico.Modelo.Corredor;
import java.awt.Dialog;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.openide.util.Exceptions;

/**
 *
 * @author alumnop
 */
public class ListadoCorredoresEnCarrera extends javax.swing.JDialog {
//FALTA ELIMINAR CORREDORES DE UNA LISTA Y ASIGNAR EL DORSAL
    private LogicaAplicacion logicaMetodos;
    private Carrera carreraEscogida;
    private GestionCSV gcsv = new GestionCSV();
    private MetodosGestionFicherosObjetos mgfo = new MetodosGestionFicherosObjetos();

    /**
     * Creates new form ListadoCorredoresEnCarrera
     */
    public ListadoCorredoresEnCarrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public ListadoCorredoresEnCarrera(Dialog owner, boolean modal, LogicaAplicacion logicaMetodos, Carrera carreraSeleccionada) {
        super(owner, modal);
        initComponents();
        this.logicaMetodos = logicaMetodos;
        this.carreraEscogida = carreraSeleccionada;
        rellenarTablaCarreras();
        System.out.println(logicaMetodos.getCorredores());
        System.out.println(carreraEscogida.getCorredores());
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
        jButtonAnnadirCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnadirCorredorActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(ListadoCorredoresEnCarrera.class, "ListadoCorredoresEnCarrera.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAnnadirCorredor)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminarCorredor)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCerrar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnadirCorredor)
                    .addComponent(jButtonEliminarCorredor)
                    .addComponent(jButtonCerrar))
                .addGap(22, 22, 22))
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
        String inscripcion = "";
        String[] columnas = {"Nombre", "Dni", "Dorsal", "Inscrito"};
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0);
        Integer[] dorsales = new Integer[carreraEscogida.getDorsales().size()];
        int contadorDeDorsales=0;
        for (Integer dorsalDeCarrera : carreraEscogida.getDorsales()) {
            dorsales[contadorDeDorsales]=dorsalDeCarrera;
            contadorDeDorsales++;
        }
        String dorsalesAsignados = "";
        int contadorDorsales = 0;
        for (Corredor corredor : logicaMetodos.getCorredores()) {
            if (carreraEscogida.getCorredores().contains(corredor)) {
                inscripcion = "si";
                //dorsalesAsignados = Integer.toString(dorsales[contadorDorsales]);
                contadorDorsales++;
            } else {
                inscripcion = "no";
                dorsalesAsignados="";
            }

            String[] a = new String[4];
            a[0] = corredor.getNombre();
            a[1] = corredor.getDni();
            //meter dorsales
            a[2] = dorsalesAsignados;
            a[3] = inscripcion;
            dtm.addRow(a);
        }
        jTableCorredoresCarrera.setModel(dtm);
    }

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonEliminarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCorredorActionPerformed
        int[] intCorredoresSeleccionados = jTableCorredoresCarrera.getSelectedRows();
        if (carreraEscogida.getCorredores().size() < carreraEscogida.getNumMaxParticipantes()) {
            for (int i = 0; i < intCorredoresSeleccionados.length; i++) {
                carreraEscogida.getCorredores().remove(logicaMetodos.getCorredores().get(intCorredoresSeleccionados[i]));
            }
            File fichero = new File("gestionCarreras.dat");
            fichero.delete();
            mgfo.abrirFicheroEscrituraObjetos("gestionCarreras.dat");
            mgfo.grabarObjetoFicheroObjetos(logicaMetodos);
            mgfo.cerrarFicherosEscrituraObjetos();
            rellenarTablaCarreras();
        }
    }//GEN-LAST:event_jButtonEliminarCorredorActionPerformed

    private void jButtonAnnadirCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnadirCorredorActionPerformed
        int[] intCorredoresSeleccionados = jTableCorredoresCarrera.getSelectedRows();

        for (int i = 0; i < intCorredoresSeleccionados.length; i++) {
            carreraEscogida.getCorredores().add(logicaMetodos.getCorredores().get(intCorredoresSeleccionados[i]));
        }
        File fichero = new File("gestionCarreras.dat");
        fichero.delete();
        mgfo.abrirFicheroEscrituraObjetos("gestionCarreras.dat");
        mgfo.grabarObjetoFicheroObjetos(logicaMetodos);
        mgfo.cerrarFicherosEscrituraObjetos();
        rellenarTablaCarreras();

    }//GEN-LAST:event_jButtonAnnadirCorredorActionPerformed


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