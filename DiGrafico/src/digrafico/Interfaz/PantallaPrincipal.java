/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Interfaz;

import digrafico.Logica.GestionCSV;
import digrafico.Logica.LogicaAplicacion;
import digrafico.Logica.MetodosGestionFicherosObjetos;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.ImageIcon;
import org.openide.util.Exceptions;

/**
 *
 * @author alumnop
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    private LogicaAplicacion logicaMetodos = new LogicaAplicacion();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    private GestionCSV gcsv = new GestionCSV();
    private MetodosGestionFicherosObjetos mgfo = new MetodosGestionFicherosObjetos();

    public PantallaPrincipal() throws IOException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(this);
        File fichero = new File("gestionCarreras.dat");
        if (!fichero.exists()) {
            mgfo.abrirFicheroEscrituraObjetos("gestionCarreras.dat");
            mgfo.grabarObjetoFicheroObjetos(logicaMetodos);
            mgfo.cerrarFicherosEscrituraObjetos();
        }

        mgfo.abrirFicheroLecturaObjetos("gestionCarreras.dat");
        this.logicaMetodos = (LogicaAplicacion) mgfo.leerUnRegistroFicheroObjetos();
        mgfo.cerrarFicherosLecturaObjetos();
        mgfo.ejecutarAutoguardado("", 1, logicaMetodos);

        ImageIcon interrogante = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/interrogante.png")));
        Image imgInterrogante = interrogante.getImage();
        Image imgInterroganteEscalado = imgInterrogante.getScaledInstance(jButtonAyuda.getWidth(), jButtonAyuda.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iconoInterrogante = new ImageIcon(imgInterroganteEscalado);
        jButtonAyuda.setIcon(iconoInterrogante);
        ImageIcon settings = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/settings.png")));
        Image imgSettings = settings.getImage();
        Image imgSettingsEscalado = imgSettings.getScaledInstance(jLabelSettings.getWidth(), jLabelSettings.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iconoSettings = new ImageIcon(imgSettingsEscalado);
        jLabelSettings.setIcon(iconoSettings);
        jLabelSettings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Configuracion confi = new Configuracion(PantallaPrincipal.this, true, logicaMetodos);
                confi.setVisible(true);
            }
        });
        ejecutarAyuda();

    }

    private void ejecutarAyuda() {
        try {
            URL ayuda = getClass().getResource("/help/help_set.hs");
            File ficheroAyuda = new File(ayuda.toURI());
            URI hsURL = ficheroAyuda.toURI();

            //Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL.toURL());
            HelpBroker hb = helpset.createHelpBroker();

            hb.enableHelpOnButton(jButtonAyuda, "aplicacion", helpset);
            //Al pulsar F1 salta la ayuda
            hb.enableHelpKey(getRootPane(), "aplicacion", helpset);
        } catch (URISyntaxException ex) {
            Exceptions.printStackTrace(ex);
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        } catch (HelpSetException ex) {
            Exceptions.printStackTrace(ex);
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
        jLabelSettings = new javax.swing.JLabel();
        jButtonAyuda = new javax.swing.JButton();
        jbInformes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuExamen = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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

        jbInformes.setText("Informes");
        jbInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInformesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCarreraAlta)
                            .addComponent(jButtonDarAltaCorredor))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCorredoresListado)
                            .addComponent(jButtonListadoCarrera)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGestionCorredores)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabelCorredores)))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabelCarreras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jbInformes)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGestionCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCorredores)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDarAltaCorredor)
                    .addComponent(jButtonCorredoresListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabelCarreras)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCarreraAlta)
                    .addComponent(jButtonListadoCarrera))
                .addGap(39, 39, 39)
                .addComponent(jbInformes)
                .addGap(22, 22, 22))
        );

        jMenuExamen.setText("Examen1Eval>Ejercicio1");

        jMenuItem1.setText("Examen1Eval>Ejercicio1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuExamen.add(jMenuItem1);

        jMenuBar1.add(jMenuExamen);

        setJMenuBar(jMenuBar1);

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
        DialogAltaCorredor pantallaDeFormulario = new DialogAltaCorredor(this, true, logicaMetodos);
        pantallaDeFormulario.setVisible(true);

        File fichero = new File("gestionCarreras.dat");
        fichero.delete();
        mgfo.abrirFicheroEscrituraObjetos("gestionCarreras.dat");
        mgfo.grabarObjetoFicheroObjetos(logicaMetodos);
        mgfo.cerrarFicherosEscrituraObjetos();
        try {
            gcsv.grabarFicheroCSVCorredores(logicaMetodos.getCorredores());
        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
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
        File fichero = new File("gestionCarreras.dat");
        fichero.delete();
        mgfo.abrirFicheroEscrituraObjetos("gestionCarreras.dat");
        mgfo.grabarObjetoFicheroObjetos(logicaMetodos);
        mgfo.cerrarFicherosEscrituraObjetos();
    }//GEN-LAST:event_jButtonCarreraAltaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Examen1Eval_Ejercicio1 dialogoExamen = new Examen1Eval_Ejercicio1(this, true, logicaMetodos);
        dialogoExamen.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jbInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInformesActionPerformed
        DialogInformes informes = new DialogInformes(this, true, logicaMetodos);
        informes.setVisible(true);
    }//GEN-LAST:event_jbInformesActionPerformed

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
                try {
                    Locale.setDefault(new Locale("es", "ES"));
                    new PantallaPrincipal().setVisible(true);
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                } catch (ClassNotFoundException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAyuda;
    private javax.swing.JButton jButtonCarreraAlta;
    private javax.swing.JButton jButtonCorredoresListado;
    private javax.swing.JButton jButtonDarAltaCorredor;
    private javax.swing.JButton jButtonListadoCarrera;
    private javax.swing.JLabel jLabelCarreras;
    private javax.swing.JLabel jLabelCorredores;
    private javax.swing.JLabel jLabelGestionCorredores;
    private javax.swing.JLabel jLabelSettings;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExamen;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbInformes;
    // End of variables declaration//GEN-END:variables
}
