/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Interfaz;

import crono.CronometroListener;
import digrafico.Logica.LogicaAplicacion;
import digrafico.Logica.MetodosGestionFicherosObjetos;
import digrafico.Modelo.Carrera;
import digrafico.Modelo.Corredor;
import digrafico.Modelo.Participante;
import java.awt.Dialog;
import java.io.File;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zapia
 */
public class EstadoCarrera extends javax.swing.JDialog {

    private Carrera carrera;
    private LogicaAplicacion logicaMetodos;
    private MetodosGestionFicherosObjetos mgfo = new MetodosGestionFicherosObjetos();

    /**
     * Creates new form EstadoCarrera
     */
    public EstadoCarrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public EstadoCarrera(Dialog owner, boolean modal, Carrera carrera, LogicaAplicacion logicaMetodos) {
        super(owner, modal);
        this.carrera = carrera;
        this.logicaMetodos = logicaMetodos;
        initComponents();
        this.setLocationRelativeTo(this);
        jLabelNombreCarrera.setText(carrera.getNombreDeCarrera());
        tempoCarrera.annadirListener(new CronometroListener() {
            @Override
            public void annadirCorredor(String dorsal, String tiempo, int horas, int minutos, int segundos) {
                boolean registrado = false;
                //segundos = tempoCarrera.getS();
                //minutos = tempoCarrera.getM();
                //horas = tempoCarrera.getH();
                if (!carrera.getParticipantes().containsKey(Integer.parseInt(dorsal))) {
                    JOptionPane.showMessageDialog(EstadoCarrera.this, "El dorsal no existe", "Dorsal no existe", JOptionPane.ERROR_MESSAGE);
                    registrado = true;
                } else if (carrera.getParticipantes().get(Integer.parseInt(dorsal)).getTiempo() != null) {
                    JOptionPane.showMessageDialog(EstadoCarrera.this, "El dorsal ya fue registrado", "Dorsal ya registrado", JOptionPane.ERROR_MESSAGE);
                    registrado = true;
                }
                if (!registrado) {
                    carrera.getParticipantes().get(Integer.parseInt(dorsal));
                    carrera.getParticipantes().get(Integer.parseInt(dorsal)).setTiempo(tiempo);
                    carrera.getParticipantes().get(Integer.parseInt(dorsal)).setTiempoHoras(horas);
                    carrera.getParticipantes().get(Integer.parseInt(dorsal)).setTiempoMinutos(minutos);
                    carrera.getParticipantes().get(Integer.parseInt(dorsal)).setTiempoSegundos(segundos);

                    rellenarTablaCarreras();
                }
                registrado = false;
            }
        });
    }

    private void rellenarTablaCarreras() {
        String nombre = "";
        String corredorTiempo = "";
        String participanteDorsal = "";
        String[] columnas = {"Nombre", "Dorsal", "Tiempo"};
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0);
        for (Corredor corredor : logicaMetodos.getCorredores()) {
            nombre = "";
            corredorTiempo = "";
            participanteDorsal = "";
            for (Map.Entry<Integer, Participante> entry : carrera.getParticipantes().entrySet()) {
                Participante participante = entry.getValue();
                if (participante.getDni().equals(corredor.getDni())) {
                    if (participante.getTiempo() != null) {
                        //System.out.println(participante.getTiempo());
                        nombre = participante.getNombre();
                        participanteDorsal = Integer.toString(participante.getDorsal());
                        corredorTiempo = participante.getTiempo();

                        String[] a = new String[3];
                        a[0] = nombre;
                        a[1] = participanteDorsal;
                        a[2] = corredorTiempo;
                        dtm.addRow(a);
                    }
                }
            }

        }
        jTableCorredoresTiempo.setModel(dtm);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredoresTiempo = new javax.swing.JTable();
        jLabelNombreCarrera = new javax.swing.JLabel();
        jButtonCerrar = new javax.swing.JButton();
        jButtonTerminar = new javax.swing.JButton();
        tempoCarrera = new crono.Tempo();

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

        jButtonCerrar.setText(org.openide.util.NbBundle.getMessage(EstadoCarrera.class, "EstadoCarrera.jButtonCerrar.text")); // NOI18N
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jButtonTerminar.setText(org.openide.util.NbBundle.getMessage(EstadoCarrera.class, "EstadoCarrera.jButtonTerminar.text")); // NOI18N
        jButtonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonTerminar)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonCerrar)
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tempoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCerrar)
                    .addComponent(jButtonTerminar))
                .addGap(51, 51, 51))
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

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminarActionPerformed
        if (carrera.isCarreraTerminada()) {
            JOptionPane.showMessageDialog(this, "La carrera ya está terminada", "Carrera terminada", JOptionPane.ERROR_MESSAGE);
        } else {

            carrera.setCarreraTerminada(true);
            rellenarTablaCarreras();
            JOptionPane.showMessageDialog(this, "Se ha terminado la carrera");
            File fichero = new File("gestionCarreras.dat");
            fichero.delete();
            mgfo.abrirFicheroEscrituraObjetos("gestionCarreras.dat");
            mgfo.grabarObjetoFicheroObjetos(logicaMetodos);
            mgfo.cerrarFicherosEscrituraObjetos();
        }
    }//GEN-LAST:event_jButtonTerminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonTerminar;
    private javax.swing.JLabel jLabelNombreCarrera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredoresTiempo;
    private crono.Tempo tempoCarrera;
    // End of variables declaration//GEN-END:variables
}
