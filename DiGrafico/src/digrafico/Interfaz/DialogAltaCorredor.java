/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Interfaz;

import digrafico.Logica.LogicaAplicacion;
import static digrafico.Logica.LogicaAplicacion.validarDni;
import digrafico.Modelo.Corredor;
import java.awt.Dialog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author alumnop
 */
public class DialogAltaCorredor extends javax.swing.JDialog {

    private LogicaAplicacion logicaMetodos;
    private Corredor corredorModificable;

    /**
     * Creates new form DialogAltaCorredor
     */
    public DialogAltaCorredor(java.awt.Frame parent, boolean modal, LogicaAplicacion logicaAplicacion) {
        super(parent, modal);
        initComponents();
        this.logicaMetodos = logicaAplicacion;
        validar();

    }

    public DialogAltaCorredor(Dialog owner, boolean modal, LogicaAplicacion logicaAplicacion) {
        super(owner, modal);
        initComponents();
        this.logicaMetodos = logicaAplicacion;
        validar();
    }

    public DialogAltaCorredor(Dialog owner, boolean modal, LogicaAplicacion logicaAplicacion, Corredor corredorAModificar) {
        super(owner, modal);
        initComponents();
        this.logicaMetodos = logicaAplicacion;
        this.corredorModificable = corredorAModificar;
        jTextFieldNombreCorredor.setText(corredorModificable.getNombre());
        jTextFieldDniNumeroCorredor.setText(corredorModificable.getDni());
        jTextFieldDireccionCorredor.setText(corredorModificable.getDireccion());
        jTextFieldTelefonoCorredor.setText(Integer.toString(corredorModificable.getTelefono()));
        jSpinnerFechaNacimientoCorredor.setValue(corredorModificable.getFechaNacimiento());
        validar();
    }

    public void validar() {
        jButtonDarAltaCorredor.setEnabled(false);
        ValidationGroup group = validationPanelUser.getValidationGroup();
        group.add(jTextFieldNombreCorredor, StringValidators.REQUIRE_NON_EMPTY_STRING);
        String dni = jTextFieldDniNumeroCorredor.getText() + jTextFieldDniLetraCorredor.getText();

        //validarDni(dni);
        group.add(jTextFieldTelefonoCorredor, StringValidators.REQUIRE_NON_EMPTY_STRING, StringValidators.REQUIRE_NON_NEGATIVE_NUMBER, StringValidators.REQUIRE_VALID_INTEGER);

        validationPanelUser.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (validationPanelUser.getProblem() == null || validarDni(dni)) {
                    jButtonDarAltaCorredor.setEnabled(true);
                } else {
                    jButtonDarAltaCorredor.setEnabled(false);
                }

            }
        });
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
        jLabelNombre = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNombreCorredor = new javax.swing.JTextField();
        jTextFieldDniNumeroCorredor = new javax.swing.JTextField();
        jTextFieldDireccionCorredor = new javax.swing.JTextField();
        jTextFieldTelefonoCorredor = new javax.swing.JTextField();
        jSpinnerFechaNacimientoCorredor = new javax.swing.JSpinner();
        jTextFieldDniLetraCorredor = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonDarAltaCorredor = new javax.swing.JButton();
        jLabelAltaCorredor = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        validationPanelUser = new org.netbeans.validation.api.ui.swing.ValidationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombre.setText("Nombre");

        jLabelDni.setText("Dni");

        jLabelFechaNacimiento.setText("Fecha de nacimiento");

        jLabelDireccion.setText("Direccion");

        jLabelTelefono.setText("Telefono");

        jTextFieldNombreCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCorredorActionPerformed(evt);
            }
        });

        jTextFieldDniNumeroCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniNumeroCorredorActionPerformed(evt);
            }
        });

        jTextFieldDireccionCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionCorredorActionPerformed(evt);
            }
        });

        jTextFieldTelefonoCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoCorredorActionPerformed(evt);
            }
        });

        jSpinnerFechaNacimientoCorredor.setModel(new javax.swing.SpinnerDateModel());

        jTextFieldDniLetraCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniLetraCorredorActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonDarAltaCorredor.setText("Dar alta al corredor");
        jButtonDarAltaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarAltaCorredorActionPerformed(evt);
            }
        });

        jLabelAltaCorredor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAltaCorredor.setText("Alta Corredor");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDni)
                    .addComponent(jLabelFechaNacimiento)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelTelefono))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldDniNumeroCorredor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDniLetraCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSpinnerFechaNacimientoCorredor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombreCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefonoCorredor)
                    .addComponent(jTextFieldDireccionCorredor))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonDarAltaCorredor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(validationPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAltaCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelAltaCorredor))
                    .addComponent(validationPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombreCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDni)
                    .addComponent(jTextFieldDniNumeroCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDniLetraCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNacimiento)
                    .addComponent(jSpinnerFechaNacimientoCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefono)
                            .addComponent(jTextFieldTelefonoCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldDireccionCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDarAltaCorredor)
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimpiar)
                .addContainerGap())
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

    private void jTextFieldNombreCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCorredorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreCorredorActionPerformed

    private void jTextFieldDniNumeroCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniNumeroCorredorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDniNumeroCorredorActionPerformed

    private void jTextFieldDniLetraCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniLetraCorredorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDniLetraCorredorActionPerformed

    private void jTextFieldDireccionCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionCorredorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionCorredorActionPerformed

    private void jTextFieldTelefonoCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoCorredorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoCorredorActionPerformed

    private void jButtonDarAltaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDarAltaCorredorActionPerformed
        Corredor corredorNuevo;
        if (corredorModificable == null) {
            String dni = jTextFieldDniNumeroCorredor.getText() + jTextFieldDniLetraCorredor.getText();
            logicaMetodos.annadirCorredorLista(jTextFieldNombreCorredor.getText(), dni, (Date) jSpinnerFechaNacimientoCorredor.getValue(), jTextFieldDireccionCorredor.getText(), Integer.parseInt(jTextFieldTelefonoCorredor.getText()));

        } else {
            System.out.println(corredorModificable.toString());
            String dni = jTextFieldDniNumeroCorredor.getText() + jTextFieldDniLetraCorredor.getText();
            logicaMetodos.modificarCorredor(corredorModificable, jTextFieldNombreCorredor.getText(), dni, (Date) jSpinnerFechaNacimientoCorredor.getValue(), jTextFieldDireccionCorredor.getText(), Integer.parseInt(jTextFieldTelefonoCorredor.getText()));
            JOptionPane.showMessageDialog(this, "Corredor añadido");
        }
        //Para cerrar la pantalla
        dispose();

    }//GEN-LAST:event_jButtonDarAltaCorredorActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextFieldNombreCorredor.setText("");
        jTextFieldDniNumeroCorredor.setText("");
        jTextFieldDniLetraCorredor.setText("");
        jTextFieldDireccionCorredor.setText("");
        jTextFieldTelefonoCorredor.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDarAltaCorredor;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabelAltaCorredor;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerFechaNacimientoCorredor;
    private javax.swing.JTextField jTextFieldDireccionCorredor;
    private javax.swing.JTextField jTextFieldDniLetraCorredor;
    private javax.swing.JTextField jTextFieldDniNumeroCorredor;
    private javax.swing.JTextField jTextFieldNombreCorredor;
    private javax.swing.JTextField jTextFieldTelefonoCorredor;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanelUser;
    // End of variables declaration//GEN-END:variables
}
