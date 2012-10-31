/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.guax.jorderly.json;

/**
 *
 * @author guax
 */
public class JsonAny extends JsonProperty {
    
    @Override
    public boolean allow(Class type) {
        return true;
    }
}
