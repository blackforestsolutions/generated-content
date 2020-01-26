package de.blackforestsolutions.generatedcontent.hvv.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "x",
    "y"
})
public class Track implements Serializable {

    @JsonProperty("x")
    private double x;
    @JsonProperty("y")
    private double y;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -3664581349041578103L;

    @JsonProperty("x")
    public double getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(double x) {
        this.x = x;
    }

    @JsonProperty("y")
    public double getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(double y) {
        this.y = y;
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
