package de.blackforestsolutions.generatedcontent.hafas.request.locations;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "loc",
    "maxLoc",
    "field"
})
public class Input implements Serializable
{

    @JsonProperty("loc")
    private com.example.Loc loc;
    @JsonProperty("maxLoc")
    private int maxLoc;
    @JsonProperty("field")
    private String field;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7554563440351357253L;

    @JsonProperty("loc")
    public com.example.Loc getLoc() {
        return loc;
    }

    @JsonProperty("loc")
    public void setLoc(com.example.Loc loc) {
        this.loc = loc;
    }

    @JsonProperty("maxLoc")
    public int getMaxLoc() {
        return maxLoc;
    }

    @JsonProperty("maxLoc")
    public void setMaxLoc(int maxLoc) {
        this.maxLoc = maxLoc;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
