package de.blackforestsolutions.generatedcontent.osrm;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "hint",
        "distance",
        "name",
        "location"
})
public class Waypoint implements Serializable {

    private final static long serialVersionUID = -666784302870871761L;
    @JsonProperty("hint")
    private String hint;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private List<Double> location = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Waypoint() {
    }

    /**
     * @param distance
     * @param hint
     * @param name
     * @param location
     */
    public Waypoint(String hint, Double distance, String name, List<Double> location) {
        super();
        this.hint = hint;
        this.distance = distance;
        this.name = name;
        this.location = location;
    }

    @JsonProperty("hint")
    public String getHint() {
        return hint;
    }

    @JsonProperty("hint")
    public void setHint(String hint) {
        this.hint = hint;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("location")
    public List<Double> getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(List<Double> location) {
        this.location = location;
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
