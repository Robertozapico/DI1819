package digrafico.Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumnop
 */
public class Carrera implements Serializable {

    /*DEJO ESTO COMO POSIBLE FUTURO*/
    private String nombreDeCarrera;
    private Date fechaDeCarrera;
    private String lugarDeCarrera;
    private int numMaxParticipantes;
    private String tiempoCarrera;
    private boolean carreraTerminada=false;
    //private LinkedHashSet<Integer> dorsales = new LinkedHashSet<Integer>();
    private List<Corredor> corredores;
    private Map<Integer, Participante> participantes = new HashMap<Integer, Participante>();

    public Carrera(String nombreDeCarrera, Date fechaCarrera, String lugarDeCarrera, int numMaxParticipantes) {
        this.nombreDeCarrera = nombreDeCarrera;
        this.fechaDeCarrera = fechaCarrera;
        this.lugarDeCarrera = lugarDeCarrera;
        this.numMaxParticipantes = numMaxParticipantes;
        corredores = new ArrayList<Corredor>();

    }

    public Carrera(String nombreDeCarrera, Date fechaDeCarrera, String lugarDeCarrera, int numMaxParticipantes, List<Corredor> corredores) {
        this.nombreDeCarrera = nombreDeCarrera;
        this.fechaDeCarrera = fechaDeCarrera;
        this.lugarDeCarrera = lugarDeCarrera;
        this.numMaxParticipantes = numMaxParticipantes;
        this.corredores = corredores;

    }

    public boolean isCarreraTerminada() {
        return carreraTerminada;
    }

    public void setCarreraTerminada(boolean carreraTerminada) {
        this.carreraTerminada = carreraTerminada;
    }

    public Map<Integer, Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Map<Integer, Participante> participantes) {
        this.participantes = participantes;
    }

    public String getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(String tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    /*
    public LinkedHashSet<Integer> getDorsales() {
        return dorsales;
    }

    public void setDorsales(LinkedHashSet<Integer> dorsales) {
        this.dorsales = dorsales;
    }*/
    public String getNombreDeCarrera() {
        return nombreDeCarrera;
    }

    public void setNombreDeCarrera(String nombreDeCarrera) {
        this.nombreDeCarrera = nombreDeCarrera;
    }

    public Date getFechaDeCarrera() {
        return fechaDeCarrera;
    }

    public void setFechaDeCarrera(Date fechaDeCarrera) {
        this.fechaDeCarrera = fechaDeCarrera;
    }

    public String getLugarDeCarrera() {
        return lugarDeCarrera;
    }

    public void setLugarDeCarrera(String lugarDeCarrera) {
        this.lugarDeCarrera = lugarDeCarrera;
    }

    public int getNumMaxParticipantes() {
        return numMaxParticipantes;
    }

    public void setNumMaxParticipantes(int numMaxParticipantes) {
        this.numMaxParticipantes = numMaxParticipantes;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombreDeCarrera=" + nombreDeCarrera + ", fechaDeCarrera=" + fechaDeCarrera + ", lugarDeCarrera=" + lugarDeCarrera + ", numMaxParticipantes=" + numMaxParticipantes + ", corredores=" + corredores + '}';
    }

}
