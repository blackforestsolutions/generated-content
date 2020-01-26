package de.blackforestsolutions.generatedcontent.bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_self",
        "_front"
})
public class Links_ implements Serializable {

    private final static long serialVersionUID = 8631609055862057917L;
    @JsonProperty("_self")
    private String self;
    @JsonProperty("_front")
    private String front;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Links_() {
    }

    /**
     * @param self
     * @param front
     */
    public Links_(String self, String front) {
        super();
        this.self = self;
        this.front = front;
    }

    @JsonProperty("_self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("_self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("_front")
    public String getFront() {
        return front;
    }

    @JsonProperty("_front")
    public void setFront(String front) {
        this.front = front;
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
