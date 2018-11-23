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

    private double tiempo;
    private int dorsal;

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

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}
