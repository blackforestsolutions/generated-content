
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "aOutR",
    "aTimeS",
    "aProgType",
    "aTZOffset",
    "type",
    "aProdX",
    "aPlatfS",
    "aTimeR",
    "aTrnCmpSX",
    "aCncl",
    "msgL"
})
public class Arr_ implements Serializable
{

    @JsonProperty("locX")
    private Integer locX;
    @JsonProperty("idx")
    private Integer idx;
    @JsonProperty("aOutR")
    private Boolean aOutR;
    @JsonProperty("aTimeS")
    private String aTimeS;
    @JsonProperty("aProgType")
    private String aProgType;
    @JsonProperty("aTZOffset")
    private Integer aTZOffset;
    @JsonProperty("type")
    private String type;
    @JsonProperty("aProdX")
    private Integer aProdX;
    @JsonProperty("aPlatfS")
    private String aPlatfS;
    @JsonProperty("aTimeR")
    private String aTimeR;
    @JsonProperty("aTrnCmpSX")
    private ATrnCmpSX aTrnCmpSX;
    @JsonProperty("aCncl")
    private Boolean aCncl;
    @JsonProperty("msgL")
    private List<MsgL> msgL = new ArrayList<MsgL>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3401063960573588670L;

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

    @JsonProperty("aProgType")
    public String getAProgType() {
        return aProgType;
    }

    @JsonProperty("aProgType")
    public void setAProgType(String aProgType) {
        this.aProgType = aProgType;
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

    @JsonProperty("aProdX")
    public Integer getAProdX() {
        return aProdX;
    }

    @JsonProperty("aProdX")
    public void setAProdX(Integer aProdX) {
        this.aProdX = aProdX;
    }

    @JsonProperty("aPlatfS")
    public String getAPlatfS() {
        return aPlatfS;
    }

    @JsonProperty("aPlatfS")
    public void setAPlatfS(String aPlatfS) {
        this.aPlatfS = aPlatfS;
    }

    @JsonProperty("aTimeR")
    public String getATimeR() {
        return aTimeR;
    }

    @JsonProperty("aTimeR")
    public void setATimeR(String aTimeR) {
        this.aTimeR = aTimeR;
    }

    @JsonProperty("aTrnCmpSX")
    public ATrnCmpSX getATrnCmpSX() {
        return aTrnCmpSX;
    }

    @JsonProperty("aTrnCmpSX")
    public void setATrnCmpSX(ATrnCmpSX aTrnCmpSX) {
        this.aTrnCmpSX = aTrnCmpSX;
    }

    @JsonProperty("aCncl")
    public Boolean getACncl() {
        return aCncl;
    }

    @JsonProperty("aCncl")
    public void setACncl(Boolean aCncl) {
        this.aCncl = aCncl;
    }

    @JsonProperty("msgL")
    public List<MsgL> getMsgL() {
        return msgL;
    }

    @JsonProperty("msgL")
    public void setMsgL(List<MsgL> msgL) {
        this.msgL = msgL;
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
