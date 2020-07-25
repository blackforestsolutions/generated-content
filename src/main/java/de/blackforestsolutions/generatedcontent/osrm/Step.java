package de.blackforestsolutions.generatedcontent.osrm;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "intersections",
        "driving_side",
        "geometry",
        "mode",
        "duration",
        "maneuver",
        "weight",
        "distance",
        "name",
        "ref"
})
public class Step implements Serializable {

    private final static long serialVersionUID = -2134715996910108644L;
    @JsonProperty("intersections")
    private List<Intersection> intersections = null;
    @JsonProperty("driving_side")
    private String drivingSide;
    @JsonProperty("geometry")
    private Geometry_ geometry;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("duration")
    private Long duration;
    @JsonProperty("maneuver")
    private Maneuver maneuver;
    @JsonProperty("weight")
    private Long weight;
    @JsonProperty("distance")
    private Long distance;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ref")
    private String ref;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Step() {
    }

    /**
     * @param mode
     * @param duration
     * @param drivingSide
     * @param ref
     * @param distance
     * @param name
     * @param weight
     * @param geometry
     * @param intersections
     * @param maneuver
     */
    public Step(List<Intersection> intersections, String drivingSide, Geometry_ geometry, String mode, Long duration, Maneuver maneuver, Long weight, Long distance, String name, String ref) {
        super();
        this.intersections = intersections;
        this.drivingSide = drivingSide;
        this.geometry = geometry;
        this.mode = mode;
        this.duration = duration;
        this.maneuver = maneuver;
        this.weight = weight;
        this.distance = distance;
        this.name = name;
        this.ref = ref;
    }

    @JsonProperty("intersections")
    public List<Intersection> getIntersections() {
        return intersections;
    }

    @JsonProperty("intersections")
    public void setIntersections(List<Intersection> intersections) {
        this.intersections = intersections;
    }

    @JsonProperty("driving_side")
    public String getDrivingSide() {
        return drivingSide;
    }

    @JsonProperty("driving_side")
    public void setDrivingSide(String drivingSide) {
        this.drivingSide = drivingSide;
    }

    @JsonProperty("geometry")
    public Geometry_ getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry_ geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @JsonProperty("maneuver")
    public Maneuver getManeuver() {
        return maneuver;
    }

    @JsonProperty("maneuver")
    public void setManeuver(Maneuver maneuver) {
        this.maneuver = maneuver;
    }

    @JsonProperty("weight")
    public Long getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    @JsonProperty("distance")
    public Long getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Long distance) {
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

    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
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
