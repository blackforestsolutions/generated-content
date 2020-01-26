package de.blackforestsolutions.generatedcontent.hvv.response;

import com.fasterxml.jackson.annotation.*;

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
    "hasStationInformation"
})
public class Result implements Serializable {

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = 4232250309681188157L;

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
