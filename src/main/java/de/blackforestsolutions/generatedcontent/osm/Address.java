
package de.blackforestsolutions.generatedcontent.osm;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "leisure",
    "aeroway",
    "road",
    "hamlet",
    "municipality",
    "place",
    "tourism",
    "neighbourhood",
    "city_district",
    "house_number",
    "suburb",
    "town",
    "state",
    "borough",
    "city",
    "postcode",
    "country",
    "country_code"
})
public class Address implements Serializable
{

    @JsonProperty("leisure")
    private String leisure;
    @JsonProperty("aeroway")
    private String aeroway;
    @JsonProperty("road")
    private String road;
    @JsonProperty("hamlet")
    private String hamlet;
    @JsonProperty("municipality")
    private String municipality;
    @JsonProperty("place")
    private String place;
    @JsonProperty("tourism")
    private String tourism;
    @JsonProperty("neighbourhood")
    private String neighbourhood;
    @JsonProperty("city_district")
    private String cityDistrict;
    @JsonProperty("house_number")
    private String houseNumber;
    @JsonProperty("suburb")
    private String suburb;
    @JsonProperty("town")
    private String town;
    @JsonProperty("state")
    private String state;
    @JsonProperty("borough")
    private String borough;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2290957592787371069L;

    @JsonProperty("leisure")
    public String getLeisure() {
        return leisure;
    }

    @JsonProperty("leisure")
    public void setLeisure(String leisure) {
        this.leisure = leisure;
    }

    @JsonProperty("aeroway")
    public String getAeroway() {
        return aeroway;
    }

    @JsonProperty("aeroway")
    public void setAeroway(String aeroway) {
        this.aeroway = aeroway;
    }

    @JsonProperty("road")
    public String getRoad() {
        return road;
    }

    @JsonProperty("road")
    public void setRoad(String road) {
        this.road = road;
    }

    @JsonProperty("hamlet")
    public String getHamlet() {
        return hamlet;
    }

    @JsonProperty("hamlet")
    public void setHamlet(String hamlet) {
        this.hamlet = hamlet;
    }

    @JsonProperty("municipality")
    public String getMunicipality() {
        return municipality;
    }

    @JsonProperty("municipality")
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    @JsonProperty("place")
    public String getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(String place) {
        this.place = place;
    }

    @JsonProperty("tourism")
    public String getTourism() {
        return tourism;
    }

    @JsonProperty("tourism")
    public void setTourism(String tourism) {
        this.tourism = tourism;
    }

    @JsonProperty("neighbourhood")
    public String getNeighbourhood() {
        return neighbourhood;
    }

    @JsonProperty("neighbourhood")
    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    @JsonProperty("city_district")
    public String getCityDistrict() {
        return cityDistrict;
    }

    @JsonProperty("city_district")
    public void setCityDistrict(String cityDistrict) {
        this.cityDistrict = cityDistrict;
    }

    @JsonProperty("house_number")
    public String getHouseNumber() {
        return houseNumber;
    }

    @JsonProperty("house_number")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @JsonProperty("suburb")
    public String getSuburb() {
        return suburb;
    }

    @JsonProperty("suburb")
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    @JsonProperty("town")
    public void setTown(String town) {
        this.town = town;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("borough")
    public String getBorough() {
        return borough;
    }

    @JsonProperty("borough")
    public void setBorough(String borough) {
        this.borough = borough;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
