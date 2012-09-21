package net.guax.jorderly.json;

import java.util.List;

/**
 *
 * @author guax
 */
abstract public class JsonProperty {
    
    /**
     * Default value.
     * 
     * Do not confuse null with JSONValueNull
     */
    protected Value defaultValue = null;
    
    
    protected boolean optional = false;
    
    protected List<String> requires = null;
    
    protected List<Value> enumValues = null;

    public Value getDefaultValue() {
        return defaultValue;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public List<String> getRequires() {
        return requires;
    }

    public void setRequires(List<String> requires) {
        this.requires = requires;
    }

    public List<Value> getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(List<Value> enumValues) {
        this.enumValues = enumValues;
    }
    
}
