
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
    "type",
    "aTimeR",
    "aPlatfS"
})
public class Arr implements Serializable
{

    @JsonProperty("locX")
    private Long locX;
    @JsonProperty("aOutR")
    private Boolean aOutR;
    @JsonProperty("aTimeS")
    private String aTimeS;
    @JsonProperty("aTimeR")
    private String aTimeR;
    @JsonProperty("aPlatfS")
    private String aPlatfS;
    @JsonProperty("aTZOffset")
    private Long aTZOffset;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9148849264626557573L;

    @JsonProperty("locX")
    public Long getLocX() {
        return locX;
    }

    @JsonProperty("locX")
    public void setLocX(Long locX) {
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

    @JsonProperty("aTimeR")
    public String getATimeR() {
        return aTimeR;
    }

    @JsonProperty("aTimeR")
    public void setATimeR(String aTimeR) {
        this.aTimeR = aTimeR;
    }

    @JsonProperty("aTZOffset")
    public Long getATZOffset() {
        return aTZOffset;
    }

    @JsonProperty("aTZOffset")
    public void setATZOffset(Long aTZOffset) {
        this.aTZOffset = aTZOffset;
    }

    @JsonProperty("aPlatfS")
    public String getAPlatfS() {
        return aPlatfS;

    }
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("aPlatfS")
    public void setAPlatfS(String aPlatfS) {
        this.aPlatfS = aPlatfS;
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
