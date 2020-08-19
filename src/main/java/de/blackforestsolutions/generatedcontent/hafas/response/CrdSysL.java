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
    "id",
    "index",
    "type",
    "dim"
})
public class CrdSysL implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("index")
    private Long index;
    @JsonProperty("type")
    private String type;
    @JsonProperty("dim")
    private Long dim;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3335381212074068087L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("index")
    public Long getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Long index) {
        this.index = index;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("dim")
    public Long getDim() {
        return dim;
    }

    @JsonProperty("dim")
    public void setDim(Long dim) {
        this.dim = dim;
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
