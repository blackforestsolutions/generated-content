
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
    "jid",
    "prodX",
    "dirTxt",
    "stopL",
    "ctxRecon",
    "msgL",
    "subscr"
})
public class JnyL implements Serializable
{

    @JsonProperty("jid")
    private String jid;
    @JsonProperty("prodX")
    private Integer prodX;
    @JsonProperty("dirTxt")
    private String dirTxt;
    @JsonProperty("stopL")
    private List<StopL_> stopL = new ArrayList<StopL_>();
    @JsonProperty("ctxRecon")
    private String ctxRecon;
    @JsonProperty("msgL")
    private List<MsgL__> msgL = new ArrayList<MsgL__>();
    @JsonProperty("subscr")
    private String subscr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2199096695758822262L;

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

    @JsonProperty("stopL")
    public List<StopL_> getStopL() {
        return stopL;
    }

    @JsonProperty("stopL")
    public void setStopL(List<StopL_> stopL) {
        this.stopL = stopL;
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
    public List<MsgL__> getMsgL() {
        return msgL;
    }

    @JsonProperty("msgL")
    public void setMsgL(List<MsgL__> msgL) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
