package de.blackforestsolutions.generatedcontent.hvv.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "regionType",
    "alternatives"
})
public class TariffRegion implements Serializable {

    @JsonProperty("regionType")
    private String regionType;
    @JsonProperty("alternatives")
    private List<Alternative> alternatives = new ArrayList<Alternative>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -946892850738959883L;

    @JsonProperty("regionType")
    public String getRegionType() {
        return regionType;
    }

    @JsonProperty("regionType")
    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    @JsonProperty("alternatives")
    public List<Alternative> getAlternatives() {
        return alternatives;
    }

    @JsonProperty("alternatives")
    public void setAlternatives(List<Alternative> alternatives) {
        this.alternatives = alternatives;
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
