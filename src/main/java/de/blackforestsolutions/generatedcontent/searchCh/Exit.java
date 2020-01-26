
package de.blackforestsolutions.generatedcontent.searchCh;

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
    "arrival",
    "stopid",
    "x",
    "y",
    "name",
    "sbb_name",
    "waittime",
    "track",
    "isaddress"
})
public class Exit implements Serializable {

    @JsonProperty("arrival")
    private String arrival;
    @JsonProperty("stopid")
    private String stopid;
    @JsonProperty("x")
    private int x;
    @JsonProperty("y")
    private int y;
    @JsonProperty("name")
    private String name;
    @JsonProperty("sbb_name")
    private String sbbName;
    @JsonProperty("waittime")
    private int waittime;
    @JsonProperty("track")
    private String track;
    @JsonProperty("isaddress")
    private boolean isaddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -5149526365444602377L;

    @JsonProperty("arrival")
    public String getArrival() {
        return arrival;
    }

    @JsonProperty("arrival")
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("stopid")
    public String getStopid() {
        return stopid;
    }

    @JsonProperty("stopid")
    public void setStopid(String stopid) {
        this.stopid = stopid;
    }

    @JsonProperty("x")
    public int getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(int x) {
        this.x = x;
    }

    @JsonProperty("y")
    public int getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(int y) {
        this.y = y;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("sbb_name")
    public String getSbbName() {
        return sbbName;
    }

    @JsonProperty("sbb_name")
    public void setSbbName(String sbbName) {
        this.sbbName = sbbName;
    }

    @JsonProperty("waittime")
    public int getWaittime() {
        return waittime;
    }

    @JsonProperty("waittime")
    public void setWaittime(int waittime) {
        this.waittime = waittime;
    }

    @JsonProperty("track")
    public String getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(String track) {
        this.track = track;
    }

    @JsonProperty("isaddress")
    public void setIsaddress(boolean isaddress) {
        this.isaddress = isaddress;
    }

    @JsonProperty("isaddress")
    public boolean getIsaddress() {
        return isaddress;
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
