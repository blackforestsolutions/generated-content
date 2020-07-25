package de.blackforestsolutions.generatedcontent.osrm;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "out",
        "entry",
        "bearings",
        "location",
        "in"
})
public class Intersection implements Serializable {

    private final static long serialVersionUID = 1791245193370457832L;
    @JsonProperty("out")
    private Long out;
    @JsonProperty("entry")
    private List<Boolean> entry = null;
    @JsonProperty("bearings")
    private List<Long> bearings = null;
    @JsonProperty("location")
    private List<Double> location = null;
    @JsonProperty("in")
    private Long in;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Intersection() {
    }

    /**
     * @param entry
     * @param bearings
     * @param in
     * @param location
     * @param out
     */
    public Intersection(Long out, List<Boolean> entry, List<Long> bearings, List<Double> location, Long in) {
        super();
        this.out = out;
        this.entry = entry;
        this.bearings = bearings;
        this.location = location;
        this.in = in;
    }

    @JsonProperty("out")
    public Long getOut() {
        return out;
    }

    @JsonProperty("out")
    public void setOut(Long out) {
        this.out = out;
    }

    @JsonProperty("entry")
    public List<Boolean> getEntry() {
        return entry;
    }

    @JsonProperty("entry")
    public void setEntry(List<Boolean> entry) {
        this.entry = entry;
    }

    @JsonProperty("bearings")
    public List<Long> getBearings() {
        return bearings;
    }

    @JsonProperty("bearings")
    public void setBearings(List<Long> bearings) {
        this.bearings = bearings;
    }

    @JsonProperty("location")
    public List<Double> getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(List<Double> location) {
        this.location = location;
    }

    @JsonProperty("in")
    public Long getIn() {
        return in;
    }

    @JsonProperty("in")
    public void setIn(Long in) {
        this.in = in;
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
