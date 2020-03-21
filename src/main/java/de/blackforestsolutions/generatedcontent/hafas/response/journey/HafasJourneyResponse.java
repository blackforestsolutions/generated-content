
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
import de.blackforestsolutions.generatedcontent.hafas.response.SvcResL;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ver",
    "ext",
    "lang",
    "id",
    "cInfo",
    "svcResL"
})
public class HafasJourneyResponse implements Serializable
{

    @JsonProperty("ver")
    private String ver;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("id")
    private String id;
    @JsonProperty("cInfo")
    private de.blackforestsolutions.generatedcontent.hafas.response.journey.CInfo cInfo;
    @JsonProperty("svcResL")
    private List<SvcResL> svcResL = new ArrayList<SvcResL>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 372032571231227850L;

    @JsonProperty("ver")
    public String getVer() {
        return ver;
    }

    @JsonProperty("ver")
    public void setVer(String ver) {
        this.ver = ver;
    }

    @JsonProperty("ext")
    public String getExt() {
        return ext;
    }

    @JsonProperty("ext")
    public void setExt(String ext) {
        this.ext = ext;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("cInfo")
    public de.blackforestsolutions.generatedcontent.hafas.response.journey.CInfo getCInfo() {
        return cInfo;
    }

    @JsonProperty("cInfo")
    public void setCInfo(de.blackforestsolutions.generatedcontent.hafas.response.journey.CInfo cInfo) {
        this.cInfo = cInfo;
    }

    @JsonProperty("svcResL")
    public List<SvcResL> getSvcResL() {
        return svcResL;
    }

    @JsonProperty("svcResL")
    public void setSvcResL(List<SvcResL> svcResL) {
        this.svcResL = svcResL;
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
