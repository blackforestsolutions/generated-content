package lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Departure",
        "Arrival",
        "MarketingCarrier",
        "Equipment",
        "Details",
        "OperatingCarrier"
})
public class Flight implements Serializable {

    private static final long serialVersionUID = -1614464834029602506L;
    @JsonProperty("Departure")
    private Departure departure;
    @JsonProperty("Arrival")
    private Arrival arrival;
    @JsonProperty("MarketingCarrier")
    private MarketingCarrier marketingCarrier;
    @JsonProperty("Equipment")
    private Equipment equipment;
    @JsonProperty("Details")
    private Details details;
    @JsonProperty("OperatingCarrier")
    private OperatingCarrier operatingCarrier;

    @JsonProperty("Departure")
    public Departure getDeparture() {
        return departure;
    }

    @JsonProperty("Departure")
    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    @JsonProperty("Arrival")
    public Arrival getArrival() {
        return arrival;
    }

    @JsonProperty("Arrival")
    public void setArrival(Arrival arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("MarketingCarrier")
    public MarketingCarrier getMarketingCarrier() {
        return marketingCarrier;
    }

    @JsonProperty("MarketingCarrier")
    public void setMarketingCarrier(MarketingCarrier marketingCarrier) {
        this.marketingCarrier = marketingCarrier;
    }

    @JsonProperty("Equipment")
    public Equipment getEquipment() {
        return equipment;
    }

    @JsonProperty("Equipment")
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @JsonProperty("Details")
    public Details getDetails() {
        return details;
    }

    @JsonProperty("Details")
    public void setDetails(Details details) {
        this.details = details;
    }

    @JsonProperty("OperatingCarrier")
    public OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("OperatingCarrier")
    public void setOperatingCarrier(OperatingCarrier operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

}
