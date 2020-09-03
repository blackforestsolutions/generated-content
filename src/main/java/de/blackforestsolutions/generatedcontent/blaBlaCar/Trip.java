
package de.blackforestsolutions.generatedcontent.blaBlaCar;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "link",
    "waypoints",
    "price",
    "vehicle",
    "distance_in_meters",
    "duration_in_seconds"
})
public class Trip implements Serializable
{

    @JsonProperty("link")
    private String link;
    @JsonProperty("waypoints")
    private List<Waypoint> waypoints = null;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("vehicle")
    private Vehicle vehicle;
    @JsonProperty("distance_in_meters")
    private Long distanceInMeters;
    @JsonProperty("duration_in_seconds")
    private Long durationInSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3278517063041150203L;

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("waypoints")
    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

    @JsonProperty("waypoints")
    public void setWaypoints(List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("vehicle")
    public Vehicle getVehicle() {
        return vehicle;
    }

    @JsonProperty("vehicle")
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @JsonProperty("distance_in_meters")
    public Long getDistanceInMeters() {
        return distanceInMeters;
    }

    @JsonProperty("distance_in_meters")
    public void setDistanceInMeters(Long distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    @JsonProperty("duration_in_seconds")
    public Long getDurationInSeconds() {
        return durationInSeconds;
    }

    @JsonProperty("duration_in_seconds")
    public void setDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
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
