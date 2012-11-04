package net.guax.jorderly.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.antlr.runtime.IntStream;

/**
 *
 * @author guax
 */
abstract public class JsonProperty {
    
    public JsonProperty() {
        this.requires = new HashMap<String, ArrayList<JsonProperty>>();
    }
    
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
    
    protected HashMap<String, ArrayList<JsonProperty>> requires = null;
    
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
    
    public void addRequires(String property) {
        this.requires.put(property, null);
    }
    
    public void addRequires(String property, ArrayList<JsonProperty> value) {
        this.requires.put(property, value);
    }

    public List<Value> getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(List<Value> enumValues) {
        this.enumValues = enumValues;
    }
    
}
