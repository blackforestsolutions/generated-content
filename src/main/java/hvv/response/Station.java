package hvv.response;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "city",
    "shortcuts",
    "vehicleTypes",
    "combinedName",
    "aliasses",
    "coordinate",
    "exists"
})
public class Station implements Serializable {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("city")
    private String city;
    @JsonProperty("shortcuts")
    private List<String> shortcuts = new ArrayList<String>();
    @JsonProperty("vehicleTypes")
    private List<String> vehicleTypes = new ArrayList<String>();
    @JsonProperty("combinedName")
    private String combinedName;
    @JsonProperty("aliasses")
    private List<String> aliasses = new ArrayList<String>();
    @JsonProperty("coordinate")
    private Coordinate coordinate;
    @JsonProperty("exists")
    private boolean exists;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -8530399323403120349L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

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

    @JsonProperty("shortcuts")
    public List<String> getShortcuts() {
        return shortcuts;
    }

    @JsonProperty("shortcuts")
    public void setShortcuts(List<String> shortcuts) {
        this.shortcuts = shortcuts;
    }

    @JsonProperty("vehicleTypes")
    public List<String> getVehicleTypes() {
        return vehicleTypes;
    }

    @JsonProperty("vehicleTypes")
    public void setVehicleTypes(List<String> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    @JsonProperty("combinedName")
    public String getCombinedName() {
        return combinedName;
    }

    @JsonProperty("combinedName")
    public void setCombinedName(String combinedName) {
        this.combinedName = combinedName;
    }

    @JsonProperty("aliasses")
    public List<String> getAliasses() {
        return aliasses;
    }

    @JsonProperty("aliasses")
    public void setAliasses(List<String> aliasses) {
        this.aliasses = aliasses;
    }

    @JsonProperty("coordinate")
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @JsonProperty("coordinate")
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @JsonProperty("exists")
    public boolean isExists() {
        return exists;
    }

    @JsonProperty("exists")
    public void setExists(boolean exists) {
        this.exists = exists;
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
