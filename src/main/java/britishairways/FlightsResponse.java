package britishairways;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "Flight",
        "DataLastUpdated"
})
public class FlightsResponse implements Serializable {

    private final static long serialVersionUID = -6721108777691976931L;
    @JsonProperty("Flight")
    private List<Flight> flight = new ArrayList<Flight>();
    @JsonProperty("DataLastUpdated")
    private String dataLastUpdated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public FlightsResponse() {
    }

    /**
     * @param flight
     * @param dataLastUpdated
     */
    public FlightsResponse(List<Flight> flight, String dataLastUpdated) {
        super();
        this.flight = flight;
        this.dataLastUpdated = dataLastUpdated;
    }

    @JsonProperty("Flight")
    public List<Flight> getFlight() {
        return flight;
    }

    @JsonProperty("Flight")
    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }

    @JsonProperty("DataLastUpdated")
    public String getDataLastUpdated() {
        return dataLastUpdated;
    }

    @JsonProperty("DataLastUpdated")
    public void setDataLastUpdated(String dataLastUpdated) {
        this.dataLastUpdated = dataLastUpdated;
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
