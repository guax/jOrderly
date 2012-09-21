package net.guax.jorderly.json;

import java.util.HashMap;

public class JsonObject extends JsonProperty {
    
    protected HashMap<String, JsonProperty> properties;
    
    protected boolean allowAdditionalProperties = false;

    public HashMap<String, JsonProperty> getProperties() {
        return properties;
    }

    public void setProperties(HashMap<String, JsonProperty> properties) {
        this.properties = properties;
    }

    public boolean isAllowAdditionalProperties() {
        return allowAdditionalProperties;
    }

    public void setAllowAdditionalProperties(boolean allowAdditionalProperties) {
        this.allowAdditionalProperties = allowAdditionalProperties;
    }
    
}
