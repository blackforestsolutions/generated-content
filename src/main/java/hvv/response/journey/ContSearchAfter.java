package hvv.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serviceId",
    "lineKey",
    "plannedDepArrTime",
    "additionalOffset"
})
public class ContSearchAfter implements Serializable {

    @JsonProperty("serviceId")
    private int serviceId;
    @JsonProperty("lineKey")
    private String lineKey;
    @JsonProperty("plannedDepArrTime")
    private PlannedDepArrTime plannedDepArrTime;
    @JsonProperty("additionalOffset")
    private int additionalOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = 6394691323525745144L;

    @JsonProperty("serviceId")
    public int getServiceId() {
        return serviceId;
    }

    @JsonProperty("serviceId")
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    @JsonProperty("lineKey")
    public String getLineKey() {
        return lineKey;
    }

    @JsonProperty("lineKey")
    public void setLineKey(String lineKey) {
        this.lineKey = lineKey;
    }

    @JsonProperty("plannedDepArrTime")
    public PlannedDepArrTime getPlannedDepArrTime() {
        return plannedDepArrTime;
    }

    @JsonProperty("plannedDepArrTime")
    public void setPlannedDepArrTime(PlannedDepArrTime plannedDepArrTime) {
        this.plannedDepArrTime = plannedDepArrTime;
    }

    @JsonProperty("additionalOffset")
    public int getAdditionalOffset() {
        return additionalOffset;
    }

    @JsonProperty("additionalOffset")
    public void setAdditionalOffset(int additionalOffset) {
        this.additionalOffset = additionalOffset;
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
