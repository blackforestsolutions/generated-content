package de.blackforestsolutions.generatedcontent.bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distance_in_meters",
        "type"
})
public class Route_ implements Serializable {

    private final static long serialVersionUID = 7222477283203983259L;
    @JsonProperty("distance_in_meters")
    private int distanceInMeters;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Route_() {
    }

    /**
     * @param distanceInMeters
     * @param type
     */
    public Route_(int distanceInMeters, String type) {
        super();
        this.distanceInMeters = distanceInMeters;
        this.type = type;
    }

    @JsonProperty("distance_in_meters")
    public int getDistanceInMeters() {
        return distanceInMeters;
    }

    @JsonProperty("distance_in_meters")
    public void setDistanceInMeters(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
