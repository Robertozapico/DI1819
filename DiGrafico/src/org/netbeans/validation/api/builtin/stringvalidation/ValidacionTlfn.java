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
public class ValidacionTlfn extends StringValidator {

    @Override
    public void validate(Problems prblms, String componentName, String telefono) {
        if (telefono.equals("") || telefono.length() != 9) {
            String msg = NbBundle.getMessage(this.getClass(), "MSG_TLFN", componentName);
            prblms.add(msg);
        }
    }

}
