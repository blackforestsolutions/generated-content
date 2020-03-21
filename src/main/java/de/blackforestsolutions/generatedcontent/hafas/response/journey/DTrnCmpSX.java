
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
    "tcocX",
    "tcM"
})
public class DTrnCmpSX implements Serializable
{

    @JsonProperty("tcocX")
    private List<Integer> tcocX = new ArrayList<Integer>();
    @JsonProperty("tcM")
    private Integer tcM;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7616516310397412395L;

    @JsonProperty("tcocX")
    public List<Integer> getTcocX() {
        return tcocX;
    }

    @JsonProperty("tcocX")
    public void setTcocX(List<Integer> tcocX) {
        this.tcocX = tcocX;
    }

    @JsonProperty("tcM")
    public Integer getTcM() {
        return tcM;
    }

    @JsonProperty("tcM")
    public void setTcM(Integer tcM) {
        this.tcM = tcM;
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
