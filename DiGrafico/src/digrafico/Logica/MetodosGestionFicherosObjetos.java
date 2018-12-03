package digrafico.Logica;

import digrafico.Logica.ClaseAnhadirObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;

public class MetodosGestionFicherosObjetos{

    private File fichero = null;
    private FileInputStream fis = null;
    private ObjectInputStream ois = null;
    private ObjectOutputStream oos = null;
    private Timer timer;

    //apertura de fichero de objetos para grabar
    public void abrirFicheroEscrituraObjetos(String f) {
        try {
            oos = new ObjectOutputStream(new FileOutputStream(f));
        } catch (IOException ex) {
            System.out.println("Error en la apertura del fichero de escritura");

        }
    }

    public void abrirFicheroEscrituraObjetos(File f) {
        try {
            oos = new ObjectOutputStream(new FileOutputStream(f));
        } catch (IOException ex) {
            System.out.println("Error en la apertura del fichero de escritura");

        }
    }

    //apertura ficheros de objetos para añadir
    public void abrirFicheroParaAnhadirObjetos(String f) {
        try {
            oos = new ClaseAnhadirObjectOutputStream(new FileOutputStream(f, true));
        } catch (IOException ex) {
            System.out.println("Error en la apertura del fichero de escritura");
        }
    }

    public void abrirFicheroParaAnhadirObjetos(File f) {
        try {
            oos = new ClaseAnhadirObjectOutputStream(new FileOutputStream(f, true));
        } catch (IOException ex) {
            System.out.println("Error en la apertura del fichero de escritura");
        }
    }

    //apertura de fichero de objetos para leer
    public void abrirFicheroLecturaObjetos(File f) {

        try {
            ois = new ObjectInputStream(new FileInputStream(f));
        } catch (IOException ex) {
            System.out.println("Error en la apertura del fichero de lectura");
        }
    }

    public void abrirFicheroLecturaObjetos(String f) {

        try {
            ois = new ObjectInputStream(new FileInputStream(f));
        } catch (IOException ex) {
            System.out.println("Error en la apertura del fichero de lectura");
        }
    }

    //grabar un objeto en un fichero de objeto
    public void grabarObjetoFicheroObjetos(Object obj) {
        try {
            oos.writeObject(obj);
        } catch (IOException ex) {
            System.out.println("Error al grabar fichero");
        }
    }

    //leer un objeto de un fichero
    public Object leerUnRegistroFicheroObjetos() throws IOException, ClassNotFoundException {
        //en caso de producirse un error en la lectura la excepción que se produce 
        //la propago y hago que sea gestionada por el método de la clase que hizo la llamada
        Object registro = null;

        //leo el registro del archivo y lo devuelvo si hay un error se lo paso al padre
        //para que lo gestione
        registro = ois.readObject();
        return registro; //devuelve el registro leido
    }

    //cerrar fichero de objeto de lectura
    public void cerrarFicherosLecturaObjetos() {
        try {
            ois.close();
        } catch (IOException ex) {
            System.out.println("Error en el cierre");
        }
    }

    //cerrar fichero objeto de escritura
    public void cerrarFicherosEscrituraObjetos() {
        try {
            oos.close();
        } catch (IOException ex) {
            System.out.println("Error en el cierre");
        }
    }

    public void ejecutarAutoguardado(String ruta, int tiempo, LogicaAplicacion logicaMetodos) {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                abrirFicheroEscrituraObjetos(ruta+File.separator+"AutoSave.dat");
                System.out.println(ruta+"/autosave");
                grabarObjetoFicheroObjetos(logicaMetodos);
                cerrarFicherosEscrituraObjetos();
            }
        }, 0, tiempo * 60 * 1000);
    }

    public void pararAutoguardado(){
        timer.cancel();
    }
}
