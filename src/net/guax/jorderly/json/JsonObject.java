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
            
            // Removing optional values
            for(JsonProperty property : this.properties.values()) {
                if(property.isOptional()) {
                    this.keyMark.remove(property.getName());
                }
            }
            
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
    
    protected boolean passRequirement(String key) {
        JsonProperty requires_candidate = this.properties.get(key);
        if(!requires_candidate.requires.isEmpty()) {
            HashMap<String, ArrayList<JsonProperty>> requires = requires_candidate.requires;
            for (String requirement : requires.keySet()) {
                if(!this.allMark.contains(requirement)) {
                    // requirement does not exists so this is optional
                    // check next
                    continue;
                }
                
                if (requires.get(requirement) == null) {
                    // requirement not met because required property exists
                    return false;
                }
                else {
                    // Conditional requirement
                    ArrayList<JsonProperty> allRequirements = requires.get(requirement);
                    // For each aceptable value
                    boolean equalToSomething = false;
                    for (JsonProperty value : allRequirements) {
                        if(value.equals(this.properties.get(requirement))) {
                            equalToSomething = true;
                        }
                    }
                    if(equalToSomething) {
                        return false;
                    }
                    continue;
                }
            }
            // No errors
            return true;
        }
        // No requires, then it should exist.
        return false;
    }
    
    public boolean finishKeyMark() throws FailedPredicateException {
        if (this.properties != null && this.keyMark.size() > 0) {
            String keys = "";
            
            int requires_check_remains = 0;
            for(String key : this.keyMark) {
                if(!this.passRequirement(key)) {
                    keys += key + " ";
                    requires_check_remains++;
                }
            }
            
            if(requires_check_remains > 0) {
                throw new FailedPredicateException(this.input, "object", "Missing properties: " + keys);
            }
        }
        return true;
    }
    
}
