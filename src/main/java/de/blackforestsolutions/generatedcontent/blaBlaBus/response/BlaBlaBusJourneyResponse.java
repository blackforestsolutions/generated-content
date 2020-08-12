
package de.blackforestsolutions.generatedcontent.blaBlaBus.response;

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
    "yesterday",
    "today",
    "trips"
})
public class BlaBlaBusJourneyResponse implements Serializable
{

    @JsonProperty("yesterday")
    private Yesterday yesterday;
    @JsonProperty("today")
    private Today today;
    @JsonProperty("trips")
    private List<Trip> trips = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6534338317603751661L;

    @JsonProperty("yesterday")
    public Yesterday getYesterday() {
        return yesterday;
    }

    @JsonProperty("yesterday")
    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    @JsonProperty("today")
    public Today getToday() {
        return today;
    }

    @JsonProperty("today")
    public void setToday(Today today) {
        this.today = today;
    }

    @JsonProperty("trips")
    public List<Trip> getTrips() {
        return trips;
    }

    @JsonProperty("trips")
    public void setTrips(List<Trip> trips) {
        this.trips = trips;
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
