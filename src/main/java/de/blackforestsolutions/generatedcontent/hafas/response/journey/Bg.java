
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "r",
    "g",
    "b",
    "a"
})
public class Bg implements Serializable
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
    private final static long serialVersionUID = -8778136537359989577L;

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
