package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Duration"
})
public class TotalJourney implements Serializable {

    private static final long serialVersionUID = -7841000378389572734L;
    @JsonProperty("Duration")
    private String duration;

    @JsonProperty("Duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("Duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

}
