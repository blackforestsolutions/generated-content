
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jid",
    "prodX",
    "dirTxt",
    "status",
    "isRchbl",
    "stopL",
    "freq",
    "ctxRecon",
    "msgL",
    "subscr",
    "chgDurR",
    "chRatingRT",
    "dTrnCmpSX",
    "isPartCncl"
})
public class Jny implements Serializable
{

    @JsonProperty("jid")
    private String jid;
    @JsonProperty("prodX")
    private Integer prodX;
    @JsonProperty("dirTxt")
    private String dirTxt;
    @JsonProperty("status")
    private String status;
    @JsonProperty("isRchbl")
    private Boolean isRchbl;
    @JsonProperty("stopL")
    private List<StopL> stopL = new ArrayList<StopL>();
    @JsonProperty("freq")
    private Freq freq;
    @JsonProperty("ctxRecon")
    private String ctxRecon;
    @JsonProperty("msgL")
    private List<MsgL> msgL = new ArrayList<MsgL>();
    @JsonProperty("subscr")
    private String subscr;
    @JsonProperty("chgDurR")
    private Integer chgDurR;
    @JsonProperty("chRatingRT")
    private Integer chRatingRT;
    @JsonProperty("dTrnCmpSX")
    private DTrnCmpSX dTrnCmpSX;
    @JsonProperty("isPartCncl")
    private Boolean isPartCncl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6726004027930173114L;

    @JsonProperty("jid")
    public String getJid() {
        return jid;
    }

    @JsonProperty("jid")
    public void setJid(String jid) {
        this.jid = jid;
    }

    @JsonProperty("prodX")
    public Integer getProdX() {
        return prodX;
    }

    @JsonProperty("prodX")
    public void setProdX(Integer prodX) {
        this.prodX = prodX;
    }

    @JsonProperty("dirTxt")
    public String getDirTxt() {
        return dirTxt;
    }

    @JsonProperty("dirTxt")
    public void setDirTxt(String dirTxt) {
        this.dirTxt = dirTxt;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("isRchbl")
    public Boolean getIsRchbl() {
        return isRchbl;
    }

    @JsonProperty("isRchbl")
    public void setIsRchbl(Boolean isRchbl) {
        this.isRchbl = isRchbl;
    }

    @JsonProperty("stopL")
    public List<StopL> getStopL() {
        return stopL;
    }

    @JsonProperty("stopL")
    public void setStopL(List<StopL> stopL) {
        this.stopL = stopL;
    }

    @JsonProperty("freq")
    public Freq getFreq() {
        return freq;
    }

    @JsonProperty("freq")
    public void setFreq(Freq freq) {
        this.freq = freq;
    }

    @JsonProperty("ctxRecon")
    public String getCtxRecon() {
        return ctxRecon;
    }

    @JsonProperty("ctxRecon")
    public void setCtxRecon(String ctxRecon) {
        this.ctxRecon = ctxRecon;
    }

    @JsonProperty("msgL")
    public List<MsgL> getMsgL() {
        return msgL;
    }

    @JsonProperty("msgL")
    public void setMsgL(List<MsgL> msgL) {
        this.msgL = msgL;
    }

    @JsonProperty("subscr")
    public String getSubscr() {
        return subscr;
    }

    @JsonProperty("subscr")
    public void setSubscr(String subscr) {
        this.subscr = subscr;
    }

    @JsonProperty("chgDurR")
    public Integer getChgDurR() {
        return chgDurR;
    }

    @JsonProperty("chgDurR")
    public void setChgDurR(Integer chgDurR) {
        this.chgDurR = chgDurR;
    }

    @JsonProperty("chRatingRT")
    public Integer getChRatingRT() {
        return chRatingRT;
    }

    @JsonProperty("chRatingRT")
    public void setChRatingRT(Integer chRatingRT) {
        this.chRatingRT = chRatingRT;
    }

    @JsonProperty("dTrnCmpSX")
    public DTrnCmpSX getDTrnCmpSX() {
        return dTrnCmpSX;
    }

    @JsonProperty("dTrnCmpSX")
    public void setDTrnCmpSX(DTrnCmpSX dTrnCmpSX) {
        this.dTrnCmpSX = dTrnCmpSX;
    }

    @JsonProperty("isPartCncl")
    public Boolean getIsPartCncl() {
        return isPartCncl;
    }

    @JsonProperty("isPartCncl")
    public void setIsPartCncl(Boolean isPartCncl) {
        this.isPartCncl = isPartCncl;
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
