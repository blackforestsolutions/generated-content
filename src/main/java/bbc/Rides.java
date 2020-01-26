package bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "links",
        "pager",
        "trips",
        "top_trips",
        "facets",
        "distance",
        "duration",
        "recommended_price",
        "savings",
        "lowest_price",
        "lowest_price_object",
        "full_trips_count",
        "total_trip_count_to_display",
        "sorting_algorithm",
        "has_bus"
})
public class Rides implements Serializable {

    private final static long serialVersionUID = -7153745814731005066L;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("pager")
    private Pager pager;
    @JsonProperty("trips")
    private List<Trip> trips = new ArrayList<Trip>();
    @JsonProperty("top_trips")
    private List<Object> topTrips = new ArrayList<Object>();
    @JsonProperty("facets")
    private List<Facet> facets = new ArrayList<Facet>();
    @JsonProperty("distance")
    private int distance;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("recommended_price")
    private int recommendedPrice;
    @JsonProperty("savings")
    private int savings;
    @JsonProperty("lowest_price")
    private int lowestPrice;
    @JsonProperty("lowest_price_object")
    private LowestPriceObject lowestPriceObject;
    @JsonProperty("full_trips_count")
    private int fullTripsCount;
    @JsonProperty("total_trip_count_to_display")
    private int totalTripCountToDisplay;
    @JsonProperty("sorting_algorithm")
    private String sortingAlgorithm;
    @JsonProperty("has_bus")
    private boolean hasBus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Rides() {
    }

    /**
     * @param lowestPrice
     * @param hasBus
     * @param distance
     * @param recommendedPrice
     * @param fullTripsCount
     * @param facets
     * @param duration
     * @param pager
     * @param trips
     * @param topTrips
     * @param sortingAlgorithm
     * @param lowestPriceObject
     * @param links
     * @param savings
     * @param totalTripCountToDisplay
     */
    public Rides(Links links, Pager pager, List<Trip> trips, List<Object> topTrips, List<Facet> facets, int distance, int duration, int recommendedPrice, int savings, int lowestPrice, LowestPriceObject lowestPriceObject, int fullTripsCount, int totalTripCountToDisplay, String sortingAlgorithm, boolean hasBus) {
        super();
        this.links = links;
        this.pager = pager;
        this.trips = trips;
        this.topTrips = topTrips;
        this.facets = facets;
        this.distance = distance;
        this.duration = duration;
        this.recommendedPrice = recommendedPrice;
        this.savings = savings;
        this.lowestPrice = lowestPrice;
        this.lowestPriceObject = lowestPriceObject;
        this.fullTripsCount = fullTripsCount;
        this.totalTripCountToDisplay = totalTripCountToDisplay;
        this.sortingAlgorithm = sortingAlgorithm;
        this.hasBus = hasBus;
    }

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
    public List<Facet> getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    @JsonProperty("distance")
    public int getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(int distance) {
        this.distance = distance;
    }

    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @JsonProperty("recommended_price")
    public int getRecommendedPrice() {
        return recommendedPrice;
    }

    @JsonProperty("recommended_price")
    public void setRecommendedPrice(int recommendedPrice) {
        this.recommendedPrice = recommendedPrice;
    }

    @JsonProperty("savings")
    public int getSavings() {
        return savings;
    }

    @JsonProperty("savings")
    public void setSavings(int savings) {
        this.savings = savings;
    }

    @JsonProperty("lowest_price")
    public int getLowestPrice() {
        return lowestPrice;
    }

    @JsonProperty("lowest_price")
    public void setLowestPrice(int lowestPrice) {
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

    @JsonProperty("full_trips_count")
    public int getFullTripsCount() {
        return fullTripsCount;
    }

    @JsonProperty("full_trips_count")
    public void setFullTripsCount(int fullTripsCount) {
        this.fullTripsCount = fullTripsCount;
    }

    @JsonProperty("total_trip_count_to_display")
    public int getTotalTripCountToDisplay() {
        return totalTripCountToDisplay;
    }

    @JsonProperty("total_trip_count_to_display")
    public void setTotalTripCountToDisplay(int totalTripCountToDisplay) {
        this.totalTripCountToDisplay = totalTripCountToDisplay;
    }

    @JsonProperty("sorting_algorithm")
    public String getSortingAlgorithm() {
        return sortingAlgorithm;
    }

    @JsonProperty("sorting_algorithm")
    public void setSortingAlgorithm(String sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    @JsonProperty("has_bus")
    public boolean isHasBus() {
        return hasBus;
    }

    @JsonProperty("has_bus")
    public void setHasBus(boolean hasBus) {
        this.hasBus = hasBus;
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
