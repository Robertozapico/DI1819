/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.botonClic;

import util.GestionRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JButton;

/**
 *
 * @author alumnop
 */
public class BotonCliquer extends JButton implements Serializable {

    private File ubicacion;
    private Date Fechita;
    private GestionRegistro gR = new GestionRegistro();
    private ActionListener pulsa;

    public BotonCliquer() {
        super();

        setText("Pulsador");
        super.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grabarClic();
            }
        });
    }

    public File getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(File ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void grabarClic() {
        Fechita = new Date();
        try {
            gR.grabarFichero(Fechita, ubicacion.getAbsolutePath() + "/registro.txt");
        } catch (ParseException ex) {
            Logger.getLogger(BotonCliquer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BotonCliquer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("pulsado");
    }

}
