package de.blackforestsolutions.generatedcontent.hafas.request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.blackforestsolutions.generatedcontent.hafas.request.Cfg;
import de.blackforestsolutions.generatedcontent.hafas.request.Req;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cfg",
    "meth",
    "req"
})
public class SvcReqL implements Serializable
{

    @JsonProperty("cfg")
    private Cfg cfg;
    @JsonProperty("meth")
    private String meth;
    @JsonProperty("req")
    private Req req;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5376772451839469386L;

    @JsonProperty("cfg")
    public Cfg getCfg() {
        return cfg;
    }

    @JsonProperty("cfg")
    public void setCfg(Cfg cfg) {
        this.cfg = cfg;
    }

    @JsonProperty("meth")
    public String getMeth() {
        return meth;
    }

    @JsonProperty("meth")
    public void setMeth(String meth) {
        this.meth = meth;
    }

    @JsonProperty("req")
    public Req getReq() {
        return req;
    }

    @JsonProperty("req")
    public void setReq(Req req) {
        this.req = req;
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
