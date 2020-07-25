package de.blackforestsolutions.generatedcontent.osrm;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "bearing_after",
        "location",
        "bearing_before",
        "type",
        "modifier"
})
public class Maneuver implements Serializable {

    private final static long serialVersionUID = 5927910607189459799L;
    @JsonProperty("bearing_after")
    private Long bearingAfter;
    @JsonProperty("location")
    private List<Double> location = null;
    @JsonProperty("bearing_before")
    private Long bearingBefore;
    @JsonProperty("type")
    private String type;
    @JsonProperty("modifier")
    private String modifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Maneuver() {
    }

    /**
     * @param bearingBefore
     * @param bearingAfter
     * @param modifier
     * @param location
     * @param type
     */
    public Maneuver(Long bearingAfter, List<Double> location, Long bearingBefore, String type, String modifier) {
        super();
        this.bearingAfter = bearingAfter;
        this.location = location;
        this.bearingBefore = bearingBefore;
        this.type = type;
        this.modifier = modifier;
    }

    @JsonProperty("bearing_after")
    public Long getBearingAfter() {
        return bearingAfter;
    }

    @JsonProperty("bearing_after")
    public void setBearingAfter(Long bearingAfter) {
        this.bearingAfter = bearingAfter;
    }

    @JsonProperty("location")
    public List<Double> getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(List<Double> location) {
        this.location = location;
    }

    @JsonProperty("bearing_before")
    public Long getBearingBefore() {
        return bearingBefore;
    }

    @JsonProperty("bearing_before")
    public void setBearingBefore(Long bearingBefore) {
        this.bearingBefore = bearingBefore;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("modifier")
    public String getModifier() {
        return modifier;
    }

    @JsonProperty("modifier")
    public void setModifier(String modifier) {
        this.modifier = modifier;
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
