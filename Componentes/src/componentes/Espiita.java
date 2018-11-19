/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author alumnop
 */
public class Espiita extends JTextField implements Serializable {

    //USAR GETDOCUMENT().ADDDOCUMENTLISTENER()
    //insertText()
    private String textoEspiado;

    public Espiita() {
    }

    public String getTextoEspiado() {
        return textoEspiado;
    }

    public void setTextoEspiado(String textoEspiado) {
        this.textoEspiado = textoEspiado;
    }

    
        
    /*
    private String ruta;
    private List<String> palabras= new ArrayList<String>;
    
    //constructor
    
        public int getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public void aniadirPalabra(String palabra){
        palabras.add(palabra);
    }
    */
    
    //run(){
     //   if(listaPalabras.contains(getText())){
      //  csv.abrir();
       // csv.grabar(getText() + " " + cal/*calendario fecha actual*/);
       // csv.cerrar();
       // }
   // }
    
    
}
