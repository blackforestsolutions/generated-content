package de.blackforestsolutions.generatedcontent.hafas.request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.blackforestsolutions.generatedcontent.hafas.request.journey.*;
import de.blackforestsolutions.generatedcontent.hafas.request.locations.Input;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "outDate",
    "outTime",
    "ctxScr",
    "getPasslist",
    "maxChg",
    "minChgTime",
    "depLocL",
    "viaLocL",
    "arrLocL",
    "jnyFltrL",
    "gisFltrL",
    "getTariff",
    "ushrp",
    "getPT",
    "getIV",
    "getPolyline",
    "numF",
    "outFrwd",
    "trfReq",
    "input"
})
public class Req implements Serializable
{

    @JsonProperty("input")
    private Input input;
    @JsonProperty("outDate")
    private String outDate;
    @JsonProperty("outTime")
    private String outTime;
    @JsonProperty("ctxScr")
    private Object ctxScr;
    @JsonProperty("getPasslist")
    private Boolean getPasslist;
    @JsonProperty("maxChg")
    private Long maxChg;
    @JsonProperty("minChgTime")
    private Long minChgTime;
    @JsonProperty("depLocL")
    private List<DepLocL> depLocL = null;
    @JsonProperty("viaLocL")
    private Object viaLocL;
    @JsonProperty("arrLocL")
    private List<ArrLocL> arrLocL = null;
    @JsonProperty("jnyFltrL")
    private List<JnyFltrL> jnyFltrL = null;
    @JsonProperty("gisFltrL")
    private List<GisFltrL> gisFltrL = null;
    @JsonProperty("getTariff")
    private Boolean getTariff;
    @JsonProperty("ushrp")
    private Boolean ushrp;
    @JsonProperty("getPT")
    private Boolean getPT;
    @JsonProperty("getIV")
    private Boolean getIV;
    @JsonProperty("getPolyline")
    private Boolean getPolyline;
    @JsonProperty("numF")
    private Long numF;
    @JsonProperty("outFrwd")
    private Boolean outFrwd;
    @JsonProperty("trfReq")
    private TrfReq trfReq;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4177586811231493774L;

    @JsonProperty("input")
    public Input getInput() {
        return input;
    }

    @JsonProperty("input")
    public void setInput(Input input) {
        this.input = input;
    }

    @JsonProperty("outDate")
    public String getOutDate() {
        return outDate;
    }

    @JsonProperty("outDate")
    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    @JsonProperty("outTime")
    public String getOutTime() {
        return outTime;
    }

    @JsonProperty("outTime")
    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    @JsonProperty("ctxScr")
    public Object getCtxScr() {
        return ctxScr;
    }

    @JsonProperty("ctxScr")
    public void setCtxScr(Object ctxScr) {
        this.ctxScr = ctxScr;
    }

    @JsonProperty("getPasslist")
    public Boolean isGetPasslist() {
        return getPasslist;
    }

    @JsonProperty("getPasslist")
    public void setGetPasslist(Boolean getPasslist) {
        this.getPasslist = getPasslist;
    }

    @JsonProperty("maxChg")
    public Long getMaxChg() {
        return maxChg;
    }

    @JsonProperty("maxChg")
    public void setMaxChg(Long maxChg) {
        this.maxChg = maxChg;
    }

    @JsonProperty("minChgTime")
    public Long getMinChgTime() {
        return minChgTime;
    }

    @JsonProperty("minChgTime")
    public void setMinChgTime(Long minChgTime) {
        this.minChgTime = minChgTime;
    }

    @JsonProperty("depLocL")
    public List<DepLocL> getDepLocL() {
        return depLocL;
    }

    @JsonProperty("depLocL")
    public void setDepLocL(List<DepLocL> depLocL) {
        this.depLocL = depLocL;
    }

    @JsonProperty("viaLocL")
    public Object getViaLocL() {
        return viaLocL;
    }

    @JsonProperty("viaLocL")
    public void setViaLocL(Object viaLocL) {
        this.viaLocL = viaLocL;
    }

    @JsonProperty("arrLocL")
    public List<ArrLocL> getArrLocL() {
        return arrLocL;
    }

    @JsonProperty("arrLocL")
    public void setArrLocL(List<ArrLocL> arrLocL) {
        this.arrLocL = arrLocL;
    }

    @JsonProperty("jnyFltrL")
    public List<JnyFltrL> getJnyFltrL() {
        return jnyFltrL;
    }

    @JsonProperty("jnyFltrL")
    public void setJnyFltrL(List<JnyFltrL> jnyFltrL) {
        this.jnyFltrL = jnyFltrL;
    }

    @JsonProperty("gisFltrL")
    public List<GisFltrL> getGisFltrL() {
        return gisFltrL;
    }

    @JsonProperty("gisFltrL")
    public void setGisFltrL(List<GisFltrL> gisFltrL) {
        this.gisFltrL = gisFltrL;
    }

    @JsonProperty("getTariff")
    public Boolean isGetTariff() {
        return getTariff;
    }

    @JsonProperty("getTariff")
    public void setGetTariff(Boolean getTariff) {
        this.getTariff = getTariff;
    }

    @JsonProperty("ushrp")
    public Boolean isUshrp() {
        return ushrp;
    }

    @JsonProperty("ushrp")
    public void setUshrp(Boolean ushrp) {
        this.ushrp = ushrp;
    }

    @JsonProperty("getPT")
    public Boolean isGetPT() {
        return getPT;
    }

    @JsonProperty("getPT")
    public void setGetPT(Boolean getPT) {
        this.getPT = getPT;
    }

    @JsonProperty("getIV")
    public Boolean isGetIV() {
        return getIV;
    }

    @JsonProperty("getIV")
    public void setGetIV(Boolean getIV) {
        this.getIV = getIV;
    }

    @JsonProperty("getPolyline")
    public Boolean isGetPolyline() {
        return getPolyline;
    }

    @JsonProperty("getPolyline")
    public void setGetPolyline(Boolean getPolyline) {
        this.getPolyline = getPolyline;
    }

    @JsonProperty("numF")
    public Long getNumF() {
        return numF;
    }

    @JsonProperty("numF")
    public void setNumF(Long numF) {
        this.numF = numF;
    }

    @JsonProperty("outFrwd")
    public Boolean isOutFrwd() {
        return outFrwd;
    }

    @JsonProperty("outFrwd")
    public void setOutFrwd(Boolean outFrwd) {
        this.outFrwd = outFrwd;
    }

    @JsonProperty("trfReq")
    public TrfReq getTrfReq() {
        return trfReq;
    }

    @JsonProperty("trfReq")
    public void setTrfReq(TrfReq trfReq) {
        this.trfReq = trfReq;
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
