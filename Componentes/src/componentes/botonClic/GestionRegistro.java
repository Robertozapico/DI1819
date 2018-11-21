/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.botonClic;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author zapia
 */
public class GestionRegistro implements Serializable {

    private FileWriter fw = null;

    public void grabarFichero(Date fecha, String nombreDelFichero) throws ParseException, IOException {
        fw = new FileWriter(nombreDelFichero, true);
        fw.write(fecha.toString()+"\n");
        fw.close();
    }

}
