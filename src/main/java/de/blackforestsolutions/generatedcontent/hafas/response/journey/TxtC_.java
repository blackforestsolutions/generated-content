
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
public class TxtC_ implements Serializable
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
    private final static long serialVersionUID = -394397851302608844L;

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
