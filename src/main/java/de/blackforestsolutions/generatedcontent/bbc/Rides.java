
package de.blackforestsolutions.generatedcontent.bbc;

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
    "search_info",
    "trips"
})
public class Rides implements Serializable
{

    @JsonProperty("link")
    private String link;
    @JsonProperty("search_info")
    private SearchInfo searchInfo;
    @JsonProperty("trips")
    private List<Trip> trips = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2603370150814320416L;

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("search_info")
    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    @JsonProperty("search_info")
    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
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
