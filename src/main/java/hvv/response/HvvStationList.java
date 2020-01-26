package hvv.response;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "returnCode",
    "dataReleaseID",
    "stations"
})
public class HvvStationList implements Serializable {

    @JsonProperty("returnCode")
    private String returnCode;
    @JsonProperty("dataReleaseID")
    private String dataReleaseID;
    @JsonProperty("stations")
    private List<Station> stations = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -7333780582961103519L;

    @JsonProperty("returnCode")
    public String getReturnCode() {
        return returnCode;
    }

    @JsonProperty("returnCode")
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    @JsonProperty("dataReleaseID")
    public String getDataReleaseID() {
        return dataReleaseID;
    }

    @JsonProperty("dataReleaseID")
    public void setDataReleaseID(String dataReleaseID) {
        this.dataReleaseID = dataReleaseID;
    }

    @JsonProperty("stations")
    public List<Station> getStations() {
        return stations;
    }

    @JsonProperty("stations")
    public void setStations(List<Station> stations) {
        this.stations = stations;
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
