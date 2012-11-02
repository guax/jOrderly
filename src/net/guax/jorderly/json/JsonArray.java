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
        if(this.properties != null) {
            return properties.get(type);
        }
        
        return new JsonAny();
    }
    
    public boolean inside;

    public void setInside(boolean inside) {
        this.inside = inside;
    }
    
    Range range;

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }
    
    public boolean inRange(int value) throws FailedPredicateException {
        if(this.range == null){
            return true;
        }
        
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
        if(this.properties == null) {
            return null;
        }
        
        for (Object o : this.properties.values()) {
            if (o != null && o.getClass() == clazz) {
                return clazz.cast(o);
            }
        }

        return null;
    }

    @Override
    public boolean allow(Class type) {
        // We allow anything if we don't have defined properties.
        if (this.properties == null) {
            return true;
        }
        
        if (this.getClass() == type || this.findInstance(type) != null) {
            return true;
        } else {
            return false;
        }
    }
}
