package de.blackforestsolutions.generatedcontent.hvv.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "returnCode",
    "realtimeSchedules",
    "individualTrack"
})
public class HvvRoute implements Serializable {

    @JsonProperty("returnCode")
    private String returnCode;
    @JsonProperty("realtimeSchedules")
    private List<RealtimeSchedule> realtimeSchedules = new ArrayList<RealtimeSchedule>();
    @JsonProperty("individualTrack")
    private IndividualTrack individualTrack;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -3007809758691548806L;

    @JsonProperty("returnCode")
    public String getReturnCode() {
        return returnCode;
    }

    @JsonProperty("returnCode")
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    @JsonProperty("realtimeSchedules")
    public List<RealtimeSchedule> getRealtimeSchedules() {
        return realtimeSchedules;
    }

    @JsonProperty("realtimeSchedules")
    public void setRealtimeSchedules(List<RealtimeSchedule> realtimeSchedules) {
        this.realtimeSchedules = realtimeSchedules;
    }

    @JsonProperty("individualTrack")
    public IndividualTrack getIndividualTrack() {
        return individualTrack;
    }

    @JsonProperty("individualTrack")
    public void setIndividualTrack(IndividualTrack individualTrack) {
        this.individualTrack = individualTrack;
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
