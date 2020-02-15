
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locX",
    "aOutR",
    "aTimeS",
    "aTZOffset",
    "type"
})
public class Arr implements Serializable
{

    @JsonProperty("locX")
    private Integer locX;
    @JsonProperty("aOutR")
    private Boolean aOutR;
    @JsonProperty("aTimeS")
    private String aTimeS;
    @JsonProperty("aTZOffset")
    private Integer aTZOffset;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9148849264626557573L;

    @JsonProperty("locX")
    public Integer getLocX() {
        return locX;
    }

    @JsonProperty("locX")
    public void setLocX(Integer locX) {
        this.locX = locX;
    }

    @JsonProperty("aOutR")
    public Boolean getAOutR() {
        return aOutR;
    }

    @JsonProperty("aOutR")
    public void setAOutR(Boolean aOutR) {
        this.aOutR = aOutR;
    }

    @JsonProperty("aTimeS")
    public String getATimeS() {
        return aTimeS;
    }

    @JsonProperty("aTimeS")
    public void setATimeS(String aTimeS) {
        this.aTimeS = aTimeS;
    }

    @JsonProperty("aTZOffset")
    public Integer getATZOffset() {
        return aTZOffset;
    }

    @JsonProperty("aTZOffset")
    public void setATZOffset(Integer aTZOffset) {
        this.aTZOffset = aTZOffset;
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
