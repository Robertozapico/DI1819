/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.temporizador;

import java.awt.Color;

/**
 *
 * @author alumnop
 */
public class ClaseColorTexto {

    private Color colorTexto;
    private String textoFinal;

    public ClaseColorTexto(Color colorTexto, String textoFinal) {
        this.colorTexto = colorTexto;
        this.textoFinal = textoFinal;
    }

    public Color getColorTexto() {
        return colorTexto;
    }

    public String getTextoFinal() {
        return textoFinal;
    }

}
