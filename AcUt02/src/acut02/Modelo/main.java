/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acut02.Modelo;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author alumnop
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] lista = null;
        File[] archivos = null;
        OperacionesFicheros of = new OperacionesFicheros();
        //Filtros
        //prueba de que el ejercicio 1.A funciona entero, falta javadoc
        //of.ListarFicheros("/home/alumnop/Carpetavacia/docu.txt", true, true);

        //prueba de que el ejercicio 1.B funciona entero, falta javadoc
        /*ArrayList<String> listaDirectorios = new ArrayList<String>();
        
        listaDirectorios.add("Nueva");
        listaDirectorios.add("Vacia");
        listaDirectorios.add("Prueba");
        File ruta = new File("/home/alumnop/Carpetavacia");
        System.out.println(of.crearDirectorio(ruta, listaDirectorios));
         */
 /*FIBONACCI
        for (int i = 0; i < 10; i++) {
            System.out.print(of.fibonacci(i) + " ");
        }
         */
        //of.ListarFicheros("", true, true);
         of.listarArchivosRecursivamente("/");
         //of.listarFicheros(filtro);

    }

}
