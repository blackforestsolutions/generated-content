package de.blackforestsolutions.generatedcontent.airportsfinder;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "airportId",
        "code",
        "name",
        "location",
        "cityId",
        "city",
        "countryCode",
        "themes",
        "pointsOfSale"
})
public class AirportsFinding implements Serializable {

    private final static long serialVersionUID = -1539383853388668480L;
    @JsonProperty("airportId")
    private String airportId;
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("cityId")
    private String cityId;
    @JsonProperty("city")
    private String city;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("themes")
    private List<String> themes = null;
    @JsonProperty("pointsOfSale")
    private List<String> pointsOfSale = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * No args constructor for use in serialization
     */
    public AirportsFinding() {
    }

    /**
     * @param pointsOfSale
     * @param themes
     * @param code
     * @param city
     * @param airportId
     * @param countryCode
     * @param name
     * @param location
     * @param cityId
     */
    public AirportsFinding(String airportId, String code, String name, Location location, String cityId, String city, String countryCode, List<String> themes, List<String> pointsOfSale) {
        super();
        this.airportId = airportId;
        this.code = code;
        this.name = name;
        this.location = location;
        this.cityId = cityId;
        this.city = city;
        this.countryCode = countryCode;
        this.themes = themes;
        this.pointsOfSale = pointsOfSale;
    }

    @JsonProperty("airportId")
    public String getAirportId() {
        return airportId;
    }

    @JsonProperty("airportId")
    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("cityId")
    public String getCityId() {
        return cityId;
    }

    @JsonProperty("cityId")
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("themes")
    public List<String> getThemes() {
        return themes;
    }

    @JsonProperty("themes")
    public void setThemes(List<String> themes) {
        this.themes = themes;
    }

    @JsonProperty("pointsOfSale")
    public List<String> getPointsOfSale() {
        return pointsOfSale;
    }

    @JsonProperty("pointsOfSale")
    public void setPointsOfSale(List<String> pointsOfSale) {
        this.pointsOfSale = pointsOfSale;
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
