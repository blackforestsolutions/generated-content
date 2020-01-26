package de.blackforestsolutions.generatedcontent.bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "value",
        "unity"
})
public class Distance implements Serializable {

    private final static long serialVersionUID = -7010746711116388390L;
    @JsonProperty("value")
    private int value;
    @JsonProperty("unity")
    private String unity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Distance() {
    }

    /**
     * @param unity
     * @param value
     */
    public Distance(int value, String unity) {
        super();
        this.value = value;
        this.unity = unity;
    }

    @JsonProperty("value")
    public int getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(int value) {
        this.value = value;
    }

    @JsonProperty("unity")
    public String getUnity() {
        return unity;
    }

    @JsonProperty("unity")
    public void setUnity(String unity) {
        this.unity = unity;
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
