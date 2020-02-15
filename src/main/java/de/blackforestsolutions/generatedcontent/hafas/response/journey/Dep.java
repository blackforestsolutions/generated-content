
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locX",
    "dInR",
    "dTimeS",
    "dTZOffset",
    "type"
})
public class Dep implements Serializable
{

    @JsonProperty("locX")
    private Integer locX;
    @JsonProperty("dInR")
    private Boolean dInR;
    @JsonProperty("dTimeS")
    private String dTimeS;
    @JsonProperty("dTZOffset")
    private Integer dTZOffset;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8227709989595759932L;

    @JsonProperty("locX")
    public Integer getLocX() {
        return locX;
    }

    @JsonProperty("locX")
    public void setLocX(Integer locX) {
        this.locX = locX;
    }

    @JsonProperty("dInR")
    public Boolean getDInR() {
        return dInR;
    }

    @JsonProperty("dInR")
    public void setDInR(Boolean dInR) {
        this.dInR = dInR;
    }

    @JsonProperty("dTimeS")
    public String getDTimeS() {
        return dTimeS;
    }

    @JsonProperty("dTimeS")
    public void setDTimeS(String dTimeS) {
        this.dTimeS = dTimeS;
    }

    @JsonProperty("dTZOffset")
    public Integer getDTZOffset() {
        return dTZOffset;
    }

    @JsonProperty("dTZOffset")
    public void setDTZOffset(Integer dTZOffset) {
        this.dTZOffset = dTZOffset;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
