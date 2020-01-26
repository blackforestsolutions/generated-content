package de.blackforestsolutions.generatedcontent.lufthansa;

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
public class Arrival implements Serializable {

    private static final long serialVersionUID = 2248746727076692484L;
    @JsonProperty("AirportCode")
    private String airportCode;
    @JsonProperty("ScheduledTimeLocal")
    private ScheduledTimeLocal_ scheduledTimeLocal;
    @JsonProperty("Terminal")
    private Terminal_ terminal;

    @JsonProperty("AirportCode")
    public String getAirportCode() {
        return airportCode;
    }

    @JsonProperty("AirportCode")
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    @JsonProperty("ScheduledTimeLocal")
    public ScheduledTimeLocal_ getScheduledTimeLocal() {
        return scheduledTimeLocal;
    }

    @JsonProperty("ScheduledTimeLocal")
    public void setScheduledTimeLocal(ScheduledTimeLocal_ scheduledTimeLocal) {
        this.scheduledTimeLocal = scheduledTimeLocal;
    }

    @JsonProperty("Terminal")
    public Terminal_ getTerminal() {
        return terminal;
    }

    @JsonProperty("Terminal")
    public void setTerminal(Terminal_ terminal) {
        this.terminal = terminal;
    }

}
