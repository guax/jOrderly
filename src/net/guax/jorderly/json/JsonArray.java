/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.guax.jorderly.json;

import java.util.List;

/**
 *
 * @author guax
 */
public class JsonArray extends JsonProperty {

    protected List<JsonProperty> properties;

    public List<JsonProperty> getProperties() {
        return properties;
    }
    
    Range range;

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public void setProperties(List<JsonProperty> properties) {
        this.properties = properties;
    }

    protected <T> T findInstance(Class<T> clazz) {
        for (Object o : this.properties) {
            if (o != null && o.getClass() == clazz) {
                return clazz.cast(o);
            }
        }

        return null;
    }

    @Override
    public boolean allow(Class type) {
        if (this.getClass() == type || this.findInstance(type) != null) {
            return true;
        } else {
            return false;
        }
    }
}
