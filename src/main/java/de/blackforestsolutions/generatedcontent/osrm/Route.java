package de.blackforestsolutions.generatedcontent.osrm;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "geometry",
        "legs",
        "distance",
        "duration",
        "weight_name",
        "weight"
})
public class Route implements Serializable {

    private final static long serialVersionUID = -7717890566829987904L;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("legs")
    private List<Leg> legs = null;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("duration")
    private Double duration;
    @JsonProperty("weight_name")
    private String weightName;
    @JsonProperty("weight")
    private Double weight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Route() {
    }

    /**
     * @param duration
     * @param weightName
     * @param distance
     * @param legs
     * @param weight
     * @param geometry
     */
    public Route(Geometry geometry, List<Leg> legs, Double distance, Double duration, String weightName, Double weight) {
        super();
        this.geometry = geometry;
        this.legs = legs;
        this.distance = distance;
        this.duration = duration;
        this.weightName = weightName;
        this.weight = weight;
    }

    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("legs")
    public List<Leg> getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @JsonProperty("weight_name")
    public String getWeightName() {
        return weightName;
    }

    @JsonProperty("weight_name")
    public void setWeightName(String weightName) {
        this.weightName = weightName;
    }

    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
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
