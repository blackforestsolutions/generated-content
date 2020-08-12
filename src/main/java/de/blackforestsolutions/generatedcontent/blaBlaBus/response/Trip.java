
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
    "id",
    "origin_id",
    "destination_id",
    "departure",
    "arrival",
    "price_cents",
    "price_promo_cents",
    "is_promo",
    "is_refundable",
    "price_currency",
    "price_promo_currency",
    "available",
    "legs",
    "passengers"
})
public class Trip implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("origin_id")
    private Integer originId;
    @JsonProperty("destination_id")
    private Integer destinationId;
    @JsonProperty("departure")
    private String departure;
    @JsonProperty("arrival")
    private String arrival;
    @JsonProperty("price_cents")
    private Integer priceCents;
    @JsonProperty("price_promo_cents")
    private Integer pricePromoCents;
    @JsonProperty("is_promo")
    private Boolean isPromo;
    @JsonProperty("is_refundable")
    private Boolean isRefundable;
    @JsonProperty("price_currency")
    private String priceCurrency;
    @JsonProperty("price_promo_currency")
    private String pricePromoCurrency;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("legs")
    private List<Leg> legs = null;
    @JsonProperty("passengers")
    private List<Passenger> passengers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7430131058524468347L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("origin_id")
    public Integer getOriginId() {
        return originId;
    }

    @JsonProperty("origin_id")
    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    @JsonProperty("destination_id")
    public Integer getDestinationId() {
        return destinationId;
    }

    @JsonProperty("destination_id")
    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    @JsonProperty("departure")
    public String getDeparture() {
        return departure;
    }

    @JsonProperty("departure")
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @JsonProperty("arrival")
    public String getArrival() {
        return arrival;
    }

    @JsonProperty("arrival")
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("price_cents")
    public Integer getPriceCents() {
        return priceCents;
    }

    @JsonProperty("price_cents")
    public void setPriceCents(Integer priceCents) {
        this.priceCents = priceCents;
    }

    @JsonProperty("price_promo_cents")
    public Integer getPricePromoCents() {
        return pricePromoCents;
    }

    @JsonProperty("price_promo_cents")
    public void setPricePromoCents(Integer pricePromoCents) {
        this.pricePromoCents = pricePromoCents;
    }

    @JsonProperty("is_promo")
    public Boolean getIsPromo() {
        return isPromo;
    }

    @JsonProperty("is_promo")
    public void setIsPromo(Boolean isPromo) {
        this.isPromo = isPromo;
    }

    @JsonProperty("is_refundable")
    public Boolean getIsRefundable() {
        return isRefundable;
    }

    @JsonProperty("is_refundable")
    public void setIsRefundable(Boolean isRefundable) {
        this.isRefundable = isRefundable;
    }

    @JsonProperty("price_currency")
    public String getPriceCurrency() {
        return priceCurrency;
    }

    @JsonProperty("price_currency")
    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    @JsonProperty("price_promo_currency")
    public String getPricePromoCurrency() {
        return pricePromoCurrency;
    }

    @JsonProperty("price_promo_currency")
    public void setPricePromoCurrency(String pricePromoCurrency) {
        this.pricePromoCurrency = pricePromoCurrency;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("legs")
    public List<Leg> getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    @JsonProperty("passengers")
    public List<Passenger> getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
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
