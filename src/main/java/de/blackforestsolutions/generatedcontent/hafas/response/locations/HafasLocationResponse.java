package de.blackforestsolutions.generatedcontent.hafas.response.locations;

import com.fasterxml.jackson.annotation.*;
import de.blackforestsolutions.generatedcontent.hafas.response.SvcResL;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ver",
    "lang",
    "id",
    "svcResL"
})
public class HafasLocationResponse implements Serializable
{

    @JsonProperty("ver")
    private String ver;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("id")
    private String id;
    @JsonProperty("svcResL")
    private List<SvcResL> svcResL = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -708690895360596243L;

    @JsonProperty("ver")
    public String getVer() {
        return ver;
    }

    @JsonProperty("ver")
    public void setVer(String ver) {
        this.ver = ver;
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
