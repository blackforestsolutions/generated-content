
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;
import de.blackforestsolutions.generatedcontent.hafas.response.CrdSysL;
import de.blackforestsolutions.generatedcontent.hafas.response.LayerL;
import de.blackforestsolutions.generatedcontent.hafas.response.LocL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locL",
    "prodL",
    "polyL",
    "layerL",
    "crdSysL",
    "opL",
    "remL",
    "icoL",
    "tcocL"
})
public class Common implements Serializable
{

    @JsonProperty("locL")
    private List<LocL> locL = new ArrayList<>();
    @JsonProperty("prodL")
    private List<de.blackforestsolutions.generatedcontent.hafas.response.journey.ProdL> prodL = new ArrayList<de.blackforestsolutions.generatedcontent.hafas.response.journey.ProdL>();
    @JsonProperty("polyL")
    private List<Object> polyL = new ArrayList<Object>();
    @JsonProperty("layerL")
    private List<LayerL> layerL = new ArrayList<LayerL>();
    @JsonProperty("crdSysL")
    private List<CrdSysL> crdSysL = new ArrayList<CrdSysL>();
    @JsonProperty("opL")
    private List<de.blackforestsolutions.generatedcontent.hafas.response.journey.OpL> opL = new ArrayList<de.blackforestsolutions.generatedcontent.hafas.response.journey.OpL>();
    @JsonProperty("remL")
    private List<de.blackforestsolutions.generatedcontent.hafas.response.journey.RemL> remL = new ArrayList<de.blackforestsolutions.generatedcontent.hafas.response.journey.RemL>();
    @JsonProperty("icoL")
    private List<de.blackforestsolutions.generatedcontent.hafas.response.journey.IcoL> icoL = new ArrayList<de.blackforestsolutions.generatedcontent.hafas.response.journey.IcoL>();
    @JsonProperty("tcocL")
    private List<de.blackforestsolutions.generatedcontent.hafas.response.journey.TcocL> tcocL = new ArrayList<de.blackforestsolutions.generatedcontent.hafas.response.journey.TcocL>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3866184785140079486L;

    @JsonProperty("locL")
    public List<LocL> getLocL() {
        return locL;
    }

    @JsonProperty("locL")
    public void setLocL(List<LocL> locL) {
        this.locL = locL;
    }

    @JsonProperty("prodL")
    public List<de.blackforestsolutions.generatedcontent.hafas.response.journey.ProdL> getProdL() {
        return prodL;
    }

    @JsonProperty("prodL")
    public void setProdL(List<de.blackforestsolutions.generatedcontent.hafas.response.journey.ProdL> prodL) {
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
    public List<de.blackforestsolutions.generatedcontent.hafas.response.journey.OpL> getOpL() {
        return opL;
    }

    @JsonProperty("opL")
    public void setOpL(List<de.blackforestsolutions.generatedcontent.hafas.response.journey.OpL> opL) {
        this.opL = opL;
    }

    @JsonProperty("remL")
    public List<de.blackforestsolutions.generatedcontent.hafas.response.journey.RemL> getRemL() {
        return remL;
    }

    @JsonProperty("remL")
    public void setRemL(List<de.blackforestsolutions.generatedcontent.hafas.response.journey.RemL> remL) {
        this.remL = remL;
    }

    @JsonProperty("icoL")
    public List<de.blackforestsolutions.generatedcontent.hafas.response.journey.IcoL> getIcoL() {
        return icoL;
    }

    @JsonProperty("icoL")
    public void setIcoL(List<de.blackforestsolutions.generatedcontent.hafas.response.journey.IcoL> icoL) {
        this.icoL = icoL;
    }

    @JsonProperty("tcocL")
    public List<de.blackforestsolutions.generatedcontent.hafas.response.journey.TcocL> getTcocL() {
        return tcocL;
    }

    @JsonProperty("tcocL")
    public void setTcocL(List<de.blackforestsolutions.generatedcontent.hafas.response.journey.TcocL> tcocL) {
        this.tcocL = tcocL;
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
