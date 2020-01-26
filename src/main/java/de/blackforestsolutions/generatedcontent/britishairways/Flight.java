package de.blackforestsolutions.generatedcontent.britishairways;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "MarketingCarrierCode",
        "FlightNumber",
        "Sector"
})
public class Flight implements Serializable {

    private final static long serialVersionUID = -8740565389556294914L;
    @JsonProperty("MarketingCarrierCode")
    private String marketingCarrierCode;
    @JsonProperty("FlightNumber")
    private String flightNumber;
    @JsonProperty("Sector")
    private Sector sector;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Flight() {
    }

    /**
     * @param sector
     * @param marketingCarrierCode
     * @param flightNumber
     */
    public Flight(String marketingCarrierCode, String flightNumber, Sector sector) {
        super();
        this.marketingCarrierCode = marketingCarrierCode;
        this.flightNumber = flightNumber;
        this.sector = sector;
    }

    @JsonProperty("MarketingCarrierCode")
    public String getMarketingCarrierCode() {
        return marketingCarrierCode;
    }

    @JsonProperty("MarketingCarrierCode")
    public void setMarketingCarrierCode(String marketingCarrierCode) {
        this.marketingCarrierCode = marketingCarrierCode;
    }

    @JsonProperty("FlightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("FlightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("Sector")
    public Sector getSector() {
        return sector;
    }

    @JsonProperty("Sector")
    public void setSector(Sector sector) {
        this.sector = sector;
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
