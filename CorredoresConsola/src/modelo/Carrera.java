package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumnop
 */
public class Carrera {
/*DEJO ESTO COMO POSIBLE FUTURO*/
    private String nombreDeCarrera;
    private Date fechaDeCarrera;
    private String lugarDeCarrera;
    private int numMaxParticipantes;

    private List<Corredor> corredores = new ArrayList<Corredor>();

    public Carrera(String nombreDeCarrera, String lugarDeCarrera, int numMaxParticipantes) {
        this.nombreDeCarrera = nombreDeCarrera;
        this.fechaDeCarrera = new Date();
        this.lugarDeCarrera = lugarDeCarrera;
        this.numMaxParticipantes = numMaxParticipantes;
    }

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
