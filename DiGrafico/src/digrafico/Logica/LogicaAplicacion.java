/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Logica;

import digrafico.Modelo.Carrera;
import digrafico.Modelo.Corredor;
import digrafico.Modelo.Participante;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alumnop
 */
public class LogicaAplicacion implements Serializable {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
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

    public boolean annadirCorredorLista(String nombre, String dni, Date fechaNacimiento, String direccion, int telefono) {
        Corredor nuevoCorredor = new Corredor(nombre, dni, fechaNacimiento, direccion, telefono);
        corredores.add(nuevoCorredor);
        return true;
    }

    public boolean modificarCorredor(Corredor corredorModificable, String nombre, String dni, Date fechaNacimiento, String direccion, int telefono) {
        corredorModificable.setNombre(nombre);
        corredorModificable.setDni(dni);
        corredorModificable.setFechaNacimiento(fechaNacimiento);
        corredorModificable.setDireccion(direccion);
        corredorModificable.setTelefono(telefono);
        return true;
    }

    public boolean eliminarCorredor(Corredor corredorModificable) {
        corredores.remove(corredorModificable);

        return true;
    }

    public static boolean validarDni(String nif) {
        //Si el largo del NIF es diferente a 9, acaba el método.
        if (nif.length() != 9) {
            return false;
        }

        String secuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        nif = nif.toUpperCase();

        //Posición inicial: 0 (primero en la cadena de texto).
        //Longitud: cadena de texto menos última posición. Así obtenemos solo el número.
        String numeroNIF = nif.substring(0, nif.length() - 1);

        //Si es un NIE reemplazamos letra inicial por su valor numérico.
        numeroNIF = numeroNIF.replace("X", "0").replace("Y", "1").replace("Z", "2");

        //Obtenemos la letra con un char que nos servirá también para el índice de las secuenciaLetrasNIF
        char letraNIF = nif.charAt(8);
        int i = Integer.parseInt(numeroNIF) % 23;
        return letraNIF == secuenciaLetrasNIF.charAt(i);
    }

    public boolean annadirCarreraLista(String nombreDeCarrera, Date fechaCarrera, String lugarDeCarrera, int numMaxParticipantes) {
        Carrera nuevaCarrera = new Carrera(nombreDeCarrera, fechaCarrera, lugarDeCarrera, numMaxParticipantes);
        carreras.add(nuevaCarrera);
        return true;
    }

    public boolean modificarCarrera(Carrera carreraModificable, String nombreDeCarrera, Date fechaCarrera, String lugarDeCarrera, int numMaxParticipantes) {
        carreraModificable.setNombreDeCarrera(nombreDeCarrera);
        carreraModificable.setFechaDeCarrera(fechaCarrera);
        carreraModificable.setLugarDeCarrera(lugarDeCarrera);
        carreraModificable.setNumMaxParticipantes(numMaxParticipantes);
        return true;
    }

    public boolean eliminarCarrera(Carrera carreraModificable) {
        carreras.remove(carreraModificable);

        return true;
    }

    public int crearDorsales(int cantidadDeDorsales, LinkedHashSet<Integer> dorsales) {
        int cantidadDorsales = 0;
        int dorsalCreado = 0;
        for (Integer dorsal : dorsales) {

            while (dorsales.contains(dorsalCreado)) {
                dorsalCreado = (int) Math.random() * cantidadDeDorsales;
                dorsal = dorsalCreado;
            }
            cantidadDeDorsales++;
        }
        return cantidadDorsales;
    }

}
