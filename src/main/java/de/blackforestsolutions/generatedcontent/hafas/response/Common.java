package de.blackforestsolutions.generatedcontent.hafas.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locL",
    "prodL",
    "polyL",
    "layerL",
    "crdSysL",
    "opL",
    "remL",
    "icoL"
})
public class Common implements Serializable
{

    @JsonProperty("locL")
    private List<Object> locL = null;
    @JsonProperty("prodL")
    private List<Object> prodL = null;
    @JsonProperty("polyL")
    private List<Object> polyL = null;
    @JsonProperty("layerL")
    private List<LayerL> layerL = null;
    @JsonProperty("crdSysL")
    private List<CrdSysL> crdSysL = null;
    @JsonProperty("opL")
    private List<Object> opL = null;
    @JsonProperty("remL")
    private List<Object> remL = null;
    @JsonProperty("icoL")
    private List<IcoL> icoL = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6079864202258248880L;

    @JsonProperty("locL")
    public List<Object> getLocL() {
        return locL;
    }

    @JsonProperty("locL")
    public void setLocL(List<Object> locL) {
        this.locL = locL;
    }

    @JsonProperty("prodL")
    public List<Object> getProdL() {
        return prodL;
    }

    @JsonProperty("prodL")
    public void setProdL(List<Object> prodL) {
        this.prodL = prodL;
    }

    @JsonProperty("polyL")
    public List<Object> getPolyL() {
        return polyL;
    }

    @JsonProperty("polyL")
    public void setPolyL(List<Object> polyL) {
        this.polyL = polyL;
    }

    @JsonProperty("layerL")
    public List<LayerL> getLayerL() {
        return layerL;
    }

    @JsonProperty("layerL")
    public void setLayerL(List<LayerL> layerL) {
        this.layerL = layerL;
    }

    @JsonProperty("crdSysL")
    public List<CrdSysL> getCrdSysL() {
        return crdSysL;
    }

    @JsonProperty("crdSysL")
    public void setCrdSysL(List<CrdSysL> crdSysL) {
        this.crdSysL = crdSysL;
    }

    @JsonProperty("opL")
    public List<Object> getOpL() {
        return opL;
    }

    @JsonProperty("opL")
    public void setOpL(List<Object> opL) {
        this.opL = opL;
    }

    @JsonProperty("remL")
    public List<Object> getRemL() {
        return remL;
    }

    @JsonProperty("remL")
    public void setRemL(List<Object> remL) {
        this.remL = remL;
    }

    @JsonProperty("icoL")
    public List<IcoL> getIcoL() {
        return icoL;
    }

    @JsonProperty("icoL")
    public void setIcoL(List<IcoL> icoL) {
        this.icoL = icoL;
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
