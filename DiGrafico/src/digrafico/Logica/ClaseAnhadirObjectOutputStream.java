
package digrafico.Logica;
 /*
Clase que permite abrir un fichero de objetos para A�ADIR objetos al final del fichero, evitando el problema de que escriba una cabecera al principio de cada sesion
esta clase es un clon de a clase ObjectOutputSream con los mismos m�todos pero al cual se le ha modificado el m�todo writeStreamHeader() para que no escriba la cabecera si vamos a a�adir en una nueva sesi�n de grabacion
*/

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ClaseAnhadirObjectOutputStream extends ObjectOutputStream {
        //bloque que sobreescribe el metodo writeStreamHeader para que no vuelva a 
        //escribir la cabecera del fichero cada vez qeu abramos el fichero para 
        //añadir. Sobreescribirmos el método writeStremHeader con reset() y asi
        //no pone nueva cabecera al nuevo bloque de registros que escribamos

        public ClaseAnhadirObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        @Override
        protected void writeStreamHeader() throws IOException {
            reset();
            }
    }