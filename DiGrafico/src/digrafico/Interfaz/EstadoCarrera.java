/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Interfaz;

import crono.CronometroListener;
import digrafico.Logica.LogicaAplicacion;
import digrafico.Modelo.Carrera;
import java.awt.Dialog;

/**
 *
 * @author zapia
 */
public class EstadoCarrera extends javax.swing.JDialog {

    private Carrera carrera;
    private LogicaAplicacion logicaMetodos;

    /**
     * Creates new form EstadoCarrera
     */
    public EstadoCarrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public EstadoCarrera(Dialog owner, boolean modal, Carrera carrera, LogicaAplicacion logicaMetodos) {
        super(owner, modal);
        this.carrera = carrera;
        this.logicaMetodos=logicaMetodos;
        initComponents();
        jLabelNombreCarrera.setText(carrera.getNombreDeCarrera());
        
        //tempoCarrera.annadirListener();
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
        tempoCarrera = new crono.Tempo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredoresTiempo = new javax.swing.JTable();
        jLabelNombreCarrera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredoresTiempo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Corredor", "Dorsal", "Tiempo"
            }
        ));
        jScrollPane1.setViewportView(jTableCorredoresTiempo);
        if (jTableCorredoresTiempo.getColumnModel().getColumnCount() > 0) {
            jTableCorredoresTiempo.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(EstadoCarrera.class, "EstadoCarrera.jTableCorredoresTiempo.columnModel.title0")); // NOI18N
            jTableCorredoresTiempo.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(EstadoCarrera.class, "EstadoCarrera.jTableCorredoresTiempo.columnModel.title1")); // NOI18N
            jTableCorredoresTiempo.getColumnModel().getColumn(2).setHeaderValue(org.openide.util.NbBundle.getMessage(EstadoCarrera.class, "EstadoCarrera.jTableCorredoresTiempo.columnModel.title2")); // NOI18N
        }

        jLabelNombreCarrera.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNombreCarrera.setText(org.openide.util.NbBundle.getMessage(EstadoCarrera.class, "EstadoCarrera.jLabelNombreCarrera.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(tempoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 161, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(92, 92, 92))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelNombreCarrera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredoresTiempo;
    private crono.Tempo tempoCarrera;
    // End of variables declaration//GEN-END:variables
}
