package de.blackforestsolutions.generatedcontent.hafas.request.journey;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jnyCl",
    "tvlrProf",
    "cType"
})
public class TrfReq implements Serializable
{

    @JsonProperty("jnyCl")
    private int jnyCl;
    @JsonProperty("tvlrProf")
    private List<com.example.TvlrProf> tvlrProf = null;
    @JsonProperty("cType")
    private String cType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6850440692427016272L;

    @JsonProperty("jnyCl")
    public int getJnyCl() {
        return jnyCl;
    }

    @JsonProperty("jnyCl")
    public void setJnyCl(int jnyCl) {
        this.jnyCl = jnyCl;
    }

    @JsonProperty("tvlrProf")
    public List<com.example.TvlrProf> getTvlrProf() {
        return tvlrProf;
    }

    @JsonProperty("tvlrProf")
    public void setTvlrProf(List<com.example.TvlrProf> tvlrProf) {
        this.tvlrProf = tvlrProf;
    }

    @JsonProperty("cType")
    public String getCType() {
        return cType;
    }

    @JsonProperty("cType")
    public void setCType(String cType) {
        this.cType = cType;
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
