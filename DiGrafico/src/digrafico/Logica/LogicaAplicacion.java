/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Logica;

import digrafico.Modelo.Carrera;
import digrafico.Modelo.Corredor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumnop
 */
public class LogicaAplicacion {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/aa");
    private List<Corredor> corredores = new ArrayList<Corredor>();
    private List<Carrera> carreras = new ArrayList<Carrera>();

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        LogicaAplicacion.sdf = sdf;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }
    
   

    public List<Carrera> getCarreras() {
        return carreras;
    }

    


}
