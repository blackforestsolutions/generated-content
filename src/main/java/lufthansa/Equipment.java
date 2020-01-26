package lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "AircraftCode"
})
public class Equipment implements Serializable {

    private static final long serialVersionUID = 5017549619602684172L;
    @JsonProperty("AircraftCode")
    private String aircraftCode;

    @JsonProperty("AircraftCode")
    public String getAircraftCode() {
        return aircraftCode;
    }

    @JsonProperty("AircraftCode")
    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

}
