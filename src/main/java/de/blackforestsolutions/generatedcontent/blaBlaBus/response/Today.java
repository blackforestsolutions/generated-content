
package de.blackforestsolutions.generatedcontent.blaBlaBus.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "min_price_cents",
    "min_price_currency",
    "is_fare_available",
    "is_booking_possible"
})
public class Today implements Serializable
{

    @JsonProperty("date")
    private String date;
    @JsonProperty("min_price_cents")
    private Integer minPriceCents;
    @JsonProperty("min_price_currency")
    private String minPriceCurrency;
    @JsonProperty("is_fare_available")
    private Boolean isFareAvailable;
    @JsonProperty("is_booking_possible")
    private Boolean isBookingPossible;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6984581053036543040L;

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("min_price_cents")
    public Integer getMinPriceCents() {
        return minPriceCents;
    }

    @JsonProperty("min_price_cents")
    public void setMinPriceCents(Integer minPriceCents) {
        this.minPriceCents = minPriceCents;
    }

    @JsonProperty("min_price_currency")
    public String getMinPriceCurrency() {
        return minPriceCurrency;
    }

    @JsonProperty("min_price_currency")
    public void setMinPriceCurrency(String minPriceCurrency) {
        this.minPriceCurrency = minPriceCurrency;
    }

    @JsonProperty("is_fare_available")
    public Boolean getIsFareAvailable() {
        return isFareAvailable;
    }

    @JsonProperty("is_fare_available")
    public void setIsFareAvailable(Boolean isFareAvailable) {
        this.isFareAvailable = isFareAvailable;
    }

    @JsonProperty("is_booking_possible")
    public Boolean getIsBookingPossible() {
        return isBookingPossible;
    }

    @JsonProperty("is_booking_possible")
    public void setIsBookingPossible(Boolean isBookingPossible) {
        this.isBookingPossible = isBookingPossible;
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
