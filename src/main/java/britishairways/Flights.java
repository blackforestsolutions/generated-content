package britishairways;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "FlightsResponse"
})
public class Flights implements Serializable {

    private final static long serialVersionUID = 8861422020604724880L;
    @JsonProperty("FlightsResponse")
    private FlightsResponse flightsResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Flights() {
    }

    /**
     * @param flightsResponse
     */
    public Flights(FlightsResponse flightsResponse) {
        super();
        this.flightsResponse = flightsResponse;
    }

    @JsonProperty("FlightsResponse")
    public FlightsResponse getFlightsResponse() {
        return flightsResponse;
    }

    @JsonProperty("FlightsResponse")
    public void setFlightsResponse(FlightsResponse flightsResponse) {
        this.flightsResponse = flightsResponse;
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
