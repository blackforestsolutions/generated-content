
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
    "locX",
    "idx",
    "dProdX",
    "dTimeS",
    "dDirTxt",
    "dDirFlg",
    "dTZOffset",
    "type",
    "aProdX",
    "aTimeS",
    "aTZOffset"
})
public class StopL_ implements Serializable
{

    @JsonProperty("locX")
    private Integer locX;
    @JsonProperty("idx")
    private Integer idx;
    @JsonProperty("dProdX")
    private Integer dProdX;
    @JsonProperty("dTimeS")
    private String dTimeS;
    @JsonProperty("dDirTxt")
    private String dDirTxt;
    @JsonProperty("dDirFlg")
    private String dDirFlg;
    @JsonProperty("dTZOffset")
    private Integer dTZOffset;
    @JsonProperty("type")
    private String type;
    @JsonProperty("aProdX")
    private Integer aProdX;
    @JsonProperty("aTimeS")
    private String aTimeS;
    @JsonProperty("aTZOffset")
    private Integer aTZOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1285457307403315037L;

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

    @JsonProperty("dTimeS")
    public String getDTimeS() {
        return dTimeS;
    }

    @JsonProperty("dTimeS")
    public void setDTimeS(String dTimeS) {
        this.dTimeS = dTimeS;
    }

    @JsonProperty("dDirTxt")
    public String getDDirTxt() {
        return dDirTxt;
    }

    @JsonProperty("dDirTxt")
    public void setDDirTxt(String dDirTxt) {
        this.dDirTxt = dDirTxt;
    }

    @JsonProperty("dDirFlg")
    public String getDDirFlg() {
        return dDirFlg;
    }

    @JsonProperty("dDirFlg")
    public void setDDirFlg(String dDirFlg) {
        this.dDirFlg = dDirFlg;
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

    @JsonProperty("aProdX")
    public Integer getAProdX() {
        return aProdX;
    }

    @JsonProperty("aProdX")
    public void setAProdX(Integer aProdX) {
        this.aProdX = aProdX;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
