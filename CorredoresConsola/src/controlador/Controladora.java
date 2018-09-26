/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import modelo.Corredor;

/**
 *
 * @author alumnop
 */
public class Controladora {

    /*Clases   de   repaso]   Creación   de   una   aplicación   en   consola   que   permita
gestionar corredores. La aplicación permitirá dar de alta, baja, modificar y
borrar corredores. Se deberá de validar la entrada de datos por parte del
usuario. La aplicación permitirá salvar y cargar los datos de un archivo CSV.
Existirá la funcionalidad de ordenar corredores por fecha de nacimiento y
mostrarlos por pantalla.*/
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
    private List<Corredor> corredores = new ArrayList<Corredor>();

    public void darAltaCorredor() throws ParseException {
        Scanner miTeclado = new Scanner(System.in);
        System.out.println("Va a dar de alta a un corredor:");
        System.out.println("Introduzca nombre del corredor:");
        String nombre = miTeclado.nextLine();
        System.out.println("Introduzca dni del corredor");
        String dni = miTeclado.nextLine();
        System.out.println("Introduzca fecha de nacimiento del corredor(Formato dd/mm/aa)");
        Date fechaNacimiento = sdf.parse(miTeclado.nextLine());
        System.out.println("Introduzca dirección del corredor");
        String direccion = miTeclado.nextLine();
        System.out.println("Introduzca teléfono del corredor");
        int telefono = miTeclado.nextInt();

        Corredor nuevoCorredor = new Corredor(nombre, dni, fechaNacimiento, direccion, telefono);
        corredores.add(nuevoCorredor);
        System.out.println("Ha dado de alta al corredor" + nuevoCorredor.toString());
    }

    public void darBajaCorredor() {
        Scanner miTeclado = new Scanner(System.in);
        System.out.println("DNI del corredor que quiere dar de baja");
        String dni = miTeclado.nextLine();
        Corredor corredorBaja = new Corredor();
        corredorBaja.setDni(dni);
        corredores.remove(Collections.binarySearch(corredores, corredorBaja));
        //corredores.remove(corredorBaja.getDni());
    }

    public void modificarCorredor() throws ParseException {
        Scanner miTeclado = new Scanner(System.in);
        System.out.println("Introduzca el DNI del corredor que quiere modificar");
        String dni = miTeclado.nextLine();
        Corredor corredorModificar = new Corredor();
        corredorModificar.setDni(dni);
        corredores.get(Collections.binarySearch(corredores, corredorModificar));

        System.out.println("Introduzca nombre:");
        String nombre = miTeclado.nextLine();
        corredores.get(Collections.binarySearch(corredores, corredorModificar)).setNombre(nombre);

        System.out.println("Introduzca dni:");
        dni = miTeclado.nextLine();
        corredores.get(Collections.binarySearch(corredores, corredorModificar)).setDni(dni);

        System.out.println("Introduzca fecha de nacimiento(dd/mm/aa)");
        Date fechaNacimiento = sdf.parse(miTeclado.nextLine());
        corredores.get(Collections.binarySearch(corredores, corredorModificar)).setFechaNacimiento(fechaNacimiento);

        System.out.println("Introduzca dirección");
        String direccion = miTeclado.nextLine();
        corredores.get(Collections.binarySearch(corredores, corredorModificar)).setDireccion(direccion);

        System.out.println("Introduzca teléfono");
        int telefono = miTeclado.nextInt();
        corredores.get(Collections.binarySearch(corredores, corredorModificar)).setTelefono(telefono);

    }

    public void ordenarCorredores() {
        Collections.sort(corredores);
        for (Corredor corredor : corredores) {
            System.out.println(corredor.toString());
        }
    }

}
