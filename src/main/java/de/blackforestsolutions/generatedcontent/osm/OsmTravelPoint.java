
package de.blackforestsolutions.generatedcontent.osm;

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
    "place_id",
    "licence",
    "osm_type",
    "osm_id",
    "boundingbox",
    "lat",
    "lon",
    "display_name",
    "class",
    "type",
    "importance",
    "icon",
    "address"
})
public class OsmTravelPoint implements Serializable
{

    @JsonProperty("place_id")
    private Long placeId;
    @JsonProperty("licence")
    private String licence;
    @JsonProperty("osm_type")
    private String osmType;
    @JsonProperty("osm_id")
    private Long osmId;
    @JsonProperty("boundingbox")
    private List<String> boundingbox = null;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("class")
    private String _class;
    @JsonProperty("type")
    private String type;
    @JsonProperty("importance")
    private Double importance;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("address")
    private Address address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 245856627757986712L;

    @JsonProperty("place_id")
    public Long getPlaceId() {
        return placeId;
    }

    @JsonProperty("place_id")
    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    @JsonProperty("licence")
    public String getLicence() {
        return licence;
    }

    @JsonProperty("licence")
    public void setLicence(String licence) {
        this.licence = licence;
    }

    @JsonProperty("osm_type")
    public String getOsmType() {
        return osmType;
    }

    @JsonProperty("osm_type")
    public void setOsmType(String osmType) {
        this.osmType = osmType;
    }

    @JsonProperty("osm_id")
    public Long getOsmId() {
        return osmId;
    }

    @JsonProperty("osm_id")
    public void setOsmId(Long osmId) {
        this.osmId = osmId;
    }

    @JsonProperty("boundingbox")
    public List<String> getBoundingbox() {
        return boundingbox;
    }

    @JsonProperty("boundingbox")
    public void setBoundingbox(List<String> boundingbox) {
        this.boundingbox = boundingbox;
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

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("importance")
    public Double getImportance() {
        return importance;
    }

    @JsonProperty("importance")
    public void setImportance(Double importance) {
        this.importance = importance;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
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
