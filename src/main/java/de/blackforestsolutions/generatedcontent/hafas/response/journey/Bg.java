
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
    private Integer r;
    @JsonProperty("g")
    private Integer g;
    @JsonProperty("b")
    private Integer b;
    @JsonProperty("a")
    private Integer a;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8778136537359989577L;

    @JsonProperty("r")
    public Integer getR() {
        return r;
    }

    @JsonProperty("r")
    public void setR(Integer r) {
        this.r = r;
    }

    @JsonProperty("g")
    public Integer getG() {
        return g;
    }

    @JsonProperty("g")
    public void setG(Integer g) {
        this.g = g;
    }

    @JsonProperty("b")
    public Integer getB() {
        return b;
    }

    @JsonProperty("b")
    public void setB(Integer b) {
        this.b = b;
    }

    @JsonProperty("a")
    public Integer getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(Integer a) {
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
