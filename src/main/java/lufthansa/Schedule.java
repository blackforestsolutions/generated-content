package lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "TotalJourney",
        "Flight"
})
public class Schedule implements Serializable {

    private static final long serialVersionUID = 5829550127358271509L;
    @JsonProperty("TotalJourney")
    private TotalJourney totalJourney;
    @JsonProperty("Flight")
    private List<Flight> flight = null;

    @JsonProperty("TotalJourney")
    public TotalJourney getTotalJourney() {
        return totalJourney;
    }

    @JsonProperty("TotalJourney")
    public void setTotalJourney(TotalJourney totalJourney) {
        this.totalJourney = totalJourney;
    }

    @JsonProperty("Flight")
    public List<Flight> getFlight() {
        return flight;
    }

    @JsonProperty("Flight")
    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }

}
