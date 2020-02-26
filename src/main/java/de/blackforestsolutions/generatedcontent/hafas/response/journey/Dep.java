
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locX",
    "idx",
    "dProdX",
    "dInR",
    "dTimeS",
    "dProgType",
    "dTZOffset",
    "type",
    "dPlatfS",
    "dTimeR",
    "dTrnCmpSX"
})
public class Dep implements Serializable
{

    @JsonProperty("locX")
    private Integer locX;
    @JsonProperty("idx")
    private Integer idx;
    @JsonProperty("dProdX")
    private Integer dProdX;
    @JsonProperty("dInR")
    private Boolean dInR;
    @JsonProperty("dTimeS")
    private String dTimeS;
    @JsonProperty("dProgType")
    private String dProgType;
    @JsonProperty("dTZOffset")
    private Integer dTZOffset;
    @JsonProperty("type")
    private String type;
    @JsonProperty("dPlatfS")
    private String dPlatfS;
    @JsonProperty("dTimeR")
    private String dTimeR;
    @JsonProperty("dTrnCmpSX")
    private DTrnCmpSX dTrnCmpSX;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9056495436682455756L;

    @JsonProperty("locX")
    public Integer getLocX() {
        return locX;
    }

    @JsonProperty("locX")
    public void setLocX(Integer locX) {
        this.locX = locX;
    }

    @JsonProperty("idx")
    public Integer getIdx() {
        return idx;
    }

    @JsonProperty("idx")
    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    @JsonProperty("dProdX")
    public Integer getDProdX() {
        return dProdX;
    }

    @JsonProperty("dProdX")
    public void setDProdX(Integer dProdX) {
        this.dProdX = dProdX;
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

    @JsonProperty("dProgType")
    public String getDProgType() {
        return dProgType;
    }

    @JsonProperty("dProgType")
    public void setDProgType(String dProgType) {
        this.dProgType = dProgType;
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

    @JsonProperty("dPlatfS")
    public String getDPlatfS() {
        return dPlatfS;
    }

    @JsonProperty("dPlatfS")
    public void setDPlatfS(String dPlatfS) {
        this.dPlatfS = dPlatfS;
    }

    @JsonProperty("dTimeR")
    public String getDTimeR() {
        return dTimeR;
    }

    @JsonProperty("dTimeR")
    public void setDTimeR(String dTimeR) {
        this.dTimeR = dTimeR;
    }

    @JsonProperty("dTrnCmpSX")
    public DTrnCmpSX getDTrnCmpSX() {
        return dTrnCmpSX;
    }

    @JsonProperty("dTrnCmpSX")
    public void setDTrnCmpSX(DTrnCmpSX dTrnCmpSX) {
        this.dTrnCmpSX = dTrnCmpSX;
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
