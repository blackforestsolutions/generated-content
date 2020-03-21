
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tcM"
})
public class ATrnCmpSX implements Serializable
{

    @JsonProperty("tcM")
    private Integer tcM;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7179022105553610564L;

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
