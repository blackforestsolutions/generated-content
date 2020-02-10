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
import de.blackforestsolutions.generatedcontent.hafas.request.journey.ArrLocL;
import de.blackforestsolutions.generatedcontent.hafas.request.journey.DepLocL;
import de.blackforestsolutions.generatedcontent.hafas.request.journey.JnyFltrL;
import de.blackforestsolutions.generatedcontent.hafas.request.journey.TrfReq;
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
    private boolean getPasslist;
    @JsonProperty("maxChg")
    private int maxChg;
    @JsonProperty("minChgTime")
    private int minChgTime;
    @JsonProperty("depLocL")
    private List<DepLocL> depLocL = null;
    @JsonProperty("viaLocL")
    private Object viaLocL;
    @JsonProperty("arrLocL")
    private List<ArrLocL> arrLocL = null;
    @JsonProperty("jnyFltrL")
    private List<JnyFltrL> jnyFltrL = null;
    @JsonProperty("gisFltrL")
    private List<Object> gisFltrL = null;
    @JsonProperty("getTariff")
    private boolean getTariff;
    @JsonProperty("ushrp")
    private boolean ushrp;
    @JsonProperty("getPT")
    private boolean getPT;
    @JsonProperty("getIV")
    private boolean getIV;
    @JsonProperty("getPolyline")
    private boolean getPolyline;
    @JsonProperty("numF")
    private int numF;
    @JsonProperty("outFrwd")
    private boolean outFrwd;
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
    public boolean isGetPasslist() {
        return getPasslist;
    }

    @JsonProperty("getPasslist")
    public void setGetPasslist(boolean getPasslist) {
        this.getPasslist = getPasslist;
    }

    @JsonProperty("maxChg")
    public int getMaxChg() {
        return maxChg;
    }

    @JsonProperty("maxChg")
    public void setMaxChg(int maxChg) {
        this.maxChg = maxChg;
    }

    @JsonProperty("minChgTime")
    public int getMinChgTime() {
        return minChgTime;
    }

    @JsonProperty("minChgTime")
    public void setMinChgTime(int minChgTime) {
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
    public List<Object> getGisFltrL() {
        return gisFltrL;
    }

    @JsonProperty("gisFltrL")
    public void setGisFltrL(List<Object> gisFltrL) {
        this.gisFltrL = gisFltrL;
    }

    @JsonProperty("getTariff")
    public boolean isGetTariff() {
        return getTariff;
    }

    @JsonProperty("getTariff")
    public void setGetTariff(boolean getTariff) {
        this.getTariff = getTariff;
    }

    @JsonProperty("ushrp")
    public boolean isUshrp() {
        return ushrp;
    }

    @JsonProperty("ushrp")
    public void setUshrp(boolean ushrp) {
        this.ushrp = ushrp;
    }

    @JsonProperty("getPT")
    public boolean isGetPT() {
        return getPT;
    }

    @JsonProperty("getPT")
    public void setGetPT(boolean getPT) {
        this.getPT = getPT;
    }

    @JsonProperty("getIV")
    public boolean isGetIV() {
        return getIV;
    }

    @JsonProperty("getIV")
    public void setGetIV(boolean getIV) {
        this.getIV = getIV;
    }

    @JsonProperty("getPolyline")
    public boolean isGetPolyline() {
        return getPolyline;
    }

    @JsonProperty("getPolyline")
    public void setGetPolyline(boolean getPolyline) {
        this.getPolyline = getPolyline;
    }

    @JsonProperty("numF")
    public int getNumF() {
        return numF;
    }

    @JsonProperty("numF")
    public void setNumF(int numF) {
        this.numF = numF;
    }

    @JsonProperty("outFrwd")
    public boolean isOutFrwd() {
        return outFrwd;
    }

    @JsonProperty("outFrwd")
    public void setOutFrwd(boolean outFrwd) {
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
