
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
    "origin_id",
    "destination_id",
    "departure",
    "arrival",
    "bus_number",
    "one_luggage",
    "service_type",
    "service_code",
    "service_name"
})
public class Leg implements Serializable
{

    @JsonProperty("origin_id")
    private Integer originId;
    @JsonProperty("destination_id")
    private Integer destinationId;
    @JsonProperty("departure")
    private String departure;
    @JsonProperty("arrival")
    private String arrival;
    @JsonProperty("bus_number")
    private String busNumber;
    @JsonProperty("one_luggage")
    private Boolean oneLuggage;
    @JsonProperty("service_type")
    private String serviceType;
    @JsonProperty("service_code")
    private String serviceCode;
    @JsonProperty("service_name")
    private String serviceName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1014761990637925350L;

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

    @JsonProperty("bus_number")
    public String getBusNumber() {
        return busNumber;
    }

    @JsonProperty("bus_number")
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    @JsonProperty("one_luggage")
    public Boolean getOneLuggage() {
        return oneLuggage;
    }

    @JsonProperty("one_luggage")
    public void setOneLuggage(Boolean oneLuggage) {
        this.oneLuggage = oneLuggage;
    }

    @JsonProperty("service_type")
    public String getServiceType() {
        return serviceType;
    }

    @JsonProperty("service_type")
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @JsonProperty("service_code")
    public String getServiceCode() {
        return serviceCode;
    }

    @JsonProperty("service_code")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @JsonProperty("service_name")
    public String getServiceName() {
        return serviceName;
    }

    @JsonProperty("service_name")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
