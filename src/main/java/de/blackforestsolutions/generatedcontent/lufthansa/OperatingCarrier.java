package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "AirlineID"
})
public class OperatingCarrier implements Serializable {

    private static final long serialVersionUID = 3413118972773265948L;
    @JsonProperty("AirlineID")
    private String airlineID;

    @JsonProperty("AirlineID")
    public String getAirlineID() {
        return airlineID;
    }

    @JsonProperty("AirlineID")
    public void setAirlineID(String airlineID) {
        this.airlineID = airlineID;
    }

}
