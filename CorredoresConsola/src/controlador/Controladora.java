/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import interfaz.Menu;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private List<Corredor> corredores;
    private GestionCSV gcsv;

    public Controladora() {
        corredores = new ArrayList<Corredor>();
        gcsv = new GestionCSV();
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void darAltaCorredor() {
        Scanner miTeclado = new Scanner(System.in);
        String nombre;
        String dni;
        Date fechaNacimiento = null;
        int telefono;

        System.out.println("Va a dar de alta a un corredor:");
        try {
            System.out.println("Introduzca nombre del corredor:");
            nombre = miTeclado.nextLine();
            if (soloLetras(nombre) == false) {
                throw new IllegalArgumentException("No puede introducir numeros");
            }

            System.out.println("Introduzca número del dni del corredor");
            int numDni = miTeclado.nextInt();
            dni = Integer.toString(numDni);
            if (soloLetras(Integer.toString(numDni)) == true) {
                throw new IllegalArgumentException("Error, ha introducido una letra");
            }
            System.out.println("Introduzca letra del dni del corredor");
            char letraDni = miTeclado.next().charAt(0);
            if (soloLetras(Character.toString(letraDni)) == false) {
                throw new IllegalArgumentException("Error, ha introducido un número");
            }
            dni += letraDni;
            if (dni.length() != 9) {
                throw new IllegalArgumentException("Error, ha introducido un DNI erroneo");
            }
            miTeclado.nextLine();
            try {
                System.out.println("Introduzca fecha de nacimiento del corredor(Formato dd/mm/aa)");
                fechaNacimiento = sdf.parse(miTeclado.nextLine());
            } catch (Exception ex) {
                throw new IllegalArgumentException("Error, la fecha no es válida");
            }

            System.out.println("Introduzca dirección del corredor");
            String direccion = miTeclado.nextLine();

            do {
                System.out.println("Introduzca teléfono del corredor");
                telefono = miTeclado.nextInt();
            } while (telefono < 000000000 && telefono > 999999999);

            Corredor nuevoCorredor = new Corredor(nombre, dni, fechaNacimiento, direccion, telefono);
            corredores.add(nuevoCorredor);
            System.out.println("Ha dado de alta al corredor" + nuevoCorredor.toString());
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

    public void darBajaCorredor() {
        Scanner miTeclado = new Scanner(System.in);
        String dni;
        try {
            do {
                //El programa rompe al meter el numero entero
                System.out.println("numero del DNI del corredor que quiere dar de baja");
                int numDni = miTeclado.nextInt();
                dni = Integer.toString(numDni);
                if (soloLetras(Integer.toString(numDni)) == true) {
                    throw new IllegalArgumentException("Error, ha introducido una letra");
                }
                System.out.println("Introduzca letra del dni del corredor");
                char letraDni = miTeclado.next().charAt(0);
                if (soloLetras(Character.toString(letraDni)) == false) {
                    throw new IllegalArgumentException("Error, ha introducido un número");
                }
                dni += letraDni;
                if (dni.length() != 9) {
                    throw new IllegalArgumentException("Error, ha introducido un DNI erroneo");
                }
            } while (dni.length() != 9);
            /* System.out.println("DNI del corredor que quiere dar de baja");
        String dni = miTeclado.nextLine();*/
            Corredor corredorBaja = new Corredor();
            corredorBaja.setDni(dni);
            System.out.println("Corredor eliminado");
            corredores.remove(Collections.binarySearch(corredores, corredorBaja));
            //corredores.remove(corredorBaja.getDni());
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

    public void modificarCorredor() throws ParseException {
        Scanner miTeclado = new Scanner(System.in);
        String nombre;
        String dni;
        Date fechaNacimiento = null;
        int telefono;
        Corredor corredorModificar = new Corredor();
        try {
            do {
                //El programa rompe al meter el numero entero
                System.out.println("Introduzca número del dni del corredor que quiere modificar");
                int numDni = miTeclado.nextInt();
                dni = Integer.toString(numDni);
                if (soloLetras(Integer.toString(numDni)) == true) {
                    throw new IllegalArgumentException("Error, ha introducido una letra");
                }
                System.out.println("Introduzca letra del dni del corredor");
                char letraDni = miTeclado.next().charAt(0);
                if (soloLetras(Character.toString(letraDni)) == false) {
                    throw new IllegalArgumentException("Error, ha introducido un número");
                }
                dni += letraDni;
                if (dni.length() != 9) {
                    throw new IllegalArgumentException("Error, ha introducido un DNI erroneo");
                }
            } while (dni.length() != 9);
            miTeclado.nextLine();
            corredorModificar.setDni(dni);
            corredores.get(Collections.binarySearch(corredores, corredorModificar));

            System.out.println("Introduzca nombre:");
            nombre = miTeclado.nextLine();
            if (soloLetras(nombre) == false) {
                throw new IllegalArgumentException("No puede introducir numeros");
            }
            corredores.get(Collections.binarySearch(corredores, corredorModificar)).setNombre(nombre);
            do {
                System.out.println("Introduzca dni:");
                System.out.println("Introduzca número del dni del corredor que quiere modificar");
                int numDni = miTeclado.nextInt();
                dni = Integer.toString(numDni);
                if (soloLetras(Integer.toString(numDni)) == true) {
                    throw new IllegalArgumentException("Error, ha introducido una letra");
                }
                System.out.println("Introduzca letra del dni del corredor");
                char letraDni = miTeclado.next().charAt(0);
                if (soloLetras(Character.toString(letraDni)) == false) {
                    throw new IllegalArgumentException("Error, ha introducido un número");
                }
                dni += letraDni;
                if (dni.length() != 9) {
                    throw new IllegalArgumentException("Error, ha introducido un DNI erroneo");
                }
            } while (dni.length() != 9);
            corredores.get(Collections.binarySearch(corredores, corredorModificar)).setDni(dni);
            try {
                System.out.println("Introduzca fecha de nacimiento del corredor(Formato dd/mm/aa)");
                fechaNacimiento = sdf.parse(miTeclado.nextLine());
            } catch (Exception ex) {
                throw new IllegalArgumentException("Error, la fecha no es válida");
            }
            corredores.get(Collections.binarySearch(corredores, corredorModificar)).setFechaNacimiento(fechaNacimiento);

            System.out.println("Introduzca dirección");
            String direccion = miTeclado.nextLine();
            corredores.get(Collections.binarySearch(corredores, corredorModificar)).setDireccion(direccion);
            do {
                System.out.println("Introduzca teléfono");
                telefono = miTeclado.nextInt();
            } while (telefono < 000000000 && telefono > 999999999);
            corredores.get(Collections.binarySearch(corredores, corredorModificar)).setTelefono(telefono);
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
//ordenar corredores por fecha de nacimiento

    public void ordenarCorredores() {
        Collections.sort(corredores, new Comparator<Corredor>() {
            @Override
            public int compare(Corredor o1, Corredor o2) {
                return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
            }
        });
        for (Corredor corredor : corredores) {
            System.out.println(corredor.toString());
        }

    }

    /*SOSPECHO QUE ESTE NO SIRVE LO COPIE DE NO SE QUE WEB
    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException d) {
            return false;
        }
        return true;
    }
     */
    public static boolean soloLetras(String cadena) {
        boolean resultado = true;

        for (int i = 0; i < cadena.length(); i++) {
            int asciiValue = (int) cadena.charAt(i);
            if (asciiValue > 64 && asciiValue < 91 || asciiValue > 96
                    && asciiValue < 123) {
            } else {
                resultado = false;
            }
        }
        return resultado;
    }

    public void ejecucion() {
        Scanner miTeclado = new Scanner(System.in);
        int opcion;
        Menu menu = new Menu();

        do {
            menu.mostrarMenu();
            opcion = miTeclado.nextInt();
            switch (opcion) {
                case 1:
                    darAltaCorredor();
                    break;

                case 2:
                    darBajaCorredor();
                    break;

                case 3: {
                    try {
                        modificarCorredor();
                    } catch (ParseException ex) {
                        Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case 4: {
                    try {
                        gcsv.visualizarCorredores();
                    } catch (ParseException ex) {
                        Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case 5: {
                    try {

                        gcsv.grabarFicheroCSV(corredores);
                    } catch (ParseException ex) {
                        Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case 6:
                    ordenarCorredores();
                    break;
                case 7:
                    for (Corredor corredor : corredores) {
                        System.out.println(corredor.toString());
                    }

                    break;
                case 8:

                    break;
            }

        } while (opcion != 8);

    }

}
