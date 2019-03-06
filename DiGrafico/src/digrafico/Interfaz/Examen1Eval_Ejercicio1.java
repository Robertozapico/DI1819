/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Interfaz;

import static digrafico.Logica.LogicaAplicacion.getSdf;
import digrafico.Modelo.Carrera;
import digrafico.Modelo.Corredor;
import digrafico.Modelo.Participante;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import digrafico.Logica.LogicaAplicacion;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import org.openide.util.Exceptions;

/**
 *
 * @author alumnop
 */
public class Examen1Eval_Ejercicio1 extends java.awt.Dialog {

    private LogicaAplicacion logicaMetodos;

    /**
     * Creates new form Examen1Eval_Ejercicio1
     */
    public Examen1Eval_Ejercicio1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ayuda();
    }

    public Examen1Eval_Ejercicio1(java.awt.Frame parent, boolean modal, LogicaAplicacion logicaAplicacion) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.logicaMetodos = logicaAplicacion;
        rellenarTablaCorredores();
        ayuda();
    }

    private void ayuda() {
        try {
            URL ayuda = getClass().getResource("/help/help_set.hs");
            File ficheroAyuda = new File(ayuda.toURI());
            URI hsURL = ficheroAyuda.toURI();

            //Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL.toURL());
            HelpBroker hb = helpset.createHelpBroker();

            //Al pulsar F1 salta la ayuda
            hb.enableHelpKey(jPanelExamen, "aplicacion", helpset);
        } catch (URISyntaxException ex) {
            Exceptions.printStackTrace(ex);
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        } catch (HelpSetException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private void rellenarTablaCorredores() {
        String[] columnas = {"Nombre", "Dni", "Fecha de nacimiento"};
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0);
        Date fechaMilenial = new Date();
        fechaMilenial.setDate(1);
        fechaMilenial.setMonth(0);
        fechaMilenial.setYear(100);
        //System.out.println(fechaMilenial);
        for (Corredor corredor : logicaMetodos.getCorredores()) {
            if (corredor.getFechaNacimiento().after(fechaMilenial)) {
                String[] a = new String[3];
                a[0] = corredor.getNombre();
                a[1] = corredor.getDni();
                a[2] = getSdf().format(corredor.getFechaNacimiento());
                dtm.addRow(a);
            }
        }
        jTableCorredores.setModel(dtm);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelExamen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCarreras = new javax.swing.JList<>();
        jLabelCarreras = new javax.swing.JLabel();
        jLabelCorredores = new javax.swing.JLabel();
        dorsales1 = new dorsalesComponente.Dorsales();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "DNI", "Fecha de Nacimiento"
            }
        ));
        jTableCorredores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCorredoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCorredores);
        if (jTableCorredores.getColumnModel().getColumnCount() > 0) {
            jTableCorredores.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(Examen1Eval_Ejercicio1.class, "Examen1Eval_Ejercicio1.jTableCorredores.columnModel.title0")); // NOI18N
            jTableCorredores.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(Examen1Eval_Ejercicio1.class, "Examen1Eval_Ejercicio1.jTableCorredores.columnModel.title1")); // NOI18N
            jTableCorredores.getColumnModel().getColumn(2).setHeaderValue(org.openide.util.NbBundle.getMessage(Examen1Eval_Ejercicio1.class, "Examen1Eval_Ejercicio1.jTableCorredores.columnModel.title2")); // NOI18N
        }

        jScrollPane2.setViewportView(jListCarreras);

        jLabelCarreras.setText(org.openide.util.NbBundle.getMessage(Examen1Eval_Ejercicio1.class, "Examen1Eval_Ejercicio1.jLabelCarreras.text")); // NOI18N

        jLabelCorredores.setText(org.openide.util.NbBundle.getMessage(Examen1Eval_Ejercicio1.class, "Examen1Eval_Ejercicio1.jLabelCorredores.text")); // NOI18N

        dorsales1.setText(org.openide.util.NbBundle.getMessage(Examen1Eval_Ejercicio1.class, "Examen1Eval_Ejercicio1.dorsales1.text")); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(Examen1Eval_Ejercicio1.class, "Examen1Eval_Ejercicio1.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout jPanelExamenLayout = new javax.swing.GroupLayout(jPanelExamen);
        jPanelExamen.setLayout(jPanelExamenLayout);
        jPanelExamenLayout.setHorizontalGroup(
            jPanelExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
            .addGroup(jPanelExamenLayout.createSequentialGroup()
                .addGroup(jPanelExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExamenLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addGroup(jPanelExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dorsales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanelExamenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCarreras))
                    .addGroup(jPanelExamenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCorredores)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelExamenLayout.setVerticalGroup(
            jPanelExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExamenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCorredores)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabelCarreras)
                .addGap(18, 18, 18)
                .addGroup(jPanelExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExamenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(dorsales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        add(jPanelExamen, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jTableCorredoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCorredoresMouseClicked
        List<String> carrerasLista = new ArrayList<>();
        int numeroCorredorSeleccionado = jTableCorredores.getSelectedRow();
        Corredor corredorSeleccionado = logicaMetodos.getCorredores().get(numeroCorredorSeleccionado);
        for (Carrera carrera : logicaMetodos.getCarreras()) {
            for (Map.Entry<Integer, Participante> entry : carrera.getParticipantes().entrySet()) {
                Participante participante = entry.getValue();
                if (corredorSeleccionado.getDni().equals(participante.getDni())) {
                    carrerasLista.add(carrera.getNombreDeCarrera());
                }
            }
        }
        int tamannoArrayList = carrerasLista.size();
        final String[] stringsCarrera = new String[tamannoArrayList];
        for (int i = 0; i < stringsCarrera.length; i++) {
            stringsCarrera[i] = carrerasLista.get(i);

        }
        jListCarreras.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = stringsCarrera;

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });


    }//GEN-LAST:event_jTableCorredoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dorsalesComponente.Dorsales dorsales1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCarreras;
    private javax.swing.JLabel jLabelCorredores;
    private javax.swing.JList<String> jListCarreras;
    private javax.swing.JPanel jPanelExamen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
