/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Logica;

import digrafico.Modelo.Corredor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zapia
 */
public class GestionCSV {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/aa");

    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader registro = null;
    private BufferedWriter fsalida = null;
    private List<Corredor> corredores;
    private Corredor corredor;
//borrar todas las anotaciones para borrar

    public void tokenizarCorredores(String linea) throws ParseException {
        StringTokenizer tokens = new StringTokenizer(linea, ",");
        while (tokens.hasMoreTokens()) {
            String nombre = tokens.nextToken();
            String dni = tokens.nextToken();
            String fechaNacimientoString = tokens.nextToken();
            Date fechaNacimiento = sdf.parse(fechaNacimientoString);
            String direccion = tokens.nextToken();
            int telefono = Integer.parseInt(tokens.nextToken());
            corredor = new Corredor(nombre, dni, fechaNacimiento, direccion, telefono);
            //System.out.println(corredor.toString());
        }
    }

    public void annadirListaCorredores(List<Corredor> corredoresLista) throws FileNotFoundException, IOException, ParseException {
        fr = new FileReader("corredores.csv");
        registro = new BufferedReader(fr);
        corredores = corredoresLista;
        String cadena = registro.readLine(); //leemos el primer registro
        while (cadena != null) {

            tokenizarCorredores(cadena); //llamamos al método que nos permite tokenizar
            corredores.add(corredor);
            cadena = registro.readLine(); //leemos el siguiente registro

        }
        registro.close();
        fr.close();
    }

    public void visualizarCorredores() throws ParseException {
        try {
            fr = new FileReader("corredores.csv");
            registro = new BufferedReader(fr);
            String cadena = registro.readLine(); //leemos el primer registro
            while (cadena != null) {
                tokenizarCorredores(cadena); //llamamos al método que nos permite tokenizar
                cadena = registro.readLine(); //leemos el siguiente registro

            }
            registro.close();
            fr.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void grabarFicheroCSVCorredores(List<Corredor> corredores) throws ParseException, IOException {
        fw = null;

        fw = new FileWriter("corredores.csv");
        fsalida = new BufferedWriter(fw);

        for (int i = 0; i < corredores.size(); i++) {
            fsalida.write(corredores.get(i).getNombre() + ",");
            fsalida.write(corredores.get(i).getDni() + ",");
            fsalida.write(sdf.format(corredores.get(i).getFechaNacimiento()) + ",");
            fsalida.write(corredores.get(i).getDireccion() + ",");
            fsalida.write(corredores.get(i).getTelefono() + "\n");
        }
        fsalida.close();
        fw.close();
    }

    public void cerrarFicheroLectura() throws IOException {
        registro.close();
        fr.close();
    }

}
