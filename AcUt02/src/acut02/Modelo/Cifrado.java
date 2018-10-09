/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acut02.Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alumnop
 */
public class Cifrado {
//Ejercicio 3
    private FileInputStream in = null;
    private FileOutputStream out = null;
    private Map<String,Integer> distribucionLetras = new HashMap<>();

    public int cifrar() throws FileNotFoundException, IOException {
        int caracteresCifrados = 0;
        try {
            in = new FileInputStream("archivo.csv");
            out = new FileOutputStream("archivoCifrado.csv");
            int c;
            
            while ((c = in.read()) != -1) {
                int contadorLetras=1;
                out.write(c + 3);
                caracteresCifrados++;
                if(distribucionLetras.get(c)){
                    System.out.println("quiero que funcione");
                    contadorLetras=contadorLetras+Integer.parseInt(distribucionLetras.values().toString());
                    System.out.println("El integer: "+Integer.parseInt(distribucionLetras.values().toString()));
                }
                System.out.println("Contador:" + contadorLetras);
                distribucionLetras.put(Character.toString((char) c), contadorLetras);
                System.out.println(contadorLetras);
                System.out.println(distribucionLetras.toString());
                
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println(distribucionLetras.toString());
        return caracteresCifrados;
    }

    public int descifrar() throws FileNotFoundException, IOException {
        int caracteresDescifrados = 0;
        try {
            in = new FileInputStream("archivoCifrado.csv");
            out = new FileOutputStream("archivoDescifrado.csv");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c - 3);
                caracteresDescifrados++;
                distribucionLetras.put(Character.toString((char) c), 5);
                
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        
        return caracteresDescifrados;
    }
    
    
}
