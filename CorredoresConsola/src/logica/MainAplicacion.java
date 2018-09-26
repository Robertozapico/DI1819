package logica;

import controlador.Controladora;
import java.text.ParseException;
import java.util.Date;
import modelo.Carrera;
import modelo.Corredor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumnop
 */
public class MainAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        
        Controladora gestionCorredores = new Controladora();
        gestionCorredores.ejecucion();
        
    }
    
}
