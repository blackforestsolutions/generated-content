package de.blackforestsolutions.generatedcontent.hvv.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "routeId",
    "start",
    "dest",
    "time",
    "footpathTime",
    "tariffInfos",
    "scheduleElements",
    "contSearchBefore",
    "contSearchAfter"
})
public class RealtimeSchedule implements Serializable {

    @JsonProperty("routeId")
    private long routeId;
    @JsonProperty("start")
    private From start;
    @JsonProperty("dest")
    private From dest;
    @JsonProperty("time")
    private long time;
    @JsonProperty("footpathTime")
    private long footpathTime;
    @JsonProperty("tariffInfos")
    private List<TariffInfo> tariffInfos = new ArrayList<TariffInfo>();
    @JsonProperty("scheduleElements")
    private List<ScheduleElement> scheduleElements = new ArrayList<ScheduleElement>();
    @JsonProperty("contSearchBefore")
    private ContSearchBefore contSearchBefore;
    @JsonProperty("contSearchAfter")
    private ContSearchAfter contSearchAfter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = 7912704082084388576L;

    @JsonProperty("routeId")
    public long getRouteId() {
        return routeId;
    }

    @JsonProperty("routeId")
    public void setRouteId(long routeId) {
        this.routeId = routeId;
    }

    @JsonProperty("start")
    public From getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(From start) {
        this.start = start;
    }

    @JsonProperty("dest")
    public From getDest() {
        return dest;
    }

    @JsonProperty("dest")
    public void setDest(From dest) {
        this.dest = dest;
    }

    @JsonProperty("time")
    public long getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(long time) {
        this.time = time;
    }

    @JsonProperty("footpathTime")
    public long getFootpathTime() {
        return footpathTime;
    }

    @JsonProperty("footpathTime")
    public void setFootpathTime(long footpathTime) {
        this.footpathTime = footpathTime;
    }

    @JsonProperty("tariffInfos")
    public List<TariffInfo> getTariffInfos() {
        return tariffInfos;
    }

    @JsonProperty("tariffInfos")
    public void setTariffInfos(List<TariffInfo> tariffInfos) {
        this.tariffInfos = tariffInfos;
    }

    @JsonProperty("scheduleElements")
    public List<ScheduleElement> getScheduleElements() {
        return scheduleElements;
    }

    @JsonProperty("scheduleElements")
    public void setScheduleElements(List<ScheduleElement> scheduleElements) {
        this.scheduleElements = scheduleElements;
    }

    @JsonProperty("contSearchBefore")
    public ContSearchBefore getContSearchBefore() {
        return contSearchBefore;
    }

    @JsonProperty("contSearchBefore")
    public void setContSearchBefore(ContSearchBefore contSearchBefore) {
        this.contSearchBefore = contSearchBefore;
    }

    @JsonProperty("contSearchAfter")
    public ContSearchAfter getContSearchAfter() {
        return contSearchAfter;
    }

    @JsonProperty("contSearchAfter")
    public void setContSearchAfter(ContSearchAfter contSearchAfter) {
        this.contSearchAfter = contSearchAfter;
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
