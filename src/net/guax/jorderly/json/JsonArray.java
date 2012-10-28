/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.guax.jorderly.json;

import java.math.BigDecimal;
import java.util.HashMap;
import org.antlr.runtime.FailedPredicateException;

/**
 *
 * @author guax
 */
public class JsonArray extends JsonProperty {

    protected HashMap<String, JsonProperty> properties;
    
    protected boolean allowAdditionalProperties = false;

    public HashMap<String, JsonProperty> getProperties() {
        return properties;
    }

    public void setProperties(HashMap<String, JsonProperty> properties) {
        this.properties = properties;
    }
    
    public JsonProperty getProperty(String type) {
        return properties.get(type);
    }
    
    public boolean inArray;

    public void setInArray(boolean inArray) {
        this.inArray = inArray;
    }
    
    Range range;

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }
    
    public boolean inRange(int value) throws FailedPredicateException {
        if (this.range.lowerBound != null && this.range.lowerBound.compareTo(new BigDecimal(value)) > 0) {
            throw new FailedPredicateException(this.input, "string", "String does not obey character range");
        }
        
        // upper bound < value.lenght
        if (this.range.upperBound != null && this.range.upperBound.compareTo(new BigDecimal(value)) < 0) {
            throw new FailedPredicateException(this.input, "string", "String does not obey character range");
        }
        
        return true;
    }

    protected <T> T findInstance(Class<T> clazz) {
        for (Object o : this.properties.values()) {
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
