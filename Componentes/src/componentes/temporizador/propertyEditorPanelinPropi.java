/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.temporizador;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author alumnop
 */
public class propertyEditorPanelinPropi extends PropertyEditorSupport {

    private PanelinPropi coloresTextoPanel = new PanelinPropi();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return coloresTextoPanel;
    }

    @Override
    public String getJavaInitializationString() {
        ClaseColorTexto propiedad = coloresTextoPanel.getPropiedadSeleccionada();
        return "new componentes.temporizador.ClaseColorTexto(new java.awt.Color("
                + propiedad.getColorTexto().getRGB() + "),\""
                + propiedad.getTextoFinal()
                + "\")";
    }

    @Override
    public Object getValue() {
        return coloresTextoPanel.getPropiedadSeleccionada();
    }

}
