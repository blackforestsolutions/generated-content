
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
    "type",
    "remX",
    "fLocX",
    "tLocX",
    "fIdx",
    "tIdx",
    "tagL"
})
public class MsgL__ implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("remX")
    private Integer remX;
    @JsonProperty("fLocX")
    private Integer fLocX;
    @JsonProperty("tLocX")
    private Integer tLocX;
    @JsonProperty("fIdx")
    private Integer fIdx;
    @JsonProperty("tIdx")
    private Integer tIdx;
    @JsonProperty("tagL")
    private List<String> tagL = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6426736305765381259L;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("remX")
    public Integer getRemX() {
        return remX;
    }

    @JsonProperty("remX")
    public void setRemX(Integer remX) {
        this.remX = remX;
    }

    @JsonProperty("fLocX")
    public Integer getFLocX() {
        return fLocX;
    }

    @JsonProperty("fLocX")
    public void setFLocX(Integer fLocX) {
        this.fLocX = fLocX;
    }

    @JsonProperty("tLocX")
    public Integer getTLocX() {
        return tLocX;
    }

    @JsonProperty("tLocX")
    public void setTLocX(Integer tLocX) {
        this.tLocX = tLocX;
    }

    @JsonProperty("fIdx")
    public Integer getFIdx() {
        return fIdx;
    }

    @JsonProperty("fIdx")
    public void setFIdx(Integer fIdx) {
        this.fIdx = fIdx;
    }

    @JsonProperty("tIdx")
    public Integer getTIdx() {
        return tIdx;
    }

    @JsonProperty("tIdx")
    public void setTIdx(Integer tIdx) {
        this.tIdx = tIdx;
    }

    @JsonProperty("tagL")
    public List<String> getTagL() {
        return tagL;
    }

    @JsonProperty("tagL")
    public void setTagL(List<String> tagL) {
        this.tagL = tagL;
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
