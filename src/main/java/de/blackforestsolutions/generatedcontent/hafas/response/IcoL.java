
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
    "res",
    "txt",
    "fg",
    "bg"
})
public class IcoL implements Serializable
{

    @JsonProperty("res")
    private String res;
    @JsonProperty("txt")
    private String txt;
    @JsonProperty("fg")
    private Fg fg;
    @JsonProperty("bg")
    private Bg bg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7395235045937630203L;

    @JsonProperty("res")
    public String getRes() {
        return res;
    }

    @JsonProperty("res")
    public void setRes(String res) {
        this.res = res;
    }

    @JsonProperty("txt")
    public String getTxt() {
        return txt;
    }

    @JsonProperty("txt")
    public void setTxt(String txt) {
        this.txt = txt;
    }

    @JsonProperty("fg")
    public Fg getFg() {
        return fg;
    }

    @JsonProperty("fg")
    public void setFg(Fg fg) {
        this.fg = fg;
    }

    @JsonProperty("bg")
    public Bg getBg() {
        return bg;
    }

    @JsonProperty("bg")
    public void setBg(Bg bg) {
        this.bg = bg;
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
