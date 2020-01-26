package de.blackforestsolutions.generatedcontent.bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "value",
        "currency",
        "symbol",
        "string_value",
        "price_color"
})
public class Price implements Serializable {

    private final static long serialVersionUID = 4626084305785691627L;
    @JsonProperty("value")
    private int value;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("string_value")
    private String stringValue;
    @JsonProperty("price_color")
    private String priceColor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Price() {
    }

    /**
     * @param symbol
     * @param stringValue
     * @param priceColor
     * @param currency
     * @param value
     */
    public Price(int value, String currency, String symbol, String stringValue, String priceColor) {
        super();
        this.value = value;
        this.currency = currency;
        this.symbol = symbol;
        this.stringValue = stringValue;
        this.priceColor = priceColor;
    }

    @JsonProperty("value")
    public int getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(int value) {
        this.value = value;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("string_value")
    public String getStringValue() {
        return stringValue;
    }

    @JsonProperty("string_value")
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    @JsonProperty("price_color")
    public String getPriceColor() {
        return priceColor;
    }

    @JsonProperty("price_color")
    public void setPriceColor(String priceColor) {
        this.priceColor = priceColor;
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
