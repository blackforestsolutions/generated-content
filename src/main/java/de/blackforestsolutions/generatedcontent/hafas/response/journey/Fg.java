
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

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
    "r",
    "g",
    "b",
    "a"
})
public class Fg implements Serializable
{

    @JsonProperty("r")
    private Long r;
    @JsonProperty("g")
    private Long g;
    @JsonProperty("b")
    private Long b;
    @JsonProperty("a")
    private Long a;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3030170462663799342L;

    @JsonProperty("r")
    public Long getR() {
        return r;
    }

    @JsonProperty("r")
    public void setR(Long r) {
        this.r = r;
    }

    @JsonProperty("g")
    public Long getG() {
        return g;
    }

    @JsonProperty("g")
    public void setG(Long g) {
        this.g = g;
    }

    @JsonProperty("b")
    public Long getB() {
        return b;
    }

    @JsonProperty("b")
    public void setB(Long b) {
        this.b = b;
    }

    @JsonProperty("a")
    public Long getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(Long a) {
        this.a = a;
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
