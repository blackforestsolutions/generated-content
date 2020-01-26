package lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "AirportCode",
        "ScheduledTimeLocal",
        "Terminal"
})
public class Departure implements Serializable {

    private static final long serialVersionUID = 5979846100403048815L;
    @JsonProperty("AirportCode")
    private String airportCode;
    @JsonProperty("ScheduledTimeLocal")
    private ScheduledTimeLocal scheduledTimeLocal;
    @JsonProperty("Terminal")
    private Terminal terminal;

    @JsonProperty("AirportCode")
    public String getAirportCode() {
        return airportCode;
    }

    @JsonProperty("AirportCode")
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    @JsonProperty("ScheduledTimeLocal")
    public ScheduledTimeLocal getScheduledTimeLocal() {
        return scheduledTimeLocal;
    }

    @JsonProperty("ScheduledTimeLocal")
    public void setScheduledTimeLocal(ScheduledTimeLocal scheduledTimeLocal) {
        this.scheduledTimeLocal = scheduledTimeLocal;
    }

    @JsonProperty("Terminal")
    public Terminal getTerminal() {
        return terminal;
    }

    @JsonProperty("Terminal")
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

}
