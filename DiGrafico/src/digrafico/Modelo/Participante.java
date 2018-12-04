/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digrafico.Modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author alumnop
 */
public class Participante extends Corredor implements Serializable {

    private String tiempo;
    private int dorsal;
    private int tiempoHoras;
    private int tiempoMinutos;
    private int tiempoSegundos;

    public Participante() {
    }

    public Participante(String nombre, String dni, Date fechaNacimiento, String direccion, int telefono) {
        super(nombre, dni, fechaNacimiento, direccion, telefono);
    }

    public Participante(int dorsal, String nombre, String dni, Date fechaNacimiento, String direccion, int telefono) {
        super(nombre, dni, fechaNacimiento, direccion, telefono);
        this.dorsal = dorsal;
    }

    public Participante(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(int tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    public int getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(int tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }

    public int getTiempoSegundos() {
        return tiempoSegundos;
    }

    public void setTiempoSegundos(int tiempoSegundos) {
        this.tiempoSegundos = tiempoSegundos;
    }
}
