package de.blackforestsolutions.generatedcontent.bahn;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "name",
        "type",
        "boardId",
        "stopId",
        "stopName",
        "dateTime",
        "origin",
        "track",
        "detailsId"
})
public class ArrivalBoard implements Serializable {

    private static final long serialVersionUID = 4659491991706272939L;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("boardId")
    private String boardId;
    @JsonProperty("stopId")
    private String stopId;
    @JsonProperty("stopName")
    private String stopName;
    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("track")
    private String track;
    @JsonProperty("detailsId")
    private String detailsId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("boardId")
    public String getBoardId() {
        return boardId;
    }

    @JsonProperty("boardId")
    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

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

    @JsonProperty("dateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("dateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("track")
    public String getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(String track) {
        this.track = track;
    }

    @JsonProperty("detailsId")
    public String getDetailsId() {
        return detailsId;
    }

    @JsonProperty("detailsId")
    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
