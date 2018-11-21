/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.temporizador;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alumnop
 */
public class Temporizador extends JLabel implements Serializable {
    
    private int segundos;
    private int segundosRestantes;
    private double segundosRestantesDouble;
    private String textoFinal = null;
    private Color colorComponente;
    private boolean decimales;
    private File imagenFinal;
    private ClaseColorTexto textoYColor;
    
    public Temporizador() {
    }
    
    public ClaseColorTexto getTextoYColor() {
        return textoYColor;
    }
    
    public void setTextoYColor(ClaseColorTexto textoYColor) {
        this.textoYColor = textoYColor;
    }
    
    public String getTextoFinal() {
        return textoFinal;
    }
    
    public void setTextoFinal(String textoFinal) {
        this.textoFinal = textoFinal;
    }
    
    public Color getColorComponente() {
        return colorComponente;
    }
    
    public void setColorComponente(Color colorComponente) {
        this.colorComponente = colorComponente;
    }
    
    public boolean isDecimales() {
        return decimales;
    }
    
    public void setDecimales(boolean decimales) {
        this.decimales = decimales;
    }
    
    public File getImagenFinal() {
        return imagenFinal;
    }
    
    public void setImagenFinal(File imagenFinal) {
        this.imagenFinal = imagenFinal;
    }
    
    public int getSegundos() {
        return segundos;
    }
    
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void start() {
        
        DecimalFormat decimalFormat = new DecimalFormat("####.#");
        segundosRestantes = segundos;
        segundosRestantesDouble = segundos;
        int milisegundos;
        if (decimales == true) {
            milisegundos = 100;
        } else {
            milisegundos = 1000;
        }
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (decimales != true) {
                    
                    setText(Integer.toString(segundos));
                    setText(Integer.toString(segundosRestantes--));
                } else {
                    setText(decimalFormat.format(segundosRestantesDouble)/*Double.toString(segundosRestantesDouble)*/);
                    segundosRestantesDouble -= 0.1;
                }
                if (segundosRestantes <= -1 || segundosRestantesDouble <= 0.0) {
                    if (decimales == true) {
                        setText("0.0");
                    }
                    if (textoFinal != null) {
                        setText(textoFinal);
                    }
                    if (colorComponente != null) {
                        setOpaque(true);
                        setBackground(colorComponente);
                    }
                    if (imagenFinal != null) {
                        setText("");
                        //setIcon(new ImageIcon(imagenFinal.getAbsolutePath()));
                        //REDIMENSIONAR IMAGEN
                        Image img = new ImageIcon(imagenFinal.getAbsolutePath()).getImage();
                        ImageIcon img2 = new ImageIcon(img.getScaledInstance(78, 124, Image.SCALE_SMOOTH));
                        
                        setIcon(img2);
                    }
                    if (textoYColor != null) {
                        setText(textoYColor.getTextoFinal());
                        setForeground(textoYColor.getColorTexto());
                    }
                    cancel();
                }
            }
        }, 0, milisegundos);
        
    }
    
}
