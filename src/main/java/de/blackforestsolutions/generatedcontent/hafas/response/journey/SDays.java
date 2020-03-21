
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
    "sDaysR",
    "sDaysI",
    "sDaysB"
})
public class SDays implements Serializable
{

    @JsonProperty("sDaysR")
    private String sDaysR;
    @JsonProperty("sDaysI")
    private String sDaysI;
    @JsonProperty("sDaysB")
    private String sDaysB;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5608723173383155834L;

    @JsonProperty("sDaysR")
    public String getSDaysR() {
        return sDaysR;
    }

    @JsonProperty("sDaysR")
    public void setSDaysR(String sDaysR) {
        this.sDaysR = sDaysR;
    }

    @JsonProperty("sDaysI")
    public String getSDaysI() {
        return sDaysI;
    }

    @JsonProperty("sDaysI")
    public void setSDaysI(String sDaysI) {
        this.sDaysI = sDaysI;
    }

    @JsonProperty("sDaysB")
    public String getSDaysB() {
        return sDaysB;
    }

    @JsonProperty("sDaysB")
    public void setSDaysB(String sDaysB) {
        this.sDaysB = sDaysB;
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
