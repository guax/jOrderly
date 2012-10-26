/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.guax.jorderly.json;

import org.antlr.runtime.FailedPredicateException;

/**
 *
 * @author guax
 */
public class JsonInteger extends JsonNumber {

    @Override
    public boolean isValidNumber(String number) throws FailedPredicateException {
        try {
            Integer.decode(number);
        }
        catch(NumberFormatException ex) {
            throw new FailedPredicateException(this.input, "integer", "Expected integer but received " + number);
        }
        return super.isValidNumber(number);
    }

    @Override
    public boolean allow(Class type) {
        if(this.getClass() == type || JsonNumber.class == type) {
            return true;
        }
        else {
            return false;
        }
    }
}
