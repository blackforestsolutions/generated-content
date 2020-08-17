package de.blackforestsolutions.generatedcontent.hvv.response.journey;

import com.fasterxml.jackson.annotation.*;
import de.blackforestsolutions.generatedcontent.hvv.response.Coordinate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "city",
    "combinedName",
    "id",
    "type",
    "coordinate",
    "serviceTypes",
    "hasStationInformation",
    "depTime",
    "depDelay",
    "arrTime",
    "arrDelay",
    "cancelled",
    "platform",
    "realtimePlatform",
    "cancelled"
})
public class From implements Serializable {

    @JsonProperty("name")
    private String name;
    @JsonProperty("city")
    private String city;
    @JsonProperty("combinedName")
    private String combinedName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("coordinate")
    private Coordinate coordinate;
    @JsonProperty("serviceTypes")
    private List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("hasStationInformation")
    private boolean hasStationInformation;
    @JsonProperty("depTime")
    private DepTime depTime;
    @JsonProperty("depDelay")
    private long depDelay;
    @JsonProperty("cancelled")
    private boolean cancelled;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("realtimePlatform")
    private String realtimePlatform;
    @JsonProperty("arrTime")
    private ArrTime arrTime;
    @JsonProperty("arrDelay")
    private long arrDelay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = 1293736039744475735L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("combinedName")
    public String getCombinedName() {
        return combinedName;
    }

    @JsonProperty("combinedName")
    public void setCombinedName(String combinedName) {
        this.combinedName = combinedName;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("coordinate")
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @JsonProperty("coordinate")
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @JsonProperty("serviceTypes")
    public List<String> getServiceTypes() {
        return serviceTypes;
    }

    @JsonProperty("serviceTypes")
    public void setServiceTypes(List<String> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    @JsonProperty("hasStationInformation")
    public boolean isHasStationInformation() {
        return hasStationInformation;
    }

    @JsonProperty("hasStationInformation")
    public void setHasStationInformation(boolean hasStationInformation) {
        this.hasStationInformation = hasStationInformation;
    }

    @JsonProperty("depTime")
    public DepTime getDepTime() {
        return depTime;
    }

    @JsonProperty("depTime")
    public void setDepTime(DepTime depTime) {
        this.depTime = depTime;
    }

    @JsonProperty("depDelay")
    public long getDepDelay() {
        return depDelay;
    }

    @JsonProperty("depDelay")
    public void setDepDelay(long depDelay) {
        this.depDelay = depDelay;
    }

    @JsonProperty("cancelled")
    public boolean isCancelled() {
        return cancelled;
    }

    @JsonProperty("cancelled")
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("realtimePlatform")
    public String getRealtimePlatform() {
        return realtimePlatform;
    }

    @JsonProperty("realtimePlatform")
    public void setRealtimePlatform(String realtimePlatform) {
        this.realtimePlatform = realtimePlatform;
    }

    @JsonProperty("arrDelay")
    public long getArrDelay() {
        return arrDelay;
    }

    @JsonProperty("arrDelay")
    public void setArrDelay(long arrDelay) {
        this.arrDelay = arrDelay;
    }

    @JsonProperty("arrTime")
    public ArrTime getArrTime() {
        return arrTime;
    }

    @JsonProperty("arrTime")
    public void setArrTime(ArrTime arrTime) {
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
