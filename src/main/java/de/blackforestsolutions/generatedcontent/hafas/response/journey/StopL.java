
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locX",
    "idx",
    "dProdX",
    "dInR",
    "dTimeS",
    "dDirTxt",
    "dDirFlg",
    "dTZOffset",
    "type",
    "aProdX",
    "aOutR",
    "aTimeS",
    "aTZOffset",
    "dPlatfS",
    "dTimeR",
    "dProgType",
    "aPlatfS",
    "aTimeR",
    "aProgType",
    "dTrnCmpSX",
    "aCncl",
    "dCncl",
    "msgL",
    "dPlatfR",
    "aPlatfR"
})
public class StopL implements Serializable
{

    @JsonProperty("locX")
    private Long locX;
    @JsonProperty("idx")
    private Long idx;
    @JsonProperty("dProdX")
    private Long dProdX;
    @JsonProperty("dInR")
    private Boolean dInR;
    @JsonProperty("dTimeS")
    private String dTimeS;
    @JsonProperty("dDirTxt")
    private String dDirTxt;
    @JsonProperty("dDirFlg")
    private String dDirFlg;
    @JsonProperty("dTZOffset")
    private Long dTZOffset;
    @JsonProperty("type")
    private String type;
    @JsonProperty("aProdX")
    private Long aProdX;
    @JsonProperty("aOutR")
    private Boolean aOutR;
    @JsonProperty("aTimeS")
    private String aTimeS;
    @JsonProperty("aTZOffset")
    private Long aTZOffset;
    @JsonProperty("dPlatfS")
    private String dPlatfS;
    @JsonProperty("dPlatfR")
    private String dPlatfR;
    @JsonProperty("dTimeR")
    private String dTimeR;
    @JsonProperty("dProgType")
    private String dProgType;
    @JsonProperty("aPlatfS")
    private String aPlatfS;
    @JsonProperty("aPlatfR")
    private String aPlatfR;
    @JsonProperty("aTimeR")
    private String aTimeR;
    @JsonProperty("aProgType")
    private String aProgType;
    @JsonProperty("dTrnCmpSX")
    private DTrnCmpSX dTrnCmpSX;
    @JsonProperty("aCncl")
    private Boolean aCncl;
    @JsonProperty("dCncl")
    private Boolean dCncl;
    @JsonProperty("msgL")
    private List<MsgL> msgL = new ArrayList<MsgL>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4776156407770909947L;

    @JsonProperty("locX")
    public Long getLocX() {
        return locX;
    }

    @JsonProperty("locX")
    public void setLocX(Long locX) {
        this.locX = locX;
    }

    @JsonProperty("idx")
    public Long getIdx() {
        return idx;
    }

    @JsonProperty("idx")
    public void setIdx(Long idx) {
        this.idx = idx;
    }

    @JsonProperty("dProdX")
    public Long getDProdX() {
        return dProdX;
    }

    @JsonProperty("dProdX")
    public void setDProdX(Long dProdX) {
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
    public Long getDTZOffset() {
        return dTZOffset;
    }

    @JsonProperty("dTZOffset")
    public void setDTZOffset(Long dTZOffset) {
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
    public Long getAProdX() {
        return aProdX;
    }

    @JsonProperty("aProdX")
    public void setAProdX(Long aProdX) {
        this.aProdX = aProdX;
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
    public Long getATZOffset() {
        return aTZOffset;
    }

    @JsonProperty("aTZOffset")
    public void setATZOffset(Long aTZOffset) {
        this.aTZOffset = aTZOffset;
    }

    @JsonProperty("dPlatfS")
    public String getDPlatfS() {
        return dPlatfS;
    }

    @JsonProperty("dPlatfS")
    public void setDPlatfS(String dPlatfS) {
        this.dPlatfS = dPlatfS;
    }

    @JsonProperty("dPlatfR")
    public String getDPlatfR() {
        return dPlatfR;
    }

    @JsonProperty("dPlatfR")
    public void setDPlatfR(String dPlatfR) {
        this.dPlatfR = dPlatfR;
    }

    @JsonProperty("dTimeR")
    public String getDTimeR() {
        return dTimeR;
    }

    @JsonProperty("dTimeR")
    public void setDTimeR(String dTimeR) {
        this.dTimeR = dTimeR;
    }

    @JsonProperty("dProgType")
    public String getDProgType() {
        return dProgType;
    }

    @JsonProperty("dProgType")
    public void setDProgType(String dProgType) {
        this.dProgType = dProgType;
    }

    @JsonProperty("aPlatfS")
    public String getAPlatfS() {
        return aPlatfS;
    }

    @JsonProperty("aPlatfS")
    public void setAPlatfS(String aPlatfS) {
        this.aPlatfS = aPlatfS;
    }

    @JsonProperty("aPlatfR")
    public String getAPlatfR() {
        return aPlatfR;
    }

    @JsonProperty("aPlatfR")
    public void setAPlatfR(String aPlatfR) {
        this.aPlatfR = aPlatfR;
    }

    @JsonProperty("aTimeR")
    public String getATimeR() {
        return aTimeR;
    }

    @JsonProperty("aTimeR")
    public void setATimeR(String aTimeR) {
        this.aTimeR = aTimeR;
    }

    @JsonProperty("aProgType")
    public String getAProgType() {
        return aProgType;
    }

    @JsonProperty("aProgType")
    public void setAProgType(String aProgType) {
        this.aProgType = aProgType;
    }

    @JsonProperty("dTrnCmpSX")
    public DTrnCmpSX getDTrnCmpSX() {
        return dTrnCmpSX;
    }

    @JsonProperty("dTrnCmpSX")
    public void setDTrnCmpSX(DTrnCmpSX dTrnCmpSX) {
        this.dTrnCmpSX = dTrnCmpSX;
    }

    @JsonProperty("aCncl")
    public Boolean getACncl() {
        return aCncl;
    }

    @JsonProperty("aCncl")
    public void setACncl(Boolean aCncl) {
        this.aCncl = aCncl;
    }

    @JsonProperty("dCncl")
    public Boolean getDCncl() {
        return dCncl;
    }

    @JsonProperty("dCncl")
    public void setDCncl(Boolean dCncl) {
        this.dCncl = dCncl;
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
