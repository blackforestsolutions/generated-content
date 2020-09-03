
package de.blackforestsolutions.generatedcontent.blaBlaCar;

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
    "date_time",
    "place"
})
public class Waypoint implements Serializable
{

    @JsonProperty("date_time")
    private String dateTime;
    @JsonProperty("place")
    private Place place;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -609649854230982949L;

    @JsonProperty("date_time")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("date_time")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("place")
    public Place getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Place place) {
        this.place = place;
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
