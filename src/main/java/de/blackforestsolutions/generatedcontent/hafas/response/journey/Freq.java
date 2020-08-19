
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minC",
    "maxC",
    "numC",
    "jnyL"
})
public class Freq implements Serializable
{

    @JsonProperty("minC")
    private Long minC;
    @JsonProperty("maxC")
    private Long maxC;
    @JsonProperty("numC")
    private Long numC;
    @JsonProperty("jnyL")
    private List<JnyL> jnyL = new ArrayList<JnyL>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 439261889060786367L;

    @JsonProperty("minC")
    public Long getMinC() {
        return minC;
    }

    @JsonProperty("minC")
    public void setMinC(Long minC) {
        this.minC = minC;
    }

    @JsonProperty("maxC")
    public Long getMaxC() {
        return maxC;
    }

    @JsonProperty("maxC")
    public void setMaxC(Long maxC) {
        this.maxC = maxC;
    }

    @JsonProperty("numC")
    public Long getNumC() {
        return numC;
    }

    @JsonProperty("numC")
    public void setNumC(Long numC) {
        this.numC = numC;
    }

    @JsonProperty("jnyL")
    public List<JnyL> getJnyL() {
        return jnyL;
    }

    @JsonProperty("jnyL")
    public void setJnyL(List<JnyL> jnyL) {
        this.jnyL = jnyL;
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
