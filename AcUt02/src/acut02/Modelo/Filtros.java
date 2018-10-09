/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acut02.Modelo;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author alumnop
 */
public class Filtros {
    
    
    
    public void imagenes(){
        
    }
    
    public void video(){
    
}
    
    public FilenameFilter filtroGif(){
        FilenameFilter filtroGif = new FilenameFilter() {
            @Override
            public boolean accept(File file, String name) {
                return name.endsWith(".gif");
            }

        };
        return filtroGif;
    }
    
    
    
    
}
