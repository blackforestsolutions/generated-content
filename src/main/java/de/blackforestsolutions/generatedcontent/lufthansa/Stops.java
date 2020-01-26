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
    private Integer stopQuantity;

    @JsonProperty("StopQuantity")
    public Integer getStopQuantity() {
        return stopQuantity;
    }

    @JsonProperty("StopQuantity")
    public void setStopQuantity(Integer stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

}
