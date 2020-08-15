
package de.blackforestsolutions.generatedcontent.blaBlaBus.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "_carrier_id",
    "short_name",
    "short_name_fr",
    "short_name_de",
    "short_name_en",
    "short_name_it",
    "short_name_nl",
    "long_name",
    "long_name_fr",
    "long_name_de",
    "long_name_en",
    "long_name_it",
    "long_name_nl",
    "time_zone",
    "latitude",
    "longitude",
    "destinations_ids",
    "is_meta_gare",
    "address",
    "stops"
})
public class Stop implements Serializable
{

    @JsonProperty("id")
    private Long id;
    @JsonProperty("_carrier_id")
    private String carrierId;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("short_name_fr")
    private String shortNameFr;
    @JsonProperty("short_name_de")
    private String shortNameDe;
    @JsonProperty("short_name_en")
    private String shortNameEn;
    @JsonProperty("short_name_it")
    private String shortNameIt;
    @JsonProperty("short_name_nl")
    private String shortNameNl;
    @JsonProperty("long_name")
    private String longName;
    @JsonProperty("long_name_fr")
    private String longNameFr;
    @JsonProperty("long_name_de")
    private String longNameDe;
    @JsonProperty("long_name_en")
    private String longNameEn;
    @JsonProperty("long_name_it")
    private String longNameIt;
    @JsonProperty("long_name_nl")
    private String longNameNl;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("destinations_ids")
    private List<Long> destinationsIds = null;
    @JsonProperty("is_meta_gare")
    private Boolean isMetaGare;
    @JsonProperty("address")
    private String address;
    @JsonProperty("stops")
    private List<Stop> stops = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2997957869166786352L;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("_carrier_id")
    public String getCarrierId() {
        return carrierId;
    }

    @JsonProperty("_carrier_id")
    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("short_name_fr")
    public String getShortNameFr() {
        return shortNameFr;
    }

    @JsonProperty("short_name_fr")
    public void setShortNameFr(String shortNameFr) {
        this.shortNameFr = shortNameFr;
    }

    @JsonProperty("short_name_de")
    public String getShortNameDe() {
        return shortNameDe;
    }

    @JsonProperty("short_name_de")
    public void setShortNameDe(String shortNameDe) {
        this.shortNameDe = shortNameDe;
    }

    @JsonProperty("short_name_en")
    public String getShortNameEn() {
        return shortNameEn;
    }

    @JsonProperty("short_name_en")
    public void setShortNameEn(String shortNameEn) {
        this.shortNameEn = shortNameEn;
    }

    @JsonProperty("short_name_it")
    public String getShortNameIt() {
        return shortNameIt;
    }

    @JsonProperty("short_name_it")
    public void setShortNameIt(String shortNameIt) {
        this.shortNameIt = shortNameIt;
    }

    @JsonProperty("short_name_nl")
    public String getShortNameNl() {
        return shortNameNl;
    }

    @JsonProperty("short_name_nl")
    public void setShortNameNl(String shortNameNl) {
        this.shortNameNl = shortNameNl;
    }

    @JsonProperty("long_name")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("long_name")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @JsonProperty("long_name_fr")
    public String getLongNameFr() {
        return longNameFr;
    }

    @JsonProperty("long_name_fr")
    public void setLongNameFr(String longNameFr) {
        this.longNameFr = longNameFr;
    }

    @JsonProperty("long_name_de")
    public String getLongNameDe() {
        return longNameDe;
    }

    @JsonProperty("long_name_de")
    public void setLongNameDe(String longNameDe) {
        this.longNameDe = longNameDe;
    }

    @JsonProperty("long_name_en")
    public String getLongNameEn() {
        return longNameEn;
    }

    @JsonProperty("long_name_en")
    public void setLongNameEn(String longNameEn) {
        this.longNameEn = longNameEn;
    }

    @JsonProperty("long_name_it")
    public String getLongNameIt() {
        return longNameIt;
    }

    @JsonProperty("long_name_it")
    public void setLongNameIt(String longNameIt) {
        this.longNameIt = longNameIt;
    }

    @JsonProperty("long_name_nl")
    public String getLongNameNl() {
        return longNameNl;
    }

    @JsonProperty("long_name_nl")
    public void setLongNameNl(String longNameNl) {
        this.longNameNl = longNameNl;
    }

    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("destinations_ids")
    public List<Long> getDestinationsIds() {
        return destinationsIds;
    }

    @JsonProperty("destinations_ids")
    public void setDestinationsIds(List<Long> destinationsIds) {
        this.destinationsIds = destinationsIds;
    }

    @JsonProperty("is_meta_gare")
    public Boolean getIsMetaGare() {
        return isMetaGare;
    }

    @JsonProperty("is_meta_gare")
    public void setIsMetaGare(Boolean isMetaGare) {
        this.isMetaGare = isMetaGare;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("stops")
    public List<Stop> getStops() {
        return stops;
    }

    @JsonProperty("stops")
    public void setStops(List<Stop> stops) {
        this.stops = stops;
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
