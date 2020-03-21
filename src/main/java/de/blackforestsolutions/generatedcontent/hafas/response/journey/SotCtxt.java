
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

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
    "calcDate",
    "locMode",
    "reqMode",
    "calcTime"
})
public class SotCtxt implements Serializable
{

    @JsonProperty("calcDate")
    private String calcDate;
    @JsonProperty("locMode")
    private String locMode;
    @JsonProperty("reqMode")
    private String reqMode;
    @JsonProperty("calcTime")
    private String calcTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4576801226096628733L;

    @JsonProperty("calcDate")
    public String getCalcDate() {
        return calcDate;
    }

    @JsonProperty("calcDate")
    public void setCalcDate(String calcDate) {
        this.calcDate = calcDate;
    }

    @JsonProperty("locMode")
    public String getLocMode() {
        return locMode;
    }

    @JsonProperty("locMode")
    public void setLocMode(String locMode) {
        this.locMode = locMode;
    }

    @JsonProperty("reqMode")
    public String getReqMode() {
        return reqMode;
    }

    @JsonProperty("reqMode")
    public void setReqMode(String reqMode) {
        this.reqMode = reqMode;
    }

    @JsonProperty("calcTime")
    public String getCalcTime() {
        return calcTime;
    }

    @JsonProperty("calcTime")
    public void setCalcTime(String calcTime) {
        this.calcTime = calcTime;
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
