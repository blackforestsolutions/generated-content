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
    "place_id",
    "osm_type",
    "osm_id",
    "display_name",
    "place_rank",
    "category",
    "type",
    "importance",
    "icon"
})
public class Properties implements Serializable
{

    @JsonProperty("place_id")
    private Integer placeId;
    @JsonProperty("osm_type")
    private String osmType;
    @JsonProperty("osm_id")
    private Integer osmId;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("place_rank")
    private Integer placeRank;
    @JsonProperty("category")
    private String category;
    @JsonProperty("type")
    private String type;
    @JsonProperty("importance")
    private Double importance;
    @JsonProperty("icon")
    private String icon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5901547266353967927L;

    @JsonProperty("place_id")
    public Integer getPlaceId() {
        return placeId;
    }

    @JsonProperty("place_id")
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
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
    public Integer getOsmId() {
        return osmId;
    }

    @JsonProperty("osm_id")
    public void setOsmId(Integer osmId) {
        this.osmId = osmId;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("place_rank")
    public Integer getPlaceRank() {
        return placeRank;
    }

    @JsonProperty("place_rank")
    public void setPlaceRank(Integer placeRank) {
        this.placeRank = placeRank;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
