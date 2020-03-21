package de.blackforestsolutions.generatedcontent.hafas.request;

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
    "polyEnc",
    "rtMode"
})
public class Cfg implements Serializable
{

    @JsonProperty("polyEnc")
    private String polyEnc;
    @JsonProperty("rtMode")
    private String rtMode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6377167884810597559L;

    @JsonProperty("polyEnc")
    public String getPolyEnc() {
        return polyEnc;
    }

    @JsonProperty("polyEnc")
    public void setPolyEnc(String polyEnc) {
        this.polyEnc = polyEnc;
    }

    @JsonProperty("rtMode")
    public String getRtMode() {
        return rtMode;
    }

    @JsonProperty("rtMode")
    public void setRtMode(String rtMode) {
        this.rtMode = rtMode;
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
