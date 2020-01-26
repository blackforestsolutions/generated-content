package bahn;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "stopId",
        "stopName",
        "lat",
        "lon",
        "depTime",
        "train",
        "type",
        "operator",
        "notes",
        "arrTime"
})
public class JourneyDetail implements Serializable {

    private static final long serialVersionUID = -4899888368015846179L;
    @JsonProperty("stopId")
    private String stopId;
    @JsonProperty("stopName")
    private String stopName;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("depTime")
    private String depTime;
    @JsonProperty("train")
    private String train;
    @JsonProperty("type")
    private String type;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("notes")
    private List<Note> notes = new ArrayList<Note>();
    @JsonProperty("arrTime")
    private String arrTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stopId")
    public String getStopId() {
        return stopId;
    }

    @JsonProperty("stopId")
    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    @JsonProperty("stopName")
    public String getStopName() {
        return stopName;
    }

    @JsonProperty("stopName")
    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public String getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(String lon) {
        this.lon = lon;
    }

    @JsonProperty("depTime")
    public String getDepTime() {
        return depTime;
    }

    @JsonProperty("depTime")
    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    @JsonProperty("train")
    public String getTrain() {
        return train;
    }

    @JsonProperty("train")
    public void setTrain(String train) {
        this.train = train;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @JsonProperty("arrTime")
    public String getArrTime() {
        return arrTime;
    }

    @JsonProperty("arrTime")
    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
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
