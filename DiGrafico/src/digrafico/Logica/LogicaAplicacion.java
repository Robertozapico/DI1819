/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Logica;

import digrafico.Modelo.Carrera;
import digrafico.Modelo.Corredor;
import digrafico.Modelo.Participante;
import java.awt.Component;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;

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
        for (Carrera carrera : carreras) {
            carrera.getParticipantes();
        }

        return true;
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

    public boolean annadirCorredoresACarrera(Carrera carreraEscogida, int[] intCorredoresSeleccionados) {

        for (int i = 0; i < intCorredoresSeleccionados.length; i++) {
            Corredor corredor = getCorredores().get(intCorredoresSeleccionados[i]);
            Participante participante = new Participante(corredor.getNombre(), corredor.getDni(), corredor.getFechaNacimiento(), corredor.getDireccion(), corredor.getTelefono());
            int dorsal = (int) (Math.random() * carreraEscogida.getNumMaxParticipantes() + 1);
            if (participante.getDorsal() == 0) {
                while (carreraEscogida.getParticipantes().containsKey(dorsal)) {
                    dorsal = (int) (Math.random() * carreraEscogida.getNumMaxParticipantes() + 1);
                }
                participante.setDorsal(dorsal);
            }
            carreraEscogida.getParticipantes().put(participante.getDorsal(), participante);
        }
        return true;
    }

    public boolean eliminarCorredoresDeUnaCarrera(int[] intCorredoresSeleccionados, Carrera carreraEscogida) {
        Participante participante;
        int dorsalABorrar = 0;
        for (int i = 0; i < intCorredoresSeleccionados.length; i++) {
            Corredor corredor = getCorredores().get(intCorredoresSeleccionados[i]);
            //System.out.println("corredor seleccionado: " + corredor);
            for (Map.Entry<Integer, Participante> entry : carreraEscogida.getParticipantes().entrySet()) {
                participante = entry.getValue();
                if (corredor.getDni().equals(participante.getDni())) {
                    dorsalABorrar = participante.getDorsal();
                }
            }
            carreraEscogida.getParticipantes().remove(dorsalABorrar);
        }
        return true;
    }

    public File escogerDirectorio(Component pantalla) {
        File ficheroEscogido = null;
        JFileChooser escogeSoloCarpetas = new JFileChooser();
        escogeSoloCarpetas.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int carpetaEscogida = escogeSoloCarpetas.showOpenDialog(pantalla);
        if (carpetaEscogida == JFileChooser.APPROVE_OPTION) {
            ficheroEscogido = escogeSoloCarpetas.getSelectedFile();
        }
        return ficheroEscogido;
    }

    public File escogerFichero(Component pantalla) {
        File ficheroEscogido = null;
        JFileChooser escogeFicheros = new JFileChooser();
        escogeFicheros.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int carpetaEscogida = escogeFicheros.showOpenDialog(pantalla);
        if (carpetaEscogida == JFileChooser.APPROVE_OPTION) {
            ficheroEscogido = escogeFicheros.getSelectedFile();
        }
        return ficheroEscogido;
    }

    public void borrarCorredoresDeTodasLasCarreras(Corredor corredor) {
        for (Carrera carrera : carreras) {
            for (Map.Entry<Integer, Participante> entry : carrera.getParticipantes().entrySet()) {
                Participante participante = entry.getValue();
                if (corredor.getDni().equals(participante.getDni())) {
                    carrera.getParticipantes().remove(participante.getDorsal());
                }
            }
        }
    }
//Segunda Evaluacion
    public List<Carrera> obtenerCarrerasNoFinalizadas() {
        List<Carrera> listaCarrerasNoFinalizadas = new ArrayList<Carrera>();

        for (Iterator<Carrera> iterator = this.carreras.iterator(); iterator.hasNext();) {
            Carrera next = iterator.next();
            if (!next.isCarreraTerminada()) {
                listaCarrerasNoFinalizadas.add(next);
            }
        }
        return listaCarrerasNoFinalizadas;
    }
}
