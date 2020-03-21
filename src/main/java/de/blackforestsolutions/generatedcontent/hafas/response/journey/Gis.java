
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
    "dist",
    "durS",
    "ctx"
})
public class Gis implements Serializable
{

    @JsonProperty("dist")
    private Integer dist;
    @JsonProperty("durS")
    private String durS;
    @JsonProperty("ctx")
    private String ctx;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1417111392060157420L;

    @JsonProperty("dist")
    public Integer getDist() {
        return dist;
    }

    @JsonProperty("dist")
    public void setDist(Integer dist) {
        this.dist = dist;
    }

    @JsonProperty("durS")
    public String getDurS() {
        return durS;
    }

    @JsonProperty("durS")
    public void setDurS(String durS) {
        this.durS = durS;
    }

    @JsonProperty("ctx")
    public String getCtx() {
        return ctx;
    }

    @JsonProperty("ctx")
    public void setCtx(String ctx) {
        this.ctx = ctx;
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
