package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "StopQuantity"
})
public class Stops implements Serializable {

    private static final long serialVersionUID = -5264860295006450193L;
    @JsonProperty("StopQuantity")
    private Long stopQuantity;

    @JsonProperty("StopQuantity")
    public Long getStopQuantity() {
        return stopQuantity;
    }

    @JsonProperty("StopQuantity")
    public void setStopQuantity(Long stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

}
