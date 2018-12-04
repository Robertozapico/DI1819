/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;

/**
 *
 * @author zapia
 */
public class ValidacionDNI extends StringValidator {

    @Override
    public void validate(Problems prblms, String componentName, String dni) {
        if (!dni.equals("") && dni.length() == 9) {

            String secuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
            dni = dni.toUpperCase();

            String numeroNIF = "";

            numeroNIF = dni.substring(0, dni.length() - 1);

            numeroNIF = numeroNIF.replace("X", "0").replace("Y", "1").replace("Z", "2");

            char letraNIF = dni.charAt(8);
            int i = Integer.parseInt(numeroNIF) % 23;
            if (letraNIF != secuenciaLetrasNIF.charAt(i)) {
                String msg = NbBundle.getMessage(this.getClass(), "MSG_DNI", componentName);
                prblms.add(msg);
            }
        } else {
            String msg = NbBundle.getMessage(this.getClass(), "MSG_DNI", componentName);
            prblms.add(msg);
        }
    }
}
