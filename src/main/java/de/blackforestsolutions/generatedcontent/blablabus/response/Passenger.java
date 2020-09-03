
package de.blackforestsolutions.generatedcontent.blablabus.response;

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
    "id",
    "fare_name",
    "fare_description",
    "price_currency",
    "price_promo_currency",
    "is_promo",
    "price_cents"
})
public class Passenger implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("fare_name")
    private String fareName;
    @JsonProperty("fare_description")
    private String fareDescription;
    @JsonProperty("price_currency")
    private String priceCurrency;
    @JsonProperty("price_promo_currency")
    private String pricePromoCurrency;
    @JsonProperty("is_promo")
    private Boolean isPromo;
    @JsonProperty("price_cents")
    private Integer priceCents;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8632081045385357424L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("fare_name")
    public String getFareName() {
        return fareName;
    }

    @JsonProperty("fare_name")
    public void setFareName(String fareName) {
        this.fareName = fareName;
    }

    @JsonProperty("fare_description")
    public String getFareDescription() {
        return fareDescription;
    }

    @JsonProperty("fare_description")
    public void setFareDescription(String fareDescription) {
        this.fareDescription = fareDescription;
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

    @JsonProperty("is_promo")
    public Boolean getIsPromo() {
        return isPromo;
    }

    @JsonProperty("is_promo")
    public void setIsPromo(Boolean isPromo) {
        this.isPromo = isPromo;
    }

    @JsonProperty("price_cents")
    public Integer getPriceCents() {
        return priceCents;
    }

    @JsonProperty("price_cents")
    public void setPriceCents(Integer priceCents) {
        this.priceCents = priceCents;
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
