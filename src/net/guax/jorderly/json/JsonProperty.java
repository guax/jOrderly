package net.guax.jorderly.json;

import java.util.List;
import org.antlr.runtime.IntStream;

/**
 *
 * @author guax
 */
abstract public class JsonProperty {
    
    IntStream input;

    public IntStream getInput() {
        return input;
    }

    public void setInput(IntStream input) {
        this.input = input;
    }
    
    /**
     * Default value.
     * 
     * Do not confuse null with JSONValueNull
     */
    protected Value defaultValue = null;
    
    protected boolean optional = false;
    
    protected List<String> requires = null;
    
    protected List<Value> enumValues = null;
    
    protected String name = null;
    
    public boolean allow(Class type) {
        if(this.getClass() == type) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
