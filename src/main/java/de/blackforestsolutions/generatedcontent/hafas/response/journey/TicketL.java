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
    "name",
    "prc",
    "cur",
    "shpCtx"
})
public class TicketL implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("prc")
    private Integer prc;
    @JsonProperty("cur")
    private String cur;
    @JsonProperty("shpCtx")
    private String shpCtx;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 655022000465651097L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("prc")
    public Integer getPrc() {
        return prc;
    }

    @JsonProperty("prc")
    public void setPrc(Integer prc) {
        this.prc = prc;
    }

    @JsonProperty("cur")
    public String getCur() {
        return cur;
    }

    @JsonProperty("cur")
    public void setCur(String cur) {
        this.cur = cur;
    }

    @JsonProperty("shpCtx")
    public String getShpCtx() {
        return shpCtx;
    }

    @JsonProperty("shpCtx")
    public void setShpCtx(String shpCtx) {
        this.shpCtx = shpCtx;
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
