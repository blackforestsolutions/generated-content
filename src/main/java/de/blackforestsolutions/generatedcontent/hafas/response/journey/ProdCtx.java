
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
    "name",
    "num",
    "line",
    "matchId",
    "catOut",
    "catOutS",
    "catOutL",
    "catIn",
    "catCode",
    "admin",
    "addName"
})
public class ProdCtx implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("num")
    private String num;
    @JsonProperty("line")
    private String line;
    @JsonProperty("matchId")
    private String matchId;
    @JsonProperty("catOut")
    private String catOut;
    @JsonProperty("catOutS")
    private String catOutS;
    @JsonProperty("catOutL")
    private String catOutL;
    @JsonProperty("catIn")
    private String catIn;
    @JsonProperty("catCode")
    private String catCode;
    @JsonProperty("admin")
    private String admin;
    @JsonProperty("addName")
    private String addName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7901561520784714793L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("num")
    public String getNum() {
        return num;
    }

    @JsonProperty("num")
    public void setNum(String num) {
        this.num = num;
    }

    @JsonProperty("line")
    public String getLine() {
        return line;
    }

    @JsonProperty("line")
    public void setLine(String line) {
        this.line = line;
    }

    @JsonProperty("matchId")
    public String getMatchId() {
        return matchId;
    }

    @JsonProperty("matchId")
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    @JsonProperty("catOut")
    public String getCatOut() {
        return catOut;
    }

    @JsonProperty("catOut")
    public void setCatOut(String catOut) {
        this.catOut = catOut;
    }

    @JsonProperty("catOutS")
    public String getCatOutS() {
        return catOutS;
    }

    @JsonProperty("catOutS")
    public void setCatOutS(String catOutS) {
        this.catOutS = catOutS;
    }

    @JsonProperty("catOutL")
    public String getCatOutL() {
        return catOutL;
    }

    @JsonProperty("catOutL")
    public void setCatOutL(String catOutL) {
        this.catOutL = catOutL;
    }

    @JsonProperty("catIn")
    public String getCatIn() {
        return catIn;
    }

    @JsonProperty("catIn")
    public void setCatIn(String catIn) {
        this.catIn = catIn;
    }

    @JsonProperty("catCode")
    public String getCatCode() {
        return catCode;
    }

    @JsonProperty("catCode")
    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    @JsonProperty("admin")
    public String getAdmin() {
        return admin;
    }

    @JsonProperty("admin")
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @JsonProperty("addName")
    public String getAddName() {
        return addName;
    }

    @JsonProperty("addName")
    public void setAddName(String addName) {
        this.addName = addName;
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
