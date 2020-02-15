
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
    "txtC",
    "prio",
    "fIdx",
    "tIdx",
    "tagL"
})
public class MsgL implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("remX")
    private Integer remX;
    @JsonProperty("txtC")
    private TxtC txtC;
    @JsonProperty("prio")
    private Integer prio;
    @JsonProperty("fIdx")
    private Integer fIdx;
    @JsonProperty("tIdx")
    private Integer tIdx;
    @JsonProperty("tagL")
    private List<String> tagL = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4543129760472202609L;

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

    @JsonProperty("txtC")
    public TxtC getTxtC() {
        return txtC;
    }

    @JsonProperty("txtC")
    public void setTxtC(TxtC txtC) {
        this.txtC = txtC;
    }

    @JsonProperty("prio")
    public Integer getPrio() {
        return prio;
    }

    @JsonProperty("prio")
    public void setPrio(Integer prio) {
        this.prio = prio;
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
