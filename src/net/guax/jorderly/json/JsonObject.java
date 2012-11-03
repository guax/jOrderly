package net.guax.jorderly.json;

import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.runtime.FailedPredicateException;

public class JsonObject extends JsonProperty {
    
    protected HashMap<String, JsonProperty> properties;
    
    protected boolean allowAdditionalProperties = false;
    
    public boolean inside;

    public void setInside(boolean inObject) {
        this.inside = inObject;
    }

    public HashMap<String, JsonProperty> getProperties() {
        return properties;
    }

    public void setProperties(HashMap<String, JsonProperty> properties) {
        this.properties = properties;
    }
    
    public JsonProperty getProperty(String name) throws FailedPredicateException {
        if((this.allowAdditionalProperties && (this.properties !=null && !this.properties.containsKey(name))) || this.properties == null) {
            return new JsonAny();
        }
        
        if(!this.properties.containsKey(name)) {
            throw new FailedPredicateException(this.input, "object", "Unexpected property: " + name);
        }
        
        return this.properties.get(name);
    }

    public boolean isAllowAdditionalProperties() {
        return allowAdditionalProperties;
    }

    public void setAllowAdditionalProperties(boolean allowAdditionalProperties) {
        this.allowAdditionalProperties = allowAdditionalProperties;
    }
    
    protected ArrayList<String> keyMark;
    
    // Check for duplicate entries
    protected ArrayList<String> allMark;
    
    public void startKeyMark() {
        if (this.properties != null) {
            this.keyMark = new ArrayList<String>(this.properties.keySet());
        }
        this.allMark = new ArrayList<String>();
    }
    
    public void markKey(String key) throws FailedPredicateException {
        if(this.allMark.contains(key)) {
            throw new FailedPredicateException(this.input, "object", "Duplicated property: " + key);
        }
        this.allMark.add(key);
        
        if (this.properties != null) {
            if(this.keyMark.contains(key)) {
                this.keyMark.remove(key);
            }
        }
    }
    
    public boolean finishKeyMark() throws FailedPredicateException {
        if (this.properties != null && this.keyMark.size() > 0) {
            String keys = "";
            for(String key : this.keyMark) {
                keys += key + " ";
            }
            throw new FailedPredicateException(this.input, "object", "Missing properties: " + keys);
        }
        return true;
    }
    
}
