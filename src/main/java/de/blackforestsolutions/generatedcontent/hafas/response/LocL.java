package de.blackforestsolutions.generatedcontent.hafas.response;

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
    "lid",
    "type",
    "name",
    "icoX",
    "extId",
    "state",
    "crd"
})
public class LocL implements Serializable
{

    @JsonProperty("lid")
    private String lid;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("icoX")
    private Integer icoX;
    @JsonProperty("extId")
    private String extId;
    @JsonProperty("state")
    private String state;
    @JsonProperty("crd")
    private Crd crd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1855191811097160642L;

    @JsonProperty("lid")
    public String getLid() {
        return lid;
    }

    @JsonProperty("lid")
    public void setLid(String lid) {
        this.lid = lid;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("icoX")
    public Integer getIcoX() {
        return icoX;
    }

    @JsonProperty("icoX")
    public void setIcoX(Integer icoX) {
        this.icoX = icoX;
    }

    @JsonProperty("extId")
    public String getExtId() {
        return extId;
    }

    @JsonProperty("extId")
    public void setExtId(String extId) {
        this.extId = extId;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("crd")
    public Crd getCrd() {
        return crd;
    }

    @JsonProperty("crd")
    public void setCrd(Crd crd) {
        this.crd = crd;
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
