
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "icoX",
    "dep",
    "arr",
    "jny",
    "minChg",
    "resState",
    "resRecommendation",
    "gis"
})
public class SecL implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("icoX")
    private Long icoX;
    @JsonProperty("dep")
    private Dep dep;
    @JsonProperty("arr")
    private Arr arr;
    @JsonProperty("jny")
    private Jny jny;
    @JsonProperty("minChg")
    private String minChg;
    @JsonProperty("resState")
    private String resState;
    @JsonProperty("resRecommendation")
    private String resRecommendation;
    @JsonProperty("gis")
    private Gis gis;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -326220525517705411L;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("icoX")
    public Long getIcoX() {
        return icoX;
    }

    @JsonProperty("icoX")
    public void setIcoX(Long icoX) {
        this.icoX = icoX;
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

    @JsonProperty("jny")
    public Jny getJny() {
        return jny;
    }

    @JsonProperty("jny")
    public void setJny(Jny jny) {
        this.jny = jny;
    }

    @JsonProperty("minChg")
    public String getMinChg() {
        return minChg;
    }

    @JsonProperty("minChg")
    public void setMinChg(String minChg) {
        this.minChg = minChg;
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

    @JsonProperty("gis")
    public Gis getGis() {
        return gis;
    }

    @JsonProperty("gis")
    public void setGis(Gis gis) {
        this.gis = gis;
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
