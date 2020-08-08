
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
    "x",
    "y",
    "type",
    "layerX",
    "crdSysX",
    "z"
})
public class Crd implements Serializable
{

    @JsonProperty("x")
    private Long x;
    @JsonProperty("y")
    private Long y;
    @JsonProperty("type")
    private String type;
    @JsonProperty("layerX")
    private Long layerX;
    @JsonProperty("crdSysX")
    private Long crdSysX;
    @JsonProperty("z")
    private Long z;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2096175845255953728L;

    @JsonProperty("x")
    public Long getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(Long x) {
        this.x = x;
    }

    @JsonProperty("y")
    public Long getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(Long y) {
        this.y = y;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("layerX")
    public Long getLayerX() {
        return layerX;
    }

    @JsonProperty("layerX")
    public void setLayerX(Long layerX) {
        this.layerX = layerX;
    }

    @JsonProperty("crdSysX")
    public Long getCrdSysX() {
        return crdSysX;
    }

    @JsonProperty("crdSysX")
    public void setCrdSysX(Long crdSysX) {
        this.crdSysX = crdSysX;
    }

    @JsonProperty("z")
    public Long getZ() {
        return z;
    }

    @JsonProperty("z")
    public void setZ(Long z) {
        this.z = z;
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
