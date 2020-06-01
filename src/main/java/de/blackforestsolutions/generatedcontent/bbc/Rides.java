
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
    "links",
    "pager",
    "trips",
    "top_trips",
    "facets",
    "total_trip_count_to_display",
    "full_trips_count",
    "distance",
    "duration",
    "recommended_price",
    "savings",
    "lowest_price",
    "lowest_price_object",
    "sorting_algorithm"
})
public class Rides implements Serializable
{

    @JsonProperty("links")
    private Links links;
    @JsonProperty("pager")
    private Pager pager;
    @JsonProperty("trips")
    private List<Trip> trips = null;
    @JsonProperty("top_trips")
    private List<Object> topTrips = null;
    @JsonProperty("facets")
    private List<Object> facets = null;
    @JsonProperty("total_trip_count_to_display")
    private Integer totalTripCountToDisplay;
    @JsonProperty("full_trips_count")
    private Integer fullTripsCount;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("recommended_price")
    private Integer recommendedPrice;
    @JsonProperty("savings")
    private Integer savings;
    @JsonProperty("lowest_price")
    private Integer lowestPrice;
    @JsonProperty("lowest_price_object")
    private LowestPriceObject lowestPriceObject;
    @JsonProperty("sorting_algorithm")
    private String sortingAlgorithm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6875458319202588587L;

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("pager")
    public Pager getPager() {
        return pager;
    }

    @JsonProperty("pager")
    public void setPager(Pager pager) {
        this.pager = pager;
    }

    @JsonProperty("trips")
    public List<Trip> getTrips() {
        return trips;
    }

    @JsonProperty("trips")
    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    @JsonProperty("top_trips")
    public List<Object> getTopTrips() {
        return topTrips;
    }

    @JsonProperty("top_trips")
    public void setTopTrips(List<Object> topTrips) {
        this.topTrips = topTrips;
    }

    @JsonProperty("facets")
    public List<Object> getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(List<Object> facets) {
        this.facets = facets;
    }

    @JsonProperty("total_trip_count_to_display")
    public Integer getTotalTripCountToDisplay() {
        return totalTripCountToDisplay;
    }

    @JsonProperty("total_trip_count_to_display")
    public void setTotalTripCountToDisplay(Integer totalTripCountToDisplay) {
        this.totalTripCountToDisplay = totalTripCountToDisplay;
    }

    @JsonProperty("full_trips_count")
    public Integer getFullTripsCount() {
        return fullTripsCount;
    }

    @JsonProperty("full_trips_count")
    public void setFullTripsCount(Integer fullTripsCount) {
        this.fullTripsCount = fullTripsCount;
    }

    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("recommended_price")
    public Integer getRecommendedPrice() {
        return recommendedPrice;
    }

    @JsonProperty("recommended_price")
    public void setRecommendedPrice(Integer recommendedPrice) {
        this.recommendedPrice = recommendedPrice;
    }

    @JsonProperty("savings")
    public Integer getSavings() {
        return savings;
    }

    @JsonProperty("savings")
    public void setSavings(Integer savings) {
        this.savings = savings;
    }

    @JsonProperty("lowest_price")
    public Integer getLowestPrice() {
        return lowestPrice;
    }

    @JsonProperty("lowest_price")
    public void setLowestPrice(Integer lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    @JsonProperty("lowest_price_object")
    public LowestPriceObject getLowestPriceObject() {
        return lowestPriceObject;
    }

    @JsonProperty("lowest_price_object")
    public void setLowestPriceObject(LowestPriceObject lowestPriceObject) {
        this.lowestPriceObject = lowestPriceObject;
    }

    @JsonProperty("sorting_algorithm")
    public String getSortingAlgorithm() {
        return sortingAlgorithm;
    }

    @JsonProperty("sorting_algorithm")
    public void setSortingAlgorithm(String sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
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
