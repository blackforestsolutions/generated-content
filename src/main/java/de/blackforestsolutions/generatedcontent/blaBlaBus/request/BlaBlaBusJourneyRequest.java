package de.blackforestsolutions.generatedcontent.blaBlaBus.request;

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
    "origin_id",
    "destination_id",
    "date",
    "passengers"
})
public class BlaBlaBusJourneyRequest implements Serializable
{

    @JsonProperty("origin_id")
    private Integer originId;
    @JsonProperty("destination_id")
    private Integer destinationId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("passengers")
    private List<de.blackforestsolutions.locoapiservicereactivedemo.apiModel.request.Passenger> passengers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5073603063118520133L;

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

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("passengers")
    public List<de.blackforestsolutions.locoapiservicereactivedemo.apiModel.request.Passenger> getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(List<de.blackforestsolutions.locoapiservicereactivedemo.apiModel.request.Passenger> passengers) {
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
