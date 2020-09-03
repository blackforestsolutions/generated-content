
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cid",
    "date",
    "dur",
    "chg",
    "sDays",
    "isNotRdbl",
    "badSecRefX",
    "dep",
    "arr",
    "secL",
    "ctxRecon",
    "freq",
    "trfRes",
    "msgL",
    "conSubscr",
    "resState",
    "resRecommendation",
    "recState",
    "sotRating",
    "isSotCon",
    "showARSLink",
    "sotCtxt",
    "cksum",
    "isAlt",
    "dTrnCmpSX"
})
public class OutConL implements Serializable
{

    @JsonProperty("cid")
    private String cid;
    @JsonProperty("date")
    private String date;
    @JsonProperty("dur")
    private String dur;
    @JsonProperty("chg")
    private Long chg;
    @JsonProperty("sDays")
    private SDays sDays;
    @JsonProperty("isNotRdbl")
    private Boolean isNotRdbl;
    @JsonProperty("badSecRefX")
    private Long badSecRefX;
    @JsonProperty("dep")
    private Dep dep;
    @JsonProperty("arr")
    private Arr arr;
    @JsonProperty("secL")
    private List<SecL> secL = new ArrayList<SecL>();
    @JsonProperty("ctxRecon")
    private String ctxRecon;
    @JsonProperty("freq")
    private Freq freq;
    @JsonProperty("trfRes")
    private TrfRes trfRes;
    @JsonProperty("msgL")
    private List<MsgL> msgL = new ArrayList<MsgL>();
    @JsonProperty("conSubscr")
    private String conSubscr;
    @JsonProperty("resState")
    private String resState;
    @JsonProperty("resRecommendation")
    private String resRecommendation;
    @JsonProperty("recState")
    private String recState;
    @JsonProperty("sotRating")
    private Long sotRating;
    @JsonProperty("isSotCon")
    private Boolean isSotCon;
    @JsonProperty("showARSLink")
    private Boolean showARSLink;
    @JsonProperty("sotCtxt")
    private SotCtxt sotCtxt;
    @JsonProperty("cksum")
    private String cksum;
    @JsonProperty("isAlt")
    private Boolean isAlt;
    @JsonProperty("dTrnCmpSX")
    private DTrnCmpSX dTrnCmpSX;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1402731518045475183L;

    @JsonProperty("cid")
    public String getCid() {
        return cid;
    }

    @JsonProperty("cid")
    public void setCid(String cid) {
        this.cid = cid;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("dur")
    public String getDur() {
        return dur;
    }

    @JsonProperty("dur")
    public void setDur(String dur) {
        this.dur = dur;
    }

    @JsonProperty("chg")
    public Long getChg() {
        return chg;
    }

    @JsonProperty("chg")
    public void setChg(Long chg) {
        this.chg = chg;
    }

    @JsonProperty("sDays")
    public SDays getSDays() {
        return sDays;
    }

    @JsonProperty("sDays")
    public void setSDays(SDays sDays) {
        this.sDays = sDays;
    }

    @JsonProperty("isNotRdbl")
    public Boolean getIsNotRdbl() {
        return isNotRdbl;
    }

    @JsonProperty("isNotRdbl")
    public void setIsNotRdbl(Boolean isNotRdbl) {
        this.isNotRdbl = isNotRdbl;
    }

    @JsonProperty("badSecRefX")
    public Long getBadSecRefX() {
        return badSecRefX;
    }

    @JsonProperty("badSecRefX")
    public void setBadSecRefX(Long badSecRefX) {
        this.badSecRefX = badSecRefX;
    }

    @JsonProperty("dep")
    public Dep getDep() {
        return dep;
    }

    @JsonProperty("dep")
    public void setDep(Dep dep) {
        this.dep = dep;
    }

    @JsonProperty("arr")
    public Arr getArr() {
        return arr;
    }

    @JsonProperty("arr")
    public void setArr(Arr arr) {
        this.arr = arr;
    }

    @JsonProperty("secL")
    public List<SecL> getSecL() {
        return secL;
    }

    @JsonProperty("secL")
    public void setSecL(List<SecL> secL) {
        this.secL = secL;
    }

    @JsonProperty("ctxRecon")
    public String getCtxRecon() {
        return ctxRecon;
    }

    @JsonProperty("ctxRecon")
    public void setCtxRecon(String ctxRecon) {
        this.ctxRecon = ctxRecon;
    }

    @JsonProperty("freq")
    public Freq getFreq() {
        return freq;
    }

    @JsonProperty("freq")
    public void setFreq(Freq freq) {
        this.freq = freq;
    }

    @JsonProperty("trfRes")
    public TrfRes getTrfRes() {
        return trfRes;
    }

    @JsonProperty("trfRes")
    public void setTrfRes(TrfRes trfRes) {
        this.trfRes = trfRes;
    }

    @JsonProperty("msgL")
    public List<MsgL> getMsgL() {
        return msgL;
    }

    @JsonProperty("msgL")
    public void setMsgL(List<MsgL> msgL) {
        this.msgL = msgL;
    }

    @JsonProperty("conSubscr")
    public String getConSubscr() {
        return conSubscr;
    }

    @JsonProperty("conSubscr")
    public void setConSubscr(String conSubscr) {
        this.conSubscr = conSubscr;
    }

    @JsonProperty("resState")
    public String getResState() {
        return resState;
    }

    @JsonProperty("resState")
    public void setResState(String resState) {
        this.resState = resState;
    }

    @JsonProperty("resRecommendation")
    public String getResRecommendation() {
        return resRecommendation;
    }

    @JsonProperty("resRecommendation")
    public void setResRecommendation(String resRecommendation) {
        this.resRecommendation = resRecommendation;
    }

    @JsonProperty("recState")
    public String getRecState() {
        return recState;
    }

    @JsonProperty("recState")
    public void setRecState(String recState) {
        this.recState = recState;
    }

    @JsonProperty("sotRating")
    public Long getSotRating() {
        return sotRating;
    }

    @JsonProperty("sotRating")
    public void setSotRating(Long sotRating) {
        this.sotRating = sotRating;
    }

    @JsonProperty("isSotCon")
    public Boolean getIsSotCon() {
        return isSotCon;
    }

    @JsonProperty("isSotCon")
    public void setIsSotCon(Boolean isSotCon) {
        this.isSotCon = isSotCon;
    }

    @JsonProperty("showARSLink")
    public Boolean getShowARSLink() {
        return showARSLink;
    }

    @JsonProperty("showARSLink")
    public void setShowARSLink(Boolean showARSLink) {
        this.showARSLink = showARSLink;
    }

    @JsonProperty("sotCtxt")
    public SotCtxt getSotCtxt() {
        return sotCtxt;
    }

    @JsonProperty("sotCtxt")
    public void setSotCtxt(SotCtxt sotCtxt) {
        this.sotCtxt = sotCtxt;
    }

    @JsonProperty("cksum")
    public String getCksum() {
        return cksum;
    }

    @JsonProperty("cksum")
    public void setCksum(String cksum) {
        this.cksum = cksum;
    }

    @JsonProperty("isAlt")
    public Boolean getIsAlt() {
        return isAlt;
    }

    @JsonProperty("isAlt")
    public void setIsAlt(Boolean isAlt) {
        this.isAlt = isAlt;
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
