package de.blackforestsolutions.generatedcontent.hafas.response;

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
    "meth",
    "err",
    "res"
})
public class SvcResL implements Serializable
{

    @JsonProperty("meth")
    private String meth;
    @JsonProperty("err")
    private String err;
    @JsonProperty("res")
    private de.blackforestsolutions.generatedcontent.hafas.response.journey.Res res;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7193821570163186017L;

    @JsonProperty("meth")
    public String getMeth() {
        return meth;
    }

    @JsonProperty("meth")
    public void setMeth(String meth) {
        this.meth = meth;
    }

    @JsonProperty("err")
    public String getErr() {
        return err;
    }

    @JsonProperty("err")
    public void setErr(String err) {
        this.err = err;
    }

    @JsonProperty("res")
    public de.blackforestsolutions.generatedcontent.hafas.response.journey.Res getRes() {
        return res;
    }

    @JsonProperty("res")
    public void setRes(de.blackforestsolutions.generatedcontent.hafas.response.journey.Res res) {
        this.res = res;
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
