package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "AirlineID",
        "FlightNumber"
})
public class MarketingCarrier implements Serializable {

    private static final long serialVersionUID = 249346289065563682L;
    @JsonProperty("AirlineID")
    private String airlineID;
    @JsonProperty("FlightNumber")
    private Integer flightNumber;

    @JsonProperty("AirlineID")
    public String getAirlineID() {
        return airlineID;
    }

    @JsonProperty("AirlineID")
    public void setAirlineID(String airlineID) {
        this.airlineID = airlineID;
    }

    @JsonProperty("FlightNumber")
    public Integer getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("FlightNumber")
    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

}
